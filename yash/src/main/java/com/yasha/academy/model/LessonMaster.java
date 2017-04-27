package com.yasha.academy.model;

/**
 * Created by Onkar on 4/27/2017.
 */

public class LessonMaster
{
    private long LessonId,SubjectAssignId,EnterBy, EnterDate, ChangedBy, ChangedDate;
            private String LessonName, Alias, Description;

    public boolean isDeleteStatus() {
        return DeleteStatus;
    }

    public void setDeleteStatus(boolean deleteStatus) {
        DeleteStatus = deleteStatus;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String alias) {
        Alias = alias;
    }

    public String getLessonName() {
        return LessonName;
    }

    public void setLessonName(String lessonName) {
        LessonName = lessonName;
    }

    public long getChangedDate() {
        return ChangedDate;
    }

    public void setChangedDate(long changedDate) {
        ChangedDate = changedDate;
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

    public long getEnterBy() {
        return EnterBy;
    }

    public void setEnterBy(long enterBy) {
        EnterBy = enterBy;
    }

    public long getSubjectAssignId() {
        return SubjectAssignId;
    }

    public void setSubjectAssignId(long subjectAssignId) {
        SubjectAssignId = subjectAssignId;
    }

    public long getLessonId() {
        return LessonId;
    }

    public void setLessonId(long lessonId) {
        LessonId = lessonId;
    }

    private boolean DeleteStatus;
}
