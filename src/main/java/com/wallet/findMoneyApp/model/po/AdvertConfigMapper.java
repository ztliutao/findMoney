package com.wallet.findMoneyApp.model.po;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AdvertConfigMapper {
    int countByExample(AdvertConfigExample example);

    int deleteByExample(AdvertConfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdvertConfig record);

    int insertSelective(AdvertConfig record);

    List<AdvertConfig> selectByExample(AdvertConfigExample example);

    AdvertConfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdvertConfig record, @Param("example") AdvertConfigExample example);

    int updateByExample(@Param("record") AdvertConfig record, @Param("example") AdvertConfigExample example);

    int updateByPrimaryKeySelective(AdvertConfig record);

    int updateByPrimaryKey(AdvertConfig record);
}