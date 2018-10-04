package com.wallet.findMoneyApp.controller;

import com.alibaba.fastjson.JSONObject;
import com.wallet.findMoneyApp.model.base.BaseRequest;
import com.wallet.findMoneyApp.model.base.BaseResult;
import com.wallet.findMoneyApp.model.base.HanderInfo;
import com.wallet.findMoneyApp.model.request.*;
import com.wallet.findMoneyApp.model.result.CreditProductListResult;
import com.wallet.findMoneyApp.model.result.IndexProductEntranceResult;
import com.wallet.findMoneyApp.model.result.ProductDetailRequest;
import com.wallet.findMoneyApp.model.result.ProductQueryApplyResult;
import com.wallet.findMoneyApp.model.vo.*;
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

@Api("产品API")
@RestController
@RequestMapping("/product")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
    @Autowired
    private ProductService pService;

    @ApiOperation(value = "用户申请列表", notes = "用户申请列表", response = ProductQueryApplyResult.class)
    @RequestMapping(value = "/applyList", method = RequestMethod.POST)
    @ResponseBody
    public String applyList(@RequestBody @ApiParam(name = "用户信息", value = "用户信息") ProductQueryRequest request) {
        logger.info("applyList init ", ToStringBuilder.reflectionToString(request, ToStringStyle.SHORT_PREFIX_STYLE));
        ProductQueryApplyResult result = pService.applyList(request);
        return JSONObject.toJSONString(result);

    }

    @ApiOperation(value = "贷款产品列表", notes = "贷款产品列表", response = CreditProductListResult.class)
    @RequestMapping(value = "/productList", method = RequestMethod.POST)
    @ResponseBody
    public String productList(@RequestBody @ApiParam(name = "用户信息", value = "用户信息") CreditProductListRequest request) {
        logger.info("productList init ", ToStringBuilder.reflectionToString(request, ToStringStyle.SHORT_PREFIX_STYLE));
        CreditProductListResult result = pService.productList(request);
        return JSONObject.toJSONString(result);

    }

    @ApiOperation(value = "信用卡产品列表", notes = "信用卡产品列表", response = CreditProductListResult.class)
    @RequestMapping(value = "/creditCardList", method = RequestMethod.POST)
    @ResponseBody
    public String creditCardList(@RequestBody @ApiParam(name = "信用卡列表", value = "信用卡列表") CardProductListRequest request) {
        logger.info("creditCardList init ", ToStringBuilder.reflectionToString(request, ToStringStyle.SHORT_PREFIX_STYLE));
        CreditProductListResult result = pService.getCardProductList(request);
        return JSONObject.toJSONString(result);

    }

    @ApiOperation(value = "大额信贷用户信息录入", notes = "大额信贷用户信息录入", response = BaseResult.class)
    @RequestMapping(value = "/userInfo", method = RequestMethod.POST)
    @ResponseBody
    public String userInfoInfoAdd(@RequestBody @ApiParam(name = "大额信贷信息录入", value = "大额信贷信息录入") UserInfoAddRequest request) {
        logger.info("userInfoInfoAdd init ", ToStringBuilder.reflectionToString(request, ToStringStyle.SHORT_PREFIX_STYLE));
        BaseResult result = pService.userInfoInfoAdd(request);
        return JSONObject.toJSONString(result);

    }

    @ApiOperation(value = "精品推荐", notes = "精品推荐", response = BaseResult.class)
    @RequestMapping(value = "/recommend", method = RequestMethod.POST)
    @ResponseBody
    public String recommend(@RequestBody @ApiParam(name = "hander信息", value = "hander信息") BaseRequest request) {
        logger.info("recommend init ");
        BaseResult result = pService.recommend(request);
        return JSONObject.toJSONString(result);

    }

    @ApiOperation(value = "热门产品", notes = "热门产品", response = BaseResult.class)
    @RequestMapping(value = "/hotProductList", method = RequestMethod.POST)
    @ResponseBody
    public String hotProductList(@RequestBody @ApiParam(name = "hander信息", value = "hander信息") BaseRequest request) {
        logger.info("hotProductList init ");
        BaseResult result = pService.hotProductList(request);
        return JSONObject.toJSONString(result);
    }

    @ApiOperation(value = "小喇叭", notes = "小喇叭", response = BaseResult.class)
    @RequestMapping(value = "/hornList", method = RequestMethod.POST)
    @ResponseBody
    public String hornList(@RequestBody @ApiParam(name = "hander信息", value = "hander信息") BaseRequest request) {
        logger.info("hornList init ");
        BaseResult result = pService.hornList(request);
        return JSONObject.toJSONString(result);
    }

    @ApiOperation(value = "转轮图", notes = "转轮图", response = BaseResult.class)
    @RequestMapping(value = "/roateInfo", method = RequestMethod.POST)
    @ResponseBody
    public String roateInfo(@RequestBody @ApiParam(name = "hander信息", value = "hander信息") BaseRequest request) {
        logger.info("roateInfo init ");
        BaseResult result = pService.roateInfo(request);
        return JSONObject.toJSONString(result);
    }

    @ApiOperation(value = "开屏广告", notes = "开屏广告", response = BaseResult.class)
    @RequestMapping(value = "/advert", method = RequestMethod.POST)
    @ResponseBody
    public String advert(@RequestBody @ApiParam(name = "hander信息", value = "hander信息") BaseRequest request) {
        logger.info("advert init ",ToStringBuilder.reflectionToString(request,ToStringStyle.SHORT_PREFIX_STYLE));
        BaseResult result = pService.advert(request);
        return JSONObject.toJSONString(result);
    }

    @ApiOperation(value = "新增申请", notes = "落地申请信息", response = BaseResult.class)
    @RequestMapping(value = "/saveApply", method = RequestMethod.POST)
    @ResponseBody
    public String saveApply(@RequestBody @ApiParam(name = "新增申请", value = "新增申请") SaveApplyRequest request) {
        logger.info("saveApply init ", ToStringBuilder.reflectionToString(request, ToStringStyle.SHORT_PREFIX_STYLE));
        BaseResult result = pService.saveApply(request);
        return JSONObject.toJSONString(result);
    }

    @ApiOperation(value = "产品详情", notes = "产品详情", response = BaseResult.class)
    @RequestMapping(value = "/detailItem", method = RequestMethod.POST)
    @ResponseBody
    public String detailItem(@RequestBody @ApiParam(name = "产品Id", value = "产品Id") ProductDetailRequest request) {
        logger.info("detailItem init ", ToStringBuilder.reflectionToString(request, ToStringStyle.SHORT_PREFIX_STYLE));
        BaseResult result = pService.detailItem(request);
        return JSONObject.toJSONString(result);
    }

    @ApiOperation(value = "产品首页", notes = "产品首页", response = BaseResult.class)
    @RequestMapping(value = "/index", method = RequestMethod.POST)
    @ResponseBody
    public String index(@RequestBody @ApiParam(name = "hander信息", value = "hander信息") BaseRequest request) {
        logger.info("index init");
        BaseResult result = pService.index(request);
        return JSONObject.toJSONString(result);

    }

    @ApiOperation(value = "首页产品入口", notes = "首页产品入口", response = IndexProductEntranceResult.class)
    @RequestMapping(value = "/indexProductList", method = RequestMethod.POST)
    @ResponseBody
    public String indexProductList(@RequestBody @ApiParam(name = "首页贷款产品入口", value = "首页贷款产品入口") IndexProductEntranceRequest request) {
        logger.info("indexProductList init ", ToStringBuilder.reflectionToString(request, ToStringStyle.SHORT_PREFIX_STYLE));
        IndexProductEntranceResult result = pService.indexProductList(request);
        return JSONObject.toJSONString(result);
    }

}
