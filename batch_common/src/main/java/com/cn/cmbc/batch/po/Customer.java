package com.cn.cmbc.batch.po;

import java.util.Date;

public class Customer {
    private Integer id;

    private String custCode;

    private String custName;

    private String custAddress;

    private String custPhone;

    private String custQq;

    private String custInfo;

    private String createBy;

    private String modifyBy;

    private Date createTime;

    private Date modifyTime;

    private String batchId;

    private String custBack01;

    private String custBack02;

    private String custBack03;

    private String custBack04;

    private String custBack05;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustCode() {
        return custCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode == null ? null : custCode.trim();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress == null ? null : custAddress.trim();
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone == null ? null : custPhone.trim();
    }

    public String getCustQq() {
        return custQq;
    }

    public void setCustQq(String custQq) {
        this.custQq = custQq == null ? null : custQq.trim();
    }

    public String getCustInfo() {
        return custInfo;
    }

    public void setCustInfo(String custInfo) {
        this.custInfo = custInfo == null ? null : custInfo.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    public String getCustBack01() {
        return custBack01;
    }

    public void setCustBack01(String custBack01) {
        this.custBack01 = custBack01 == null ? null : custBack01.trim();
    }

    public String getCustBack02() {
        return custBack02;
    }

    public void setCustBack02(String custBack02) {
        this.custBack02 = custBack02 == null ? null : custBack02.trim();
    }

    public String getCustBack03() {
        return custBack03;
    }

    public void setCustBack03(String custBack03) {
        this.custBack03 = custBack03 == null ? null : custBack03.trim();
    }

    public String getCustBack04() {
        return custBack04;
    }

    public void setCustBack04(String custBack04) {
        this.custBack04 = custBack04 == null ? null : custBack04.trim();
    }

    public String getCustBack05() {
        return custBack05;
    }

    public void setCustBack05(String custBack05) {
        this.custBack05 = custBack05 == null ? null : custBack05.trim();
    }
}