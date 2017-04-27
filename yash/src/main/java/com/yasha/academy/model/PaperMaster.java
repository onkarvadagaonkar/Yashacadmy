package com.yasha.academy.model;

/**
 * Created by Onkar on 4/27/2017.
 */

public class PaperMaster
{
    public long PaperId, SubjectAssignId,LessonId, EnterBy, EnterDate, ChangedBy, ChangedDate;

    public long getPaperId() {
        return PaperId;
    }

    public void setPaperId(long paperId) {
        PaperId = paperId;
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

    public String getPaperName() {
        return PaperName;
    }

    public void setPaperName(String paperName) {
        PaperName = paperName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getMarks() {
        return Marks;
    }

    public void setMarks(String marks) {
        Marks = marks;
    }

    public boolean isDeleteStatus() {
        return DeleteStatus;
    }

    public void setDeleteStatus(boolean deleteStatus) {
        DeleteStatus = deleteStatus;
    }

    private String PaperName, Description, Marks;
    private boolean DeleteStatus;
}
