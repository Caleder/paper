package com.bingbing.paper.mybatis.mapper;

import com.bingbing.paper.mybatis.entity.SchoolBegin;
import com.bingbing.paper.mybatis.entity.SchoolBeginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolBeginMapper {
    int countByExample(SchoolBeginExample example);

    int deleteByExample(SchoolBeginExample example);

    int deleteByPrimaryKey(String id);

    int insert(SchoolBegin record);

    int insertSelective(SchoolBegin record);

    List<SchoolBegin> selectByExample(SchoolBeginExample example);

    SchoolBegin selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SchoolBegin record, @Param("example") SchoolBeginExample example);

    int updateByExample(@Param("record") SchoolBegin record, @Param("example") SchoolBeginExample example);

    int updateByPrimaryKeySelective(SchoolBegin record);

    int updateByPrimaryKey(SchoolBegin record);
}
