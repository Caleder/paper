package com.bingbing.paper.mybatis.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SchoolScore implements Serializable {
    private String id;

    /**
     * 院校id
     *
     * @mbggenerated
     */
    private String schoolId;

    /**
     * 院校复试线
     *
     * @mbggenerated
     */
    private String schoolScore;

    /**
     * 院校报名人数
     *
     * @mbggenerated
     */
    private Integer schoolApply;

    /**
     * 院校录取人数
     *
     * @mbggenerated
     */
    private Integer schoolAdmit;

    /**
     * 初复试资料
     *
     * @mbggenerated
     */
    private String schoolFile;

    /**
     * 初试：1/复试：0
     *
     * @mbggenerated
     */
    private Boolean beginRepeat;

    private Date gmtCreate;

    private Boolean enabled;

    private String schoolApplyAdmit;

    private String schoolName;

    private static final long serialVersionUID = 1L;
}
