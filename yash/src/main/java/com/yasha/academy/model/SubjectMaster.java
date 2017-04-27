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
    private long EnterDate;
    private long ChangedBy;
    private long ChangedDate;
            private String SubjectName, Alias, Description;
    private boolean DeleteStatus;
}
