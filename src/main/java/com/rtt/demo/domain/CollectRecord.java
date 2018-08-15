package com.rtt.demo.domain;

import java.util.Date;

public class CollectRecord {
    private Long id;

    private String collectingNo;

    private String collectingName;

    private String collectingAddress;

    private String province;

    private String city;

    private String region;

    private String orderId;

    private String itemName;

    private Integer qty;

    private String tagNo;

    private String remark;

    private String optUserName;

    private String optUserId;

    private Date createTime;

    private Date updateTime;

    private Integer isDel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCollectingNo() {
        return collectingNo;
    }

    public void setCollectingNo(String collectingNo) {
        this.collectingNo = collectingNo == null ? null : collectingNo.trim();
    }

    public String getCollectingName() {
        return collectingName;
    }

    public void setCollectingName(String collectingName) {
        this.collectingName = collectingName == null ? null : collectingName.trim();
    }

    public String getCollectingAddress() {
        return collectingAddress;
    }

    public void setCollectingAddress(String collectingAddress) {
        this.collectingAddress = collectingAddress == null ? null : collectingAddress.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getTagNo() {
        return tagNo;
    }

    public void setTagNo(String tagNo) {
        this.tagNo = tagNo == null ? null : tagNo.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getOptUserName() {
        return optUserName;
    }

    public void setOptUserName(String optUserName) {
        this.optUserName = optUserName == null ? null : optUserName.trim();
    }

    public String getOptUserId() {
        return optUserId;
    }

    public void setOptUserId(String optUserId) {
        this.optUserId = optUserId == null ? null : optUserId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}