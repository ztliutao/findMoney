package com.wallet.findMoneyApp.service;

import com.alibaba.fastjson.JSONObject;
import com.wallet.findMoneyApp.model.base.BaseRequest;
import com.wallet.findMoneyApp.model.base.BaseResult;
import com.wallet.findMoneyApp.model.po.AdvertConfigMapper;
import com.wallet.findMoneyApp.model.result.ErrorReportRequest;
import com.wallet.findMoneyApp.model.vo.ErrorReportBody;
import com.wallet.findMoneyApp.util.StringUtil;
import com.wallet.findMoneyApp.util.enums.ResultEnum;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {
    private static final Logger logger = LoggerFactory.getLogger(AppService.class);
    @Autowired
    private AdvertConfigMapper configMapper;

    public BaseResult versionCheck(BaseRequest request) {
        logger.info("versionCheck init ");
        BaseResult result = new BaseResult();
        result.setHander(request.getHander());
        JSONObject jsonData = new JSONObject();
        try {

//            List<AdvertConfig> config =configMapper.selectByExample(example);
            jsonData.put("code", ResultEnum._0.getCode());
            jsonData.put("msg", ResultEnum._0.getMsg());
            //TODO：获取最新版本信息，读取配置表
            jsonData.put("version", "1");
            jsonData.put("desc", "1");
            jsonData.put("url", "1");
            jsonData.put("md5", "1");
            //TODO：设置签约信息
            result.getHander().setSign("");
            result.getBody().setData(jsonData);
            return result;
        } catch (Exception e) {
            logger.error("versionCheck error", e.getMessage(), e);
            jsonData.put("code", ResultEnum._1.getCode());
            jsonData.put("msg", ResultEnum._1.getMsg() + ",系统异常");
            result.getBody().setData(jsonData);
            return result;
        }

    }


    public BaseResult staticResource(BaseRequest request) {
        logger.info("staticResource init ");
        BaseResult result = new BaseResult();
        result.setHander(request.getHander());
        JSONObject jsonData = new JSONObject();
        try {

            jsonData.put("code", ResultEnum._0.getCode());
            jsonData.put("msg", ResultEnum._0.getMsg());
            jsonData.put("errorPageUrl", "1");
            jsonData.put("advertImgUrl", "1");
            result.getHander().setSign("");
            result.getBody().setData(jsonData);
            return result;
        } catch (Exception e) {
            logger.error("staticResource error", e.getMessage(), e);
            jsonData.put("code", ResultEnum._1.getCode());
            jsonData.put("msg", ResultEnum._1.getMsg() + ",系统异常");
            result.getBody().setData(jsonData);
            return result;
        }
    }

    public BaseResult errrReport(ErrorReportRequest request) {
        logger.info("errrReport init:", ToStringBuilder.reflectionToString(request, ToStringStyle.SHORT_PREFIX_STYLE));
        BaseResult result = new BaseResult();
        result.setHander(request.getHander());
        ErrorReportBody model = request.getBody();
        String param = StringUtil.getSignChar(model);
        if (!StringUtil.isValidate(param, request.getHander().getT(), request.getHander().getSign())) {
            result.getBody().setCode(ResultEnum._1.getCode());
            result.getBody().setMsg(ResultEnum._1.getMsg() + ",验签失败");
            return result;
        }

        JSONObject jsonData = new JSONObject();
        try {

            //TODO:落地数据
            jsonData.put("code", ResultEnum._0.getCode());
            jsonData.put("msg", ResultEnum._0.getMsg());
            return result;
        } catch (Exception e) {
            logger.error("errrReport error", e.getMessage(), e);
            jsonData.put("code", ResultEnum._1.getCode());
            jsonData.put("msg", ResultEnum._1.getMsg() + ",系统异常");
            result.getBody().setData(jsonData);
            return result;
        }
    }
}
