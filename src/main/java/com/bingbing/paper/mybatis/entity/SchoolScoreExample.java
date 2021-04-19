package com.bingbing.paper.mybatis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SchoolScoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchoolScoreExample() {
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
            addCriterion("school_id like", "%"+value+"%", "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotLike(String value) {
            addCriterion("school_id not like", "%"+value+"%", "schoolId");
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

        public Criteria andSchoolScoreIsNull() {
            addCriterion("school_score is null");
            return (Criteria) this;
        }

        public Criteria andSchoolScoreIsNotNull() {
            addCriterion("school_score is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolScoreEqualTo(String value) {
            addCriterion("school_score =", value, "schoolScore");
            return (Criteria) this;
        }

        public Criteria andSchoolScoreNotEqualTo(String value) {
            addCriterion("school_score <>", value, "schoolScore");
            return (Criteria) this;
        }

        public Criteria andSchoolScoreGreaterThan(String value) {
            addCriterion("school_score >", value, "schoolScore");
            return (Criteria) this;
        }

        public Criteria andSchoolScoreGreaterThanOrEqualTo(String value) {
            addCriterion("school_score >=", value, "schoolScore");
            return (Criteria) this;
        }

        public Criteria andSchoolScoreLessThan(String value) {
            addCriterion("school_score <", value, "schoolScore");
            return (Criteria) this;
        }

        public Criteria andSchoolScoreLessThanOrEqualTo(String value) {
            addCriterion("school_score <=", value, "schoolScore");
            return (Criteria) this;
        }

        public Criteria andSchoolScoreLike(String value) {
            addCriterion("school_score like", "%"+value+"%", "schoolScore");
            return (Criteria) this;
        }

        public Criteria andSchoolScoreNotLike(String value) {
            addCriterion("school_score not like", "%"+value+"%", "schoolScore");
            return (Criteria) this;
        }

        public Criteria andSchoolScoreIn(List<String> values) {
            addCriterion("school_score in", values, "schoolScore");
            return (Criteria) this;
        }

        public Criteria andSchoolScoreNotIn(List<String> values) {
            addCriterion("school_score not in", values, "schoolScore");
            return (Criteria) this;
        }

        public Criteria andSchoolScoreBetween(String value1, String value2) {
            addCriterion("school_score between", value1, value2, "schoolScore");
            return (Criteria) this;
        }

        public Criteria andSchoolScoreNotBetween(String value1, String value2) {
            addCriterion("school_score not between", value1, value2, "schoolScore");
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

        public Criteria andSchoolFileIsNull() {
            addCriterion("school_file is null");
            return (Criteria) this;
        }

        public Criteria andSchoolFileIsNotNull() {
            addCriterion("school_file is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolFileEqualTo(String value) {
            addCriterion("school_file =", value, "schoolFile");
            return (Criteria) this;
        }

        public Criteria andSchoolFileNotEqualTo(String value) {
            addCriterion("school_file <>", value, "schoolFile");
            return (Criteria) this;
        }

        public Criteria andSchoolFileGreaterThan(String value) {
            addCriterion("school_file >", value, "schoolFile");
            return (Criteria) this;
        }

        public Criteria andSchoolFileGreaterThanOrEqualTo(String value) {
            addCriterion("school_file >=", value, "schoolFile");
            return (Criteria) this;
        }

        public Criteria andSchoolFileLessThan(String value) {
            addCriterion("school_file <", value, "schoolFile");
            return (Criteria) this;
        }

        public Criteria andSchoolFileLessThanOrEqualTo(String value) {
            addCriterion("school_file <=", value, "schoolFile");
            return (Criteria) this;
        }

        public Criteria andSchoolFileLike(String value) {
            addCriterion("school_file like", "%"+value+"%", "schoolFile");
            return (Criteria) this;
        }

        public Criteria andSchoolFileNotLike(String value) {
            addCriterion("school_file not like", "%"+value+"%", "schoolFile");
            return (Criteria) this;
        }

        public Criteria andSchoolFileIn(List<String> values) {
            addCriterion("school_file in", values, "schoolFile");
            return (Criteria) this;
        }

        public Criteria andSchoolFileNotIn(List<String> values) {
            addCriterion("school_file not in", values, "schoolFile");
            return (Criteria) this;
        }

        public Criteria andSchoolFileBetween(String value1, String value2) {
            addCriterion("school_file between", value1, value2, "schoolFile");
            return (Criteria) this;
        }

        public Criteria andSchoolFileNotBetween(String value1, String value2) {
            addCriterion("school_file not between", value1, value2, "schoolFile");
            return (Criteria) this;
        }

        public Criteria andBeginRepeatIsNull() {
            addCriterion("begin_repeat is null");
            return (Criteria) this;
        }

        public Criteria andBeginRepeatIsNotNull() {
            addCriterion("begin_repeat is not null");
            return (Criteria) this;
        }

        public Criteria andBeginRepeatEqualTo(Boolean value) {
            addCriterion("begin_repeat =", value, "beginRepeat");
            return (Criteria) this;
        }

        public Criteria andBeginRepeatNotEqualTo(Boolean value) {
            addCriterion("begin_repeat <>", value, "beginRepeat");
            return (Criteria) this;
        }

        public Criteria andBeginRepeatGreaterThan(Boolean value) {
            addCriterion("begin_repeat >", value, "beginRepeat");
            return (Criteria) this;
        }

        public Criteria andBeginRepeatGreaterThanOrEqualTo(Boolean value) {
            addCriterion("begin_repeat >=", value, "beginRepeat");
            return (Criteria) this;
        }

        public Criteria andBeginRepeatLessThan(Boolean value) {
            addCriterion("begin_repeat <", value, "beginRepeat");
            return (Criteria) this;
        }

        public Criteria andBeginRepeatLessThanOrEqualTo(Boolean value) {
            addCriterion("begin_repeat <=", value, "beginRepeat");
            return (Criteria) this;
        }

        public Criteria andBeginRepeatIn(List<Boolean> values) {
            addCriterion("begin_repeat in", values, "beginRepeat");
            return (Criteria) this;
        }

        public Criteria andBeginRepeatNotIn(List<Boolean> values) {
            addCriterion("begin_repeat not in", values, "beginRepeat");
            return (Criteria) this;
        }

        public Criteria andBeginRepeatBetween(Boolean value1, Boolean value2) {
            addCriterion("begin_repeat between", value1, value2, "beginRepeat");
            return (Criteria) this;
        }

        public Criteria andBeginRepeatNotBetween(Boolean value1, Boolean value2) {
            addCriterion("begin_repeat not between", value1, value2, "beginRepeat");
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

        public Criteria andSchoolYearEqualTo(String value) {
            addCriterion("school_year =", value, "schoolYear");
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
        public Criteria andSchoolApplyAdmitEqualTo(String value) {
            addCriterion("school_apply_admit =", value, "schoolApplyAdmit");
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
