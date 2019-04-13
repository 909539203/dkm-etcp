package com.etcp.mapper;

import com.etcp.pojo.TbCarLog;
import com.etcp.pojo.TbCarLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbCarLogMapper {
    int countByExample(TbCarLogExample example);

    int deleteByExample(TbCarLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbCarLog record);

    int insertSelective(TbCarLog record);

    List<TbCarLog> selectByExample(TbCarLogExample example);

    TbCarLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbCarLog record, @Param("example") TbCarLogExample example);

    int updateByExample(@Param("record") TbCarLog record, @Param("example") TbCarLogExample example);

    int updateByPrimaryKeySelective(TbCarLog record);

    int updateByPrimaryKey(TbCarLog record);
}