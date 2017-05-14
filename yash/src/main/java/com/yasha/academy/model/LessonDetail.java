package com.yasha.academy.model;

/**
 * Created by Onkar on 4/27/2017.
 */

public class LessonDetail {
    private long LessionDetailId;
    private long LessionId;
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

    public String getEnterDate() {
        return EnterDate;
    }

    public void setEnterDate(String enterDate) {
        EnterDate = enterDate;
    }

    public String getChangedDate() {
        return ChangedDate;
    }

    public void setChangedDate(String changedDate) {
        ChangedDate = changedDate;
    }

    private long EnterDateLong;
    private long ChangedBy;
    private long ChangedDateLong;
            private String LessionType, Titile, Description, Url, Url1, Url2, Marks;

    private String EnterDate,ChangedDate;
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

    public String getLessonName() {
        return LessonName;
    }

    public void setLessonName(String lessonName) {
        LessonName = lessonName;
    }

    private String LessonName;
}
