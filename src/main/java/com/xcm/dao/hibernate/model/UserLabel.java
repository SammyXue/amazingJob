package com.xcm.dao.hibernate.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by 薛岑明 on 2017/3/15.
 */
@Entity
@Table(name = "user_label")
public class UserLabel {
    private long userLabelId;
    private long userId;
    private int labelNum;
    private String labelName;
    private int status;
    private long createdBy;
    private Date createdOn;
    private long modifiedBy;
    private Date modifiedOn;

    public UserLabel(long userId, int labelNum, String labelName, int status, long createdBy,
                     Date createdOn, long modifiedBy, Date modifiedOn) {
        this.userId = userId;
        this.labelNum = labelNum;
        this.labelName = labelName;
        this.status = status;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.modifiedBy = modifiedBy;
        this.modifiedOn = modifiedOn;
    }

    public UserLabel() {
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "userLabelId")
    public long getUserLabelId() {
        return userLabelId;
    }

    public void setUserLabelId(long userLabelId) {
        this.userLabelId = userLabelId;
    }

    @Basic
    @Column(name = "userId")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "labelNum")
    public int getLabelNum() {
        return labelNum;
    }

    public void setLabelNum(int labelNum) {
        this.labelNum = labelNum;
    }

    @Basic
    @Column(name = "labelName")
    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    @Column(name = "createdBy")
    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "createdOn")
    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @Basic
    @Column(name = "modifiedBy")
    public long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Basic
    @Column(name = "modifiedOn")
    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserLabel userLabel = (UserLabel) o;

        if (userLabelId != userLabel.userLabelId) return false;
        if (userId != userLabel.userId) return false;
        if (labelNum != userLabel.labelNum) return false;
        if (status != userLabel.status) return false;
        if (createdBy != userLabel.createdBy) return false;
        if (modifiedBy != userLabel.modifiedBy) return false;
        if (labelName != null ? !labelName.equals(userLabel.labelName) : userLabel.labelName != null) return false;
        if (createdOn != null ? !createdOn.equals(userLabel.createdOn) : userLabel.createdOn != null) return false;
        if (modifiedOn != null ? !modifiedOn.equals(userLabel.modifiedOn) : userLabel.modifiedOn != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userLabelId ^ (userLabelId >>> 32));
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + labelNum;
        result = 31 * result + (labelName != null ? labelName.hashCode() : 0);
        result = 31 * result + status;
        result = 31 * result + (int) (createdBy ^ (createdBy >>> 32));
        result = 31 * result + (createdOn != null ? createdOn.hashCode() : 0);
        result = 31 * result + (int) (modifiedBy ^ (modifiedBy >>> 32));
        result = 31 * result + (modifiedOn != null ? modifiedOn.hashCode() : 0);
        return result;
    }
}
