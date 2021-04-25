package com.bingbing.paper.model;

public class CollectModel {

    private String schoolName;

    private String schoolWebUrl;

    private String schoolTel;

    private String schoolContent;

    private String affiliation;

    private String grade;

    private String cityName;

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

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    private Integer schoolRank;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolWebUrl() {
        return schoolWebUrl;
    }

    public void setSchoolWebUrl(String schoolWebUrl) {
        this.schoolWebUrl = schoolWebUrl;
    }

    public String getSchoolTel() {
        return schoolTel;
    }

    public void setSchoolTel(String schoolTel) {
        this.schoolTel = schoolTel;
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
}
