package com.yasha.academy.model;

/**
 * Created by Onkar on 4/27/2017.
 */

public class PublicationDetail
{
    public long PublicationDetailId, StandardId, MediumId, MediumSubTypeId, PublicationId,EnterBy, EnterDate, ChangedBy, ChangedDate;

    public boolean isDeleteStatus() {
        return DeleteStatus;
    }

    public void setDeleteStatus(boolean deleteStatus) {
        DeleteStatus = deleteStatus;
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

    public long getPublicationId() {
        return PublicationId;
    }

    public void setPublicationId(long publicationId) {
        PublicationId = publicationId;
    }

    public long getMediumSubTypeId() {
        return MediumSubTypeId;
    }

    public void setMediumSubTypeId(long mediumSubTypeId) {
        MediumSubTypeId = mediumSubTypeId;
    }

    public long getMediumId() {
        return MediumId;
    }

    public void setMediumId(long mediumId) {
        MediumId = mediumId;
    }

    public long getStandardId() {
        return StandardId;
    }

    public void setStandardId(long standardId) {
        StandardId = standardId;
    }

    public long getPublicationDetailId() {
        return PublicationDetailId;
    }

    public void setPublicationDetailId(long publicationDetailId) {
        PublicationDetailId = publicationDetailId;
    }

    public String Description, Alias;
    public boolean DeleteStatus;
}
