package com.flwm.dal.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BasicDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasicDOExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andTimetomarketIsNull() {
            addCriterion("timeToMarket is null");
            return (Criteria) this;
        }

        public Criteria andTimetomarketIsNotNull() {
            addCriterion("timeToMarket is not null");
            return (Criteria) this;
        }

        public Criteria andTimetomarketEqualTo(Date value) {
            addCriterionForJDBCDate("timeToMarket =", value, "timetomarket");
            return (Criteria) this;
        }

        public Criteria andTimetomarketNotEqualTo(Date value) {
            addCriterionForJDBCDate("timeToMarket <>", value, "timetomarket");
            return (Criteria) this;
        }

        public Criteria andTimetomarketGreaterThan(Date value) {
            addCriterionForJDBCDate("timeToMarket >", value, "timetomarket");
            return (Criteria) this;
        }

        public Criteria andTimetomarketGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("timeToMarket >=", value, "timetomarket");
            return (Criteria) this;
        }

        public Criteria andTimetomarketLessThan(Date value) {
            addCriterionForJDBCDate("timeToMarket <", value, "timetomarket");
            return (Criteria) this;
        }

        public Criteria andTimetomarketLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("timeToMarket <=", value, "timetomarket");
            return (Criteria) this;
        }

        public Criteria andTimetomarketIn(List<Date> values) {
            addCriterionForJDBCDate("timeToMarket in", values, "timetomarket");
            return (Criteria) this;
        }

        public Criteria andTimetomarketNotIn(List<Date> values) {
            addCriterionForJDBCDate("timeToMarket not in", values, "timetomarket");
            return (Criteria) this;
        }

        public Criteria andTimetomarketBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("timeToMarket between", value1, value2, "timetomarket");
            return (Criteria) this;
        }

        public Criteria andTimetomarketNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("timeToMarket not between", value1, value2, "timetomarket");
            return (Criteria) this;
        }

        public Criteria andOutstandingIsNull() {
            addCriterion("outstanding is null");
            return (Criteria) this;
        }

        public Criteria andOutstandingIsNotNull() {
            addCriterion("outstanding is not null");
            return (Criteria) this;
        }

        public Criteria andOutstandingEqualTo(Double value) {
            addCriterion("outstanding =", value, "outstanding");
            return (Criteria) this;
        }

        public Criteria andOutstandingNotEqualTo(Double value) {
            addCriterion("outstanding <>", value, "outstanding");
            return (Criteria) this;
        }

        public Criteria andOutstandingGreaterThan(Double value) {
            addCriterion("outstanding >", value, "outstanding");
            return (Criteria) this;
        }

        public Criteria andOutstandingGreaterThanOrEqualTo(Double value) {
            addCriterion("outstanding >=", value, "outstanding");
            return (Criteria) this;
        }

        public Criteria andOutstandingLessThan(Double value) {
            addCriterion("outstanding <", value, "outstanding");
            return (Criteria) this;
        }

        public Criteria andOutstandingLessThanOrEqualTo(Double value) {
            addCriterion("outstanding <=", value, "outstanding");
            return (Criteria) this;
        }

        public Criteria andOutstandingIn(List<Double> values) {
            addCriterion("outstanding in", values, "outstanding");
            return (Criteria) this;
        }

        public Criteria andOutstandingNotIn(List<Double> values) {
            addCriterion("outstanding not in", values, "outstanding");
            return (Criteria) this;
        }

        public Criteria andOutstandingBetween(Double value1, Double value2) {
            addCriterion("outstanding between", value1, value2, "outstanding");
            return (Criteria) this;
        }

        public Criteria andOutstandingNotBetween(Double value1, Double value2) {
            addCriterion("outstanding not between", value1, value2, "outstanding");
            return (Criteria) this;
        }

        public Criteria andTotalsIsNull() {
            addCriterion("totals is null");
            return (Criteria) this;
        }

        public Criteria andTotalsIsNotNull() {
            addCriterion("totals is not null");
            return (Criteria) this;
        }

        public Criteria andTotalsEqualTo(Double value) {
            addCriterion("totals =", value, "totals");
            return (Criteria) this;
        }

        public Criteria andTotalsNotEqualTo(Double value) {
            addCriterion("totals <>", value, "totals");
            return (Criteria) this;
        }

        public Criteria andTotalsGreaterThan(Double value) {
            addCriterion("totals >", value, "totals");
            return (Criteria) this;
        }

        public Criteria andTotalsGreaterThanOrEqualTo(Double value) {
            addCriterion("totals >=", value, "totals");
            return (Criteria) this;
        }

        public Criteria andTotalsLessThan(Double value) {
            addCriterion("totals <", value, "totals");
            return (Criteria) this;
        }

        public Criteria andTotalsLessThanOrEqualTo(Double value) {
            addCriterion("totals <=", value, "totals");
            return (Criteria) this;
        }

        public Criteria andTotalsIn(List<Double> values) {
            addCriterion("totals in", values, "totals");
            return (Criteria) this;
        }

        public Criteria andTotalsNotIn(List<Double> values) {
            addCriterion("totals not in", values, "totals");
            return (Criteria) this;
        }

        public Criteria andTotalsBetween(Double value1, Double value2) {
            addCriterion("totals between", value1, value2, "totals");
            return (Criteria) this;
        }

        public Criteria andTotalsNotBetween(Double value1, Double value2) {
            addCriterion("totals not between", value1, value2, "totals");
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