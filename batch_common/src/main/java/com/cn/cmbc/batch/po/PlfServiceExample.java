package com.cn.cmbc.batch.po;

import java.util.ArrayList;
import java.util.List;

public class PlfServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlfServiceExample() {
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

        public Criteria andServiceIdIsNull() {
            addCriterion("service_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNotNull() {
            addCriterion("service_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceIdEqualTo(String value) {
            addCriterion("service_id =", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotEqualTo(String value) {
            addCriterion("service_id <>", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThan(String value) {
            addCriterion("service_id >", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThanOrEqualTo(String value) {
            addCriterion("service_id >=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThan(String value) {
            addCriterion("service_id <", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThanOrEqualTo(String value) {
            addCriterion("service_id <=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLike(String value) {
            addCriterion("service_id like", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotLike(String value) {
            addCriterion("service_id not like", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIn(List<String> values) {
            addCriterion("service_id in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotIn(List<String> values) {
            addCriterion("service_id not in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdBetween(String value1, String value2) {
            addCriterion("service_id between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotBetween(String value1, String value2) {
            addCriterion("service_id not between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andLocalPathIsNull() {
            addCriterion("local_path is null");
            return (Criteria) this;
        }

        public Criteria andLocalPathIsNotNull() {
            addCriterion("local_path is not null");
            return (Criteria) this;
        }

        public Criteria andLocalPathEqualTo(String value) {
            addCriterion("local_path =", value, "localPath");
            return (Criteria) this;
        }

        public Criteria andLocalPathNotEqualTo(String value) {
            addCriterion("local_path <>", value, "localPath");
            return (Criteria) this;
        }

        public Criteria andLocalPathGreaterThan(String value) {
            addCriterion("local_path >", value, "localPath");
            return (Criteria) this;
        }

        public Criteria andLocalPathGreaterThanOrEqualTo(String value) {
            addCriterion("local_path >=", value, "localPath");
            return (Criteria) this;
        }

        public Criteria andLocalPathLessThan(String value) {
            addCriterion("local_path <", value, "localPath");
            return (Criteria) this;
        }

        public Criteria andLocalPathLessThanOrEqualTo(String value) {
            addCriterion("local_path <=", value, "localPath");
            return (Criteria) this;
        }

        public Criteria andLocalPathLike(String value) {
            addCriterion("local_path like", value, "localPath");
            return (Criteria) this;
        }

        public Criteria andLocalPathNotLike(String value) {
            addCriterion("local_path not like", value, "localPath");
            return (Criteria) this;
        }

        public Criteria andLocalPathIn(List<String> values) {
            addCriterion("local_path in", values, "localPath");
            return (Criteria) this;
        }

        public Criteria andLocalPathNotIn(List<String> values) {
            addCriterion("local_path not in", values, "localPath");
            return (Criteria) this;
        }

        public Criteria andLocalPathBetween(String value1, String value2) {
            addCriterion("local_path between", value1, value2, "localPath");
            return (Criteria) this;
        }

        public Criteria andLocalPathNotBetween(String value1, String value2) {
            addCriterion("local_path not between", value1, value2, "localPath");
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

        public Criteria andFileTypeIsNull() {
            addCriterion("file_type is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNotNull() {
            addCriterion("file_type is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeEqualTo(String value) {
            addCriterion("file_type =", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotEqualTo(String value) {
            addCriterion("file_type <>", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThan(String value) {
            addCriterion("file_type >", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("file_type >=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThan(String value) {
            addCriterion("file_type <", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThanOrEqualTo(String value) {
            addCriterion("file_type <=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLike(String value) {
            addCriterion("file_type like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotLike(String value) {
            addCriterion("file_type not like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeIn(List<String> values) {
            addCriterion("file_type in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotIn(List<String> values) {
            addCriterion("file_type not in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeBetween(String value1, String value2) {
            addCriterion("file_type between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotBetween(String value1, String value2) {
            addCriterion("file_type not between", value1, value2, "fileType");
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

        public Criteria andLastBatchIdIsNull() {
            addCriterion("last_batch_id is null");
            return (Criteria) this;
        }

        public Criteria andLastBatchIdIsNotNull() {
            addCriterion("last_batch_id is not null");
            return (Criteria) this;
        }

        public Criteria andLastBatchIdEqualTo(String value) {
            addCriterion("last_batch_id =", value, "lastBatchId");
            return (Criteria) this;
        }

        public Criteria andLastBatchIdNotEqualTo(String value) {
            addCriterion("last_batch_id <>", value, "lastBatchId");
            return (Criteria) this;
        }

        public Criteria andLastBatchIdGreaterThan(String value) {
            addCriterion("last_batch_id >", value, "lastBatchId");
            return (Criteria) this;
        }

        public Criteria andLastBatchIdGreaterThanOrEqualTo(String value) {
            addCriterion("last_batch_id >=", value, "lastBatchId");
            return (Criteria) this;
        }

        public Criteria andLastBatchIdLessThan(String value) {
            addCriterion("last_batch_id <", value, "lastBatchId");
            return (Criteria) this;
        }

        public Criteria andLastBatchIdLessThanOrEqualTo(String value) {
            addCriterion("last_batch_id <=", value, "lastBatchId");
            return (Criteria) this;
        }

        public Criteria andLastBatchIdLike(String value) {
            addCriterion("last_batch_id like", value, "lastBatchId");
            return (Criteria) this;
        }

        public Criteria andLastBatchIdNotLike(String value) {
            addCriterion("last_batch_id not like", value, "lastBatchId");
            return (Criteria) this;
        }

        public Criteria andLastBatchIdIn(List<String> values) {
            addCriterion("last_batch_id in", values, "lastBatchId");
            return (Criteria) this;
        }

        public Criteria andLastBatchIdNotIn(List<String> values) {
            addCriterion("last_batch_id not in", values, "lastBatchId");
            return (Criteria) this;
        }

        public Criteria andLastBatchIdBetween(String value1, String value2) {
            addCriterion("last_batch_id between", value1, value2, "lastBatchId");
            return (Criteria) this;
        }

        public Criteria andLastBatchIdNotBetween(String value1, String value2) {
            addCriterion("last_batch_id not between", value1, value2, "lastBatchId");
            return (Criteria) this;
        }

        public Criteria andPlfBack01IsNull() {
            addCriterion("plf_back_01 is null");
            return (Criteria) this;
        }

        public Criteria andPlfBack01IsNotNull() {
            addCriterion("plf_back_01 is not null");
            return (Criteria) this;
        }

        public Criteria andPlfBack01EqualTo(String value) {
            addCriterion("plf_back_01 =", value, "plfBack01");
            return (Criteria) this;
        }

        public Criteria andPlfBack01NotEqualTo(String value) {
            addCriterion("plf_back_01 <>", value, "plfBack01");
            return (Criteria) this;
        }

        public Criteria andPlfBack01GreaterThan(String value) {
            addCriterion("plf_back_01 >", value, "plfBack01");
            return (Criteria) this;
        }

        public Criteria andPlfBack01GreaterThanOrEqualTo(String value) {
            addCriterion("plf_back_01 >=", value, "plfBack01");
            return (Criteria) this;
        }

        public Criteria andPlfBack01LessThan(String value) {
            addCriterion("plf_back_01 <", value, "plfBack01");
            return (Criteria) this;
        }

        public Criteria andPlfBack01LessThanOrEqualTo(String value) {
            addCriterion("plf_back_01 <=", value, "plfBack01");
            return (Criteria) this;
        }

        public Criteria andPlfBack01Like(String value) {
            addCriterion("plf_back_01 like", value, "plfBack01");
            return (Criteria) this;
        }

        public Criteria andPlfBack01NotLike(String value) {
            addCriterion("plf_back_01 not like", value, "plfBack01");
            return (Criteria) this;
        }

        public Criteria andPlfBack01In(List<String> values) {
            addCriterion("plf_back_01 in", values, "plfBack01");
            return (Criteria) this;
        }

        public Criteria andPlfBack01NotIn(List<String> values) {
            addCriterion("plf_back_01 not in", values, "plfBack01");
            return (Criteria) this;
        }

        public Criteria andPlfBack01Between(String value1, String value2) {
            addCriterion("plf_back_01 between", value1, value2, "plfBack01");
            return (Criteria) this;
        }

        public Criteria andPlfBack01NotBetween(String value1, String value2) {
            addCriterion("plf_back_01 not between", value1, value2, "plfBack01");
            return (Criteria) this;
        }

        public Criteria andPlfBack02IsNull() {
            addCriterion("plf_back_02 is null");
            return (Criteria) this;
        }

        public Criteria andPlfBack02IsNotNull() {
            addCriterion("plf_back_02 is not null");
            return (Criteria) this;
        }

        public Criteria andPlfBack02EqualTo(String value) {
            addCriterion("plf_back_02 =", value, "plfBack02");
            return (Criteria) this;
        }

        public Criteria andPlfBack02NotEqualTo(String value) {
            addCriterion("plf_back_02 <>", value, "plfBack02");
            return (Criteria) this;
        }

        public Criteria andPlfBack02GreaterThan(String value) {
            addCriterion("plf_back_02 >", value, "plfBack02");
            return (Criteria) this;
        }

        public Criteria andPlfBack02GreaterThanOrEqualTo(String value) {
            addCriterion("plf_back_02 >=", value, "plfBack02");
            return (Criteria) this;
        }

        public Criteria andPlfBack02LessThan(String value) {
            addCriterion("plf_back_02 <", value, "plfBack02");
            return (Criteria) this;
        }

        public Criteria andPlfBack02LessThanOrEqualTo(String value) {
            addCriterion("plf_back_02 <=", value, "plfBack02");
            return (Criteria) this;
        }

        public Criteria andPlfBack02Like(String value) {
            addCriterion("plf_back_02 like", value, "plfBack02");
            return (Criteria) this;
        }

        public Criteria andPlfBack02NotLike(String value) {
            addCriterion("plf_back_02 not like", value, "plfBack02");
            return (Criteria) this;
        }

        public Criteria andPlfBack02In(List<String> values) {
            addCriterion("plf_back_02 in", values, "plfBack02");
            return (Criteria) this;
        }

        public Criteria andPlfBack02NotIn(List<String> values) {
            addCriterion("plf_back_02 not in", values, "plfBack02");
            return (Criteria) this;
        }

        public Criteria andPlfBack02Between(String value1, String value2) {
            addCriterion("plf_back_02 between", value1, value2, "plfBack02");
            return (Criteria) this;
        }

        public Criteria andPlfBack02NotBetween(String value1, String value2) {
            addCriterion("plf_back_02 not between", value1, value2, "plfBack02");
            return (Criteria) this;
        }

        public Criteria andPlfBack03IsNull() {
            addCriterion("plf_back_03 is null");
            return (Criteria) this;
        }

        public Criteria andPlfBack03IsNotNull() {
            addCriterion("plf_back_03 is not null");
            return (Criteria) this;
        }

        public Criteria andPlfBack03EqualTo(String value) {
            addCriterion("plf_back_03 =", value, "plfBack03");
            return (Criteria) this;
        }

        public Criteria andPlfBack03NotEqualTo(String value) {
            addCriterion("plf_back_03 <>", value, "plfBack03");
            return (Criteria) this;
        }

        public Criteria andPlfBack03GreaterThan(String value) {
            addCriterion("plf_back_03 >", value, "plfBack03");
            return (Criteria) this;
        }

        public Criteria andPlfBack03GreaterThanOrEqualTo(String value) {
            addCriterion("plf_back_03 >=", value, "plfBack03");
            return (Criteria) this;
        }

        public Criteria andPlfBack03LessThan(String value) {
            addCriterion("plf_back_03 <", value, "plfBack03");
            return (Criteria) this;
        }

        public Criteria andPlfBack03LessThanOrEqualTo(String value) {
            addCriterion("plf_back_03 <=", value, "plfBack03");
            return (Criteria) this;
        }

        public Criteria andPlfBack03Like(String value) {
            addCriterion("plf_back_03 like", value, "plfBack03");
            return (Criteria) this;
        }

        public Criteria andPlfBack03NotLike(String value) {
            addCriterion("plf_back_03 not like", value, "plfBack03");
            return (Criteria) this;
        }

        public Criteria andPlfBack03In(List<String> values) {
            addCriterion("plf_back_03 in", values, "plfBack03");
            return (Criteria) this;
        }

        public Criteria andPlfBack03NotIn(List<String> values) {
            addCriterion("plf_back_03 not in", values, "plfBack03");
            return (Criteria) this;
        }

        public Criteria andPlfBack03Between(String value1, String value2) {
            addCriterion("plf_back_03 between", value1, value2, "plfBack03");
            return (Criteria) this;
        }

        public Criteria andPlfBack03NotBetween(String value1, String value2) {
            addCriterion("plf_back_03 not between", value1, value2, "plfBack03");
            return (Criteria) this;
        }

        public Criteria andPlfBack04IsNull() {
            addCriterion("plf_back_04 is null");
            return (Criteria) this;
        }

        public Criteria andPlfBack04IsNotNull() {
            addCriterion("plf_back_04 is not null");
            return (Criteria) this;
        }

        public Criteria andPlfBack04EqualTo(String value) {
            addCriterion("plf_back_04 =", value, "plfBack04");
            return (Criteria) this;
        }

        public Criteria andPlfBack04NotEqualTo(String value) {
            addCriterion("plf_back_04 <>", value, "plfBack04");
            return (Criteria) this;
        }

        public Criteria andPlfBack04GreaterThan(String value) {
            addCriterion("plf_back_04 >", value, "plfBack04");
            return (Criteria) this;
        }

        public Criteria andPlfBack04GreaterThanOrEqualTo(String value) {
            addCriterion("plf_back_04 >=", value, "plfBack04");
            return (Criteria) this;
        }

        public Criteria andPlfBack04LessThan(String value) {
            addCriterion("plf_back_04 <", value, "plfBack04");
            return (Criteria) this;
        }

        public Criteria andPlfBack04LessThanOrEqualTo(String value) {
            addCriterion("plf_back_04 <=", value, "plfBack04");
            return (Criteria) this;
        }

        public Criteria andPlfBack04Like(String value) {
            addCriterion("plf_back_04 like", value, "plfBack04");
            return (Criteria) this;
        }

        public Criteria andPlfBack04NotLike(String value) {
            addCriterion("plf_back_04 not like", value, "plfBack04");
            return (Criteria) this;
        }

        public Criteria andPlfBack04In(List<String> values) {
            addCriterion("plf_back_04 in", values, "plfBack04");
            return (Criteria) this;
        }

        public Criteria andPlfBack04NotIn(List<String> values) {
            addCriterion("plf_back_04 not in", values, "plfBack04");
            return (Criteria) this;
        }

        public Criteria andPlfBack04Between(String value1, String value2) {
            addCriterion("plf_back_04 between", value1, value2, "plfBack04");
            return (Criteria) this;
        }

        public Criteria andPlfBack04NotBetween(String value1, String value2) {
            addCriterion("plf_back_04 not between", value1, value2, "plfBack04");
            return (Criteria) this;
        }

        public Criteria andPlfBack05IsNull() {
            addCriterion("plf_back_05 is null");
            return (Criteria) this;
        }

        public Criteria andPlfBack05IsNotNull() {
            addCriterion("plf_back_05 is not null");
            return (Criteria) this;
        }

        public Criteria andPlfBack05EqualTo(String value) {
            addCriterion("plf_back_05 =", value, "plfBack05");
            return (Criteria) this;
        }

        public Criteria andPlfBack05NotEqualTo(String value) {
            addCriterion("plf_back_05 <>", value, "plfBack05");
            return (Criteria) this;
        }

        public Criteria andPlfBack05GreaterThan(String value) {
            addCriterion("plf_back_05 >", value, "plfBack05");
            return (Criteria) this;
        }

        public Criteria andPlfBack05GreaterThanOrEqualTo(String value) {
            addCriterion("plf_back_05 >=", value, "plfBack05");
            return (Criteria) this;
        }

        public Criteria andPlfBack05LessThan(String value) {
            addCriterion("plf_back_05 <", value, "plfBack05");
            return (Criteria) this;
        }

        public Criteria andPlfBack05LessThanOrEqualTo(String value) {
            addCriterion("plf_back_05 <=", value, "plfBack05");
            return (Criteria) this;
        }

        public Criteria andPlfBack05Like(String value) {
            addCriterion("plf_back_05 like", value, "plfBack05");
            return (Criteria) this;
        }

        public Criteria andPlfBack05NotLike(String value) {
            addCriterion("plf_back_05 not like", value, "plfBack05");
            return (Criteria) this;
        }

        public Criteria andPlfBack05In(List<String> values) {
            addCriterion("plf_back_05 in", values, "plfBack05");
            return (Criteria) this;
        }

        public Criteria andPlfBack05NotIn(List<String> values) {
            addCriterion("plf_back_05 not in", values, "plfBack05");
            return (Criteria) this;
        }

        public Criteria andPlfBack05Between(String value1, String value2) {
            addCriterion("plf_back_05 between", value1, value2, "plfBack05");
            return (Criteria) this;
        }

        public Criteria andPlfBack05NotBetween(String value1, String value2) {
            addCriterion("plf_back_05 not between", value1, value2, "plfBack05");
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