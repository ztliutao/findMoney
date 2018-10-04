package com.wallet.findMoneyApp.controller;

import com.alibaba.fastjson.JSONObject;
import com.wallet.findMoneyApp.model.base.BaseRequest;
import com.wallet.findMoneyApp.model.base.BaseResult;
import com.wallet.findMoneyApp.model.base.HanderInfo;
import com.wallet.findMoneyApp.model.result.ErrorReportRequest;
import com.wallet.findMoneyApp.service.AppService;
import com.wallet.findMoneyApp.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api("app交互API")
@RestController
@RequestMapping("/app")
public class AppController {
    private static final Logger logger = LoggerFactory.getLogger(AppController.class);
    @Autowired
    private ProductService pService;
    @Autowired
    private AppService appService;

    @ApiOperation(value = "开屏广告", notes = "开屏广告",response = BaseResult.class)
    @RequestMapping(value = "/advert", method = RequestMethod.POST)
    @ResponseBody
    public String appAdvert(BaseRequest request) {
        logger.info("appAdvert init ", ToStringBuilder.reflectionToString(request, ToStringStyle.SHORT_PREFIX_STYLE));
        BaseResult result = pService.advert(request);
        return JSONObject.toJSONString(result);
    }

    @ApiOperation(value = "版本检查", notes = "版本检查" ,response = BaseResult.class)
    @RequestMapping(value = "/versionCheck", method = RequestMethod.POST)
    @ResponseBody
    public String versionCheck(BaseRequest request) {
        logger.info("versionCheck init ", ToStringBuilder.reflectionToString(request, ToStringStyle.SHORT_PREFIX_STYLE));
        BaseResult result = appService.versionCheck(request);
        return JSONObject.toJSONString(result);
    }


    @ApiOperation(value = "静态资源包", notes = "静态资源包" ,response = BaseResult.class)
    @RequestMapping(value = "/staticResource", method = RequestMethod.POST)
    @ResponseBody
    public String staticResource(BaseRequest request) {
        logger.info("staticResource init ", ToStringBuilder.reflectionToString(request, ToStringStyle.SHORT_PREFIX_STYLE));
        BaseResult result = appService.staticResource(request);
        return JSONObject.toJSONString(result);
    }

    @ApiOperation(value = "异常上报", notes = "异常上报",response = BaseResult.class)
    @RequestMapping(value = "/errrReport", method = RequestMethod.POST)
    @ResponseBody
    public String errrReport(@RequestBody @ApiParam(name = "异常信息", value = "异常信息") ErrorReportRequest request) {
        logger.info("errrReport init ", ToStringBuilder.reflectionToString(request, ToStringStyle.SHORT_PREFIX_STYLE));
        BaseResult result = appService.errrReport(request);
        return JSONObject.toJSONString(result);
    }
}
