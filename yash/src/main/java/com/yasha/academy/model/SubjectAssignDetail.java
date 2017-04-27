package com.yasha.academy.model;

/**
 * Created by Onkar on 4/27/2017.
 */

public class SubjectAssignDetail
{
    private long SubjectAssignId, StandardId, MediumId, MediumSubTypeId, PublicationId,EnterBy, EnterDate, ChangedBy, ChangedDate;

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
