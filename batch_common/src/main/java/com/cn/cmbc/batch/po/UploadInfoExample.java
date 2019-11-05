package com.cn.cmbc.batch.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UploadInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UploadInfoExample() {
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

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("group_id like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("group_id not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andFastNameIsNull() {
            addCriterion("fast_name is null");
            return (Criteria) this;
        }

        public Criteria andFastNameIsNotNull() {
            addCriterion("fast_name is not null");
            return (Criteria) this;
        }

        public Criteria andFastNameEqualTo(String value) {
            addCriterion("fast_name =", value, "fastName");
            return (Criteria) this;
        }

        public Criteria andFastNameNotEqualTo(String value) {
            addCriterion("fast_name <>", value, "fastName");
            return (Criteria) this;
        }

        public Criteria andFastNameGreaterThan(String value) {
            addCriterion("fast_name >", value, "fastName");
            return (Criteria) this;
        }

        public Criteria andFastNameGreaterThanOrEqualTo(String value) {
            addCriterion("fast_name >=", value, "fastName");
            return (Criteria) this;
        }

        public Criteria andFastNameLessThan(String value) {
            addCriterion("fast_name <", value, "fastName");
            return (Criteria) this;
        }

        public Criteria andFastNameLessThanOrEqualTo(String value) {
            addCriterion("fast_name <=", value, "fastName");
            return (Criteria) this;
        }

        public Criteria andFastNameLike(String value) {
            addCriterion("fast_name like", value, "fastName");
            return (Criteria) this;
        }

        public Criteria andFastNameNotLike(String value) {
            addCriterion("fast_name not like", value, "fastName");
            return (Criteria) this;
        }

        public Criteria andFastNameIn(List<String> values) {
            addCriterion("fast_name in", values, "fastName");
            return (Criteria) this;
        }

        public Criteria andFastNameNotIn(List<String> values) {
            addCriterion("fast_name not in", values, "fastName");
            return (Criteria) this;
        }

        public Criteria andFastNameBetween(String value1, String value2) {
            addCriterion("fast_name between", value1, value2, "fastName");
            return (Criteria) this;
        }

        public Criteria andFastNameNotBetween(String value1, String value2) {
            addCriterion("fast_name not between", value1, value2, "fastName");
            return (Criteria) this;
        }

        public Criteria andUplodaTimeIsNull() {
            addCriterion("uploda_time is null");
            return (Criteria) this;
        }

        public Criteria andUplodaTimeIsNotNull() {
            addCriterion("uploda_time is not null");
            return (Criteria) this;
        }

        public Criteria andUplodaTimeEqualTo(Date value) {
            addCriterion("uploda_time =", value, "uplodaTime");
            return (Criteria) this;
        }

        public Criteria andUplodaTimeNotEqualTo(Date value) {
            addCriterion("uploda_time <>", value, "uplodaTime");
            return (Criteria) this;
        }

        public Criteria andUplodaTimeGreaterThan(Date value) {
            addCriterion("uploda_time >", value, "uplodaTime");
            return (Criteria) this;
        }

        public Criteria andUplodaTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("uploda_time >=", value, "uplodaTime");
            return (Criteria) this;
        }

        public Criteria andUplodaTimeLessThan(Date value) {
            addCriterion("uploda_time <", value, "uplodaTime");
            return (Criteria) this;
        }

        public Criteria andUplodaTimeLessThanOrEqualTo(Date value) {
            addCriterion("uploda_time <=", value, "uplodaTime");
            return (Criteria) this;
        }

        public Criteria andUplodaTimeIn(List<Date> values) {
            addCriterion("uploda_time in", values, "uplodaTime");
            return (Criteria) this;
        }

        public Criteria andUplodaTimeNotIn(List<Date> values) {
            addCriterion("uploda_time not in", values, "uplodaTime");
            return (Criteria) this;
        }

        public Criteria andUplodaTimeBetween(Date value1, Date value2) {
            addCriterion("uploda_time between", value1, value2, "uplodaTime");
            return (Criteria) this;
        }

        public Criteria andUplodaTimeNotBetween(Date value1, Date value2) {
            addCriterion("uploda_time not between", value1, value2, "uplodaTime");
            return (Criteria) this;
        }

        public Criteria andServiceCodeIsNull() {
            addCriterion("service_code is null");
            return (Criteria) this;
        }

        public Criteria andServiceCodeIsNotNull() {
            addCriterion("service_code is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCodeEqualTo(String value) {
            addCriterion("service_code =", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotEqualTo(String value) {
            addCriterion("service_code <>", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeGreaterThan(String value) {
            addCriterion("service_code >", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("service_code >=", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeLessThan(String value) {
            addCriterion("service_code <", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeLessThanOrEqualTo(String value) {
            addCriterion("service_code <=", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeLike(String value) {
            addCriterion("service_code like", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotLike(String value) {
            addCriterion("service_code not like", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeIn(List<String> values) {
            addCriterion("service_code in", values, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotIn(List<String> values) {
            addCriterion("service_code not in", values, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeBetween(String value1, String value2) {
            addCriterion("service_code between", value1, value2, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotBetween(String value1, String value2) {
            addCriterion("service_code not between", value1, value2, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andStautsIsNull() {
            addCriterion("stauts is null");
            return (Criteria) this;
        }

        public Criteria andStautsIsNotNull() {
            addCriterion("stauts is not null");
            return (Criteria) this;
        }

        public Criteria andStautsEqualTo(String value) {
            addCriterion("stauts =", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsNotEqualTo(String value) {
            addCriterion("stauts <>", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsGreaterThan(String value) {
            addCriterion("stauts >", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsGreaterThanOrEqualTo(String value) {
            addCriterion("stauts >=", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsLessThan(String value) {
            addCriterion("stauts <", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsLessThanOrEqualTo(String value) {
            addCriterion("stauts <=", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsLike(String value) {
            addCriterion("stauts like", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsNotLike(String value) {
            addCriterion("stauts not like", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsIn(List<String> values) {
            addCriterion("stauts in", values, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsNotIn(List<String> values) {
            addCriterion("stauts not in", values, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsBetween(String value1, String value2) {
            addCriterion("stauts between", value1, value2, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsNotBetween(String value1, String value2) {
            addCriterion("stauts not between", value1, value2, "stauts");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andThisBatchIdIsNull() {
            addCriterion("this_batch_id is null");
            return (Criteria) this;
        }

        public Criteria andThisBatchIdIsNotNull() {
            addCriterion("this_batch_id is not null");
            return (Criteria) this;
        }

        public Criteria andThisBatchIdEqualTo(String value) {
            addCriterion("this_batch_id =", value, "thisBatchId");
            return (Criteria) this;
        }

        public Criteria andThisBatchIdNotEqualTo(String value) {
            addCriterion("this_batch_id <>", value, "thisBatchId");
            return (Criteria) this;
        }

        public Criteria andThisBatchIdGreaterThan(String value) {
            addCriterion("this_batch_id >", value, "thisBatchId");
            return (Criteria) this;
        }

        public Criteria andThisBatchIdGreaterThanOrEqualTo(String value) {
            addCriterion("this_batch_id >=", value, "thisBatchId");
            return (Criteria) this;
        }

        public Criteria andThisBatchIdLessThan(String value) {
            addCriterion("this_batch_id <", value, "thisBatchId");
            return (Criteria) this;
        }

        public Criteria andThisBatchIdLessThanOrEqualTo(String value) {
            addCriterion("this_batch_id <=", value, "thisBatchId");
            return (Criteria) this;
        }

        public Criteria andThisBatchIdLike(String value) {
            addCriterion("this_batch_id like", value, "thisBatchId");
            return (Criteria) this;
        }

        public Criteria andThisBatchIdNotLike(String value) {
            addCriterion("this_batch_id not like", value, "thisBatchId");
            return (Criteria) this;
        }

        public Criteria andThisBatchIdIn(List<String> values) {
            addCriterion("this_batch_id in", values, "thisBatchId");
            return (Criteria) this;
        }

        public Criteria andThisBatchIdNotIn(List<String> values) {
            addCriterion("this_batch_id not in", values, "thisBatchId");
            return (Criteria) this;
        }

        public Criteria andThisBatchIdBetween(String value1, String value2) {
            addCriterion("this_batch_id between", value1, value2, "thisBatchId");
            return (Criteria) this;
        }

        public Criteria andThisBatchIdNotBetween(String value1, String value2) {
            addCriterion("this_batch_id not between", value1, value2, "thisBatchId");
            return (Criteria) this;
        }

        public Criteria andUploadBack01IsNull() {
            addCriterion("upload_back_01 is null");
            return (Criteria) this;
        }

        public Criteria andUploadBack01IsNotNull() {
            addCriterion("upload_back_01 is not null");
            return (Criteria) this;
        }

        public Criteria andUploadBack01EqualTo(String value) {
            addCriterion("upload_back_01 =", value, "uploadBack01");
            return (Criteria) this;
        }

        public Criteria andUploadBack01NotEqualTo(String value) {
            addCriterion("upload_back_01 <>", value, "uploadBack01");
            return (Criteria) this;
        }

        public Criteria andUploadBack01GreaterThan(String value) {
            addCriterion("upload_back_01 >", value, "uploadBack01");
            return (Criteria) this;
        }

        public Criteria andUploadBack01GreaterThanOrEqualTo(String value) {
            addCriterion("upload_back_01 >=", value, "uploadBack01");
            return (Criteria) this;
        }

        public Criteria andUploadBack01LessThan(String value) {
            addCriterion("upload_back_01 <", value, "uploadBack01");
            return (Criteria) this;
        }

        public Criteria andUploadBack01LessThanOrEqualTo(String value) {
            addCriterion("upload_back_01 <=", value, "uploadBack01");
            return (Criteria) this;
        }

        public Criteria andUploadBack01Like(String value) {
            addCriterion("upload_back_01 like", value, "uploadBack01");
            return (Criteria) this;
        }

        public Criteria andUploadBack01NotLike(String value) {
            addCriterion("upload_back_01 not like", value, "uploadBack01");
            return (Criteria) this;
        }

        public Criteria andUploadBack01In(List<String> values) {
            addCriterion("upload_back_01 in", values, "uploadBack01");
            return (Criteria) this;
        }

        public Criteria andUploadBack01NotIn(List<String> values) {
            addCriterion("upload_back_01 not in", values, "uploadBack01");
            return (Criteria) this;
        }

        public Criteria andUploadBack01Between(String value1, String value2) {
            addCriterion("upload_back_01 between", value1, value2, "uploadBack01");
            return (Criteria) this;
        }

        public Criteria andUploadBack01NotBetween(String value1, String value2) {
            addCriterion("upload_back_01 not between", value1, value2, "uploadBack01");
            return (Criteria) this;
        }

        public Criteria andUploadBack02IsNull() {
            addCriterion("upload_back_02 is null");
            return (Criteria) this;
        }

        public Criteria andUploadBack02IsNotNull() {
            addCriterion("upload_back_02 is not null");
            return (Criteria) this;
        }

        public Criteria andUploadBack02EqualTo(String value) {
            addCriterion("upload_back_02 =", value, "uploadBack02");
            return (Criteria) this;
        }

        public Criteria andUploadBack02NotEqualTo(String value) {
            addCriterion("upload_back_02 <>", value, "uploadBack02");
            return (Criteria) this;
        }

        public Criteria andUploadBack02GreaterThan(String value) {
            addCriterion("upload_back_02 >", value, "uploadBack02");
            return (Criteria) this;
        }

        public Criteria andUploadBack02GreaterThanOrEqualTo(String value) {
            addCriterion("upload_back_02 >=", value, "uploadBack02");
            return (Criteria) this;
        }

        public Criteria andUploadBack02LessThan(String value) {
            addCriterion("upload_back_02 <", value, "uploadBack02");
            return (Criteria) this;
        }

        public Criteria andUploadBack02LessThanOrEqualTo(String value) {
            addCriterion("upload_back_02 <=", value, "uploadBack02");
            return (Criteria) this;
        }

        public Criteria andUploadBack02Like(String value) {
            addCriterion("upload_back_02 like", value, "uploadBack02");
            return (Criteria) this;
        }

        public Criteria andUploadBack02NotLike(String value) {
            addCriterion("upload_back_02 not like", value, "uploadBack02");
            return (Criteria) this;
        }

        public Criteria andUploadBack02In(List<String> values) {
            addCriterion("upload_back_02 in", values, "uploadBack02");
            return (Criteria) this;
        }

        public Criteria andUploadBack02NotIn(List<String> values) {
            addCriterion("upload_back_02 not in", values, "uploadBack02");
            return (Criteria) this;
        }

        public Criteria andUploadBack02Between(String value1, String value2) {
            addCriterion("upload_back_02 between", value1, value2, "uploadBack02");
            return (Criteria) this;
        }

        public Criteria andUploadBack02NotBetween(String value1, String value2) {
            addCriterion("upload_back_02 not between", value1, value2, "uploadBack02");
            return (Criteria) this;
        }

        public Criteria andUploadBack03IsNull() {
            addCriterion("upload_back_03 is null");
            return (Criteria) this;
        }

        public Criteria andUploadBack03IsNotNull() {
            addCriterion("upload_back_03 is not null");
            return (Criteria) this;
        }

        public Criteria andUploadBack03EqualTo(String value) {
            addCriterion("upload_back_03 =", value, "uploadBack03");
            return (Criteria) this;
        }

        public Criteria andUploadBack03NotEqualTo(String value) {
            addCriterion("upload_back_03 <>", value, "uploadBack03");
            return (Criteria) this;
        }

        public Criteria andUploadBack03GreaterThan(String value) {
            addCriterion("upload_back_03 >", value, "uploadBack03");
            return (Criteria) this;
        }

        public Criteria andUploadBack03GreaterThanOrEqualTo(String value) {
            addCriterion("upload_back_03 >=", value, "uploadBack03");
            return (Criteria) this;
        }

        public Criteria andUploadBack03LessThan(String value) {
            addCriterion("upload_back_03 <", value, "uploadBack03");
            return (Criteria) this;
        }

        public Criteria andUploadBack03LessThanOrEqualTo(String value) {
            addCriterion("upload_back_03 <=", value, "uploadBack03");
            return (Criteria) this;
        }

        public Criteria andUploadBack03Like(String value) {
            addCriterion("upload_back_03 like", value, "uploadBack03");
            return (Criteria) this;
        }

        public Criteria andUploadBack03NotLike(String value) {
            addCriterion("upload_back_03 not like", value, "uploadBack03");
            return (Criteria) this;
        }

        public Criteria andUploadBack03In(List<String> values) {
            addCriterion("upload_back_03 in", values, "uploadBack03");
            return (Criteria) this;
        }

        public Criteria andUploadBack03NotIn(List<String> values) {
            addCriterion("upload_back_03 not in", values, "uploadBack03");
            return (Criteria) this;
        }

        public Criteria andUploadBack03Between(String value1, String value2) {
            addCriterion("upload_back_03 between", value1, value2, "uploadBack03");
            return (Criteria) this;
        }

        public Criteria andUploadBack03NotBetween(String value1, String value2) {
            addCriterion("upload_back_03 not between", value1, value2, "uploadBack03");
            return (Criteria) this;
        }

        public Criteria andUploadBack04IsNull() {
            addCriterion("upload_back_04 is null");
            return (Criteria) this;
        }

        public Criteria andUploadBack04IsNotNull() {
            addCriterion("upload_back_04 is not null");
            return (Criteria) this;
        }

        public Criteria andUploadBack04EqualTo(String value) {
            addCriterion("upload_back_04 =", value, "uploadBack04");
            return (Criteria) this;
        }

        public Criteria andUploadBack04NotEqualTo(String value) {
            addCriterion("upload_back_04 <>", value, "uploadBack04");
            return (Criteria) this;
        }

        public Criteria andUploadBack04GreaterThan(String value) {
            addCriterion("upload_back_04 >", value, "uploadBack04");
            return (Criteria) this;
        }

        public Criteria andUploadBack04GreaterThanOrEqualTo(String value) {
            addCriterion("upload_back_04 >=", value, "uploadBack04");
            return (Criteria) this;
        }

        public Criteria andUploadBack04LessThan(String value) {
            addCriterion("upload_back_04 <", value, "uploadBack04");
            return (Criteria) this;
        }

        public Criteria andUploadBack04LessThanOrEqualTo(String value) {
            addCriterion("upload_back_04 <=", value, "uploadBack04");
            return (Criteria) this;
        }

        public Criteria andUploadBack04Like(String value) {
            addCriterion("upload_back_04 like", value, "uploadBack04");
            return (Criteria) this;
        }

        public Criteria andUploadBack04NotLike(String value) {
            addCriterion("upload_back_04 not like", value, "uploadBack04");
            return (Criteria) this;
        }

        public Criteria andUploadBack04In(List<String> values) {
            addCriterion("upload_back_04 in", values, "uploadBack04");
            return (Criteria) this;
        }

        public Criteria andUploadBack04NotIn(List<String> values) {
            addCriterion("upload_back_04 not in", values, "uploadBack04");
            return (Criteria) this;
        }

        public Criteria andUploadBack04Between(String value1, String value2) {
            addCriterion("upload_back_04 between", value1, value2, "uploadBack04");
            return (Criteria) this;
        }

        public Criteria andUploadBack04NotBetween(String value1, String value2) {
            addCriterion("upload_back_04 not between", value1, value2, "uploadBack04");
            return (Criteria) this;
        }

        public Criteria andUploadBack05IsNull() {
            addCriterion("upload_back_05 is null");
            return (Criteria) this;
        }

        public Criteria andUploadBack05IsNotNull() {
            addCriterion("upload_back_05 is not null");
            return (Criteria) this;
        }

        public Criteria andUploadBack05EqualTo(String value) {
            addCriterion("upload_back_05 =", value, "uploadBack05");
            return (Criteria) this;
        }

        public Criteria andUploadBack05NotEqualTo(String value) {
            addCriterion("upload_back_05 <>", value, "uploadBack05");
            return (Criteria) this;
        }

        public Criteria andUploadBack05GreaterThan(String value) {
            addCriterion("upload_back_05 >", value, "uploadBack05");
            return (Criteria) this;
        }

        public Criteria andUploadBack05GreaterThanOrEqualTo(String value) {
            addCriterion("upload_back_05 >=", value, "uploadBack05");
            return (Criteria) this;
        }

        public Criteria andUploadBack05LessThan(String value) {
            addCriterion("upload_back_05 <", value, "uploadBack05");
            return (Criteria) this;
        }

        public Criteria andUploadBack05LessThanOrEqualTo(String value) {
            addCriterion("upload_back_05 <=", value, "uploadBack05");
            return (Criteria) this;
        }

        public Criteria andUploadBack05Like(String value) {
            addCriterion("upload_back_05 like", value, "uploadBack05");
            return (Criteria) this;
        }

        public Criteria andUploadBack05NotLike(String value) {
            addCriterion("upload_back_05 not like", value, "uploadBack05");
            return (Criteria) this;
        }

        public Criteria andUploadBack05In(List<String> values) {
            addCriterion("upload_back_05 in", values, "uploadBack05");
            return (Criteria) this;
        }

        public Criteria andUploadBack05NotIn(List<String> values) {
            addCriterion("upload_back_05 not in", values, "uploadBack05");
            return (Criteria) this;
        }

        public Criteria andUploadBack05Between(String value1, String value2) {
            addCriterion("upload_back_05 between", value1, value2, "uploadBack05");
            return (Criteria) this;
        }

        public Criteria andUploadBack05NotBetween(String value1, String value2) {
            addCriterion("upload_back_05 not between", value1, value2, "uploadBack05");
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