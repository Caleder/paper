package com.bingbing.paper.mybatis.mapper;

import com.bingbing.paper.mybatis.entity.SchoolRank;
import com.bingbing.paper.mybatis.entity.SchoolRankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRankMapper {
    int countByExample(SchoolRankExample example);

    int deleteByExample(SchoolRankExample example);

    int deleteByPrimaryKey(String id);

    int insert(SchoolRank record);

    int insertSelective(SchoolRank record);

    List<SchoolRank> selectByExample(SchoolRankExample example);

    SchoolRank selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SchoolRank record, @Param("example") SchoolRankExample example);

    int updateByExample(@Param("record") SchoolRank record, @Param("example") SchoolRankExample example);

    int updateByPrimaryKeySelective(SchoolRank record);

    int updateByPrimaryKey(SchoolRank record);
}