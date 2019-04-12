package com.handy.support.entity;

import java.util.ArrayList;
import java.util.List;

public class StepExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table step
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table step
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table step
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated
     */
    public StepExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table step
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table step
     *
     * @mbggenerated
     */
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

        public Criteria andStepIdIsNull() {
            addCriterion("step_id is null");
            return (Criteria) this;
        }

        public Criteria andStepIdIsNotNull() {
            addCriterion("step_id is not null");
            return (Criteria) this;
        }

        public Criteria andStepIdEqualTo(Integer value) {
            addCriterion("step_id =", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdNotEqualTo(Integer value) {
            addCriterion("step_id <>", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdGreaterThan(Integer value) {
            addCriterion("step_id >", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("step_id >=", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdLessThan(Integer value) {
            addCriterion("step_id <", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdLessThanOrEqualTo(Integer value) {
            addCriterion("step_id <=", value, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdIn(List<Integer> values) {
            addCriterion("step_id in", values, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdNotIn(List<Integer> values) {
            addCriterion("step_id not in", values, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdBetween(Integer value1, Integer value2) {
            addCriterion("step_id between", value1, value2, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepIdNotBetween(Integer value1, Integer value2) {
            addCriterion("step_id not between", value1, value2, "stepId");
            return (Criteria) this;
        }

        public Criteria andStepTagIsNull() {
            addCriterion("step_tag is null");
            return (Criteria) this;
        }

        public Criteria andStepTagIsNotNull() {
            addCriterion("step_tag is not null");
            return (Criteria) this;
        }

        public Criteria andStepTagEqualTo(Integer value) {
            addCriterion("step_tag =", value, "stepTag");
            return (Criteria) this;
        }

        public Criteria andStepTagNotEqualTo(Integer value) {
            addCriterion("step_tag <>", value, "stepTag");
            return (Criteria) this;
        }

        public Criteria andStepTagGreaterThan(Integer value) {
            addCriterion("step_tag >", value, "stepTag");
            return (Criteria) this;
        }

        public Criteria andStepTagGreaterThanOrEqualTo(Integer value) {
            addCriterion("step_tag >=", value, "stepTag");
            return (Criteria) this;
        }

        public Criteria andStepTagLessThan(Integer value) {
            addCriterion("step_tag <", value, "stepTag");
            return (Criteria) this;
        }

        public Criteria andStepTagLessThanOrEqualTo(Integer value) {
            addCriterion("step_tag <=", value, "stepTag");
            return (Criteria) this;
        }

        public Criteria andStepTagIn(List<Integer> values) {
            addCriterion("step_tag in", values, "stepTag");
            return (Criteria) this;
        }

        public Criteria andStepTagNotIn(List<Integer> values) {
            addCriterion("step_tag not in", values, "stepTag");
            return (Criteria) this;
        }

        public Criteria andStepTagBetween(Integer value1, Integer value2) {
            addCriterion("step_tag between", value1, value2, "stepTag");
            return (Criteria) this;
        }

        public Criteria andStepTagNotBetween(Integer value1, Integer value2) {
            addCriterion("step_tag not between", value1, value2, "stepTag");
            return (Criteria) this;
        }

        public Criteria andStepImgIsNull() {
            addCriterion("step_img is null");
            return (Criteria) this;
        }

        public Criteria andStepImgIsNotNull() {
            addCriterion("step_img is not null");
            return (Criteria) this;
        }

        public Criteria andStepImgEqualTo(String value) {
            addCriterion("step_img =", value, "stepImg");
            return (Criteria) this;
        }

        public Criteria andStepImgNotEqualTo(String value) {
            addCriterion("step_img <>", value, "stepImg");
            return (Criteria) this;
        }

        public Criteria andStepImgGreaterThan(String value) {
            addCriterion("step_img >", value, "stepImg");
            return (Criteria) this;
        }

        public Criteria andStepImgGreaterThanOrEqualTo(String value) {
            addCriterion("step_img >=", value, "stepImg");
            return (Criteria) this;
        }

        public Criteria andStepImgLessThan(String value) {
            addCriterion("step_img <", value, "stepImg");
            return (Criteria) this;
        }

        public Criteria andStepImgLessThanOrEqualTo(String value) {
            addCriterion("step_img <=", value, "stepImg");
            return (Criteria) this;
        }

        public Criteria andStepImgLike(String value) {
            addCriterion("step_img like", value, "stepImg");
            return (Criteria) this;
        }

        public Criteria andStepImgNotLike(String value) {
            addCriterion("step_img not like", value, "stepImg");
            return (Criteria) this;
        }

        public Criteria andStepImgIn(List<String> values) {
            addCriterion("step_img in", values, "stepImg");
            return (Criteria) this;
        }

        public Criteria andStepImgNotIn(List<String> values) {
            addCriterion("step_img not in", values, "stepImg");
            return (Criteria) this;
        }

        public Criteria andStepImgBetween(String value1, String value2) {
            addCriterion("step_img between", value1, value2, "stepImg");
            return (Criteria) this;
        }

        public Criteria andStepImgNotBetween(String value1, String value2) {
            addCriterion("step_img not between", value1, value2, "stepImg");
            return (Criteria) this;
        }

        public Criteria andStepDetailIsNull() {
            addCriterion("step_detail is null");
            return (Criteria) this;
        }

        public Criteria andStepDetailIsNotNull() {
            addCriterion("step_detail is not null");
            return (Criteria) this;
        }

        public Criteria andStepDetailEqualTo(String value) {
            addCriterion("step_detail =", value, "stepDetail");
            return (Criteria) this;
        }

        public Criteria andStepDetailNotEqualTo(String value) {
            addCriterion("step_detail <>", value, "stepDetail");
            return (Criteria) this;
        }

        public Criteria andStepDetailGreaterThan(String value) {
            addCriterion("step_detail >", value, "stepDetail");
            return (Criteria) this;
        }

        public Criteria andStepDetailGreaterThanOrEqualTo(String value) {
            addCriterion("step_detail >=", value, "stepDetail");
            return (Criteria) this;
        }

        public Criteria andStepDetailLessThan(String value) {
            addCriterion("step_detail <", value, "stepDetail");
            return (Criteria) this;
        }

        public Criteria andStepDetailLessThanOrEqualTo(String value) {
            addCriterion("step_detail <=", value, "stepDetail");
            return (Criteria) this;
        }

        public Criteria andStepDetailLike(String value) {
            addCriterion("step_detail like", value, "stepDetail");
            return (Criteria) this;
        }

        public Criteria andStepDetailNotLike(String value) {
            addCriterion("step_detail not like", value, "stepDetail");
            return (Criteria) this;
        }

        public Criteria andStepDetailIn(List<String> values) {
            addCriterion("step_detail in", values, "stepDetail");
            return (Criteria) this;
        }

        public Criteria andStepDetailNotIn(List<String> values) {
            addCriterion("step_detail not in", values, "stepDetail");
            return (Criteria) this;
        }

        public Criteria andStepDetailBetween(String value1, String value2) {
            addCriterion("step_detail between", value1, value2, "stepDetail");
            return (Criteria) this;
        }

        public Criteria andStepDetailNotBetween(String value1, String value2) {
            addCriterion("step_detail not between", value1, value2, "stepDetail");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table step
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table step
     *
     * @mbggenerated
     */
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