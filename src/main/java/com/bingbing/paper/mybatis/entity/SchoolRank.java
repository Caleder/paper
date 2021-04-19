package com.bingbing.paper.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

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

    private Boolean collected;

    private String cityName;

    private String affiliation;

    private String grade;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolContent() {
        return schoolContent;
    }

    public void setSchoolContent(String schoolContent) {
        this.schoolContent = schoolContent;
    }

    public Integer getSchoolRank() {
        return schoolRank;
    }

    public void setSchoolRank(Integer schoolRank) {
        this.schoolRank = schoolRank;
    }

    public String getSchoolTel() {
        return schoolTel;
    }

    public void setSchoolTel(String schoolTel) {
        this.schoolTel = schoolTel;
    }

    public String getSchoolWebUrl() {
        return schoolWebUrl;
    }

    public void setSchoolWebUrl(String schoolWebUrl) {
        this.schoolWebUrl = schoolWebUrl;
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

    public Boolean getCollected() {
        return collected;
    }

    public void setCollected(Boolean collected) {
        this.collected = collected;
    }

    private static final long serialVersionUID = 1L;

}
