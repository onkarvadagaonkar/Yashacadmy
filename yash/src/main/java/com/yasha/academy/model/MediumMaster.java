package com.yasha.academy.model;

/**
 * Created by Onkar on 4/26/2017.
 */

public class MediumMaster
{
    private long MediumId, EnterBy,ChangedBy,EnterDate,  ChangedDate;
            private String MediumName, Alias, Description;

    public boolean isDeleteStatus() {
        return DeleteStatus;
    }

    public void setDeleteStatus(boolean deleteStatus) {
        DeleteStatus = deleteStatus;
    }

    public long getMediumId() {
        return MediumId;
    }

    public void setMediumId(long mediumId) {
        MediumId = mediumId;
    }

    public long getEnterBy() {
        return EnterBy;
    }

    public void setEnterBy(long enterBy) {
        EnterBy = enterBy;
    }

    public long getChangedBy() {
        return ChangedBy;
    }

    public void setChangedBy(long changedBy) {
        ChangedBy = changedBy;
    }

    public long getEnterDate() {
        return EnterDate;
    }

    public void setEnterDate(long enterDate) {
        EnterDate = enterDate;
    }

    public long getChangedDate() {
        return ChangedDate;
    }

    public void setChangedDate(long changedDate) {
        ChangedDate = changedDate;
    }

    public String getMediumName() {
        return MediumName;
    }

    public void setMediumName(String mediumName) {
        MediumName = mediumName;
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
