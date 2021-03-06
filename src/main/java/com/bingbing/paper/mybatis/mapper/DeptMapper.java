package com.bingbing.paper.mybatis.mapper;

import com.bingbing.paper.mybatis.entity.Dept;
import com.bingbing.paper.mybatis.entity.DeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptMapper {
    int countByExample(DeptExample example);

    int deleteByExample(DeptExample example);

    int deleteByPrimaryKey(String id);

    int insert(Dept record);

    int insertSelective(Dept record);

    List<Dept> selectByExample(DeptExample example);

    Dept selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Dept record, @Param("example") DeptExample example);

    int updateByExample(@Param("record") Dept record, @Param("example") DeptExample example);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}
