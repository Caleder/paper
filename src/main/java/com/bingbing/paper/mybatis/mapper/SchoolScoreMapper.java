package com.bingbing.paper.mybatis.mapper;

import com.bingbing.paper.mybatis.entity.SchoolScore;
import com.bingbing.paper.mybatis.entity.SchoolScoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolScoreMapper {
    int countByExample(SchoolScoreExample example);

    int deleteByExample(SchoolScoreExample example);

    int deleteByPrimaryKey(String id);

    int insert(SchoolScore record);

    int insertSelective(SchoolScore record);

    List<SchoolScore> selectByExample(SchoolScoreExample example);

    SchoolScore selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SchoolScore record, @Param("example") SchoolScoreExample example);

    int updateByExample(@Param("record") SchoolScore record, @Param("example") SchoolScoreExample example);

    int updateByPrimaryKeySelective(SchoolScore record);

    int updateByPrimaryKey(SchoolScore record);
}