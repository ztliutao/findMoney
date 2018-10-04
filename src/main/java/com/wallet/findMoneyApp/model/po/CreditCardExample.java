package com.wallet.findMoneyApp.model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CreditCardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CreditCardExample() {
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

        public Criteria andCreditCardNameIsNull() {
            addCriterion("credit_card_name is null");
            return (Criteria) this;
        }

        public Criteria andCreditCardNameIsNotNull() {
            addCriterion("credit_card_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCardNameEqualTo(String value) {
            addCriterion("credit_card_name =", value, "creditCardName");
            return (Criteria) this;
        }

        public Criteria andCreditCardNameNotEqualTo(String value) {
            addCriterion("credit_card_name <>", value, "creditCardName");
            return (Criteria) this;
        }

        public Criteria andCreditCardNameGreaterThan(String value) {
            addCriterion("credit_card_name >", value, "creditCardName");
            return (Criteria) this;
        }

        public Criteria andCreditCardNameGreaterThanOrEqualTo(String value) {
            addCriterion("credit_card_name >=", value, "creditCardName");
            return (Criteria) this;
        }

        public Criteria andCreditCardNameLessThan(String value) {
            addCriterion("credit_card_name <", value, "creditCardName");
            return (Criteria) this;
        }

        public Criteria andCreditCardNameLessThanOrEqualTo(String value) {
            addCriterion("credit_card_name <=", value, "creditCardName");
            return (Criteria) this;
        }

        public Criteria andCreditCardNameLike(String value) {
            addCriterion("credit_card_name like", value, "creditCardName");
            return (Criteria) this;
        }

        public Criteria andCreditCardNameNotLike(String value) {
            addCriterion("credit_card_name not like", value, "creditCardName");
            return (Criteria) this;
        }

        public Criteria andCreditCardNameIn(List<String> values) {
            addCriterion("credit_card_name in", values, "creditCardName");
            return (Criteria) this;
        }

        public Criteria andCreditCardNameNotIn(List<String> values) {
            addCriterion("credit_card_name not in", values, "creditCardName");
            return (Criteria) this;
        }

        public Criteria andCreditCardNameBetween(String value1, String value2) {
            addCriterion("credit_card_name between", value1, value2, "creditCardName");
            return (Criteria) this;
        }

        public Criteria andCreditCardNameNotBetween(String value1, String value2) {
            addCriterion("credit_card_name not between", value1, value2, "creditCardName");
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

        public Criteria andCreditCardImageIsNull() {
            addCriterion("credit_card_image is null");
            return (Criteria) this;
        }

        public Criteria andCreditCardImageIsNotNull() {
            addCriterion("credit_card_image is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCardImageEqualTo(String value) {
            addCriterion("credit_card_image =", value, "creditCardImage");
            return (Criteria) this;
        }

        public Criteria andCreditCardImageNotEqualTo(String value) {
            addCriterion("credit_card_image <>", value, "creditCardImage");
            return (Criteria) this;
        }

        public Criteria andCreditCardImageGreaterThan(String value) {
            addCriterion("credit_card_image >", value, "creditCardImage");
            return (Criteria) this;
        }

        public Criteria andCreditCardImageGreaterThanOrEqualTo(String value) {
            addCriterion("credit_card_image >=", value, "creditCardImage");
            return (Criteria) this;
        }

        public Criteria andCreditCardImageLessThan(String value) {
            addCriterion("credit_card_image <", value, "creditCardImage");
            return (Criteria) this;
        }

        public Criteria andCreditCardImageLessThanOrEqualTo(String value) {
            addCriterion("credit_card_image <=", value, "creditCardImage");
            return (Criteria) this;
        }

        public Criteria andCreditCardImageLike(String value) {
            addCriterion("credit_card_image like", value, "creditCardImage");
            return (Criteria) this;
        }

        public Criteria andCreditCardImageNotLike(String value) {
            addCriterion("credit_card_image not like", value, "creditCardImage");
            return (Criteria) this;
        }

        public Criteria andCreditCardImageIn(List<String> values) {
            addCriterion("credit_card_image in", values, "creditCardImage");
            return (Criteria) this;
        }

        public Criteria andCreditCardImageNotIn(List<String> values) {
            addCriterion("credit_card_image not in", values, "creditCardImage");
            return (Criteria) this;
        }

        public Criteria andCreditCardImageBetween(String value1, String value2) {
            addCriterion("credit_card_image between", value1, value2, "creditCardImage");
            return (Criteria) this;
        }

        public Criteria andCreditCardImageNotBetween(String value1, String value2) {
            addCriterion("credit_card_image not between", value1, value2, "creditCardImage");
            return (Criteria) this;
        }

        public Criteria andApplyPageUrlIsNull() {
            addCriterion("apply_page_url is null");
            return (Criteria) this;
        }

        public Criteria andApplyPageUrlIsNotNull() {
            addCriterion("apply_page_url is not null");
            return (Criteria) this;
        }

        public Criteria andApplyPageUrlEqualTo(String value) {
            addCriterion("apply_page_url =", value, "applyPageUrl");
            return (Criteria) this;
        }

        public Criteria andApplyPageUrlNotEqualTo(String value) {
            addCriterion("apply_page_url <>", value, "applyPageUrl");
            return (Criteria) this;
        }

        public Criteria andApplyPageUrlGreaterThan(String value) {
            addCriterion("apply_page_url >", value, "applyPageUrl");
            return (Criteria) this;
        }

        public Criteria andApplyPageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("apply_page_url >=", value, "applyPageUrl");
            return (Criteria) this;
        }

        public Criteria andApplyPageUrlLessThan(String value) {
            addCriterion("apply_page_url <", value, "applyPageUrl");
            return (Criteria) this;
        }

        public Criteria andApplyPageUrlLessThanOrEqualTo(String value) {
            addCriterion("apply_page_url <=", value, "applyPageUrl");
            return (Criteria) this;
        }

        public Criteria andApplyPageUrlLike(String value) {
            addCriterion("apply_page_url like", value, "applyPageUrl");
            return (Criteria) this;
        }

        public Criteria andApplyPageUrlNotLike(String value) {
            addCriterion("apply_page_url not like", value, "applyPageUrl");
            return (Criteria) this;
        }

        public Criteria andApplyPageUrlIn(List<String> values) {
            addCriterion("apply_page_url in", values, "applyPageUrl");
            return (Criteria) this;
        }

        public Criteria andApplyPageUrlNotIn(List<String> values) {
            addCriterion("apply_page_url not in", values, "applyPageUrl");
            return (Criteria) this;
        }

        public Criteria andApplyPageUrlBetween(String value1, String value2) {
            addCriterion("apply_page_url between", value1, value2, "applyPageUrl");
            return (Criteria) this;
        }

        public Criteria andApplyPageUrlNotBetween(String value1, String value2) {
            addCriterion("apply_page_url not between", value1, value2, "applyPageUrl");
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

        public Criteria andApplySucCountIsNull() {
            addCriterion("apply_suc_count is null");
            return (Criteria) this;
        }

        public Criteria andApplySucCountIsNotNull() {
            addCriterion("apply_suc_count is not null");
            return (Criteria) this;
        }

        public Criteria andApplySucCountEqualTo(String value) {
            addCriterion("apply_suc_count =", value, "applySucCount");
            return (Criteria) this;
        }

        public Criteria andApplySucCountNotEqualTo(String value) {
            addCriterion("apply_suc_count <>", value, "applySucCount");
            return (Criteria) this;
        }

        public Criteria andApplySucCountGreaterThan(String value) {
            addCriterion("apply_suc_count >", value, "applySucCount");
            return (Criteria) this;
        }

        public Criteria andApplySucCountGreaterThanOrEqualTo(String value) {
            addCriterion("apply_suc_count >=", value, "applySucCount");
            return (Criteria) this;
        }

        public Criteria andApplySucCountLessThan(String value) {
            addCriterion("apply_suc_count <", value, "applySucCount");
            return (Criteria) this;
        }

        public Criteria andApplySucCountLessThanOrEqualTo(String value) {
            addCriterion("apply_suc_count <=", value, "applySucCount");
            return (Criteria) this;
        }

        public Criteria andApplySucCountLike(String value) {
            addCriterion("apply_suc_count like", value, "applySucCount");
            return (Criteria) this;
        }

        public Criteria andApplySucCountNotLike(String value) {
            addCriterion("apply_suc_count not like", value, "applySucCount");
            return (Criteria) this;
        }

        public Criteria andApplySucCountIn(List<String> values) {
            addCriterion("apply_suc_count in", values, "applySucCount");
            return (Criteria) this;
        }

        public Criteria andApplySucCountNotIn(List<String> values) {
            addCriterion("apply_suc_count not in", values, "applySucCount");
            return (Criteria) this;
        }

        public Criteria andApplySucCountBetween(String value1, String value2) {
            addCriterion("apply_suc_count between", value1, value2, "applySucCount");
            return (Criteria) this;
        }

        public Criteria andApplySucCountNotBetween(String value1, String value2) {
            addCriterion("apply_suc_count not between", value1, value2, "applySucCount");
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