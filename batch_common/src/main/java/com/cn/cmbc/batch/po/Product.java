package com.cn.cmbc.batch.po;

import java.util.Date;

public class Product {
    private Integer id;

    private String productCode;

    private String productName;

    private Double productPrice;

    private String productColor;

    private String productStock;

    private String productInfo;

    private String createBy;

    private String modifyBy;

    private Date createTime;

    private Date modifyTime;

    private String batchId;

    private String prodBack01;

    private String prodBack02;

    private String prodBack03;

    private String prodBack04;

    private String prodBack05;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor == null ? null : productColor.trim();
    }

    public String getProductStock() {
        return productStock;
    }

    public void setProductStock(String productStock) {
        this.productStock = productStock == null ? null : productStock.trim();
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo == null ? null : productInfo.trim();
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

    public String getProdBack01() {
        return prodBack01;
    }

    public void setProdBack01(String prodBack01) {
        this.prodBack01 = prodBack01 == null ? null : prodBack01.trim();
    }

    public String getProdBack02() {
        return prodBack02;
    }

    public void setProdBack02(String prodBack02) {
        this.prodBack02 = prodBack02 == null ? null : prodBack02.trim();
    }

    public String getProdBack03() {
        return prodBack03;
    }

    public void setProdBack03(String prodBack03) {
        this.prodBack03 = prodBack03 == null ? null : prodBack03.trim();
    }

    public String getProdBack04() {
        return prodBack04;
    }

    public void setProdBack04(String prodBack04) {
        this.prodBack04 = prodBack04 == null ? null : prodBack04.trim();
    }

    public String getProdBack05() {
        return prodBack05;
    }

    public void setProdBack05(String prodBack05) {
        this.prodBack05 = prodBack05 == null ? null : prodBack05.trim();
    }
}