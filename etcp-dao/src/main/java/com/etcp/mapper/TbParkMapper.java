package com.etcp.mapper;

import com.etcp.pojo.TbPark;
import com.etcp.pojo.TbParkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbParkMapper {
    int countByExample(TbParkExample example);

    int deleteByExample(TbParkExample example);

    int deleteByPrimaryKey(Long parkId);

    int insert(TbPark record);

    int insertSelective(TbPark record);

    List<TbPark> selectByExample(TbParkExample example);

    TbPark selectByPrimaryKey(Long parkId);

    int updateByExampleSelective(@Param("record") TbPark record, @Param("example") TbParkExample example);

    int updateByExample(@Param("record") TbPark record, @Param("example") TbParkExample example);

    int updateByPrimaryKeySelective(TbPark record);

    int updateByPrimaryKey(TbPark record);
}