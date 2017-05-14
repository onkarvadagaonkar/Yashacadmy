package com.yasha.academy.model;

/**
 * Created by Onkar on 4/27/2017.
 */

public class SubjectAssignDetail
{
    private long SubjectAssignId;
    private long StandardId;
    private long MediumId;
    private long MediumSubTypeId;
    private long PublicationId;
    private long EnterBy;
    private long EnterDateLong;
    private long ChangedBy;

    public long getSubjectId() {
        return SubjectId;
    }

    public void setSubjectId(long subjectId) {
        SubjectId = subjectId;
    }

    private long SubjectId;

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String subjectName) {
        SubjectName = subjectName;
    }

    private String SubjectName;
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
    private String EnterDate,ChangedDate;


    public long getSubjectAssignId() {
        return SubjectAssignId;
    }

    public void setSubjectAssignId(long subjectAssignId) {
        SubjectAssignId = subjectAssignId;
    }

    public long getStandardId() {
        return StandardId;
    }

    public void setStandardId(long standardId) {
        StandardId = standardId;
    }

    public long getMediumId() {
        return MediumId;
    }

    public void setMediumId(long mediumId) {
        MediumId = mediumId;
    }

    public long getMediumSubTypeId() {
        return MediumSubTypeId;
    }

    public void setMediumSubTypeId(long mediumSubTypeId) {
        MediumSubTypeId = mediumSubTypeId;
    }

    public long getPublicationId() {
        return PublicationId;
    }

    public void setPublicationId(long publicationId) {
        PublicationId = publicationId;
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

    public boolean isDeleteStatus() {
        return DeleteStatus;
    }

    public void setDeleteStatus(boolean deleteStatus) {
        DeleteStatus = deleteStatus;
    }

    private String Description, Alias;
    private boolean DeleteStatus;
}
