package com.bingbing.paper.model;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import lombok.Data;

@Data
public class PageModel<T> {

    private Page<T> page = new Page<T>();

    private PageInfo<T> pageInfo = new PageInfo<T>();

    private Integer pageTotal;

}
