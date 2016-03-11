package com.hengda.hdb.risk.base.po;

import java.util.Date;

public class PhoneBlacklist {
    private Long id;

    private String phoneNum;

    private String banReasonCode;

    private Date banStartTime;

    private Date banEndTime;

    private Byte banType;

    private String creator;

    private Date createTime;

    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum == null ? null : phoneNum.trim();
    }

    public String getBanReasonCode() {
        return banReasonCode;
    }

    public void setBanReasonCode(String banReasonCode) {
        this.banReasonCode = banReasonCode == null ? null : banReasonCode.trim();
    }

    public Date getBanStartTime() {
        return banStartTime;
    }

    public void setBanStartTime(Date banStartTime) {
        this.banStartTime = banStartTime;
    }

    public Date getBanEndTime() {
        return banEndTime;
    }

    public void setBanEndTime(Date banEndTime) {
        this.banEndTime = banEndTime;
    }

    public Byte getBanType() {
        return banType;
    }

    public void setBanType(Byte banType) {
        this.banType = banType;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}