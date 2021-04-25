package com.bingbing.paper.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class SchoolBegin implements Serializable {
    private String id;

    /**
     * 院校名称
     *
     * @mbggenerated
     */
    private String schoolName;

    /**
     * 学年
     *
     * @mbggenerated
     */
    private String schoolYear;

    /**
     * 学院名称
     *
     * @mbggenerated
     */
    private String deptName;

    /**
     * 专业名称
     *
     * @mbggenerated
     */
    private String majorName;

    /**
     * 计划名额
     *
     * @mbggenerated
     */
    private String planNum;

    /**
     * 初试专业内容
     *
     * @mbggenerated
     */
    private String beginContent;

    /**
     * 初试专业参考书
     *
     * @mbggenerated
     */
    private String beginBook;

    private Date gmtCreate;

    private Boolean enabled;

    private static final long serialVersionUID = 1L;

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

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getPlanNum() {
        return planNum;
    }

    public void setPlanNum(String planNum) {
        this.planNum = planNum;
    }

    public String getBeginContent() {
        return beginContent;
    }

    public void setBeginContent(String beginContent) {
        this.beginContent = beginContent;
    }

    public String getBeginBook() {
        return beginBook;
    }

    public void setBeginBook(String beginBook) {
        this.beginBook = beginBook;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", schoolName=").append(schoolName);
        sb.append(", schoolYear=").append(schoolYear);
        sb.append(", deptName=").append(deptName);
        sb.append(", majorName=").append(majorName);
        sb.append(", planNum=").append(planNum);
        sb.append(", beginContent=").append(beginContent);
        sb.append(", beginBook=").append(beginBook);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", enabled=").append(enabled);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
