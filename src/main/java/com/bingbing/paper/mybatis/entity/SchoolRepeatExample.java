package com.bingbing.paper.mybatis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SchoolRepeatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchoolRepeatExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNull() {
            addCriterion("school_name is null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNotNull() {
            addCriterion("school_name is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameEqualTo(String value) {
            addCriterion("school_name =", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotEqualTo(String value) {
            addCriterion("school_name <>", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThan(String value) {
            addCriterion("school_name >", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThanOrEqualTo(String value) {
            addCriterion("school_name >=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThan(String value) {
            addCriterion("school_name <", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThanOrEqualTo(String value) {
            addCriterion("school_name <=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLike(String value) {
            addCriterion("school_name like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotLike(String value) {
            addCriterion("school_name not like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIn(List<String> values) {
            addCriterion("school_name in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotIn(List<String> values) {
            addCriterion("school_name not in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameBetween(String value1, String value2) {
            addCriterion("school_name between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotBetween(String value1, String value2) {
            addCriterion("school_name not between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolYearIsNull() {
            addCriterion("school_year is null");
            return (Criteria) this;
        }

        public Criteria andSchoolYearIsNotNull() {
            addCriterion("school_year is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolYearEqualTo(String value) {
            addCriterion("school_year =", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNotEqualTo(String value) {
            addCriterion("school_year <>", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearGreaterThan(String value) {
            addCriterion("school_year >", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearGreaterThanOrEqualTo(String value) {
            addCriterion("school_year >=", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearLessThan(String value) {
            addCriterion("school_year <", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearLessThanOrEqualTo(String value) {
            addCriterion("school_year <=", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearLike(String value) {
            addCriterion("school_year like", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNotLike(String value) {
            addCriterion("school_year not like", value, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearIn(List<String> values) {
            addCriterion("school_year in", values, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNotIn(List<String> values) {
            addCriterion("school_year not in", values, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearBetween(String value1, String value2) {
            addCriterion("school_year between", value1, value2, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andSchoolYearNotBetween(String value1, String value2) {
            addCriterion("school_year not between", value1, value2, "schoolYear");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("dept_name is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("dept_name =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("dept_name <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("dept_name >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("dept_name >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("dept_name <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("dept_name <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("dept_name like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("dept_name not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("dept_name in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("dept_name not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("dept_name between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("dept_name not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andMajorNameIsNull() {
            addCriterion("major_name is null");
            return (Criteria) this;
        }

        public Criteria andMajorNameIsNotNull() {
            addCriterion("major_name is not null");
            return (Criteria) this;
        }

        public Criteria andMajorNameEqualTo(String value) {
            addCriterion("major_name =", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotEqualTo(String value) {
            addCriterion("major_name <>", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameGreaterThan(String value) {
            addCriterion("major_name >", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameGreaterThanOrEqualTo(String value) {
            addCriterion("major_name >=", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLessThan(String value) {
            addCriterion("major_name <", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLessThanOrEqualTo(String value) {
            addCriterion("major_name <=", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLike(String value) {
            addCriterion("major_name like", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotLike(String value) {
            addCriterion("major_name not like", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameIn(List<String> values) {
            addCriterion("major_name in", values, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotIn(List<String> values) {
            addCriterion("major_name not in", values, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameBetween(String value1, String value2) {
            addCriterion("major_name between", value1, value2, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotBetween(String value1, String value2) {
            addCriterion("major_name not between", value1, value2, "majorName");
            return (Criteria) this;
        }

        public Criteria andRepeatContentIsNull() {
            addCriterion("repeat_content is null");
            return (Criteria) this;
        }

        public Criteria andRepeatContentIsNotNull() {
            addCriterion("repeat_content is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatContentEqualTo(String value) {
            addCriterion("repeat_content =", value, "repeatContent");
            return (Criteria) this;
        }

        public Criteria andRepeatContentNotEqualTo(String value) {
            addCriterion("repeat_content <>", value, "repeatContent");
            return (Criteria) this;
        }

        public Criteria andRepeatContentGreaterThan(String value) {
            addCriterion("repeat_content >", value, "repeatContent");
            return (Criteria) this;
        }

        public Criteria andRepeatContentGreaterThanOrEqualTo(String value) {
            addCriterion("repeat_content >=", value, "repeatContent");
            return (Criteria) this;
        }

        public Criteria andRepeatContentLessThan(String value) {
            addCriterion("repeat_content <", value, "repeatContent");
            return (Criteria) this;
        }

        public Criteria andRepeatContentLessThanOrEqualTo(String value) {
            addCriterion("repeat_content <=", value, "repeatContent");
            return (Criteria) this;
        }

        public Criteria andRepeatContentLike(String value) {
            addCriterion("repeat_content like", value, "repeatContent");
            return (Criteria) this;
        }

        public Criteria andRepeatContentNotLike(String value) {
            addCriterion("repeat_content not like", value, "repeatContent");
            return (Criteria) this;
        }

        public Criteria andRepeatContentIn(List<String> values) {
            addCriterion("repeat_content in", values, "repeatContent");
            return (Criteria) this;
        }

        public Criteria andRepeatContentNotIn(List<String> values) {
            addCriterion("repeat_content not in", values, "repeatContent");
            return (Criteria) this;
        }

        public Criteria andRepeatContentBetween(String value1, String value2) {
            addCriterion("repeat_content between", value1, value2, "repeatContent");
            return (Criteria) this;
        }

        public Criteria andRepeatContentNotBetween(String value1, String value2) {
            addCriterion("repeat_content not between", value1, value2, "repeatContent");
            return (Criteria) this;
        }

        public Criteria andRepeatBookIsNull() {
            addCriterion("repeat_book is null");
            return (Criteria) this;
        }

        public Criteria andRepeatBookIsNotNull() {
            addCriterion("repeat_book is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatBookEqualTo(String value) {
            addCriterion("repeat_book =", value, "repeatBook");
            return (Criteria) this;
        }

        public Criteria andRepeatBookNotEqualTo(String value) {
            addCriterion("repeat_book <>", value, "repeatBook");
            return (Criteria) this;
        }

        public Criteria andRepeatBookGreaterThan(String value) {
            addCriterion("repeat_book >", value, "repeatBook");
            return (Criteria) this;
        }

        public Criteria andRepeatBookGreaterThanOrEqualTo(String value) {
            addCriterion("repeat_book >=", value, "repeatBook");
            return (Criteria) this;
        }

        public Criteria andRepeatBookLessThan(String value) {
            addCriterion("repeat_book <", value, "repeatBook");
            return (Criteria) this;
        }

        public Criteria andRepeatBookLessThanOrEqualTo(String value) {
            addCriterion("repeat_book <=", value, "repeatBook");
            return (Criteria) this;
        }

        public Criteria andRepeatBookLike(String value) {
            addCriterion("repeat_book like", value, "repeatBook");
            return (Criteria) this;
        }

        public Criteria andRepeatBookNotLike(String value) {
            addCriterion("repeat_book not like", value, "repeatBook");
            return (Criteria) this;
        }

        public Criteria andRepeatBookIn(List<String> values) {
            addCriterion("repeat_book in", values, "repeatBook");
            return (Criteria) this;
        }

        public Criteria andRepeatBookNotIn(List<String> values) {
            addCriterion("repeat_book not in", values, "repeatBook");
            return (Criteria) this;
        }

        public Criteria andRepeatBookBetween(String value1, String value2) {
            addCriterion("repeat_book between", value1, value2, "repeatBook");
            return (Criteria) this;
        }

        public Criteria andRepeatBookNotBetween(String value1, String value2) {
            addCriterion("repeat_book not between", value1, value2, "repeatBook");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(String value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(String value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(String value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(String value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(String value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(String value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLike(String value) {
            addCriterion("score like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotLike(String value) {
            addCriterion("score not like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<String> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<String> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(String value1, String value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(String value1, String value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andSchoolApplyIsNull() {
            addCriterion("school_apply is null");
            return (Criteria) this;
        }

        public Criteria andSchoolApplyIsNotNull() {
            addCriterion("school_apply is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolApplyEqualTo(Integer value) {
            addCriterion("school_apply =", value, "schoolApply");
            return (Criteria) this;
        }

        public Criteria andSchoolApplyNotEqualTo(Integer value) {
            addCriterion("school_apply <>", value, "schoolApply");
            return (Criteria) this;
        }

        public Criteria andSchoolApplyGreaterThan(Integer value) {
            addCriterion("school_apply >", value, "schoolApply");
            return (Criteria) this;
        }

        public Criteria andSchoolApplyGreaterThanOrEqualTo(Integer value) {
            addCriterion("school_apply >=", value, "schoolApply");
            return (Criteria) this;
        }

        public Criteria andSchoolApplyLessThan(Integer value) {
            addCriterion("school_apply <", value, "schoolApply");
            return (Criteria) this;
        }

        public Criteria andSchoolApplyLessThanOrEqualTo(Integer value) {
            addCriterion("school_apply <=", value, "schoolApply");
            return (Criteria) this;
        }

        public Criteria andSchoolApplyIn(List<Integer> values) {
            addCriterion("school_apply in", values, "schoolApply");
            return (Criteria) this;
        }

        public Criteria andSchoolApplyNotIn(List<Integer> values) {
            addCriterion("school_apply not in", values, "schoolApply");
            return (Criteria) this;
        }

        public Criteria andSchoolApplyBetween(Integer value1, Integer value2) {
            addCriterion("school_apply between", value1, value2, "schoolApply");
            return (Criteria) this;
        }

        public Criteria andSchoolApplyNotBetween(Integer value1, Integer value2) {
            addCriterion("school_apply not between", value1, value2, "schoolApply");
            return (Criteria) this;
        }

        public Criteria andSchoolAdmitIsNull() {
            addCriterion("school_admit is null");
            return (Criteria) this;
        }

        public Criteria andSchoolAdmitIsNotNull() {
            addCriterion("school_admit is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolAdmitEqualTo(Integer value) {
            addCriterion("school_admit =", value, "schoolAdmit");
            return (Criteria) this;
        }

        public Criteria andSchoolAdmitNotEqualTo(Integer value) {
            addCriterion("school_admit <>", value, "schoolAdmit");
            return (Criteria) this;
        }

        public Criteria andSchoolAdmitGreaterThan(Integer value) {
            addCriterion("school_admit >", value, "schoolAdmit");
            return (Criteria) this;
        }

        public Criteria andSchoolAdmitGreaterThanOrEqualTo(Integer value) {
            addCriterion("school_admit >=", value, "schoolAdmit");
            return (Criteria) this;
        }

        public Criteria andSchoolAdmitLessThan(Integer value) {
            addCriterion("school_admit <", value, "schoolAdmit");
            return (Criteria) this;
        }

        public Criteria andSchoolAdmitLessThanOrEqualTo(Integer value) {
            addCriterion("school_admit <=", value, "schoolAdmit");
            return (Criteria) this;
        }

        public Criteria andSchoolAdmitIn(List<Integer> values) {
            addCriterion("school_admit in", values, "schoolAdmit");
            return (Criteria) this;
        }

        public Criteria andSchoolAdmitNotIn(List<Integer> values) {
            addCriterion("school_admit not in", values, "schoolAdmit");
            return (Criteria) this;
        }

        public Criteria andSchoolAdmitBetween(Integer value1, Integer value2) {
            addCriterion("school_admit between", value1, value2, "schoolAdmit");
            return (Criteria) this;
        }

        public Criteria andSchoolAdmitNotBetween(Integer value1, Integer value2) {
            addCriterion("school_admit not between", value1, value2, "schoolAdmit");
            return (Criteria) this;
        }

        public Criteria andSchoolApplyAdmitIsNull() {
            addCriterion("school_apply_admit is null");
            return (Criteria) this;
        }

        public Criteria andSchoolApplyAdmitIsNotNull() {
            addCriterion("school_apply_admit is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolApplyAdmitEqualTo(String value) {
            addCriterion("school_apply_admit =", value, "schoolApplyAdmit");
            return (Criteria) this;
        }

        public Criteria andSchoolApplyAdmitNotEqualTo(String value) {
            addCriterion("school_apply_admit <>", value, "schoolApplyAdmit");
            return (Criteria) this;
        }

        public Criteria andSchoolApplyAdmitGreaterThan(String value) {
            addCriterion("school_apply_admit >", value, "schoolApplyAdmit");
            return (Criteria) this;
        }

        public Criteria andSchoolApplyAdmitGreaterThanOrEqualTo(String value) {
            addCriterion("school_apply_admit >=", value, "schoolApplyAdmit");
            return (Criteria) this;
        }

        public Criteria andSchoolApplyAdmitLessThan(String value) {
            addCriterion("school_apply_admit <", value, "schoolApplyAdmit");
            return (Criteria) this;
        }

        public Criteria andSchoolApplyAdmitLessThanOrEqualTo(String value) {
            addCriterion("school_apply_admit <=", value, "schoolApplyAdmit");
            return (Criteria) this;
        }

        public Criteria andSchoolApplyAdmitLike(String value) {
            addCriterion("school_apply_admit like", value, "schoolApplyAdmit");
            return (Criteria) this;
        }

        public Criteria andSchoolApplyAdmitNotLike(String value) {
            addCriterion("school_apply_admit not like", value, "schoolApplyAdmit");
            return (Criteria) this;
        }

        public Criteria andSchoolApplyAdmitIn(List<String> values) {
            addCriterion("school_apply_admit in", values, "schoolApplyAdmit");
            return (Criteria) this;
        }

        public Criteria andSchoolApplyAdmitNotIn(List<String> values) {
            addCriterion("school_apply_admit not in", values, "schoolApplyAdmit");
            return (Criteria) this;
        }

        public Criteria andSchoolApplyAdmitBetween(String value1, String value2) {
            addCriterion("school_apply_admit between", value1, value2, "schoolApplyAdmit");
            return (Criteria) this;
        }

        public Criteria andSchoolApplyAdmitNotBetween(String value1, String value2) {
            addCriterion("school_apply_admit not between", value1, value2, "schoolApplyAdmit");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(Boolean value) {
            addCriterion("enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(Boolean value) {
            addCriterion("enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(Boolean value) {
            addCriterion("enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(Boolean value) {
            addCriterion("enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(Boolean value) {
            addCriterion("enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<Boolean> values) {
            addCriterion("enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<Boolean> values) {
            addCriterion("enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(Boolean value1, Boolean value2) {
            addCriterion("enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
