package com.wallet.findMoneyApp.model.po;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ExtApplyRecordMapper {
    /**
     * 通过userID查询所有贷款申请列表
     *
     * @param userId
     * @return
     */
    public List<ApplyInfoPO> getApplyLInfoList(String userId);

    /**
     * 根据userId查询信用卡申请列表
     *
     * @param userId
     * @return
     */
    public List<ApplyInfoPO> getApplyPInfoList(String userId);

    /**
     * 根据条件查询贷款列表
     *
     * @param param
     * @return
     */
    public List<ExtCreditProductDTO> productList(Map<String, String> param);

    /**
     * 根据条件查询信用卡列表
     *
     * @param param
     * @return
     */
    public List<ExtCardProductDTO> cardProductList(Map<String, String> param);

    /**
     * 根据产品ID查询产品详情
     *
     * @param productId
     * @return
     */
    public ExtProductDetailDTO detailProductById(String productId);

    /**
     * 根据入口获取贷款列表
     *
     * @param param
     * @return
     */
    public List<ExtCreditProductDTO> indexProductList(Map<String, String> param);

}
