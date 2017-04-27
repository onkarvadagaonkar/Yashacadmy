package com.yasha.academy.model;

/**
 * Created by Onkar on 4/27/2017.
 */

public class LessonDetail {
    private long LessionDetailId, LessionId, EnterBy, EnterDate, ChangedBy, ChangedDate;
            private String LessionType, Titile, Description, Url, Url1, Url2, Marks;

    public boolean isDeleteStatus() {
        return DeleteStatus;
    }

    public void setDeleteStatus(boolean deleteStatus) {
        DeleteStatus = deleteStatus;
    }

    public String getMarks() {
        return Marks;
    }

    public void setMarks(String marks) {
        Marks = marks;
    }

    public String getUrl2() {
        return Url2;
    }

    public void setUrl2(String url2) {
        Url2 = url2;
    }

    public String getUrl1() {
        return Url1;
    }

    public void setUrl1(String url1) {
        Url1 = url1;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getTitile() {
        return Titile;
    }

    public void setTitile(String titile) {
        Titile = titile;
    }

    public String getLessionType() {
        return LessionType;
    }

    public void setLessionType(String lessionType) {
        LessionType = lessionType;
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

    public long getLessionId() {
        return LessionId;
    }

    public void setLessionId(long lessionId) {
        LessionId = lessionId;
    }

    public long getLessionDetailId() {
        return LessionDetailId;
    }

    public void setLessionDetailId(long lessionDetailId) {
        LessionDetailId = lessionDetailId;
    }

    private boolean DeleteStatus;
}
