package com.wallet.findMoneyApp.model.po;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CreditProductDetailedMapper {
    int countByExample(CreditProductDetailedExample example);

    int deleteByExample(CreditProductDetailedExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CreditProductDetailed record);

    int insertSelective(CreditProductDetailed record);

    List<CreditProductDetailed> selectByExample(CreditProductDetailedExample example);

    CreditProductDetailed selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CreditProductDetailed record, @Param("example") CreditProductDetailedExample example);

    int updateByExample(@Param("record") CreditProductDetailed record, @Param("example") CreditProductDetailedExample example);

    int updateByPrimaryKeySelective(CreditProductDetailed record);

    int updateByPrimaryKey(CreditProductDetailed record);
}