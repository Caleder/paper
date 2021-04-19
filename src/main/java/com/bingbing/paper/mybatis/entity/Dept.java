package com.bingbing.paper.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class Dept implements Serializable {
    private String id;

    /**
     * 部门名称
     *
     * @mbggenerated
     */
    private String deptName;

    /**
     * 院校id
     *
     * @mbggenerated
     */
    private String schoolId;

    /**
     * 院校名称
     *
     * @mbggenerated
     */
    private String schoolName;

    /**
     * 部门简介
     *
     * @mbggenerated
     */
    private String deptContent;

    /**
     * 部门负责人id
     *
     * @mbggenerated
     */
    private String deptLeaderId;

    /**
     * 部门负责人
     *
     * @mbggenerated
     */
    private String deptLeaderName;

    private Date gmtCreate;

    private Boolean enabled;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getDeptContent() {
        return deptContent;
    }

    public void setDeptContent(String deptContent) {
        this.deptContent = deptContent;
    }

    public String getDeptLeaderId() {
        return deptLeaderId;
    }

    public void setDeptLeaderId(String deptLeaderId) {
        this.deptLeaderId = deptLeaderId;
    }

    public String getDeptLeaderName() {
        return deptLeaderName;
    }

    public void setDeptLeaderName(String deptLeaderName) {
        this.deptLeaderName = deptLeaderName;
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
        sb.append(", deptName=").append(deptName);
        sb.append(", schoolId=").append(schoolId);
        sb.append(", schoolName=").append(schoolName);
        sb.append(", deptContent=").append(deptContent);
        sb.append(", deptLeaderId=").append(deptLeaderId);
        sb.append(", deptLeaderName=").append(deptLeaderName);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", enabled=").append(enabled);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
