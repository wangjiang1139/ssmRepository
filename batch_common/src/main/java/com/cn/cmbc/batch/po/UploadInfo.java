package com.cn.cmbc.batch.po;

import java.util.Date;

public class UploadInfo {
    private Integer id;

    private String groupId;

    private String fastName;

    private Date uplodaTime;

    private String serviceCode;

    private String stauts;

    private String fileName;

    private String thisBatchId;

    private String uploadBack01;

    private String uploadBack02;

    private String uploadBack03;

    private String uploadBack04;

    private String uploadBack05;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getFastName() {
        return fastName;
    }

    public void setFastName(String fastName) {
        this.fastName = fastName == null ? null : fastName.trim();
    }

    public Date getUplodaTime() {
        return uplodaTime;
    }

    public void setUplodaTime(Date uplodaTime) {
        this.uplodaTime = uplodaTime;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode == null ? null : serviceCode.trim();
    }

    public String getStauts() {
        return stauts;
    }

    public void setStauts(String stauts) {
        this.stauts = stauts == null ? null : stauts.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getThisBatchId() {
        return thisBatchId;
    }

    public void setThisBatchId(String thisBatchId) {
        this.thisBatchId = thisBatchId == null ? null : thisBatchId.trim();
    }

    public String getUploadBack01() {
        return uploadBack01;
    }

    public void setUploadBack01(String uploadBack01) {
        this.uploadBack01 = uploadBack01 == null ? null : uploadBack01.trim();
    }

    public String getUploadBack02() {
        return uploadBack02;
    }

    public void setUploadBack02(String uploadBack02) {
        this.uploadBack02 = uploadBack02 == null ? null : uploadBack02.trim();
    }

    public String getUploadBack03() {
        return uploadBack03;
    }

    public void setUploadBack03(String uploadBack03) {
        this.uploadBack03 = uploadBack03 == null ? null : uploadBack03.trim();
    }

    public String getUploadBack04() {
        return uploadBack04;
    }

    public void setUploadBack04(String uploadBack04) {
        this.uploadBack04 = uploadBack04 == null ? null : uploadBack04.trim();
    }

    public String getUploadBack05() {
        return uploadBack05;
    }

    public void setUploadBack05(String uploadBack05) {
        this.uploadBack05 = uploadBack05 == null ? null : uploadBack05.trim();
    }
}