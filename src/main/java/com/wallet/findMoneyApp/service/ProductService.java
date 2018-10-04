package com.wallet.findMoneyApp.service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wallet.findMoneyApp.model.base.BaseRequest;
import com.wallet.findMoneyApp.model.base.BaseResult;
import com.wallet.findMoneyApp.model.request.*;
import com.wallet.findMoneyApp.model.result.*;
import com.wallet.findMoneyApp.model.vo.*;
import com.wallet.findMoneyApp.model.po.*;
import com.wallet.findMoneyApp.util.StringUtil;
import com.wallet.findMoneyApp.util.enums.ApplyTypeEnum;
import com.wallet.findMoneyApp.util.enums.ProductAmountLimitEnum;
import com.wallet.findMoneyApp.util.enums.ResultEnum;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {
    private static final Logger logger = LoggerFactory.getLogger(ProductService.class);
    @Autowired
    private ExtApplyRecordMapper extMapper;
    @Autowired
    private UserEnrollMapper userEnrollMapper;
    @Autowired
    private CreditProductMapper creditPmapper;
    @Autowired
    private CreditCardMapper cardMapper;
    @Autowired
    private AdvertConfigMapper configMapper;
    @Autowired
    private ApplyRecordMapper applyMapper;

    /**
     * 查询申请列表
     *
     * @param request
     * @return
     */
    public ProductQueryApplyResult applyList(ProductQueryRequest request) {
        logger.info("applyList init", ToStringBuilder.reflectionToString(request, ToStringStyle.SHORT_PREFIX_STYLE));
        ProductQueryApplyResult result = new ProductQueryApplyResult();
        result.setHander(request.getHander());
        JSONObject jsonData = new JSONObject();
        try {
            ProductQueryBody model = request.getBody();
            String param = StringUtil.getSignChar(model);
            if (!StringUtil.isValidate(param, request.getHander().getT(), request.getHander().getSign())) {
                result.getBody().setCode(ResultEnum._1.getCode());
                result.getBody().setMsg(ResultEnum._1.getMsg() + ",验签失败");
                return result;
            }
            Page<ApplyInfoPO> pages = PageHelper.startPage(Integer.parseInt(model.getCurrentPage()), Integer.parseInt(model.getPageSize()), true, true);
            if (model.getApplyType().equals(ApplyTypeEnum.CREDIT_PRODUCT.getCode())) {
                extMapper.getApplyLInfoList(model.getUserId());
            } else if (model.getApplyType().equals(ApplyTypeEnum.CREDIT_CARD.getCode())) {
                extMapper.getApplyPInfoList(model.getUserId());
            } else {
                result.getBody().setCode(ResultEnum._1.getCode());
                result.getBody().setMsg(ResultEnum._1.getMsg() + ",参数类型错误");
                return result;
            }
            jsonData.put("userId", model.getUserId());
            result.setHander(request.getHander());
            result.getBody().setPageSize(model.getPageSize());
            result.getBody().setCurrentPage(model.getCurrentPage());
            result.getBody().setCode(ResultEnum._0.getCode());
            result.getBody().setMsg(ResultEnum._0.getMsg());
            result.getBody().setData(pages.getResult());
            return result;

        } catch (Exception e) {
            logger.error("applyList error", e.getMessage(), e);
            result.getBody().setCode(ResultEnum._1.getCode());
            result.getBody().setMsg(ResultEnum._1.getMsg() + ",系统异常");
            return result;
        }

    }

    /**
     * 贷款列表
     *
     * @param request
     * @return
     */
    public CreditProductListResult productList(CreditProductListRequest request) {
        logger.info("productList init", ToStringBuilder.reflectionToString(request, ToStringStyle.SHORT_PREFIX_STYLE));
        CreditProductListResult result = new CreditProductListResult();
        result.setHander(request.getHander());
        try {
            ProductListModelBody model = request.getBody();
            String param = StringUtil.getSignChar(model);
            if (!StringUtil.isValidate(param, request.getHander().getT(), request.getHander().getSign())) {
                result.getBody().setCode(ResultEnum._1.getCode());
                result.getBody().setMsg(ResultEnum._1.getMsg() + ",验签失败");
                return result;
            }
            JSONObject jsonData = new JSONObject();
            Page<ExtCreditProductDTO> pages = PageHelper.startPage(Integer.parseInt(model.getCurrentPage()), Integer.parseInt(model.getPageSize()), true, true);

            Map<String, String> paramMap = new HashMap<>();
            ProductAmountLimitEnum enums = ProductAmountLimitEnum.getEnumByCode(model.getAmountLimit());
            if (StringUtils.isNotBlank(model.getAmountLimit()) || null != enums) {
                paramMap.put("minAmount", enums.getMin());
                paramMap.put("maxAmount", enums.getMax());
            }
            paramMap.put("type", model.getProductType());
            model.setOrderByType("id");
            paramMap.put("orderBy", model.getOrderByType());
            extMapper.productList(paramMap);
            result.setHander(request.getHander());
            result.getBody().setPageSize(model.getPageSize());
            result.getBody().setCurrentPage(model.getCurrentPage());
            result.getBody().setCode(ResultEnum._0.getCode());
            result.getBody().setMsg(ResultEnum._0.getMsg());
            result.getBody().setData(pages.getResult());
            return result;

        } catch (Exception e) {
            logger.error("productList error", e.getMessage(), e);
            result.getBody().setCode(ResultEnum._1.getCode());
            result.getBody().setMsg(ResultEnum._1.getMsg() + ",系统异常");
            return result;
        }

    }

    /**
     * 信用卡
     *
     * @param request
     * @return
     */
    public CreditProductListResult getCardProductList(CardProductListRequest request) {
        logger.info("getCardProductList init", ToStringBuilder.reflectionToString(request, ToStringStyle.SHORT_PREFIX_STYLE));
        CreditProductListResult result = new CreditProductListResult();
        result.setHander(request.getHander());
        try {
            CardProductListBody model = request.getBody();
            String param = StringUtil.getSignChar(model);
            if (!StringUtil.isValidate(param, request.getHander().getT(), request.getHander().getSign())) {
                result.getBody().setCode(ResultEnum._1.getCode());
                result.getBody().setMsg(ResultEnum._1.getMsg() + ",验签失败");
                return result;
            }
            Page<ExtCreditProductDTO> pages = PageHelper.startPage(Integer.parseInt(model.getCurrentPage()), Integer.parseInt(model.getPageSize()), true, true);
            Map<String, String> paramMap = new HashMap<>();
            extMapper.cardProductList(paramMap);
            result.setHander(request.getHander());
            result.getBody().setPageSize(model.getPageSize());
            result.getBody().setCurrentPage(model.getCurrentPage());
            result.getBody().setCode(ResultEnum._0.getCode());
            result.getBody().setMsg(ResultEnum._0.getMsg());
            result.getBody().setData(pages.getResult());
            return result;

        } catch (Exception e) {
            logger.error("getCardProductList error", e.getMessage(), e);
            result.getBody().setCode(ResultEnum._1.getCode());
            result.getBody().setMsg(ResultEnum._1.getMsg() + ",系统异常");
            return result;
        }

    }

    /**
     * 录入大额信贷用户信息
     * 根据userID判断是否存在，存在更新 不存在新增
     *
     * @param request
     * @return
     */
    public BaseResult userInfoInfoAdd(UserInfoAddRequest request) {
        logger.info("userInfoInfoAdd init", ToStringBuilder.reflectionToString(request, ToStringStyle.SHORT_PREFIX_STYLE));
        BaseResult result = new BaseResult();
        result.setHander(request.getHander());
        UserInfoAddBody model = request.getBody();
        try {
            String param = StringUtil.getSignChar(model);
            if (!StringUtil.isValidate(param, request.getHander().getT(), request.getHander().getSign())) {
                result.getBody().setCode(ResultEnum._1.getCode());
                result.getBody().setMsg(ResultEnum._1.getMsg() + ",验签失败");
                return result;
            }
            UserEnrollExample example = new UserEnrollExample();
            example.createCriteria().andMobileNoEqualTo(model.getTel());
            List<UserEnroll> userList = userEnrollMapper.selectByExample(example);
            UserEnroll info = new UserEnroll();
            info.setLongitude(request.getHander().getLng());
            info.setLatitude(request.getHander().getLat());
            info.setClientIp(request.getHander().getDeviceIp());
            info.setAppVersion(request.getHander().getV());
            info.setCreateTime(new Date());
            info.setImei(request.getHander().getImei());
            info.setMobileNo(request.getHander().getT());
            info.setPassword("");
            info.setSource(request.getHander().getCh());
            info.setUpdateTime(new Date());
            info.setOsVersion(request.getHander().getOsv());
            if (null != userList || userList.size() == 0) {
                userEnrollMapper.insert(info);
            } else {
                info = userList.get(0);
                info.setUpdateTime(new Date());
                userEnrollMapper.updateByPrimaryKeySelective(info);
            }
            result.setHander(request.getHander());
            result.getBody().setCode(ResultEnum._0.getCode());
            result.getBody().setMsg(ResultEnum._0.getMsg());
        } catch (Exception e) {
            logger.error("", e.getMessage(), e);
            result.getBody().setCode(ResultEnum._1.getCode());
            result.getBody().setMsg(ResultEnum._1.getMsg() + ",系统异常");
        }
        logger.info("userInfoInfoAdd result", ToStringBuilder.reflectionToString(result, ToStringStyle.SHORT_PREFIX_STYLE));
        return result;
    }

    /**
     * 精品推荐
     *
     * @return
     */
    public BaseResult recommend(BaseRequest request) {
        logger.info("recommend init");
        BaseResult result = new BaseResult();
        result.setHander(request.getHander());
        List<RecommendModel> dataList = new ArrayList<>();
        try {
            CreditProductExample exampl = new CreditProductExample();
            exampl.createCriteria().andExcellentEqualTo("0");
            List<CreditProduct> list = creditPmapper.selectByExample(exampl);
            for (CreditProduct p : list) {
                RecommendModel model = new RecommendModel();
                model.setMin(p.getMinAmount());
                model.setMax(p.getMaxAmount());
                model.setPid(p.getId().toString());
                model.setPname(p.getCreditName());
                model.setRemark("");
            }
            result.setHander(request.getHander());
            result.getBody().setData(dataList);
            result.getBody().setCode(ResultEnum._0.getCode());
            result.getBody().setMsg(ResultEnum._0.getMsg());
        } catch (Exception e) {
            logger.error("recommend is error", e.getMessage(), e);
            result.getBody().setCode(ResultEnum._1.getCode());
            result.getBody().setMsg(ResultEnum._1.getMsg() + ",系统异常");
        }
        logger.info("recommend result", ToStringBuilder.reflectionToString(result, ToStringStyle.SHORT_PREFIX_STYLE));
        return result;
    }

    /**
     * 热门产品
     *
     * @return
     */
    public BaseResult hotProductList(BaseRequest request) {
        logger.info("hotProductList init");
        BaseResult result = new BaseResult();
        result.setHander(request.getHander());
        try {
            JSONObject jsondata = new JSONObject();
            CreditProductExample example = new CreditProductExample();
            example.createCriteria().andWellReceivedEqualTo("1");
            List<CreditProduct> hotLoanData = creditPmapper.selectByExample(example);
            CreditCardExample cardExample = new CreditCardExample();
            List<CreditCard> hotCardModels = cardMapper.selectByExample(cardExample);

            List<HotCardDataModel> hotCardDataModels = new ArrayList<>();
            List<HotLoanDataModel> hotLoanDataModels = new ArrayList<>();

            for (CreditProduct p : hotLoanData) {
                HotLoanDataModel loan = new HotLoanDataModel();
                loan.setPid(p.getId().toString());
                loan.setPname(p.getCreditName());
                loan.setImgUrl(p.getIconUrl());
                loan.setMin(p.getMinAmount());
                loan.setMax(p.getMaxAmount());
                loan.setRate(p.getRate());
                loan.setRataType("1");
                loan.setRemark("");
                hotLoanDataModels.add(loan);
            }
            for (CreditCard c : hotCardModels) {
                HotCardDataModel card = new HotCardDataModel();
                card.setId(c.getId().toString());
                card.setName(c.getCreditCardName());
                card.setNum(c.getApplySucCount());
                card.setImgPath(c.getCreditCardImage());
                card.setRemark("");
                card.setUrl(c.getApplyPageUrl());
                hotCardDataModels.add(card);
            }
            jsondata.put("hotLoanData", hotLoanDataModels);
            jsondata.put("hotCardData", hotCardDataModels);
            result.getBody().setData(jsondata);
            result.getBody().setCode(ResultEnum._0.getCode());
            result.getBody().setMsg(ResultEnum._0.getMsg());
            logger.info("hotProductList result", ToStringBuilder.reflectionToString(result), ToStringStyle.SHORT_PREFIX_STYLE);
            return result;
        } catch (Exception e) {
            logger.error("hotProductList is error", e.getMessage(), e);
            result.getBody().setCode(ResultEnum._1.getCode());
            result.getBody().setMsg(ResultEnum._1.getMsg() + ",系统异常");
            return result;
        }
    }

    /**
     * 小喇叭
     * 所有数据都是假数据
     *
     * @return
     */
    public BaseResult hornList(BaseRequest request) {
        logger.info("hornList init");
        BaseResult result = new BaseResult();
        result.setHander(request.getHander());
        try {
            List<HornModel> list = new ArrayList();
            for (int i = 0; i < 10; i++) {
                HornModel horn = new HornModel();
                horn.setTel(StringUtil.getTel());
                horn.setChannel(String.valueOf(i));
                horn.setAmount(String.valueOf(Math.random() * 9).substring(0, 1) + "000");
                list.add(horn);
            }
            result.getBody().setData(list);
            result.getBody().setCode(ResultEnum._0.getCode());
            result.getBody().setMsg(ResultEnum._0.getMsg());
            logger.info("hornList result", ToStringBuilder.reflectionToString(result), ToStringStyle.SHORT_PREFIX_STYLE);
            return result;
        } catch (Exception e) {
            logger.error("hornList is error", e.getMessage(), e);
            result.getBody().setCode(ResultEnum._1.getCode());
            result.getBody().setMsg(ResultEnum._1.getMsg() + ",系统异常");
            return result;
        }
    }

    /**
     * 转轮图
     *
     * @return
     */
    public BaseResult roateInfo(BaseRequest request) {
        logger.info("roateInfo init");
        BaseResult result = new BaseResult();
        result.setHander(request.getHander());
        List<Object> list = new ArrayList<>();
        try {
            AdvertConfigExample example = new AdvertConfigExample();
            example.createCriteria().andTopEqualTo("0");
            List<AdvertConfig> configList = configMapper.selectByExample(example);
            for (AdvertConfig c : configList) {
                Map<String, String> map = new HashMap<>();
                map.put("imgUrl", c.getImgeUrl());
                map.put("requestUrl", c.getActionUrl());
                list.add(map);
            }
            result.getBody().setData(list);
            result.getBody().setCode(ResultEnum._0.getCode());
            result.getBody().setMsg(ResultEnum._0.getMsg());
            logger.info("roateInfo result", ToStringBuilder.reflectionToString(result), ToStringStyle.SHORT_PREFIX_STYLE);
            return result;
        } catch (Exception e) {
            logger.error("roateInfo is error", e.getMessage(), e);
            result.getBody().setCode(ResultEnum._1.getCode());
            result.getBody().setMsg(ResultEnum._1.getMsg() + ",系统异常");
            return result;
        }
    }

    /**
     * 开屏广告
     *
     * @return
     */
    public BaseResult advert(BaseRequest request) {
        logger.info("advert init ", ToStringBuilder.reflectionToString(request, ToStringStyle.SHORT_PREFIX_STYLE));
        BaseResult result = new BaseResult();
        result.setHander(request.getHander());
        List<JSONObject> list = new ArrayList<>();
        try {
            AdvertConfigExample example = new AdvertConfigExample();
            example.createCriteria().andOpenScreenEqualTo("YES");
            List<AdvertConfig> configList = configMapper.selectByExample(example);
            for (AdvertConfig c : configList) {
                JSONObject json = new JSONObject();
                json.put("imgUrl", c.getImgeUrl());
                json.put("requestUrl", c.getActionUrl());
                list.add(json);
            }
            result.getBody().setData(list);
            result.getBody().setCode(ResultEnum._0.getCode());
            result.getBody().setMsg(ResultEnum._0.getMsg());
            logger.info("advert result", ToStringBuilder.reflectionToString(result), ToStringStyle.SHORT_PREFIX_STYLE);
            return result;
        } catch (Exception e) {
            logger.error("advert is error", e.getMessage(), e);
            result.getBody().setCode(ResultEnum._1.getCode());
            result.getBody().setMsg(ResultEnum._1.getMsg() + ",系统异常");
            return result;
        }
    }

    /**
     * 落地申请记录
     *
     * @return
     */
    public BaseResult saveApply(SaveApplyRequest request) {
        logger.info("saveApply init", ToStringBuilder.reflectionToString(request), ToStringStyle.SHORT_PREFIX_STYLE);
        BaseResult result = new BaseResult();
        result.setHander(request.getHander());
        SaveApplyBody model = request.getBody();
        try {
            String param = StringUtil.getSignChar(model);
            if (!StringUtil.isValidate(param, request.getHander().getT(), request.getHander().getSign())) {
                result.getBody().setCode(ResultEnum._1.getCode());
                result.getBody().setMsg(ResultEnum._1.getMsg() + ",验签失败");
                return result;
            }
            ApplyRecord record = new ApplyRecord();
            record.setApplyProductId(Integer.parseInt(model.getProductId()));
            record.setUserId(Integer.parseInt(model.getUserID()));
            record.setApplyProductType(model.getType());
            record.setCreateTime(new Date());
            record.setUpdateTime(new Date());
            applyMapper.insert(record);
            result.getBody().setCode(ResultEnum._0.getCode());
            result.getBody().setMsg(ResultEnum._0.getMsg());
            logger.info("saveApply result", ToStringBuilder.reflectionToString(result), ToStringStyle.SHORT_PREFIX_STYLE);
            return result;
        } catch (Exception e) {
            logger.error("saveApply is error", e.getMessage(), e);
            result.getBody().setCode(ResultEnum._1.getCode());
            result.getBody().setMsg(ResultEnum._1.getMsg() + ",系统异常");
            return result;
        }
    }

    /**
     * 查看产品详情
     *
     * @param request
     * @return
     */
    public BaseResult detailItem(ProductDetailRequest request) {
        logger.info("detailItem result request：", ToStringBuilder.reflectionToString(request, ToStringStyle.SHORT_PREFIX_STYLE));
        BaseResult result = new BaseResult();
        result.setHander(request.getHander());
        try {
            ProductDetailRequestBody model = request.getBody();
            String param = StringUtil.getSignChar(model);
            if (!StringUtil.isValidate(param, request.getHander().getT(), request.getHander().getSign())) {
                result.getBody().setCode(ResultEnum._1.getCode());
                result.getBody().setMsg(ResultEnum._1.getMsg() + ",验签失败");
                return result;
            }
            ExtProductDetailDTO dto = extMapper.detailProductById(model.getProductId());
           String [] limit= dto.getMinLimit().split(",");
           Arrays.sort(limit);
            dto.setMaxLimit(limit[0]);
            dto.setMinLimit(limit[limit.length-1]);
            dto.setrAmount("未定义");
            dto.setrType("未定义");
            result.getBody().setData(dto);
            result.getBody().setCode(ResultEnum._0.getCode());
            result.getBody().setMsg(ResultEnum._0.getMsg());
            logger.info("detailItem result", ToStringBuilder.reflectionToString(result), ToStringStyle.SHORT_PREFIX_STYLE);
            return result;
        } catch (Exception e) {
            logger.error("detailItem is error", e.getMessage(), e);
            result.getBody().setCode(ResultEnum._1.getCode());
            result.getBody().setMsg(ResultEnum._1.getMsg() + ",系统异常");
            return result;
        }
    }

    /**
     * 首页
     *
     * @return
     */
    public BaseResult index(BaseRequest request) {
        logger.info("index result");
        BaseResult result = new BaseResult();
        result.setHander(request.getHander());
        try {
            JSONObject jsonData = new JSONObject();
            JSONObject resultHotJson = JSONObject.parseObject(hotProductList(request).getBody().getData().toString());
            jsonData.put("hotLData", resultHotJson.getString("hotLoanData"));
            jsonData.put("hotCData", resultHotJson.getString("hotCardData"));
            jsonData.put("hornData", hornList(request).getBody().getData());
            jsonData.put("cycleData", roateInfo(request).getBody().getData());
            jsonData.put("recommendData", recommend(request).getBody().getData());

            result.getBody().setData(jsonData);
            result.getBody().setCode(ResultEnum._0.getCode());
            result.getBody().setMsg(ResultEnum._0.getMsg());
            logger.info("index result", ToStringBuilder.reflectionToString(result, ToStringStyle.SHORT_PREFIX_STYLE));
            return result;
        } catch (Exception e) {
            logger.error("index is error", e.getMessage(), e);
            result.getBody().setCode(ResultEnum._1.getCode());
            result.getBody().setMsg(ResultEnum._1.getMsg() + ",系统异常");
            return result;
        }
    }

    /**
     * 首页产品入口
     *
     * @return
     */
    public IndexProductEntranceResult indexProductList(IndexProductEntranceRequest request) {
        logger.info("indexProductList init", ToStringBuilder.reflectionToString(request, ToStringStyle.SHORT_PREFIX_STYLE));
        IndexProductEntranceResult result = new IndexProductEntranceResult();
        result.setHander(request.getHander());
        IndexProductEntranceBody model = request.getBody();
        try {
            String param = StringUtil.getSignChar(model);
            if (!StringUtil.isValidate(param, request.getHander().getT(), request.getHander().getSign())) {
                result.getBody().setCode(ResultEnum._1.getCode());
                result.getBody().setMsg(ResultEnum._1.getMsg() + ",验签失败");
                return result;
            }
            Page<ExtCreditProductDTO> pages = PageHelper.startPage(Integer.parseInt(model.getCurrentPage()), Integer.parseInt(model.getPageSize()), true, true);
            Map<String, String> paramMap = new HashMap<>();
            paramMap.put("entry_type", model.getEntryType());
            extMapper.indexProductList(paramMap);
            result.getBody().setData(pages.getResult());
            result.getBody().setPageSize(model.getPageSize());
            result.getBody().setCurrentPage(model.getCurrentPage());
            result.getBody().setCode(ResultEnum._0.getCode());
            result.getBody().setMsg(ResultEnum._0.getMsg());
            logger.info("indexProductList result", ToStringBuilder.reflectionToString(result, ToStringStyle.SHORT_PREFIX_STYLE));
            return result;
        } catch (Exception e) {
            logger.error("indexProductList is error", e.getMessage(), e);
            result.getBody().setCode(ResultEnum._1.getCode());
            result.getBody().setMsg(ResultEnum._1.getMsg() + ",系统异常");
            return result;
        }
    }


}
