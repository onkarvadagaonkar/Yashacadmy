package com.yasha.academy.model;

/**
 * Created by Onkar on 4/26/2017.
 */

public class MediumSubType
{
    private long MediumSubTypeId, EnterBy, EnterDate, ChangedBy, ChangedDate;
    private String  MediumSubTypeName, Alias, Description;

    public boolean isDeleteStatus() {
        return DeleteStatus;
    }

    public void setDeleteStatus(boolean deleteStatus) {
        DeleteStatus = deleteStatus;
    }

    public long getMediumSubTypeId() {
        return MediumSubTypeId;
    }

    public void setMediumSubTypeId(long mediumSubTypeId) {
        MediumSubTypeId = mediumSubTypeId;
    }

    public long getEnterBy() {
        return EnterBy;
    }

    public void setEnterBy(long enterBy) {
        EnterBy = enterBy;
    }

    public long getEnterDate() {
        return EnterDate;
    }

    public void setEnterDate(long enterDate) {
        EnterDate = enterDate;
    }

    public long getChangedBy() {
        return ChangedBy;
    }

    public void setChangedBy(long changedBy) {
        ChangedBy = changedBy;
    }

    public long getChangedDate() {
        return ChangedDate;
    }

    public void setChangedDate(long changedDate) {
        ChangedDate = changedDate;
    }

    public String getMediumSubTypeName() {
        return MediumSubTypeName;
    }

    public void setMediumSubTypeName(String mediumSubTypeName) {
        MediumSubTypeName = mediumSubTypeName;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String alias) {
        Alias = alias;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    private boolean DeleteStatus;
}
