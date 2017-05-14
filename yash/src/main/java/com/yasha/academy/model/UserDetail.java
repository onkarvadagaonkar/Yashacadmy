package com.yasha.academy.model;

/**
 * Created by Onkar on 4/27/2017.
 */

public class UserDetail
{
    private long RecId, UserId, StandardId, MediumId, MediumSubTypeId, PublicationId,EnterDateLong, EnterBy, ChangedDateLong, ChangedBy;
    private boolean IsActive;

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

    private String EnterDate, ChangedDate;
    public boolean isActive() {
        return IsActive;
    }

    public void setActive(boolean active) {
        IsActive = active;
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

    public long getUserId() {
        return UserId;
    }

    public void setUserId(long userId) {
        UserId = userId;
    }

    public long getRecId() {
        return RecId;
    }

    public void setRecId(long recId) {
        RecId = recId;
    }


    private  String StandardName;
    private String PublicationName;
    private String MediumName;

    public String getMediumSubTypeName() {
        return MediumSubTypeName;
    }

    public void setMediumSubTypeName(String mediumSubTypeName) {
        MediumSubTypeName = mediumSubTypeName;
    }

    public String getMediumName() {
        return MediumName;
    }

    public void setMediumName(String mediumName) {
        MediumName = mediumName;
    }

    public String getPublicationName() {
        return PublicationName;
    }

    public void setPublicationName(String publicationName) {
        PublicationName = publicationName;
    }

    public String getStandardName() {
        return StandardName;
    }

    public void setStandardName(String standardName) {
        StandardName = standardName;
    }

    private String MediumSubTypeName;
}
