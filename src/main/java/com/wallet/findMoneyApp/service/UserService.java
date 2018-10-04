package com.wallet.findMoneyApp.service;

import com.alibaba.fastjson.JSONObject;
import com.wallet.findMoneyApp.model.po.*;
import com.wallet.findMoneyApp.model.request.LoginRequest;
import com.wallet.findMoneyApp.model.result.UserRequest;
import com.wallet.findMoneyApp.model.vo.LoginBody;
import com.wallet.findMoneyApp.model.result.LoginResult;
import com.wallet.findMoneyApp.model.vo.UserBody;
import com.wallet.findMoneyApp.model.result.UserReuslt;
import com.wallet.findMoneyApp.util.StringUtil;
import com.wallet.findMoneyApp.util.enums.ResultEnum;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    @Autowired
    private UserEnrollMapper userEnrollMapper;
    @Autowired
    private TelMsgService msgService;

    /**
     * 新增用户
     * UserBody-->UserBody
     *
     * @param request
     * @return
     */
    public UserReuslt addUser(UserRequest request) {
        logger.info("addUser init", ToStringBuilder.reflectionToString(request, ToStringStyle.SHORT_PREFIX_STYLE));
        UserEnroll info = new UserEnroll();
        UserReuslt result = new UserReuslt();
        result.setHander(request.getHander());
        try {
            UserBody model = request.getBody();
            UserEnrollExample example = new UserEnrollExample();
            example.createCriteria().andMobileNoEqualTo(model.getTel());
            List<UserEnroll> infoList = userEnrollMapper.selectByExample(example);
            if (null != infoList && infoList.size() > 0) {
                result.getBody().setCode(ResultEnum._1.getCode());
                result.getBody().setMsg(ResultEnum._1.getMsg() + ",用户已存在");
                return result;
            }

            info.setMobileNo(model.getTel());
            info.setPassword(model.getPwd());
            info.setImei(request.getHander().getImei());
            info.setClientIp(request.getHander().getDeviceIp());
            info.setSource(request.getHander().getCh());
            info.setAppVersion(request.getHander().getV());
            info.setCreateTime(new Date());
            info.setLatitude(request.getHander().getLat());
            info.setLongitude(request.getHander().getLng());
            info.setUpdateTime(new Date());
            userEnrollMapper.insert(info);

            JSONObject json = new JSONObject();
            result.setHander(request.getHander());
            json.put("tel", model.getTel());
            result.getBody().setCode(ResultEnum._0.getCode());
            result.getBody().setMsg(ResultEnum._0.getMsg());
            result.getBody().setData(json);
            return result;
        } catch (Exception e) {
            logger.error("addUser is error", e.getMessage(), e);
            result.getBody().setCode(ResultEnum._1.getCode());
            result.getBody().setMsg(ResultEnum._1.getMsg() + ",系统异常");
            return result;
        }
    }

    /**
     * 根据登录信息检查是否登录成功
     * 检查用户是否存在
     * 检查数据（正确只有一条记录）
     * 检查密码是否正确
     *
     * @param request
     * @return
     */
    public LoginResult login(LoginRequest request) {
        logger.info("login init", ToStringBuilder.reflectionToString(request, ToStringStyle.SHORT_PREFIX_STYLE));
        LoginResult result = new LoginResult();
        result.setHander(request.getHander());
        try {
            LoginBody model = request.getBody();
            UserEnrollExample example = new UserEnrollExample();
            example.createCriteria().andMobileNoEqualTo(model.getTel());
            List<UserEnroll> infoList = userEnrollMapper.selectByExample(example);
            if (null == infoList || infoList.size() <= 0) {
                result.getBody().setCode(ResultEnum._1.getCode());
                result.getBody().setMsg(ResultEnum._1.getMsg() + ",用户不存在");
                return result;
            }
            if (infoList.size() > 1) {
                result.getBody().setCode(ResultEnum._1.getCode());
                result.getBody().setMsg(ResultEnum._1.getMsg() + ",数据异常，存在多个用户");
                return result;
            }
            if (!model.getPwd().equals(infoList.get(0).getPassword())) {
                result.getBody().setCode(ResultEnum._1.getCode());
                result.getBody().setMsg(ResultEnum._1.getMsg() + ",用户名或者密码错误");
                return result;
            }

            JSONObject json = new JSONObject();
            json.put("tel", model.getTel());
            json.put("userId", infoList.get(0).getId());
            json.put("flag", true);//通过redis获取
            if (json.getBoolean("flag")) {
                json.put("imgUrl", "还没定从哪里获取，或者前台固定");
            }
            result.getBody().setData(json);
            return result;
        } catch (Exception e) {
            logger.error("addUser is error", e.getMessage(), e);
            result.getBody().setCode(ResultEnum._1.getCode());
            result.getBody().setMsg(ResultEnum._1.getMsg() + ",系统异常");
            return result;

        }
    }

    /**
     * 忘记密码
     *
     * @param request
     * @return
     */
    public UserReuslt forgetPwd(UserRequest request) {
        logger.info("forgetPwd init", request);
        UserReuslt result = new UserReuslt();
        result.setHander(request.getHander());
        UserBody model = request.getBody();
        try {
            UserEnrollExample example = new UserEnrollExample();
            example.createCriteria().andMobileNoEqualTo(model.getTel());
            List<UserEnroll> infoList = userEnrollMapper.selectByExample(example);
            if (null == infoList || infoList.size() <= 0) {
                logger.info("addUser info is exist", model);
                result.getBody().setCode(ResultEnum._1.getCode());
                result.getBody().setMsg(ResultEnum._1.getMsg() + ",数据异常");
                return result;
            }
            UserEnroll info = infoList.get(0);
//            info.setId(null);
            info.setAppVersion(request.getHander().getV());
            info.setImei(request.getHander().getImei());
            info.setLatitude(request.getHander().getLat());
            info.setLongitude(request.getHander().getLng());
            info.setSource(request.getHander().getCh());
            info.setOsVersion(request.getHander().getOsv());
            info.setPassword("");
            info.setUpdateTime(new Date());
            userEnrollMapper.updateByPrimaryKeySelective(info);

            JSONObject json = new JSONObject();
            json.put("tel", model.getTel());
            result.getBody().setData(json);
            result.getBody().setCode(ResultEnum._0.getCode());
            result.getBody().setMsg(ResultEnum._0.getMsg());
            return result;
        } catch (Exception e) {
            logger.error("addUser is error", e.getMessage(), e);
            result.getBody().setCode(ResultEnum._1.getCode());
            result.getBody().setMsg(ResultEnum._1.getMsg() + ",系统异常");
            return result;
        }
    }

    public  LoginResult checkLoginMolde(LoginRequest user) {
        LoginBody info = user.getBody();
        if (StringUtils.isBlank(info.getTel())) {
            return new LoginResult(ResultEnum._1.getCode(), "手机号码为空");
        }
        String param = StringUtil.getSignChar(info);
        if (!StringUtil.isValidate(param, user.getHander().getT(), user.getHander().getSign())) {
            return new LoginResult(ResultEnum._1.getCode(), "验签失败");
        }
        return new LoginResult(ResultEnum._0.getCode(), ResultEnum._0.getMsg());
    }

    /**
     * 验证手机号码内容、格式
     * 验证短信验证码
     * 密码是否一致
     * 验签
     *
     * @param request
     * @return
     */
    public  UserReuslt checkMolde(UserRequest request) {
        UserBody user = request.getBody();
        if (StringUtils.isBlank(user.getTel())) {
            return new UserReuslt(ResultEnum._1.getCode(), "手机号码为空");
        }
        UserReuslt r = StringUtil.isPhone(user.getTel());
        if (!r.getBody().getCode().equalsIgnoreCase(ResultEnum._0.getCode())) {
            return r;
        }
        if (!user.getPwd().equals(user.getPwd1())) {
            return new UserReuslt(ResultEnum._1.getCode(), "两次密码不一致");
        }
        String msg = msgService.getTelMsg(user.getTel());
        if (!user.getTelMsg().equalsIgnoreCase(msg)) {
            return new UserReuslt(ResultEnum._1.getCode(), "验证码错误");
        }

        String param = StringUtil.getSignChar(user);
        if (!StringUtil.isValidate(param, request.getHander().getT(), request.getHander().getSign())) {
            return new UserReuslt(ResultEnum._1.getCode(), "验签失败");
        }
        return new UserReuslt(ResultEnum._0.getCode(), ResultEnum._0.getMsg());
    }

}
