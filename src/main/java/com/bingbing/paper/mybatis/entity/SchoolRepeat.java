package com.bingbing.paper.mybatis.entity;

import java.io.Serializable;
import java.util.Date;

public class SchoolRepeat implements Serializable {
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
     * 复试专业内容
     *
     * @mbggenerated
     */
    private String repeatContent;

    /**
     * 复试专业参考书
     *
     * @mbggenerated
     */
    private String repeatBook;

    /**
     * 复试线
     *
     * @mbggenerated
     */
    private String score;

    /**
     * 报考人数
     *
     * @mbggenerated
     */
    private Integer schoolApply;

    /**
     * 录取人数
     *
     * @mbggenerated
     */
    private Integer schoolAdmit;

    /**
     * 报录比
     *
     * @mbggenerated
     */
    private String schoolApplyAdmit;

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

    public String getRepeatContent() {
        return repeatContent;
    }

    public void setRepeatContent(String repeatContent) {
        this.repeatContent = repeatContent;
    }

    public String getRepeatBook() {
        return repeatBook;
    }

    public void setRepeatBook(String repeatBook) {
        this.repeatBook = repeatBook;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
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

    public String getSchoolApplyAdmit() {
        return schoolApplyAdmit;
    }

    public void setSchoolApplyAdmit(String schoolApplyAdmit) {
        this.schoolApplyAdmit = schoolApplyAdmit;
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
        sb.append(", repeatContent=").append(repeatContent);
        sb.append(", repeatBook=").append(repeatBook);
        sb.append(", score=").append(score);
        sb.append(", schoolApply=").append(schoolApply);
        sb.append(", schoolAdmit=").append(schoolAdmit);
        sb.append(", schoolApplyAdmit=").append(schoolApplyAdmit);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", enabled=").append(enabled);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
