package com.wallet.findMoneyApp.model.po;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CreditProductMapper {
    int countByExample(CreditProductExample example);

    int deleteByExample(CreditProductExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CreditProduct record);

    int insertSelective(CreditProduct record);

    List<CreditProduct> selectByExample(CreditProductExample example);

    CreditProduct selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CreditProduct record, @Param("example") CreditProductExample example);

    int updateByExample(@Param("record") CreditProduct record, @Param("example") CreditProductExample example);

    int updateByPrimaryKeySelective(CreditProduct record);

    int updateByPrimaryKey(CreditProduct record);
}