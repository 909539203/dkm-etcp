package com.etcp.mapper;

import com.etcp.pojo.TbRentLog;
import com.etcp.pojo.TbRentLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbRentLogMapper {
    int countByExample(TbRentLogExample example);

    int deleteByExample(TbRentLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbRentLog record);

    int insertSelective(TbRentLog record);

    List<TbRentLog> selectByExample(TbRentLogExample example);

    TbRentLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbRentLog record, @Param("example") TbRentLogExample example);

    int updateByExample(@Param("record") TbRentLog record, @Param("example") TbRentLogExample example);

    int updateByPrimaryKeySelective(TbRentLog record);

    int updateByPrimaryKey(TbRentLog record);
}