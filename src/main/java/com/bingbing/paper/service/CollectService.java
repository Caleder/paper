package com.bingbing.paper.service;

import com.bingbing.paper.form.CollectForm;
import com.bingbing.paper.mybatis.entity.Collect;
import com.github.pagehelper.Page;

import java.util.List;

public interface CollectService {

    Page<Collect> getCollectPage(Page<Collect> page, CollectForm collectForm);

    int getCollectCount(CollectForm collectForm);

    void updateCollect(String id);

    void addCollect(String schoolId,String userId);

    Collect getCollect(String id);

    Collect getCollectBySchoolId(String schoolId);

    List<Collect> getCollectList(String userId);

}
