package com.yasha.academy.model;

/**
 * Created by Onkar on 4/27/2017.
 */

public class LessonMaster
{
    private long LessonId;
    private long SubjectAssignId;
    private long EnterBy;

    public long getEnterDateLong() {
        return EnterDateLong;
    }

    public void setEnterDateLong(long enterDateLong) {
        EnterDateLong = enterDateLong;
    }

    public long getChangedDateLong() {
        return ChangedDateLong;
    }

    public void setChangedDateLong(long changedDateLong) {
        ChangedDateLong = changedDateLong;
    }

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

    private long EnterDateLong;
    private long ChangedBy;
    private long ChangedDateLong;
            private String LessonName, Alias, Description;
    private String ChangedDate,EnterDate;

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



    public long getChangedBy() {
        return ChangedBy;
    }

    public void setChangedBy(long changedBy) {
        ChangedBy = changedBy;
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
