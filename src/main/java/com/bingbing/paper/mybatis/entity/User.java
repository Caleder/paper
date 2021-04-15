package com.bingbing.paper.mybatis.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    private String id;

    private String username;

    private String password;

    private String mobile;

    private Date gmtCreate;

    private Boolean enabled;

    private static final long serialVersionUID = 1L;

}
