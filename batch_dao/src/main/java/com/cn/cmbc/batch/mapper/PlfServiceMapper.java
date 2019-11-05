package com.cn.cmbc.batch.mapper;

import com.cn.cmbc.batch.po.PlfService;
import com.cn.cmbc.batch.po.PlfServiceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlfServiceMapper {
    int countByExample(PlfServiceExample example);

    int deleteByExample(PlfServiceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PlfService record);

    int insertSelective(PlfService record);

    List<PlfService> selectByExample(PlfServiceExample example);

    PlfService selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PlfService record, @Param("example") PlfServiceExample example);

    int updateByExample(@Param("record") PlfService record, @Param("example") PlfServiceExample example);

    int updateByPrimaryKeySelective(PlfService record);

    int updateByPrimaryKey(PlfService record);
}