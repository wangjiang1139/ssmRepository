package com.cn.cmbc.batch.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andProductCodeIsNull() {
            addCriterion("product_code is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("product_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("product_code =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("product_code <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("product_code >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_code >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("product_code <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("product_code <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("product_code like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("product_code not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("product_code in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("product_code not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("product_code between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("product_code not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNull() {
            addCriterion("product_price is null");
            return (Criteria) this;
        }

        public Criteria andProductPriceIsNotNull() {
            addCriterion("product_price is not null");
            return (Criteria) this;
        }

        public Criteria andProductPriceEqualTo(Double value) {
            addCriterion("product_price =", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotEqualTo(Double value) {
            addCriterion("product_price <>", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThan(Double value) {
            addCriterion("product_price >", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("product_price >=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThan(Double value) {
            addCriterion("product_price <", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceLessThanOrEqualTo(Double value) {
            addCriterion("product_price <=", value, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceIn(List<Double> values) {
            addCriterion("product_price in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotIn(List<Double> values) {
            addCriterion("product_price not in", values, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceBetween(Double value1, Double value2) {
            addCriterion("product_price between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductPriceNotBetween(Double value1, Double value2) {
            addCriterion("product_price not between", value1, value2, "productPrice");
            return (Criteria) this;
        }

        public Criteria andProductColorIsNull() {
            addCriterion("product_color is null");
            return (Criteria) this;
        }

        public Criteria andProductColorIsNotNull() {
            addCriterion("product_color is not null");
            return (Criteria) this;
        }

        public Criteria andProductColorEqualTo(String value) {
            addCriterion("product_color =", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorNotEqualTo(String value) {
            addCriterion("product_color <>", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorGreaterThan(String value) {
            addCriterion("product_color >", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorGreaterThanOrEqualTo(String value) {
            addCriterion("product_color >=", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorLessThan(String value) {
            addCriterion("product_color <", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorLessThanOrEqualTo(String value) {
            addCriterion("product_color <=", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorLike(String value) {
            addCriterion("product_color like", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorNotLike(String value) {
            addCriterion("product_color not like", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorIn(List<String> values) {
            addCriterion("product_color in", values, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorNotIn(List<String> values) {
            addCriterion("product_color not in", values, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorBetween(String value1, String value2) {
            addCriterion("product_color between", value1, value2, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorNotBetween(String value1, String value2) {
            addCriterion("product_color not between", value1, value2, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductStockIsNull() {
            addCriterion("product_stock is null");
            return (Criteria) this;
        }

        public Criteria andProductStockIsNotNull() {
            addCriterion("product_stock is not null");
            return (Criteria) this;
        }

        public Criteria andProductStockEqualTo(String value) {
            addCriterion("product_stock =", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockNotEqualTo(String value) {
            addCriterion("product_stock <>", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockGreaterThan(String value) {
            addCriterion("product_stock >", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockGreaterThanOrEqualTo(String value) {
            addCriterion("product_stock >=", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockLessThan(String value) {
            addCriterion("product_stock <", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockLessThanOrEqualTo(String value) {
            addCriterion("product_stock <=", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockLike(String value) {
            addCriterion("product_stock like", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockNotLike(String value) {
            addCriterion("product_stock not like", value, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockIn(List<String> values) {
            addCriterion("product_stock in", values, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockNotIn(List<String> values) {
            addCriterion("product_stock not in", values, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockBetween(String value1, String value2) {
            addCriterion("product_stock between", value1, value2, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductStockNotBetween(String value1, String value2) {
            addCriterion("product_stock not between", value1, value2, "productStock");
            return (Criteria) this;
        }

        public Criteria andProductInfoIsNull() {
            addCriterion("product_info is null");
            return (Criteria) this;
        }

        public Criteria andProductInfoIsNotNull() {
            addCriterion("product_info is not null");
            return (Criteria) this;
        }

        public Criteria andProductInfoEqualTo(String value) {
            addCriterion("product_info =", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoNotEqualTo(String value) {
            addCriterion("product_info <>", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoGreaterThan(String value) {
            addCriterion("product_info >", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoGreaterThanOrEqualTo(String value) {
            addCriterion("product_info >=", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoLessThan(String value) {
            addCriterion("product_info <", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoLessThanOrEqualTo(String value) {
            addCriterion("product_info <=", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoLike(String value) {
            addCriterion("product_info like", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoNotLike(String value) {
            addCriterion("product_info not like", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoIn(List<String> values) {
            addCriterion("product_info in", values, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoNotIn(List<String> values) {
            addCriterion("product_info not in", values, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoBetween(String value1, String value2) {
            addCriterion("product_info between", value1, value2, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoNotBetween(String value1, String value2) {
            addCriterion("product_info not between", value1, value2, "productInfo");
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

        public Criteria andProdBack01IsNull() {
            addCriterion("prod_back_01 is null");
            return (Criteria) this;
        }

        public Criteria andProdBack01IsNotNull() {
            addCriterion("prod_back_01 is not null");
            return (Criteria) this;
        }

        public Criteria andProdBack01EqualTo(String value) {
            addCriterion("prod_back_01 =", value, "prodBack01");
            return (Criteria) this;
        }

        public Criteria andProdBack01NotEqualTo(String value) {
            addCriterion("prod_back_01 <>", value, "prodBack01");
            return (Criteria) this;
        }

        public Criteria andProdBack01GreaterThan(String value) {
            addCriterion("prod_back_01 >", value, "prodBack01");
            return (Criteria) this;
        }

        public Criteria andProdBack01GreaterThanOrEqualTo(String value) {
            addCriterion("prod_back_01 >=", value, "prodBack01");
            return (Criteria) this;
        }

        public Criteria andProdBack01LessThan(String value) {
            addCriterion("prod_back_01 <", value, "prodBack01");
            return (Criteria) this;
        }

        public Criteria andProdBack01LessThanOrEqualTo(String value) {
            addCriterion("prod_back_01 <=", value, "prodBack01");
            return (Criteria) this;
        }

        public Criteria andProdBack01Like(String value) {
            addCriterion("prod_back_01 like", value, "prodBack01");
            return (Criteria) this;
        }

        public Criteria andProdBack01NotLike(String value) {
            addCriterion("prod_back_01 not like", value, "prodBack01");
            return (Criteria) this;
        }

        public Criteria andProdBack01In(List<String> values) {
            addCriterion("prod_back_01 in", values, "prodBack01");
            return (Criteria) this;
        }

        public Criteria andProdBack01NotIn(List<String> values) {
            addCriterion("prod_back_01 not in", values, "prodBack01");
            return (Criteria) this;
        }

        public Criteria andProdBack01Between(String value1, String value2) {
            addCriterion("prod_back_01 between", value1, value2, "prodBack01");
            return (Criteria) this;
        }

        public Criteria andProdBack01NotBetween(String value1, String value2) {
            addCriterion("prod_back_01 not between", value1, value2, "prodBack01");
            return (Criteria) this;
        }

        public Criteria andProdBack02IsNull() {
            addCriterion("prod_back_02 is null");
            return (Criteria) this;
        }

        public Criteria andProdBack02IsNotNull() {
            addCriterion("prod_back_02 is not null");
            return (Criteria) this;
        }

        public Criteria andProdBack02EqualTo(String value) {
            addCriterion("prod_back_02 =", value, "prodBack02");
            return (Criteria) this;
        }

        public Criteria andProdBack02NotEqualTo(String value) {
            addCriterion("prod_back_02 <>", value, "prodBack02");
            return (Criteria) this;
        }

        public Criteria andProdBack02GreaterThan(String value) {
            addCriterion("prod_back_02 >", value, "prodBack02");
            return (Criteria) this;
        }

        public Criteria andProdBack02GreaterThanOrEqualTo(String value) {
            addCriterion("prod_back_02 >=", value, "prodBack02");
            return (Criteria) this;
        }

        public Criteria andProdBack02LessThan(String value) {
            addCriterion("prod_back_02 <", value, "prodBack02");
            return (Criteria) this;
        }

        public Criteria andProdBack02LessThanOrEqualTo(String value) {
            addCriterion("prod_back_02 <=", value, "prodBack02");
            return (Criteria) this;
        }

        public Criteria andProdBack02Like(String value) {
            addCriterion("prod_back_02 like", value, "prodBack02");
            return (Criteria) this;
        }

        public Criteria andProdBack02NotLike(String value) {
            addCriterion("prod_back_02 not like", value, "prodBack02");
            return (Criteria) this;
        }

        public Criteria andProdBack02In(List<String> values) {
            addCriterion("prod_back_02 in", values, "prodBack02");
            return (Criteria) this;
        }

        public Criteria andProdBack02NotIn(List<String> values) {
            addCriterion("prod_back_02 not in", values, "prodBack02");
            return (Criteria) this;
        }

        public Criteria andProdBack02Between(String value1, String value2) {
            addCriterion("prod_back_02 between", value1, value2, "prodBack02");
            return (Criteria) this;
        }

        public Criteria andProdBack02NotBetween(String value1, String value2) {
            addCriterion("prod_back_02 not between", value1, value2, "prodBack02");
            return (Criteria) this;
        }

        public Criteria andProdBack03IsNull() {
            addCriterion("prod_back_03 is null");
            return (Criteria) this;
        }

        public Criteria andProdBack03IsNotNull() {
            addCriterion("prod_back_03 is not null");
            return (Criteria) this;
        }

        public Criteria andProdBack03EqualTo(String value) {
            addCriterion("prod_back_03 =", value, "prodBack03");
            return (Criteria) this;
        }

        public Criteria andProdBack03NotEqualTo(String value) {
            addCriterion("prod_back_03 <>", value, "prodBack03");
            return (Criteria) this;
        }

        public Criteria andProdBack03GreaterThan(String value) {
            addCriterion("prod_back_03 >", value, "prodBack03");
            return (Criteria) this;
        }

        public Criteria andProdBack03GreaterThanOrEqualTo(String value) {
            addCriterion("prod_back_03 >=", value, "prodBack03");
            return (Criteria) this;
        }

        public Criteria andProdBack03LessThan(String value) {
            addCriterion("prod_back_03 <", value, "prodBack03");
            return (Criteria) this;
        }

        public Criteria andProdBack03LessThanOrEqualTo(String value) {
            addCriterion("prod_back_03 <=", value, "prodBack03");
            return (Criteria) this;
        }

        public Criteria andProdBack03Like(String value) {
            addCriterion("prod_back_03 like", value, "prodBack03");
            return (Criteria) this;
        }

        public Criteria andProdBack03NotLike(String value) {
            addCriterion("prod_back_03 not like", value, "prodBack03");
            return (Criteria) this;
        }

        public Criteria andProdBack03In(List<String> values) {
            addCriterion("prod_back_03 in", values, "prodBack03");
            return (Criteria) this;
        }

        public Criteria andProdBack03NotIn(List<String> values) {
            addCriterion("prod_back_03 not in", values, "prodBack03");
            return (Criteria) this;
        }

        public Criteria andProdBack03Between(String value1, String value2) {
            addCriterion("prod_back_03 between", value1, value2, "prodBack03");
            return (Criteria) this;
        }

        public Criteria andProdBack03NotBetween(String value1, String value2) {
            addCriterion("prod_back_03 not between", value1, value2, "prodBack03");
            return (Criteria) this;
        }

        public Criteria andProdBack04IsNull() {
            addCriterion("prod_back_04 is null");
            return (Criteria) this;
        }

        public Criteria andProdBack04IsNotNull() {
            addCriterion("prod_back_04 is not null");
            return (Criteria) this;
        }

        public Criteria andProdBack04EqualTo(String value) {
            addCriterion("prod_back_04 =", value, "prodBack04");
            return (Criteria) this;
        }

        public Criteria andProdBack04NotEqualTo(String value) {
            addCriterion("prod_back_04 <>", value, "prodBack04");
            return (Criteria) this;
        }

        public Criteria andProdBack04GreaterThan(String value) {
            addCriterion("prod_back_04 >", value, "prodBack04");
            return (Criteria) this;
        }

        public Criteria andProdBack04GreaterThanOrEqualTo(String value) {
            addCriterion("prod_back_04 >=", value, "prodBack04");
            return (Criteria) this;
        }

        public Criteria andProdBack04LessThan(String value) {
            addCriterion("prod_back_04 <", value, "prodBack04");
            return (Criteria) this;
        }

        public Criteria andProdBack04LessThanOrEqualTo(String value) {
            addCriterion("prod_back_04 <=", value, "prodBack04");
            return (Criteria) this;
        }

        public Criteria andProdBack04Like(String value) {
            addCriterion("prod_back_04 like", value, "prodBack04");
            return (Criteria) this;
        }

        public Criteria andProdBack04NotLike(String value) {
            addCriterion("prod_back_04 not like", value, "prodBack04");
            return (Criteria) this;
        }

        public Criteria andProdBack04In(List<String> values) {
            addCriterion("prod_back_04 in", values, "prodBack04");
            return (Criteria) this;
        }

        public Criteria andProdBack04NotIn(List<String> values) {
            addCriterion("prod_back_04 not in", values, "prodBack04");
            return (Criteria) this;
        }

        public Criteria andProdBack04Between(String value1, String value2) {
            addCriterion("prod_back_04 between", value1, value2, "prodBack04");
            return (Criteria) this;
        }

        public Criteria andProdBack04NotBetween(String value1, String value2) {
            addCriterion("prod_back_04 not between", value1, value2, "prodBack04");
            return (Criteria) this;
        }

        public Criteria andProdBack05IsNull() {
            addCriterion("prod_back_05 is null");
            return (Criteria) this;
        }

        public Criteria andProdBack05IsNotNull() {
            addCriterion("prod_back_05 is not null");
            return (Criteria) this;
        }

        public Criteria andProdBack05EqualTo(String value) {
            addCriterion("prod_back_05 =", value, "prodBack05");
            return (Criteria) this;
        }

        public Criteria andProdBack05NotEqualTo(String value) {
            addCriterion("prod_back_05 <>", value, "prodBack05");
            return (Criteria) this;
        }

        public Criteria andProdBack05GreaterThan(String value) {
            addCriterion("prod_back_05 >", value, "prodBack05");
            return (Criteria) this;
        }

        public Criteria andProdBack05GreaterThanOrEqualTo(String value) {
            addCriterion("prod_back_05 >=", value, "prodBack05");
            return (Criteria) this;
        }

        public Criteria andProdBack05LessThan(String value) {
            addCriterion("prod_back_05 <", value, "prodBack05");
            return (Criteria) this;
        }

        public Criteria andProdBack05LessThanOrEqualTo(String value) {
            addCriterion("prod_back_05 <=", value, "prodBack05");
            return (Criteria) this;
        }

        public Criteria andProdBack05Like(String value) {
            addCriterion("prod_back_05 like", value, "prodBack05");
            return (Criteria) this;
        }

        public Criteria andProdBack05NotLike(String value) {
            addCriterion("prod_back_05 not like", value, "prodBack05");
            return (Criteria) this;
        }

        public Criteria andProdBack05In(List<String> values) {
            addCriterion("prod_back_05 in", values, "prodBack05");
            return (Criteria) this;
        }

        public Criteria andProdBack05NotIn(List<String> values) {
            addCriterion("prod_back_05 not in", values, "prodBack05");
            return (Criteria) this;
        }

        public Criteria andProdBack05Between(String value1, String value2) {
            addCriterion("prod_back_05 between", value1, value2, "prodBack05");
            return (Criteria) this;
        }

        public Criteria andProdBack05NotBetween(String value1, String value2) {
            addCriterion("prod_back_05 not between", value1, value2, "prodBack05");
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