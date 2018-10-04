package com.wallet.findMoneyApp.model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CreditProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CreditProductExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreditNameIsNull() {
            addCriterion("credit_name is null");
            return (Criteria) this;
        }

        public Criteria andCreditNameIsNotNull() {
            addCriterion("credit_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreditNameEqualTo(String value) {
            addCriterion("credit_name =", value, "creditName");
            return (Criteria) this;
        }

        public Criteria andCreditNameNotEqualTo(String value) {
            addCriterion("credit_name <>", value, "creditName");
            return (Criteria) this;
        }

        public Criteria andCreditNameGreaterThan(String value) {
            addCriterion("credit_name >", value, "creditName");
            return (Criteria) this;
        }

        public Criteria andCreditNameGreaterThanOrEqualTo(String value) {
            addCriterion("credit_name >=", value, "creditName");
            return (Criteria) this;
        }

        public Criteria andCreditNameLessThan(String value) {
            addCriterion("credit_name <", value, "creditName");
            return (Criteria) this;
        }

        public Criteria andCreditNameLessThanOrEqualTo(String value) {
            addCriterion("credit_name <=", value, "creditName");
            return (Criteria) this;
        }

        public Criteria andCreditNameLike(String value) {
            addCriterion("credit_name like", value, "creditName");
            return (Criteria) this;
        }

        public Criteria andCreditNameNotLike(String value) {
            addCriterion("credit_name not like", value, "creditName");
            return (Criteria) this;
        }

        public Criteria andCreditNameIn(List<String> values) {
            addCriterion("credit_name in", values, "creditName");
            return (Criteria) this;
        }

        public Criteria andCreditNameNotIn(List<String> values) {
            addCriterion("credit_name not in", values, "creditName");
            return (Criteria) this;
        }

        public Criteria andCreditNameBetween(String value1, String value2) {
            addCriterion("credit_name between", value1, value2, "creditName");
            return (Criteria) this;
        }

        public Criteria andCreditNameNotBetween(String value1, String value2) {
            addCriterion("credit_name not between", value1, value2, "creditName");
            return (Criteria) this;
        }

        public Criteria andSloganIsNull() {
            addCriterion("slogan is null");
            return (Criteria) this;
        }

        public Criteria andSloganIsNotNull() {
            addCriterion("slogan is not null");
            return (Criteria) this;
        }

        public Criteria andSloganEqualTo(String value) {
            addCriterion("slogan =", value, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganNotEqualTo(String value) {
            addCriterion("slogan <>", value, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganGreaterThan(String value) {
            addCriterion("slogan >", value, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganGreaterThanOrEqualTo(String value) {
            addCriterion("slogan >=", value, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganLessThan(String value) {
            addCriterion("slogan <", value, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganLessThanOrEqualTo(String value) {
            addCriterion("slogan <=", value, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganLike(String value) {
            addCriterion("slogan like", value, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganNotLike(String value) {
            addCriterion("slogan not like", value, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganIn(List<String> values) {
            addCriterion("slogan in", values, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganNotIn(List<String> values) {
            addCriterion("slogan not in", values, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganBetween(String value1, String value2) {
            addCriterion("slogan between", value1, value2, "slogan");
            return (Criteria) this;
        }

        public Criteria andSloganNotBetween(String value1, String value2) {
            addCriterion("slogan not between", value1, value2, "slogan");
            return (Criteria) this;
        }

        public Criteria andIconUrlIsNull() {
            addCriterion("icon_url is null");
            return (Criteria) this;
        }

        public Criteria andIconUrlIsNotNull() {
            addCriterion("icon_url is not null");
            return (Criteria) this;
        }

        public Criteria andIconUrlEqualTo(String value) {
            addCriterion("icon_url =", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotEqualTo(String value) {
            addCriterion("icon_url <>", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThan(String value) {
            addCriterion("icon_url >", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThanOrEqualTo(String value) {
            addCriterion("icon_url >=", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThan(String value) {
            addCriterion("icon_url <", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThanOrEqualTo(String value) {
            addCriterion("icon_url <=", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLike(String value) {
            addCriterion("icon_url like", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotLike(String value) {
            addCriterion("icon_url not like", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlIn(List<String> values) {
            addCriterion("icon_url in", values, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotIn(List<String> values) {
            addCriterion("icon_url not in", values, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlBetween(String value1, String value2) {
            addCriterion("icon_url between", value1, value2, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotBetween(String value1, String value2) {
            addCriterion("icon_url not between", value1, value2, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andMinAmountIsNull() {
            addCriterion("min_amount is null");
            return (Criteria) this;
        }

        public Criteria andMinAmountIsNotNull() {
            addCriterion("min_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMinAmountEqualTo(String value) {
            addCriterion("min_amount =", value, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountNotEqualTo(String value) {
            addCriterion("min_amount <>", value, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountGreaterThan(String value) {
            addCriterion("min_amount >", value, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountGreaterThanOrEqualTo(String value) {
            addCriterion("min_amount >=", value, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountLessThan(String value) {
            addCriterion("min_amount <", value, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountLessThanOrEqualTo(String value) {
            addCriterion("min_amount <=", value, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountLike(String value) {
            addCriterion("min_amount like", value, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountNotLike(String value) {
            addCriterion("min_amount not like", value, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountIn(List<String> values) {
            addCriterion("min_amount in", values, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountNotIn(List<String> values) {
            addCriterion("min_amount not in", values, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountBetween(String value1, String value2) {
            addCriterion("min_amount between", value1, value2, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMinAmountNotBetween(String value1, String value2) {
            addCriterion("min_amount not between", value1, value2, "minAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountIsNull() {
            addCriterion("max_amount is null");
            return (Criteria) this;
        }

        public Criteria andMaxAmountIsNotNull() {
            addCriterion("max_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMaxAmountEqualTo(String value) {
            addCriterion("max_amount =", value, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountNotEqualTo(String value) {
            addCriterion("max_amount <>", value, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountGreaterThan(String value) {
            addCriterion("max_amount >", value, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountGreaterThanOrEqualTo(String value) {
            addCriterion("max_amount >=", value, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountLessThan(String value) {
            addCriterion("max_amount <", value, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountLessThanOrEqualTo(String value) {
            addCriterion("max_amount <=", value, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountLike(String value) {
            addCriterion("max_amount like", value, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountNotLike(String value) {
            addCriterion("max_amount not like", value, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountIn(List<String> values) {
            addCriterion("max_amount in", values, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountNotIn(List<String> values) {
            addCriterion("max_amount not in", values, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountBetween(String value1, String value2) {
            addCriterion("max_amount between", value1, value2, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andMaxAmountNotBetween(String value1, String value2) {
            addCriterion("max_amount not between", value1, value2, "maxAmount");
            return (Criteria) this;
        }

        public Criteria andAmountUnitIsNull() {
            addCriterion("amount_unit is null");
            return (Criteria) this;
        }

        public Criteria andAmountUnitIsNotNull() {
            addCriterion("amount_unit is not null");
            return (Criteria) this;
        }

        public Criteria andAmountUnitEqualTo(String value) {
            addCriterion("amount_unit =", value, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitNotEqualTo(String value) {
            addCriterion("amount_unit <>", value, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitGreaterThan(String value) {
            addCriterion("amount_unit >", value, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitGreaterThanOrEqualTo(String value) {
            addCriterion("amount_unit >=", value, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitLessThan(String value) {
            addCriterion("amount_unit <", value, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitLessThanOrEqualTo(String value) {
            addCriterion("amount_unit <=", value, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitLike(String value) {
            addCriterion("amount_unit like", value, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitNotLike(String value) {
            addCriterion("amount_unit not like", value, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitIn(List<String> values) {
            addCriterion("amount_unit in", values, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitNotIn(List<String> values) {
            addCriterion("amount_unit not in", values, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitBetween(String value1, String value2) {
            addCriterion("amount_unit between", value1, value2, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andAmountUnitNotBetween(String value1, String value2) {
            addCriterion("amount_unit not between", value1, value2, "amountUnit");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(String value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(String value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(String value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(String value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(String value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(String value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLike(String value) {
            addCriterion("rate like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotLike(String value) {
            addCriterion("rate not like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<String> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<String> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(String value1, String value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(String value1, String value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andCOrderIsNull() {
            addCriterion("c_order is null");
            return (Criteria) this;
        }

        public Criteria andCOrderIsNotNull() {
            addCriterion("c_order is not null");
            return (Criteria) this;
        }

        public Criteria andCOrderEqualTo(Integer value) {
            addCriterion("c_order =", value, "cOrder");
            return (Criteria) this;
        }

        public Criteria andCOrderNotEqualTo(Integer value) {
            addCriterion("c_order <>", value, "cOrder");
            return (Criteria) this;
        }

        public Criteria andCOrderGreaterThan(Integer value) {
            addCriterion("c_order >", value, "cOrder");
            return (Criteria) this;
        }

        public Criteria andCOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_order >=", value, "cOrder");
            return (Criteria) this;
        }

        public Criteria andCOrderLessThan(Integer value) {
            addCriterion("c_order <", value, "cOrder");
            return (Criteria) this;
        }

        public Criteria andCOrderLessThanOrEqualTo(Integer value) {
            addCriterion("c_order <=", value, "cOrder");
            return (Criteria) this;
        }

        public Criteria andCOrderIn(List<Integer> values) {
            addCriterion("c_order in", values, "cOrder");
            return (Criteria) this;
        }

        public Criteria andCOrderNotIn(List<Integer> values) {
            addCriterion("c_order not in", values, "cOrder");
            return (Criteria) this;
        }

        public Criteria andCOrderBetween(Integer value1, Integer value2) {
            addCriterion("c_order between", value1, value2, "cOrder");
            return (Criteria) this;
        }

        public Criteria andCOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("c_order not between", value1, value2, "cOrder");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andEntryTypeIsNull() {
            addCriterion("entry_type is null");
            return (Criteria) this;
        }

        public Criteria andEntryTypeIsNotNull() {
            addCriterion("entry_type is not null");
            return (Criteria) this;
        }

        public Criteria andEntryTypeEqualTo(String value) {
            addCriterion("entry_type =", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeNotEqualTo(String value) {
            addCriterion("entry_type <>", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeGreaterThan(String value) {
            addCriterion("entry_type >", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeGreaterThanOrEqualTo(String value) {
            addCriterion("entry_type >=", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeLessThan(String value) {
            addCriterion("entry_type <", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeLessThanOrEqualTo(String value) {
            addCriterion("entry_type <=", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeLike(String value) {
            addCriterion("entry_type like", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeNotLike(String value) {
            addCriterion("entry_type not like", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeIn(List<String> values) {
            addCriterion("entry_type in", values, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeNotIn(List<String> values) {
            addCriterion("entry_type not in", values, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeBetween(String value1, String value2) {
            addCriterion("entry_type between", value1, value2, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeNotBetween(String value1, String value2) {
            addCriterion("entry_type not between", value1, value2, "entryType");
            return (Criteria) this;
        }

        public Criteria andExcellentIsNull() {
            addCriterion("excellent is null");
            return (Criteria) this;
        }

        public Criteria andExcellentIsNotNull() {
            addCriterion("excellent is not null");
            return (Criteria) this;
        }

        public Criteria andExcellentEqualTo(String value) {
            addCriterion("excellent =", value, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentNotEqualTo(String value) {
            addCriterion("excellent <>", value, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentGreaterThan(String value) {
            addCriterion("excellent >", value, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentGreaterThanOrEqualTo(String value) {
            addCriterion("excellent >=", value, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentLessThan(String value) {
            addCriterion("excellent <", value, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentLessThanOrEqualTo(String value) {
            addCriterion("excellent <=", value, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentLike(String value) {
            addCriterion("excellent like", value, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentNotLike(String value) {
            addCriterion("excellent not like", value, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentIn(List<String> values) {
            addCriterion("excellent in", values, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentNotIn(List<String> values) {
            addCriterion("excellent not in", values, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentBetween(String value1, String value2) {
            addCriterion("excellent between", value1, value2, "excellent");
            return (Criteria) this;
        }

        public Criteria andExcellentNotBetween(String value1, String value2) {
            addCriterion("excellent not between", value1, value2, "excellent");
            return (Criteria) this;
        }

        public Criteria andWellReceivedIsNull() {
            addCriterion("well_received is null");
            return (Criteria) this;
        }

        public Criteria andWellReceivedIsNotNull() {
            addCriterion("well_received is not null");
            return (Criteria) this;
        }

        public Criteria andWellReceivedEqualTo(String value) {
            addCriterion("well_received =", value, "wellReceived");
            return (Criteria) this;
        }

        public Criteria andWellReceivedNotEqualTo(String value) {
            addCriterion("well_received <>", value, "wellReceived");
            return (Criteria) this;
        }

        public Criteria andWellReceivedGreaterThan(String value) {
            addCriterion("well_received >", value, "wellReceived");
            return (Criteria) this;
        }

        public Criteria andWellReceivedGreaterThanOrEqualTo(String value) {
            addCriterion("well_received >=", value, "wellReceived");
            return (Criteria) this;
        }

        public Criteria andWellReceivedLessThan(String value) {
            addCriterion("well_received <", value, "wellReceived");
            return (Criteria) this;
        }

        public Criteria andWellReceivedLessThanOrEqualTo(String value) {
            addCriterion("well_received <=", value, "wellReceived");
            return (Criteria) this;
        }

        public Criteria andWellReceivedLike(String value) {
            addCriterion("well_received like", value, "wellReceived");
            return (Criteria) this;
        }

        public Criteria andWellReceivedNotLike(String value) {
            addCriterion("well_received not like", value, "wellReceived");
            return (Criteria) this;
        }

        public Criteria andWellReceivedIn(List<String> values) {
            addCriterion("well_received in", values, "wellReceived");
            return (Criteria) this;
        }

        public Criteria andWellReceivedNotIn(List<String> values) {
            addCriterion("well_received not in", values, "wellReceived");
            return (Criteria) this;
        }

        public Criteria andWellReceivedBetween(String value1, String value2) {
            addCriterion("well_received between", value1, value2, "wellReceived");
            return (Criteria) this;
        }

        public Criteria andWellReceivedNotBetween(String value1, String value2) {
            addCriterion("well_received not between", value1, value2, "wellReceived");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNull() {
            addCriterion("operator_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(String value) {
            addCriterion("operator_id =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(String value) {
            addCriterion("operator_id <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(String value) {
            addCriterion("operator_id >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("operator_id >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(String value) {
            addCriterion("operator_id <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(String value) {
            addCriterion("operator_id <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLike(String value) {
            addCriterion("operator_id like", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotLike(String value) {
            addCriterion("operator_id not like", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<String> values) {
            addCriterion("operator_id in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<String> values) {
            addCriterion("operator_id not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(String value1, String value2) {
            addCriterion("operator_id between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(String value1, String value2) {
            addCriterion("operator_id not between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIsNull() {
            addCriterion("operator_name is null");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIsNotNull() {
            addCriterion("operator_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorNameEqualTo(String value) {
            addCriterion("operator_name =", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotEqualTo(String value) {
            addCriterion("operator_name <>", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThan(String value) {
            addCriterion("operator_name >", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("operator_name >=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThan(String value) {
            addCriterion("operator_name <", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThanOrEqualTo(String value) {
            addCriterion("operator_name <=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLike(String value) {
            addCriterion("operator_name like", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotLike(String value) {
            addCriterion("operator_name not like", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIn(List<String> values) {
            addCriterion("operator_name in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotIn(List<String> values) {
            addCriterion("operator_name not in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameBetween(String value1, String value2) {
            addCriterion("operator_name between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotBetween(String value1, String value2) {
            addCriterion("operator_name not between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTelIsNull() {
            addCriterion("customer_service_tel is null");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTelIsNotNull() {
            addCriterion("customer_service_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTelEqualTo(String value) {
            addCriterion("customer_service_tel =", value, "customerServiceTel");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTelNotEqualTo(String value) {
            addCriterion("customer_service_tel <>", value, "customerServiceTel");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTelGreaterThan(String value) {
            addCriterion("customer_service_tel >", value, "customerServiceTel");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTelGreaterThanOrEqualTo(String value) {
            addCriterion("customer_service_tel >=", value, "customerServiceTel");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTelLessThan(String value) {
            addCriterion("customer_service_tel <", value, "customerServiceTel");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTelLessThanOrEqualTo(String value) {
            addCriterion("customer_service_tel <=", value, "customerServiceTel");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTelLike(String value) {
            addCriterion("customer_service_tel like", value, "customerServiceTel");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTelNotLike(String value) {
            addCriterion("customer_service_tel not like", value, "customerServiceTel");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTelIn(List<String> values) {
            addCriterion("customer_service_tel in", values, "customerServiceTel");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTelNotIn(List<String> values) {
            addCriterion("customer_service_tel not in", values, "customerServiceTel");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTelBetween(String value1, String value2) {
            addCriterion("customer_service_tel between", value1, value2, "customerServiceTel");
            return (Criteria) this;
        }

        public Criteria andCustomerServiceTelNotBetween(String value1, String value2) {
            addCriterion("customer_service_tel not between", value1, value2, "customerServiceTel");
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