package com.bingbing.paper.model;

import com.github.pagehelper.Page;
import lombok.Data;

@Data
public class PageModel<T> {

    private Page<T> page = new Page<T>();

    private Integer pageTotal;

}
