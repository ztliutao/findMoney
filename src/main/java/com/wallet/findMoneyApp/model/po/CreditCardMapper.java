package com.wallet.findMoneyApp.model.po;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CreditCardMapper {
    int countByExample(CreditCardExample example);

    int deleteByExample(CreditCardExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CreditCard record);

    int insertSelective(CreditCard record);

    List<CreditCard> selectByExample(CreditCardExample example);

    CreditCard selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CreditCard record, @Param("example") CreditCardExample example);

    int updateByExample(@Param("record") CreditCard record, @Param("example") CreditCardExample example);

    int updateByPrimaryKeySelective(CreditCard record);

    int updateByPrimaryKey(CreditCard record);
}