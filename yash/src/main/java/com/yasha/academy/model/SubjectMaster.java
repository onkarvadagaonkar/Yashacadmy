package com.yasha.academy.model;

/**
 * Created by Onkar on 4/27/2017.
 */

public class SubjectMaster
{
    private long SubjectId;

    public long getSubjectId() {
        return SubjectId;
    }

    public void setSubjectId(long subjectId) {
        SubjectId = subjectId;
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


    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String subjectName) {
        SubjectName = subjectName;
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

    public boolean isDeleteStatus() {
        return DeleteStatus;
    }

    public void setDeleteStatus(boolean deleteStatus) {
        DeleteStatus = deleteStatus;
    }

    private long EnterBy;
    private String EnterDate;
    private long ChangedBy;

    private long EnterDateLong;

    public long getChangedDateLong() {
        return ChangedDateLong;
    }

    public void setChangedDateLong(long changedDateLong) {
        ChangedDateLong = changedDateLong;
    }

    public long getEnterDateLong() {
        return EnterDateLong;
    }

    public void setEnterDateLong(long enterDateLong) {
        EnterDateLong = enterDateLong;
    }

    private long ChangedDateLong;
    public String getChangedDate() {
        return ChangedDate;
    }

    public void setChangedDate(String changedDate) {
        ChangedDate = changedDate;
    }

    public String getEnterDate() {
        return EnterDate;
    }

    public void setEnterDate(String enterDate) {
        EnterDate = enterDate;
    }

    private String ChangedDate;
            private String SubjectName, Alias, Description;
    private boolean DeleteStatus;
}
