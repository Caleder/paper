package com.bingbing.paper.mybatis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeptExample() {
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

        public Criteria andSchoolIdIsNull() {
            addCriterion("school_id is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNotNull() {
            addCriterion("school_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdEqualTo(String value) {
            addCriterion("school_id =", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotEqualTo(String value) {
            addCriterion("school_id <>", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThan(String value) {
            addCriterion("school_id >", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThanOrEqualTo(String value) {
            addCriterion("school_id >=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThan(String value) {
            addCriterion("school_id <", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThanOrEqualTo(String value) {
            addCriterion("school_id <=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLike(String value) {
            addCriterion("school_id like", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotLike(String value) {
            addCriterion("school_id not like", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIn(List<String> values) {
            addCriterion("school_id in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotIn(List<String> values) {
            addCriterion("school_id not in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdBetween(String value1, String value2) {
            addCriterion("school_id between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotBetween(String value1, String value2) {
            addCriterion("school_id not between", value1, value2, "schoolId");
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

        public Criteria andDeptContentIsNull() {
            addCriterion("dept_content is null");
            return (Criteria) this;
        }

        public Criteria andDeptContentIsNotNull() {
            addCriterion("dept_content is not null");
            return (Criteria) this;
        }

        public Criteria andDeptContentEqualTo(String value) {
            addCriterion("dept_content =", value, "deptContent");
            return (Criteria) this;
        }

        public Criteria andDeptContentNotEqualTo(String value) {
            addCriterion("dept_content <>", value, "deptContent");
            return (Criteria) this;
        }

        public Criteria andDeptContentGreaterThan(String value) {
            addCriterion("dept_content >", value, "deptContent");
            return (Criteria) this;
        }

        public Criteria andDeptContentGreaterThanOrEqualTo(String value) {
            addCriterion("dept_content >=", value, "deptContent");
            return (Criteria) this;
        }

        public Criteria andDeptContentLessThan(String value) {
            addCriterion("dept_content <", value, "deptContent");
            return (Criteria) this;
        }

        public Criteria andDeptContentLessThanOrEqualTo(String value) {
            addCriterion("dept_content <=", value, "deptContent");
            return (Criteria) this;
        }

        public Criteria andDeptContentLike(String value) {
            addCriterion("dept_content like", value, "deptContent");
            return (Criteria) this;
        }

        public Criteria andDeptContentNotLike(String value) {
            addCriterion("dept_content not like", value, "deptContent");
            return (Criteria) this;
        }

        public Criteria andDeptContentIn(List<String> values) {
            addCriterion("dept_content in", values, "deptContent");
            return (Criteria) this;
        }

        public Criteria andDeptContentNotIn(List<String> values) {
            addCriterion("dept_content not in", values, "deptContent");
            return (Criteria) this;
        }

        public Criteria andDeptContentBetween(String value1, String value2) {
            addCriterion("dept_content between", value1, value2, "deptContent");
            return (Criteria) this;
        }

        public Criteria andDeptContentNotBetween(String value1, String value2) {
            addCriterion("dept_content not between", value1, value2, "deptContent");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderIdIsNull() {
            addCriterion("dept_leader_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderIdIsNotNull() {
            addCriterion("dept_leader_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderIdEqualTo(String value) {
            addCriterion("dept_leader_id =", value, "deptLeaderId");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderIdNotEqualTo(String value) {
            addCriterion("dept_leader_id <>", value, "deptLeaderId");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderIdGreaterThan(String value) {
            addCriterion("dept_leader_id >", value, "deptLeaderId");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderIdGreaterThanOrEqualTo(String value) {
            addCriterion("dept_leader_id >=", value, "deptLeaderId");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderIdLessThan(String value) {
            addCriterion("dept_leader_id <", value, "deptLeaderId");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderIdLessThanOrEqualTo(String value) {
            addCriterion("dept_leader_id <=", value, "deptLeaderId");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderIdLike(String value) {
            addCriterion("dept_leader_id like", value, "deptLeaderId");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderIdNotLike(String value) {
            addCriterion("dept_leader_id not like", value, "deptLeaderId");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderIdIn(List<String> values) {
            addCriterion("dept_leader_id in", values, "deptLeaderId");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderIdNotIn(List<String> values) {
            addCriterion("dept_leader_id not in", values, "deptLeaderId");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderIdBetween(String value1, String value2) {
            addCriterion("dept_leader_id between", value1, value2, "deptLeaderId");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderIdNotBetween(String value1, String value2) {
            addCriterion("dept_leader_id not between", value1, value2, "deptLeaderId");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderNameIsNull() {
            addCriterion("dept_leader_name is null");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderNameIsNotNull() {
            addCriterion("dept_leader_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderNameEqualTo(String value) {
            addCriterion("dept_leader_name =", value, "deptLeaderName");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderNameNotEqualTo(String value) {
            addCriterion("dept_leader_name <>", value, "deptLeaderName");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderNameGreaterThan(String value) {
            addCriterion("dept_leader_name >", value, "deptLeaderName");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderNameGreaterThanOrEqualTo(String value) {
            addCriterion("dept_leader_name >=", value, "deptLeaderName");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderNameLessThan(String value) {
            addCriterion("dept_leader_name <", value, "deptLeaderName");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderNameLessThanOrEqualTo(String value) {
            addCriterion("dept_leader_name <=", value, "deptLeaderName");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderNameLike(String value) {
            addCriterion("dept_leader_name like", value, "deptLeaderName");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderNameNotLike(String value) {
            addCriterion("dept_leader_name not like", value, "deptLeaderName");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderNameIn(List<String> values) {
            addCriterion("dept_leader_name in", values, "deptLeaderName");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderNameNotIn(List<String> values) {
            addCriterion("dept_leader_name not in", values, "deptLeaderName");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderNameBetween(String value1, String value2) {
            addCriterion("dept_leader_name between", value1, value2, "deptLeaderName");
            return (Criteria) this;
        }

        public Criteria andDeptLeaderNameNotBetween(String value1, String value2) {
            addCriterion("dept_leader_name not between", value1, value2, "deptLeaderName");
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
