package com.yasha.academy.model;

/**
 * Created by Onkar on 4/27/2017.
 */

public class PaperDetail
{
    private long PaperDetailId, PaperId, QuestionId, EnterBy, EnterDate, ChangedBy, ChangedDate;

    public boolean isDeleteStatus() {
        return DeleteStatus;
    }

    public void setDeleteStatus(boolean deleteStatus) {
        DeleteStatus = deleteStatus;
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

    public long getQuestionId() {
        return QuestionId;
    }

    public void setQuestionId(long questionId) {
        QuestionId = questionId;
    }

    public long getPaperId() {
        return PaperId;
    }

    public void setPaperId(long paperId) {
        PaperId = paperId;
    }

    public long getPaperDetailId() {
        return PaperDetailId;
    }

    public void setPaperDetailId(long paperDetailId) {
        PaperDetailId = paperDetailId;
    }

    private boolean DeleteStatus;

}
