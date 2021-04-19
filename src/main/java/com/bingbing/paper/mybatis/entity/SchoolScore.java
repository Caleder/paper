package com.bingbing.paper.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

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

    private String schoolYear;

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolScore() {
        return schoolScore;
    }

    public void setSchoolScore(String schoolScore) {
        this.schoolScore = schoolScore;
    }

    public Integer getSchoolApply() {
        return schoolApply;
    }

    public void setSchoolApply(Integer schoolApply) {
        this.schoolApply = schoolApply;
    }

    public Integer getSchoolAdmit() {
        return schoolAdmit;
    }

    public void setSchoolAdmit(Integer schoolAdmit) {
        this.schoolAdmit = schoolAdmit;
    }

    public String getSchoolFile() {
        return schoolFile;
    }

    public void setSchoolFile(String schoolFile) {
        this.schoolFile = schoolFile;
    }

    public Boolean getBeginRepeat() {
        return beginRepeat;
    }

    public void setBeginRepeat(Boolean beginRepeat) {
        this.beginRepeat = beginRepeat;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getSchoolApplyAdmit() {
        return schoolApplyAdmit;
    }

    public void setSchoolApplyAdmit(String schoolApplyAdmit) {
        this.schoolApplyAdmit = schoolApplyAdmit;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    private static final long serialVersionUID = 1L;
}
