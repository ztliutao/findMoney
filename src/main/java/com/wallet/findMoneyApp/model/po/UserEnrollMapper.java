package com.wallet.findMoneyApp.model.po;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserEnrollMapper {
    int countByExample(UserEnrollExample example);

    int deleteByExample(UserEnrollExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserEnroll record);

    int insertSelective(UserEnroll record);

    List<UserEnroll> selectByExample(UserEnrollExample example);

    UserEnroll selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserEnroll record, @Param("example") UserEnrollExample example);

    int updateByExample(@Param("record") UserEnroll record, @Param("example") UserEnrollExample example);

    int updateByPrimaryKeySelective(UserEnroll record);

    int updateByPrimaryKey(UserEnroll record);
}