package com.wallet.findMoneyApp.controller;

import com.alibaba.fastjson.JSONObject;
import com.wallet.findMoneyApp.model.base.BaseResult;
import com.wallet.findMoneyApp.model.request.LoginRequest;
import com.wallet.findMoneyApp.model.request.SendMsgRequest;
import com.wallet.findMoneyApp.model.result.UserRequest;
import com.wallet.findMoneyApp.model.vo.LoginBody;
import com.wallet.findMoneyApp.model.result.LoginResult;
import com.wallet.findMoneyApp.model.vo.UserBody;
import com.wallet.findMoneyApp.model.result.UserReuslt;
import com.wallet.findMoneyApp.service.TelMsgService;
import com.wallet.findMoneyApp.service.UserService;
import com.wallet.findMoneyApp.util.StringUtil;
import com.wallet.findMoneyApp.util.enums.ResultEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 注册
 * 登录
 * 忘记密码
 * 发送短信验证码
 */
@Api("用户PI")
@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserService userService;
    @Autowired
    TelMsgService msgService;

    @ApiOperation(value = "保存用户", notes = "新增user对象", response = UserReuslt.class)
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public String saveUser(@RequestBody @ApiParam(name = "用户对象", value = "用户对象") UserRequest request) {
        logger.info("saveUser init", ToStringBuilder.reflectionToString(request, ToStringStyle.SHORT_PREFIX_STYLE));
        UserReuslt result = userService.checkMolde(request);
        if (!result.getBody().getCode().equalsIgnoreCase(ResultEnum._0.getCode())) {
            return JSONObject.toJSONString(result);
        }
        result = userService.addUser(request);
        return JSONObject.toJSONString(result);

    }

    @ApiOperation(value = "登录", notes = "登录", response = LoginResult.class)
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestBody @ApiParam(name = "用户对象", value = "用户对象") LoginRequest request) {
        logger.info("saveUser init", ToStringBuilder.reflectionToString(request, ToStringStyle.SHORT_PREFIX_STYLE));
        LoginResult result = userService.checkLoginMolde(request);
        if (!result.getBody().getCode().equalsIgnoreCase(ResultEnum._0.getCode())) {
            return JSONObject.toJSONString(result);
        }
        result = userService.login(request);
        return JSONObject.toJSONString(result);

    }

    @ApiOperation(value = "忘记密码", notes = "忘记密码", response = UserReuslt.class)
    @RequestMapping(value = "/forgetPwd", method = RequestMethod.POST)
    @ResponseBody
    public String forgetPwd(@RequestBody @ApiParam(name = "忘记密码", value = "忘记密码") UserRequest request) {
        logger.info("saveUser init", ToStringBuilder.reflectionToString(request, ToStringStyle.SHORT_PREFIX_STYLE));
        UserReuslt result = userService.checkMolde(request);
        if (!result.getBody().getCode().equalsIgnoreCase(ResultEnum._0.getCode())) {
            return JSONObject.toJSONString(result);
        }
        result = userService.forgetPwd(request);
        return JSONObject.toJSONString(result);

    }

    @ApiOperation(value = "发送短信验证码", notes = "发送短信验证码", response = BaseResult.class)
    @RequestMapping(value = "/sendMsg", method = RequestMethod.POST)
    @ResponseBody
    public String sendMsg(@RequestBody @ApiParam(name = "发送短信验证码", value = "发送短信验证码") SendMsgRequest request) {
        logger.info("sendMsg init request{}", ToStringBuilder.reflectionToString(request, ToStringStyle.SHORT_PREFIX_STYLE));
        return JSONObject.toJSONString(msgService.sendMsg(request));

    }


}
