package com.wallet.findMoneyApp.model.po;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ApplyRecordMapper {
    int countByExample(ApplyRecordExample example);

    int deleteByExample(ApplyRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ApplyRecord record);

    int insertSelective(ApplyRecord record);

    List<ApplyRecord> selectByExample(ApplyRecordExample example);

    ApplyRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ApplyRecord record, @Param("example") ApplyRecordExample example);

    int updateByExample(@Param("record") ApplyRecord record, @Param("example") ApplyRecordExample example);

    int updateByPrimaryKeySelective(ApplyRecord record);

    int updateByPrimaryKey(ApplyRecord record);
}