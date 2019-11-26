package com.cn.cmbc.batch.po;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PlfService {
    private Integer id;

    private String serviceId;

    private String localPath;

    private String fileName;

    private String fileType;

    private String stauts;

    private String lastBatchId;

    private String plfBack01;

    private String plfBack02;

    private String plfBack03;

    private String plfBack04;

    private String plfBack05;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId == null ? null : serviceId.trim();
    }

    public String getLocalPath() {
        return localPath;
    }

    public void setLocalPath(String localPath) {
        this.localPath = localPath == null ? null : localPath.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    public String getStauts() {
        return stauts;
    }

    public void setStauts(String stauts) {
        this.stauts = stauts == null ? null : stauts.trim();
    }

    public String getLastBatchId() {
        return lastBatchId;
    }

    public void setLastBatchId(String lastBatchId) {
        this.lastBatchId = lastBatchId == null ? null : lastBatchId.trim();
    }

    public String getPlfBack01() {
        return plfBack01;
    }

    public void setPlfBack01(String plfBack01) {
        this.plfBack01 = plfBack01 == null ? null : plfBack01.trim();
    }

    public String getPlfBack02() {
        return plfBack02;
    }

    public void setPlfBack02(String plfBack02) {
        this.plfBack02 = plfBack02 == null ? null : plfBack02.trim();
    }

    public String getPlfBack03() {
        return plfBack03;
    }

    public void setPlfBack03(String plfBack03) {
        this.plfBack03 = plfBack03 == null ? null : plfBack03.trim();
    }

    public String getPlfBack04() {
        return plfBack04;
    }

    public void setPlfBack04(String plfBack04) {
        this.plfBack04 = plfBack04 == null ? null : plfBack04.trim();
    }

    public String getPlfBack05() {
        return plfBack05;
    }

    public void setPlfBack05(String plfBack05) {
        this.plfBack05 = plfBack05 == null ? null : plfBack05.trim();
    }
}