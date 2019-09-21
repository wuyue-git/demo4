package com.web.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class HobbyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HobbyExample() {
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

        public Criteria andHobbyIdIsNull() {
            addCriterion("hobby_id is null");
            return (Criteria) this;
        }

        public Criteria andHobbyIdIsNotNull() {
            addCriterion("hobby_id is not null");
            return (Criteria) this;
        }

        public Criteria andHobbyIdEqualTo(Integer value) {
            addCriterion("hobby_id =", value, "hobbyId");
            return (Criteria) this;
        }

        public Criteria andHobbyIdNotEqualTo(Integer value) {
            addCriterion("hobby_id <>", value, "hobbyId");
            return (Criteria) this;
        }

        public Criteria andHobbyIdGreaterThan(Integer value) {
            addCriterion("hobby_id >", value, "hobbyId");
            return (Criteria) this;
        }

        public Criteria andHobbyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hobby_id >=", value, "hobbyId");
            return (Criteria) this;
        }

        public Criteria andHobbyIdLessThan(Integer value) {
            addCriterion("hobby_id <", value, "hobbyId");
            return (Criteria) this;
        }

        public Criteria andHobbyIdLessThanOrEqualTo(Integer value) {
            addCriterion("hobby_id <=", value, "hobbyId");
            return (Criteria) this;
        }

        public Criteria andHobbyIdIn(List<Integer> values) {
            addCriterion("hobby_id in", values, "hobbyId");
            return (Criteria) this;
        }

        public Criteria andHobbyIdNotIn(List<Integer> values) {
            addCriterion("hobby_id not in", values, "hobbyId");
            return (Criteria) this;
        }

        public Criteria andHobbyIdBetween(Integer value1, Integer value2) {
            addCriterion("hobby_id between", value1, value2, "hobbyId");
            return (Criteria) this;
        }

        public Criteria andHobbyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hobby_id not between", value1, value2, "hobbyId");
            return (Criteria) this;
        }

        public Criteria andHobbyNameIsNull() {
            addCriterion("hobby_name is null");
            return (Criteria) this;
        }

        public Criteria andHobbyNameIsNotNull() {
            addCriterion("hobby_name is not null");
            return (Criteria) this;
        }

        public Criteria andHobbyNameEqualTo(String value) {
            addCriterion("hobby_name =", value, "hobbyName");
            return (Criteria) this;
        }

        public Criteria andHobbyNameNotEqualTo(String value) {
            addCriterion("hobby_name <>", value, "hobbyName");
            return (Criteria) this;
        }

        public Criteria andHobbyNameGreaterThan(String value) {
            addCriterion("hobby_name >", value, "hobbyName");
            return (Criteria) this;
        }

        public Criteria andHobbyNameGreaterThanOrEqualTo(String value) {
            addCriterion("hobby_name >=", value, "hobbyName");
            return (Criteria) this;
        }

        public Criteria andHobbyNameLessThan(String value) {
            addCriterion("hobby_name <", value, "hobbyName");
            return (Criteria) this;
        }

        public Criteria andHobbyNameLessThanOrEqualTo(String value) {
            addCriterion("hobby_name <=", value, "hobbyName");
            return (Criteria) this;
        }

        public Criteria andHobbyNameLike(String value) {
            addCriterion("hobby_name like", value, "hobbyName");
            return (Criteria) this;
        }

        public Criteria andHobbyNameNotLike(String value) {
            addCriterion("hobby_name not like", value, "hobbyName");
            return (Criteria) this;
        }

        public Criteria andHobbyNameIn(List<String> values) {
            addCriterion("hobby_name in", values, "hobbyName");
            return (Criteria) this;
        }

        public Criteria andHobbyNameNotIn(List<String> values) {
            addCriterion("hobby_name not in", values, "hobbyName");
            return (Criteria) this;
        }

        public Criteria andHobbyNameBetween(String value1, String value2) {
            addCriterion("hobby_name between", value1, value2, "hobbyName");
            return (Criteria) this;
        }

        public Criteria andHobbyNameNotBetween(String value1, String value2) {
            addCriterion("hobby_name not between", value1, value2, "hobbyName");
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