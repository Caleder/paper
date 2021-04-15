package com.bingbing.paper.mybatis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SchoolRankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchoolRankExample() {
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
            addCriterion("id like", "%"+value+"%", "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", "%"+value+"%", "id");
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
            addCriterion("school_name like", "%"+value+"%", "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotLike(String value) {
            addCriterion("school_name not like", "%"+value+"%", "schoolName");
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

        public Criteria andSchoolContentIsNull() {
            addCriterion("school_content is null");
            return (Criteria) this;
        }

        public Criteria andSchoolContentIsNotNull() {
            addCriterion("school_content is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolContentEqualTo(String value) {
            addCriterion("school_content =", value, "schoolContent");
            return (Criteria) this;
        }

        public Criteria andSchoolContentNotEqualTo(String value) {
            addCriterion("school_content <>", value, "schoolContent");
            return (Criteria) this;
        }

        public Criteria andSchoolContentGreaterThan(String value) {
            addCriterion("school_content >", value, "schoolContent");
            return (Criteria) this;
        }

        public Criteria andSchoolContentGreaterThanOrEqualTo(String value) {
            addCriterion("school_content >=", value, "schoolContent");
            return (Criteria) this;
        }

        public Criteria andSchoolContentLessThan(String value) {
            addCriterion("school_content <", value, "schoolContent");
            return (Criteria) this;
        }

        public Criteria andSchoolContentLessThanOrEqualTo(String value) {
            addCriterion("school_content <=", value, "schoolContent");
            return (Criteria) this;
        }

        public Criteria andSchoolContentLike(String value) {
            addCriterion("school_content like", "%"+value+"%", "schoolContent");
            return (Criteria) this;
        }

        public Criteria andSchoolContentNotLike(String value) {
            addCriterion("school_content not like", "%"+value+"%", "schoolContent");
            return (Criteria) this;
        }

        public Criteria andSchoolContentIn(List<String> values) {
            addCriterion("school_content in", values, "schoolContent");
            return (Criteria) this;
        }

        public Criteria andSchoolContentNotIn(List<String> values) {
            addCriterion("school_content not in", values, "schoolContent");
            return (Criteria) this;
        }

        public Criteria andSchoolContentBetween(String value1, String value2) {
            addCriterion("school_content between", value1, value2, "schoolContent");
            return (Criteria) this;
        }

        public Criteria andSchoolContentNotBetween(String value1, String value2) {
            addCriterion("school_content not between", value1, value2, "schoolContent");
            return (Criteria) this;
        }

        public Criteria andSchoolRankIsNull() {
            addCriterion("school_rank is null");
            return (Criteria) this;
        }

        public Criteria andSchoolRankIsNotNull() {
            addCriterion("school_rank is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolRankEqualTo(Integer value) {
            addCriterion("school_rank =", value, "schoolRank");
            return (Criteria) this;
        }

        public Criteria andSchoolRankNotEqualTo(Integer value) {
            addCriterion("school_rank <>", value, "schoolRank");
            return (Criteria) this;
        }

        public Criteria andSchoolRankGreaterThan(Integer value) {
            addCriterion("school_rank >", value, "schoolRank");
            return (Criteria) this;
        }

        public Criteria andSchoolRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("school_rank >=", value, "schoolRank");
            return (Criteria) this;
        }

        public Criteria andSchoolRankLessThan(Integer value) {
            addCriterion("school_rank <", value, "schoolRank");
            return (Criteria) this;
        }

        public Criteria andSchoolRankLessThanOrEqualTo(Integer value) {
            addCriterion("school_rank <=", value, "schoolRank");
            return (Criteria) this;
        }

        public Criteria andSchoolRankIn(List<Integer> values) {
            addCriterion("school_rank in", values, "schoolRank");
            return (Criteria) this;
        }

        public Criteria andSchoolRankNotIn(List<Integer> values) {
            addCriterion("school_rank not in", values, "schoolRank");
            return (Criteria) this;
        }

        public Criteria andSchoolRankBetween(Integer value1, Integer value2) {
            addCriterion("school_rank between", value1, value2, "schoolRank");
            return (Criteria) this;
        }

        public Criteria andSchoolRankNotBetween(Integer value1, Integer value2) {
            addCriterion("school_rank not between", value1, value2, "schoolRank");
            return (Criteria) this;
        }

        public Criteria andSchoolTelIsNull() {
            addCriterion("school_tel is null");
            return (Criteria) this;
        }

        public Criteria andSchoolTelIsNotNull() {
            addCriterion("school_tel is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolTelEqualTo(String value) {
            addCriterion("school_tel =", value, "schoolTel");
            return (Criteria) this;
        }

        public Criteria andSchoolTelNotEqualTo(String value) {
            addCriterion("school_tel <>", value, "schoolTel");
            return (Criteria) this;
        }

        public Criteria andSchoolTelGreaterThan(String value) {
            addCriterion("school_tel >", value, "schoolTel");
            return (Criteria) this;
        }

        public Criteria andSchoolTelGreaterThanOrEqualTo(String value) {
            addCriterion("school_tel >=", value, "schoolTel");
            return (Criteria) this;
        }

        public Criteria andSchoolTelLessThan(String value) {
            addCriterion("school_tel <", value, "schoolTel");
            return (Criteria) this;
        }

        public Criteria andSchoolTelLessThanOrEqualTo(String value) {
            addCriterion("school_tel <=", value, "schoolTel");
            return (Criteria) this;
        }

        public Criteria andSchoolTelLike(String value) {
            addCriterion("school_tel like", "%"+value+"%", "schoolTel");
            return (Criteria) this;
        }

        public Criteria andSchoolTelNotLike(String value) {
            addCriterion("school_tel not like", "%"+value+"%", "schoolTel");
            return (Criteria) this;
        }

        public Criteria andSchoolTelIn(List<String> values) {
            addCriterion("school_tel in", values, "schoolTel");
            return (Criteria) this;
        }

        public Criteria andSchoolTelNotIn(List<String> values) {
            addCriterion("school_tel not in", values, "schoolTel");
            return (Criteria) this;
        }

        public Criteria andSchoolTelBetween(String value1, String value2) {
            addCriterion("school_tel between", value1, value2, "schoolTel");
            return (Criteria) this;
        }

        public Criteria andSchoolTelNotBetween(String value1, String value2) {
            addCriterion("school_tel not between", value1, value2, "schoolTel");
            return (Criteria) this;
        }

        public Criteria andSchoolWebUrlIsNull() {
            addCriterion("school_web_url is null");
            return (Criteria) this;
        }

        public Criteria andSchoolWebUrlIsNotNull() {
            addCriterion("school_web_url is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolWebUrlEqualTo(String value) {
            addCriterion("school_web_url =", value, "schoolWebUrl");
            return (Criteria) this;
        }

        public Criteria andSchoolWebUrlNotEqualTo(String value) {
            addCriterion("school_web_url <>", value, "schoolWebUrl");
            return (Criteria) this;
        }

        public Criteria andSchoolWebUrlGreaterThan(String value) {
            addCriterion("school_web_url >", value, "schoolWebUrl");
            return (Criteria) this;
        }

        public Criteria andSchoolWebUrlGreaterThanOrEqualTo(String value) {
            addCriterion("school_web_url >=", value, "schoolWebUrl");
            return (Criteria) this;
        }

        public Criteria andSchoolWebUrlLessThan(String value) {
            addCriterion("school_web_url <", value, "schoolWebUrl");
            return (Criteria) this;
        }

        public Criteria andSchoolWebUrlLessThanOrEqualTo(String value) {
            addCriterion("school_web_url <=", value, "schoolWebUrl");
            return (Criteria) this;
        }

        public Criteria andSchoolWebUrlLike(String value) {
            addCriterion("school_web_url like", "%"+value+"%", "schoolWebUrl");
            return (Criteria) this;
        }

        public Criteria andSchoolWebUrlNotLike(String value) {
            addCriterion("school_web_url not like", "%"+value+"%", "schoolWebUrl");
            return (Criteria) this;
        }

        public Criteria andSchoolWebUrlIn(List<String> values) {
            addCriterion("school_web_url in", values, "schoolWebUrl");
            return (Criteria) this;
        }

        public Criteria andSchoolWebUrlNotIn(List<String> values) {
            addCriterion("school_web_url not in", values, "schoolWebUrl");
            return (Criteria) this;
        }

        public Criteria andSchoolWebUrlBetween(String value1, String value2) {
            addCriterion("school_web_url between", value1, value2, "schoolWebUrl");
            return (Criteria) this;
        }

        public Criteria andSchoolWebUrlNotBetween(String value1, String value2) {
            addCriterion("school_web_url not between", value1, value2, "schoolWebUrl");
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
