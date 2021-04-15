package com.bingbing.paper.mybatis.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SchoolRank implements Serializable {
    private String id;

    /**
     * 院校名称
     *
     * @mbggenerated
     */
    private String schoolName;

    /**
     * 院校信息
     *
     * @mbggenerated
     */
    private String schoolContent;

    /**
     * 院校排名
     *
     * @mbggenerated
     */
    private Integer schoolRank;

    /**
     * 院校联系方式
     *
     * @mbggenerated
     */
    private String schoolTel;

    /**
     * 院校院网
     *
     * @mbggenerated
     */
    private String schoolWebUrl;

    private Date gmtCreate;

    private Boolean enabled;

    private static final long serialVersionUID = 1L;

}