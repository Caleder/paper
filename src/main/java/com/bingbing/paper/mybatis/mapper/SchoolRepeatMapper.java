package com.bingbing.paper.mybatis.mapper;

import com.bingbing.paper.mybatis.entity.SchoolRepeat;
import com.bingbing.paper.mybatis.entity.SchoolRepeatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepeatMapper {
    int countByExample(SchoolRepeatExample example);

    int deleteByExample(SchoolRepeatExample example);

    int deleteByPrimaryKey(String id);

    int insert(SchoolRepeat record);

    int insertSelective(SchoolRepeat record);

    List<SchoolRepeat> selectByExample(SchoolRepeatExample example);

    SchoolRepeat selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SchoolRepeat record, @Param("example") SchoolRepeatExample example);

    int updateByExample(@Param("record") SchoolRepeat record, @Param("example") SchoolRepeatExample example);

    int updateByPrimaryKeySelective(SchoolRepeat record);

    int updateByPrimaryKey(SchoolRepeat record);
}
