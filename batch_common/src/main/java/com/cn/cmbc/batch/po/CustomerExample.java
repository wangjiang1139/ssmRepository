package com.cn.cmbc.batch.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andCustCodeIsNull() {
            addCriterion("cust_code is null");
            return (Criteria) this;
        }

        public Criteria andCustCodeIsNotNull() {
            addCriterion("cust_code is not null");
            return (Criteria) this;
        }

        public Criteria andCustCodeEqualTo(String value) {
            addCriterion("cust_code =", value, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeNotEqualTo(String value) {
            addCriterion("cust_code <>", value, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeGreaterThan(String value) {
            addCriterion("cust_code >", value, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cust_code >=", value, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeLessThan(String value) {
            addCriterion("cust_code <", value, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeLessThanOrEqualTo(String value) {
            addCriterion("cust_code <=", value, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeLike(String value) {
            addCriterion("cust_code like", value, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeNotLike(String value) {
            addCriterion("cust_code not like", value, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeIn(List<String> values) {
            addCriterion("cust_code in", values, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeNotIn(List<String> values) {
            addCriterion("cust_code not in", values, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeBetween(String value1, String value2) {
            addCriterion("cust_code between", value1, value2, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustCodeNotBetween(String value1, String value2) {
            addCriterion("cust_code not between", value1, value2, "custCode");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNull() {
            addCriterion("cust_name is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("cust_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("cust_name =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("cust_name <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("cust_name >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("cust_name >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("cust_name <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("cust_name <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("cust_name like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("cust_name not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("cust_name in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("cust_name not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("cust_name between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("cust_name not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustAddressIsNull() {
            addCriterion("cust_address is null");
            return (Criteria) this;
        }

        public Criteria andCustAddressIsNotNull() {
            addCriterion("cust_address is not null");
            return (Criteria) this;
        }

        public Criteria andCustAddressEqualTo(String value) {
            addCriterion("cust_address =", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressNotEqualTo(String value) {
            addCriterion("cust_address <>", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressGreaterThan(String value) {
            addCriterion("cust_address >", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressGreaterThanOrEqualTo(String value) {
            addCriterion("cust_address >=", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressLessThan(String value) {
            addCriterion("cust_address <", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressLessThanOrEqualTo(String value) {
            addCriterion("cust_address <=", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressLike(String value) {
            addCriterion("cust_address like", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressNotLike(String value) {
            addCriterion("cust_address not like", value, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressIn(List<String> values) {
            addCriterion("cust_address in", values, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressNotIn(List<String> values) {
            addCriterion("cust_address not in", values, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressBetween(String value1, String value2) {
            addCriterion("cust_address between", value1, value2, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustAddressNotBetween(String value1, String value2) {
            addCriterion("cust_address not between", value1, value2, "custAddress");
            return (Criteria) this;
        }

        public Criteria andCustPhoneIsNull() {
            addCriterion("cust_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustPhoneIsNotNull() {
            addCriterion("cust_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustPhoneEqualTo(String value) {
            addCriterion("cust_phone =", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneNotEqualTo(String value) {
            addCriterion("cust_phone <>", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneGreaterThan(String value) {
            addCriterion("cust_phone >", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("cust_phone >=", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneLessThan(String value) {
            addCriterion("cust_phone <", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneLessThanOrEqualTo(String value) {
            addCriterion("cust_phone <=", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneLike(String value) {
            addCriterion("cust_phone like", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneNotLike(String value) {
            addCriterion("cust_phone not like", value, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneIn(List<String> values) {
            addCriterion("cust_phone in", values, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneNotIn(List<String> values) {
            addCriterion("cust_phone not in", values, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneBetween(String value1, String value2) {
            addCriterion("cust_phone between", value1, value2, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustPhoneNotBetween(String value1, String value2) {
            addCriterion("cust_phone not between", value1, value2, "custPhone");
            return (Criteria) this;
        }

        public Criteria andCustQqIsNull() {
            addCriterion("cust_qq is null");
            return (Criteria) this;
        }

        public Criteria andCustQqIsNotNull() {
            addCriterion("cust_qq is not null");
            return (Criteria) this;
        }

        public Criteria andCustQqEqualTo(String value) {
            addCriterion("cust_qq =", value, "custQq");
            return (Criteria) this;
        }

        public Criteria andCustQqNotEqualTo(String value) {
            addCriterion("cust_qq <>", value, "custQq");
            return (Criteria) this;
        }

        public Criteria andCustQqGreaterThan(String value) {
            addCriterion("cust_qq >", value, "custQq");
            return (Criteria) this;
        }

        public Criteria andCustQqGreaterThanOrEqualTo(String value) {
            addCriterion("cust_qq >=", value, "custQq");
            return (Criteria) this;
        }

        public Criteria andCustQqLessThan(String value) {
            addCriterion("cust_qq <", value, "custQq");
            return (Criteria) this;
        }

        public Criteria andCustQqLessThanOrEqualTo(String value) {
            addCriterion("cust_qq <=", value, "custQq");
            return (Criteria) this;
        }

        public Criteria andCustQqLike(String value) {
            addCriterion("cust_qq like", value, "custQq");
            return (Criteria) this;
        }

        public Criteria andCustQqNotLike(String value) {
            addCriterion("cust_qq not like", value, "custQq");
            return (Criteria) this;
        }

        public Criteria andCustQqIn(List<String> values) {
            addCriterion("cust_qq in", values, "custQq");
            return (Criteria) this;
        }

        public Criteria andCustQqNotIn(List<String> values) {
            addCriterion("cust_qq not in", values, "custQq");
            return (Criteria) this;
        }

        public Criteria andCustQqBetween(String value1, String value2) {
            addCriterion("cust_qq between", value1, value2, "custQq");
            return (Criteria) this;
        }

        public Criteria andCustQqNotBetween(String value1, String value2) {
            addCriterion("cust_qq not between", value1, value2, "custQq");
            return (Criteria) this;
        }

        public Criteria andCustInfoIsNull() {
            addCriterion("cust_info is null");
            return (Criteria) this;
        }

        public Criteria andCustInfoIsNotNull() {
            addCriterion("cust_info is not null");
            return (Criteria) this;
        }

        public Criteria andCustInfoEqualTo(String value) {
            addCriterion("cust_info =", value, "custInfo");
            return (Criteria) this;
        }

        public Criteria andCustInfoNotEqualTo(String value) {
            addCriterion("cust_info <>", value, "custInfo");
            return (Criteria) this;
        }

        public Criteria andCustInfoGreaterThan(String value) {
            addCriterion("cust_info >", value, "custInfo");
            return (Criteria) this;
        }

        public Criteria andCustInfoGreaterThanOrEqualTo(String value) {
            addCriterion("cust_info >=", value, "custInfo");
            return (Criteria) this;
        }

        public Criteria andCustInfoLessThan(String value) {
            addCriterion("cust_info <", value, "custInfo");
            return (Criteria) this;
        }

        public Criteria andCustInfoLessThanOrEqualTo(String value) {
            addCriterion("cust_info <=", value, "custInfo");
            return (Criteria) this;
        }

        public Criteria andCustInfoLike(String value) {
            addCriterion("cust_info like", value, "custInfo");
            return (Criteria) this;
        }

        public Criteria andCustInfoNotLike(String value) {
            addCriterion("cust_info not like", value, "custInfo");
            return (Criteria) this;
        }

        public Criteria andCustInfoIn(List<String> values) {
            addCriterion("cust_info in", values, "custInfo");
            return (Criteria) this;
        }

        public Criteria andCustInfoNotIn(List<String> values) {
            addCriterion("cust_info not in", values, "custInfo");
            return (Criteria) this;
        }

        public Criteria andCustInfoBetween(String value1, String value2) {
            addCriterion("cust_info between", value1, value2, "custInfo");
            return (Criteria) this;
        }

        public Criteria andCustInfoNotBetween(String value1, String value2) {
            addCriterion("cust_info not between", value1, value2, "custInfo");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andModifyByIsNull() {
            addCriterion("modify_by is null");
            return (Criteria) this;
        }

        public Criteria andModifyByIsNotNull() {
            addCriterion("modify_by is not null");
            return (Criteria) this;
        }

        public Criteria andModifyByEqualTo(String value) {
            addCriterion("modify_by =", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByNotEqualTo(String value) {
            addCriterion("modify_by <>", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByGreaterThan(String value) {
            addCriterion("modify_by >", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByGreaterThanOrEqualTo(String value) {
            addCriterion("modify_by >=", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByLessThan(String value) {
            addCriterion("modify_by <", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByLessThanOrEqualTo(String value) {
            addCriterion("modify_by <=", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByLike(String value) {
            addCriterion("modify_by like", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByNotLike(String value) {
            addCriterion("modify_by not like", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByIn(List<String> values) {
            addCriterion("modify_by in", values, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByNotIn(List<String> values) {
            addCriterion("modify_by not in", values, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByBetween(String value1, String value2) {
            addCriterion("modify_by between", value1, value2, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByNotBetween(String value1, String value2) {
            addCriterion("modify_by not between", value1, value2, "modifyBy");
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

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNull() {
            addCriterion("batch_id is null");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNotNull() {
            addCriterion("batch_id is not null");
            return (Criteria) this;
        }

        public Criteria andBatchIdEqualTo(String value) {
            addCriterion("batch_id =", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotEqualTo(String value) {
            addCriterion("batch_id <>", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThan(String value) {
            addCriterion("batch_id >", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThanOrEqualTo(String value) {
            addCriterion("batch_id >=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThan(String value) {
            addCriterion("batch_id <", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThanOrEqualTo(String value) {
            addCriterion("batch_id <=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLike(String value) {
            addCriterion("batch_id like", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotLike(String value) {
            addCriterion("batch_id not like", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdIn(List<String> values) {
            addCriterion("batch_id in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotIn(List<String> values) {
            addCriterion("batch_id not in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdBetween(String value1, String value2) {
            addCriterion("batch_id between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotBetween(String value1, String value2) {
            addCriterion("batch_id not between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andCustBack01IsNull() {
            addCriterion("cust_back_01 is null");
            return (Criteria) this;
        }

        public Criteria andCustBack01IsNotNull() {
            addCriterion("cust_back_01 is not null");
            return (Criteria) this;
        }

        public Criteria andCustBack01EqualTo(String value) {
            addCriterion("cust_back_01 =", value, "custBack01");
            return (Criteria) this;
        }

        public Criteria andCustBack01NotEqualTo(String value) {
            addCriterion("cust_back_01 <>", value, "custBack01");
            return (Criteria) this;
        }

        public Criteria andCustBack01GreaterThan(String value) {
            addCriterion("cust_back_01 >", value, "custBack01");
            return (Criteria) this;
        }

        public Criteria andCustBack01GreaterThanOrEqualTo(String value) {
            addCriterion("cust_back_01 >=", value, "custBack01");
            return (Criteria) this;
        }

        public Criteria andCustBack01LessThan(String value) {
            addCriterion("cust_back_01 <", value, "custBack01");
            return (Criteria) this;
        }

        public Criteria andCustBack01LessThanOrEqualTo(String value) {
            addCriterion("cust_back_01 <=", value, "custBack01");
            return (Criteria) this;
        }

        public Criteria andCustBack01Like(String value) {
            addCriterion("cust_back_01 like", value, "custBack01");
            return (Criteria) this;
        }

        public Criteria andCustBack01NotLike(String value) {
            addCriterion("cust_back_01 not like", value, "custBack01");
            return (Criteria) this;
        }

        public Criteria andCustBack01In(List<String> values) {
            addCriterion("cust_back_01 in", values, "custBack01");
            return (Criteria) this;
        }

        public Criteria andCustBack01NotIn(List<String> values) {
            addCriterion("cust_back_01 not in", values, "custBack01");
            return (Criteria) this;
        }

        public Criteria andCustBack01Between(String value1, String value2) {
            addCriterion("cust_back_01 between", value1, value2, "custBack01");
            return (Criteria) this;
        }

        public Criteria andCustBack01NotBetween(String value1, String value2) {
            addCriterion("cust_back_01 not between", value1, value2, "custBack01");
            return (Criteria) this;
        }

        public Criteria andCustBack02IsNull() {
            addCriterion("cust_back_02 is null");
            return (Criteria) this;
        }

        public Criteria andCustBack02IsNotNull() {
            addCriterion("cust_back_02 is not null");
            return (Criteria) this;
        }

        public Criteria andCustBack02EqualTo(String value) {
            addCriterion("cust_back_02 =", value, "custBack02");
            return (Criteria) this;
        }

        public Criteria andCustBack02NotEqualTo(String value) {
            addCriterion("cust_back_02 <>", value, "custBack02");
            return (Criteria) this;
        }

        public Criteria andCustBack02GreaterThan(String value) {
            addCriterion("cust_back_02 >", value, "custBack02");
            return (Criteria) this;
        }

        public Criteria andCustBack02GreaterThanOrEqualTo(String value) {
            addCriterion("cust_back_02 >=", value, "custBack02");
            return (Criteria) this;
        }

        public Criteria andCustBack02LessThan(String value) {
            addCriterion("cust_back_02 <", value, "custBack02");
            return (Criteria) this;
        }

        public Criteria andCustBack02LessThanOrEqualTo(String value) {
            addCriterion("cust_back_02 <=", value, "custBack02");
            return (Criteria) this;
        }

        public Criteria andCustBack02Like(String value) {
            addCriterion("cust_back_02 like", value, "custBack02");
            return (Criteria) this;
        }

        public Criteria andCustBack02NotLike(String value) {
            addCriterion("cust_back_02 not like", value, "custBack02");
            return (Criteria) this;
        }

        public Criteria andCustBack02In(List<String> values) {
            addCriterion("cust_back_02 in", values, "custBack02");
            return (Criteria) this;
        }

        public Criteria andCustBack02NotIn(List<String> values) {
            addCriterion("cust_back_02 not in", values, "custBack02");
            return (Criteria) this;
        }

        public Criteria andCustBack02Between(String value1, String value2) {
            addCriterion("cust_back_02 between", value1, value2, "custBack02");
            return (Criteria) this;
        }

        public Criteria andCustBack02NotBetween(String value1, String value2) {
            addCriterion("cust_back_02 not between", value1, value2, "custBack02");
            return (Criteria) this;
        }

        public Criteria andCustBack03IsNull() {
            addCriterion("cust_back_03 is null");
            return (Criteria) this;
        }

        public Criteria andCustBack03IsNotNull() {
            addCriterion("cust_back_03 is not null");
            return (Criteria) this;
        }

        public Criteria andCustBack03EqualTo(String value) {
            addCriterion("cust_back_03 =", value, "custBack03");
            return (Criteria) this;
        }

        public Criteria andCustBack03NotEqualTo(String value) {
            addCriterion("cust_back_03 <>", value, "custBack03");
            return (Criteria) this;
        }

        public Criteria andCustBack03GreaterThan(String value) {
            addCriterion("cust_back_03 >", value, "custBack03");
            return (Criteria) this;
        }

        public Criteria andCustBack03GreaterThanOrEqualTo(String value) {
            addCriterion("cust_back_03 >=", value, "custBack03");
            return (Criteria) this;
        }

        public Criteria andCustBack03LessThan(String value) {
            addCriterion("cust_back_03 <", value, "custBack03");
            return (Criteria) this;
        }

        public Criteria andCustBack03LessThanOrEqualTo(String value) {
            addCriterion("cust_back_03 <=", value, "custBack03");
            return (Criteria) this;
        }

        public Criteria andCustBack03Like(String value) {
            addCriterion("cust_back_03 like", value, "custBack03");
            return (Criteria) this;
        }

        public Criteria andCustBack03NotLike(String value) {
            addCriterion("cust_back_03 not like", value, "custBack03");
            return (Criteria) this;
        }

        public Criteria andCustBack03In(List<String> values) {
            addCriterion("cust_back_03 in", values, "custBack03");
            return (Criteria) this;
        }

        public Criteria andCustBack03NotIn(List<String> values) {
            addCriterion("cust_back_03 not in", values, "custBack03");
            return (Criteria) this;
        }

        public Criteria andCustBack03Between(String value1, String value2) {
            addCriterion("cust_back_03 between", value1, value2, "custBack03");
            return (Criteria) this;
        }

        public Criteria andCustBack03NotBetween(String value1, String value2) {
            addCriterion("cust_back_03 not between", value1, value2, "custBack03");
            return (Criteria) this;
        }

        public Criteria andCustBack04IsNull() {
            addCriterion("cust_back_04 is null");
            return (Criteria) this;
        }

        public Criteria andCustBack04IsNotNull() {
            addCriterion("cust_back_04 is not null");
            return (Criteria) this;
        }

        public Criteria andCustBack04EqualTo(String value) {
            addCriterion("cust_back_04 =", value, "custBack04");
            return (Criteria) this;
        }

        public Criteria andCustBack04NotEqualTo(String value) {
            addCriterion("cust_back_04 <>", value, "custBack04");
            return (Criteria) this;
        }

        public Criteria andCustBack04GreaterThan(String value) {
            addCriterion("cust_back_04 >", value, "custBack04");
            return (Criteria) this;
        }

        public Criteria andCustBack04GreaterThanOrEqualTo(String value) {
            addCriterion("cust_back_04 >=", value, "custBack04");
            return (Criteria) this;
        }

        public Criteria andCustBack04LessThan(String value) {
            addCriterion("cust_back_04 <", value, "custBack04");
            return (Criteria) this;
        }

        public Criteria andCustBack04LessThanOrEqualTo(String value) {
            addCriterion("cust_back_04 <=", value, "custBack04");
            return (Criteria) this;
        }

        public Criteria andCustBack04Like(String value) {
            addCriterion("cust_back_04 like", value, "custBack04");
            return (Criteria) this;
        }

        public Criteria andCustBack04NotLike(String value) {
            addCriterion("cust_back_04 not like", value, "custBack04");
            return (Criteria) this;
        }

        public Criteria andCustBack04In(List<String> values) {
            addCriterion("cust_back_04 in", values, "custBack04");
            return (Criteria) this;
        }

        public Criteria andCustBack04NotIn(List<String> values) {
            addCriterion("cust_back_04 not in", values, "custBack04");
            return (Criteria) this;
        }

        public Criteria andCustBack04Between(String value1, String value2) {
            addCriterion("cust_back_04 between", value1, value2, "custBack04");
            return (Criteria) this;
        }

        public Criteria andCustBack04NotBetween(String value1, String value2) {
            addCriterion("cust_back_04 not between", value1, value2, "custBack04");
            return (Criteria) this;
        }

        public Criteria andCustBack05IsNull() {
            addCriterion("cust_back_05 is null");
            return (Criteria) this;
        }

        public Criteria andCustBack05IsNotNull() {
            addCriterion("cust_back_05 is not null");
            return (Criteria) this;
        }

        public Criteria andCustBack05EqualTo(String value) {
            addCriterion("cust_back_05 =", value, "custBack05");
            return (Criteria) this;
        }

        public Criteria andCustBack05NotEqualTo(String value) {
            addCriterion("cust_back_05 <>", value, "custBack05");
            return (Criteria) this;
        }

        public Criteria andCustBack05GreaterThan(String value) {
            addCriterion("cust_back_05 >", value, "custBack05");
            return (Criteria) this;
        }

        public Criteria andCustBack05GreaterThanOrEqualTo(String value) {
            addCriterion("cust_back_05 >=", value, "custBack05");
            return (Criteria) this;
        }

        public Criteria andCustBack05LessThan(String value) {
            addCriterion("cust_back_05 <", value, "custBack05");
            return (Criteria) this;
        }

        public Criteria andCustBack05LessThanOrEqualTo(String value) {
            addCriterion("cust_back_05 <=", value, "custBack05");
            return (Criteria) this;
        }

        public Criteria andCustBack05Like(String value) {
            addCriterion("cust_back_05 like", value, "custBack05");
            return (Criteria) this;
        }

        public Criteria andCustBack05NotLike(String value) {
            addCriterion("cust_back_05 not like", value, "custBack05");
            return (Criteria) this;
        }

        public Criteria andCustBack05In(List<String> values) {
            addCriterion("cust_back_05 in", values, "custBack05");
            return (Criteria) this;
        }

        public Criteria andCustBack05NotIn(List<String> values) {
            addCriterion("cust_back_05 not in", values, "custBack05");
            return (Criteria) this;
        }

        public Criteria andCustBack05Between(String value1, String value2) {
            addCriterion("cust_back_05 between", value1, value2, "custBack05");
            return (Criteria) this;
        }

        public Criteria andCustBack05NotBetween(String value1, String value2) {
            addCriterion("cust_back_05 not between", value1, value2, "custBack05");
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