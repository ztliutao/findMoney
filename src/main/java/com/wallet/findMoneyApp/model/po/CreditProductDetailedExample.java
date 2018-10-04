package com.wallet.findMoneyApp.model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CreditProductDetailedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CreditProductDetailedExample() {
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

        public Criteria andCreditProductIdIsNull() {
            addCriterion("credit_product_id is null");
            return (Criteria) this;
        }

        public Criteria andCreditProductIdIsNotNull() {
            addCriterion("credit_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreditProductIdEqualTo(Integer value) {
            addCriterion("credit_product_id =", value, "creditProductId");
            return (Criteria) this;
        }

        public Criteria andCreditProductIdNotEqualTo(Integer value) {
            addCriterion("credit_product_id <>", value, "creditProductId");
            return (Criteria) this;
        }

        public Criteria andCreditProductIdGreaterThan(Integer value) {
            addCriterion("credit_product_id >", value, "creditProductId");
            return (Criteria) this;
        }

        public Criteria andCreditProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit_product_id >=", value, "creditProductId");
            return (Criteria) this;
        }

        public Criteria andCreditProductIdLessThan(Integer value) {
            addCriterion("credit_product_id <", value, "creditProductId");
            return (Criteria) this;
        }

        public Criteria andCreditProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("credit_product_id <=", value, "creditProductId");
            return (Criteria) this;
        }

        public Criteria andCreditProductIdIn(List<Integer> values) {
            addCriterion("credit_product_id in", values, "creditProductId");
            return (Criteria) this;
        }

        public Criteria andCreditProductIdNotIn(List<Integer> values) {
            addCriterion("credit_product_id not in", values, "creditProductId");
            return (Criteria) this;
        }

        public Criteria andCreditProductIdBetween(Integer value1, Integer value2) {
            addCriterion("credit_product_id between", value1, value2, "creditProductId");
            return (Criteria) this;
        }

        public Criteria andCreditProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("credit_product_id not between", value1, value2, "creditProductId");
            return (Criteria) this;
        }

        public Criteria andTermIsNull() {
            addCriterion("term is null");
            return (Criteria) this;
        }

        public Criteria andTermIsNotNull() {
            addCriterion("term is not null");
            return (Criteria) this;
        }

        public Criteria andTermEqualTo(String value) {
            addCriterion("term =", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotEqualTo(String value) {
            addCriterion("term <>", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThan(String value) {
            addCriterion("term >", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThanOrEqualTo(String value) {
            addCriterion("term >=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThan(String value) {
            addCriterion("term <", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThanOrEqualTo(String value) {
            addCriterion("term <=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLike(String value) {
            addCriterion("term like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotLike(String value) {
            addCriterion("term not like", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermIn(List<String> values) {
            addCriterion("term in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotIn(List<String> values) {
            addCriterion("term not in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermBetween(String value1, String value2) {
            addCriterion("term between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotBetween(String value1, String value2) {
            addCriterion("term not between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andTermUnitIsNull() {
            addCriterion("term_unit is null");
            return (Criteria) this;
        }

        public Criteria andTermUnitIsNotNull() {
            addCriterion("term_unit is not null");
            return (Criteria) this;
        }

        public Criteria andTermUnitEqualTo(String value) {
            addCriterion("term_unit =", value, "termUnit");
            return (Criteria) this;
        }

        public Criteria andTermUnitNotEqualTo(String value) {
            addCriterion("term_unit <>", value, "termUnit");
            return (Criteria) this;
        }

        public Criteria andTermUnitGreaterThan(String value) {
            addCriterion("term_unit >", value, "termUnit");
            return (Criteria) this;
        }

        public Criteria andTermUnitGreaterThanOrEqualTo(String value) {
            addCriterion("term_unit >=", value, "termUnit");
            return (Criteria) this;
        }

        public Criteria andTermUnitLessThan(String value) {
            addCriterion("term_unit <", value, "termUnit");
            return (Criteria) this;
        }

        public Criteria andTermUnitLessThanOrEqualTo(String value) {
            addCriterion("term_unit <=", value, "termUnit");
            return (Criteria) this;
        }

        public Criteria andTermUnitLike(String value) {
            addCriterion("term_unit like", value, "termUnit");
            return (Criteria) this;
        }

        public Criteria andTermUnitNotLike(String value) {
            addCriterion("term_unit not like", value, "termUnit");
            return (Criteria) this;
        }

        public Criteria andTermUnitIn(List<String> values) {
            addCriterion("term_unit in", values, "termUnit");
            return (Criteria) this;
        }

        public Criteria andTermUnitNotIn(List<String> values) {
            addCriterion("term_unit not in", values, "termUnit");
            return (Criteria) this;
        }

        public Criteria andTermUnitBetween(String value1, String value2) {
            addCriterion("term_unit between", value1, value2, "termUnit");
            return (Criteria) this;
        }

        public Criteria andTermUnitNotBetween(String value1, String value2) {
            addCriterion("term_unit not between", value1, value2, "termUnit");
            return (Criteria) this;
        }

        public Criteria andApplyFlowIsNull() {
            addCriterion("apply_flow is null");
            return (Criteria) this;
        }

        public Criteria andApplyFlowIsNotNull() {
            addCriterion("apply_flow is not null");
            return (Criteria) this;
        }

        public Criteria andApplyFlowEqualTo(String value) {
            addCriterion("apply_flow =", value, "applyFlow");
            return (Criteria) this;
        }

        public Criteria andApplyFlowNotEqualTo(String value) {
            addCriterion("apply_flow <>", value, "applyFlow");
            return (Criteria) this;
        }

        public Criteria andApplyFlowGreaterThan(String value) {
            addCriterion("apply_flow >", value, "applyFlow");
            return (Criteria) this;
        }

        public Criteria andApplyFlowGreaterThanOrEqualTo(String value) {
            addCriterion("apply_flow >=", value, "applyFlow");
            return (Criteria) this;
        }

        public Criteria andApplyFlowLessThan(String value) {
            addCriterion("apply_flow <", value, "applyFlow");
            return (Criteria) this;
        }

        public Criteria andApplyFlowLessThanOrEqualTo(String value) {
            addCriterion("apply_flow <=", value, "applyFlow");
            return (Criteria) this;
        }

        public Criteria andApplyFlowLike(String value) {
            addCriterion("apply_flow like", value, "applyFlow");
            return (Criteria) this;
        }

        public Criteria andApplyFlowNotLike(String value) {
            addCriterion("apply_flow not like", value, "applyFlow");
            return (Criteria) this;
        }

        public Criteria andApplyFlowIn(List<String> values) {
            addCriterion("apply_flow in", values, "applyFlow");
            return (Criteria) this;
        }

        public Criteria andApplyFlowNotIn(List<String> values) {
            addCriterion("apply_flow not in", values, "applyFlow");
            return (Criteria) this;
        }

        public Criteria andApplyFlowBetween(String value1, String value2) {
            addCriterion("apply_flow between", value1, value2, "applyFlow");
            return (Criteria) this;
        }

        public Criteria andApplyFlowNotBetween(String value1, String value2) {
            addCriterion("apply_flow not between", value1, value2, "applyFlow");
            return (Criteria) this;
        }

        public Criteria andMinCreditTimeIsNull() {
            addCriterion("min_credit_time is null");
            return (Criteria) this;
        }

        public Criteria andMinCreditTimeIsNotNull() {
            addCriterion("min_credit_time is not null");
            return (Criteria) this;
        }

        public Criteria andMinCreditTimeEqualTo(String value) {
            addCriterion("min_credit_time =", value, "minCreditTime");
            return (Criteria) this;
        }

        public Criteria andMinCreditTimeNotEqualTo(String value) {
            addCriterion("min_credit_time <>", value, "minCreditTime");
            return (Criteria) this;
        }

        public Criteria andMinCreditTimeGreaterThan(String value) {
            addCriterion("min_credit_time >", value, "minCreditTime");
            return (Criteria) this;
        }

        public Criteria andMinCreditTimeGreaterThanOrEqualTo(String value) {
            addCriterion("min_credit_time >=", value, "minCreditTime");
            return (Criteria) this;
        }

        public Criteria andMinCreditTimeLessThan(String value) {
            addCriterion("min_credit_time <", value, "minCreditTime");
            return (Criteria) this;
        }

        public Criteria andMinCreditTimeLessThanOrEqualTo(String value) {
            addCriterion("min_credit_time <=", value, "minCreditTime");
            return (Criteria) this;
        }

        public Criteria andMinCreditTimeLike(String value) {
            addCriterion("min_credit_time like", value, "minCreditTime");
            return (Criteria) this;
        }

        public Criteria andMinCreditTimeNotLike(String value) {
            addCriterion("min_credit_time not like", value, "minCreditTime");
            return (Criteria) this;
        }

        public Criteria andMinCreditTimeIn(List<String> values) {
            addCriterion("min_credit_time in", values, "minCreditTime");
            return (Criteria) this;
        }

        public Criteria andMinCreditTimeNotIn(List<String> values) {
            addCriterion("min_credit_time not in", values, "minCreditTime");
            return (Criteria) this;
        }

        public Criteria andMinCreditTimeBetween(String value1, String value2) {
            addCriterion("min_credit_time between", value1, value2, "minCreditTime");
            return (Criteria) this;
        }

        public Criteria andMinCreditTimeNotBetween(String value1, String value2) {
            addCriterion("min_credit_time not between", value1, value2, "minCreditTime");
            return (Criteria) this;
        }

        public Criteria andApplyAptitudeIsNull() {
            addCriterion("apply_aptitude is null");
            return (Criteria) this;
        }

        public Criteria andApplyAptitudeIsNotNull() {
            addCriterion("apply_aptitude is not null");
            return (Criteria) this;
        }

        public Criteria andApplyAptitudeEqualTo(String value) {
            addCriterion("apply_aptitude =", value, "applyAptitude");
            return (Criteria) this;
        }

        public Criteria andApplyAptitudeNotEqualTo(String value) {
            addCriterion("apply_aptitude <>", value, "applyAptitude");
            return (Criteria) this;
        }

        public Criteria andApplyAptitudeGreaterThan(String value) {
            addCriterion("apply_aptitude >", value, "applyAptitude");
            return (Criteria) this;
        }

        public Criteria andApplyAptitudeGreaterThanOrEqualTo(String value) {
            addCriterion("apply_aptitude >=", value, "applyAptitude");
            return (Criteria) this;
        }

        public Criteria andApplyAptitudeLessThan(String value) {
            addCriterion("apply_aptitude <", value, "applyAptitude");
            return (Criteria) this;
        }

        public Criteria andApplyAptitudeLessThanOrEqualTo(String value) {
            addCriterion("apply_aptitude <=", value, "applyAptitude");
            return (Criteria) this;
        }

        public Criteria andApplyAptitudeLike(String value) {
            addCriterion("apply_aptitude like", value, "applyAptitude");
            return (Criteria) this;
        }

        public Criteria andApplyAptitudeNotLike(String value) {
            addCriterion("apply_aptitude not like", value, "applyAptitude");
            return (Criteria) this;
        }

        public Criteria andApplyAptitudeIn(List<String> values) {
            addCriterion("apply_aptitude in", values, "applyAptitude");
            return (Criteria) this;
        }

        public Criteria andApplyAptitudeNotIn(List<String> values) {
            addCriterion("apply_aptitude not in", values, "applyAptitude");
            return (Criteria) this;
        }

        public Criteria andApplyAptitudeBetween(String value1, String value2) {
            addCriterion("apply_aptitude between", value1, value2, "applyAptitude");
            return (Criteria) this;
        }

        public Criteria andApplyAptitudeNotBetween(String value1, String value2) {
            addCriterion("apply_aptitude not between", value1, value2, "applyAptitude");
            return (Criteria) this;
        }

        public Criteria andProductDescIsNull() {
            addCriterion("product_desc is null");
            return (Criteria) this;
        }

        public Criteria andProductDescIsNotNull() {
            addCriterion("product_desc is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescEqualTo(String value) {
            addCriterion("product_desc =", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotEqualTo(String value) {
            addCriterion("product_desc <>", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescGreaterThan(String value) {
            addCriterion("product_desc >", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescGreaterThanOrEqualTo(String value) {
            addCriterion("product_desc >=", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLessThan(String value) {
            addCriterion("product_desc <", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLessThanOrEqualTo(String value) {
            addCriterion("product_desc <=", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLike(String value) {
            addCriterion("product_desc like", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotLike(String value) {
            addCriterion("product_desc not like", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescIn(List<String> values) {
            addCriterion("product_desc in", values, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotIn(List<String> values) {
            addCriterion("product_desc not in", values, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescBetween(String value1, String value2) {
            addCriterion("product_desc between", value1, value2, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotBetween(String value1, String value2) {
            addCriterion("product_desc not between", value1, value2, "productDesc");
            return (Criteria) this;
        }

        public Criteria andApplyRequestUrlIsNull() {
            addCriterion("apply_request_url is null");
            return (Criteria) this;
        }

        public Criteria andApplyRequestUrlIsNotNull() {
            addCriterion("apply_request_url is not null");
            return (Criteria) this;
        }

        public Criteria andApplyRequestUrlEqualTo(String value) {
            addCriterion("apply_request_url =", value, "applyRequestUrl");
            return (Criteria) this;
        }

        public Criteria andApplyRequestUrlNotEqualTo(String value) {
            addCriterion("apply_request_url <>", value, "applyRequestUrl");
            return (Criteria) this;
        }

        public Criteria andApplyRequestUrlGreaterThan(String value) {
            addCriterion("apply_request_url >", value, "applyRequestUrl");
            return (Criteria) this;
        }

        public Criteria andApplyRequestUrlGreaterThanOrEqualTo(String value) {
            addCriterion("apply_request_url >=", value, "applyRequestUrl");
            return (Criteria) this;
        }

        public Criteria andApplyRequestUrlLessThan(String value) {
            addCriterion("apply_request_url <", value, "applyRequestUrl");
            return (Criteria) this;
        }

        public Criteria andApplyRequestUrlLessThanOrEqualTo(String value) {
            addCriterion("apply_request_url <=", value, "applyRequestUrl");
            return (Criteria) this;
        }

        public Criteria andApplyRequestUrlLike(String value) {
            addCriterion("apply_request_url like", value, "applyRequestUrl");
            return (Criteria) this;
        }

        public Criteria andApplyRequestUrlNotLike(String value) {
            addCriterion("apply_request_url not like", value, "applyRequestUrl");
            return (Criteria) this;
        }

        public Criteria andApplyRequestUrlIn(List<String> values) {
            addCriterion("apply_request_url in", values, "applyRequestUrl");
            return (Criteria) this;
        }

        public Criteria andApplyRequestUrlNotIn(List<String> values) {
            addCriterion("apply_request_url not in", values, "applyRequestUrl");
            return (Criteria) this;
        }

        public Criteria andApplyRequestUrlBetween(String value1, String value2) {
            addCriterion("apply_request_url between", value1, value2, "applyRequestUrl");
            return (Criteria) this;
        }

        public Criteria andApplyRequestUrlNotBetween(String value1, String value2) {
            addCriterion("apply_request_url not between", value1, value2, "applyRequestUrl");
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