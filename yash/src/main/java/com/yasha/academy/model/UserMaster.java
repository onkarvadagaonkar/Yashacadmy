package com.yasha.academy.model;

/**
 * Created by Onkar on 4/27/2017.
 */

public class UserMaster
{
    private long UserId;
    private long EnterBy;
    private long ChangedBy;
    private long EnterDateLong;

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

    private long ChangedDateLong;
    private String Name, UserName, Password, MobileNo, MobileNo1, Address, ReffernceBy, EnterDate,ChangedDate;
    private boolean IsActive;
    private boolean DeleteStatus;

    public boolean isDeleteStatus() {
        return DeleteStatus;
    }

    public void setDeleteStatus(boolean deleteStatus) {
        DeleteStatus = deleteStatus;
    }

    public boolean isActive() {
        return IsActive;
    }

    public void setActive(boolean active) {
        IsActive = active;
    }

    public String getReffernceBy() {
        return ReffernceBy;
    }

    public void setReffernceBy(String reffernceBy) {
        ReffernceBy = reffernceBy;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getMobileNo1() {
        return MobileNo1;
    }

    public void setMobileNo1(String mobileNo1) {
        MobileNo1 = mobileNo1;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String mobileNo) {
        MobileNo = mobileNo;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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


    public long getUserId() {
        return UserId;
    }

    public void setUserId(long userId) {
        UserId = userId;
    }


    private String Gendar,DBO,Photo,GCMID,DeviceId,UserType;
    private long RefferencedById;

    public long getDBOLong() {
        return DBOLong;
    }

    public void setDBOLong(long DBOLong) {
        this.DBOLong = DBOLong;
    }

    public long getRefferencedById() {
        return RefferencedById;
    }

    public void setRefferencedById(long refferencedById) {
        RefferencedById = refferencedById;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String userType) {
        UserType = userType;
    }

    public String getDeviceId() {
        return DeviceId;
    }

    public void setDeviceId(String deviceId) {
        DeviceId = deviceId;
    }

    public String getGCMID() {
        return GCMID;
    }

    public void setGCMID(String GCMID) {
        this.GCMID = GCMID;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    public String getDBO() {
        return DBO;
    }

    public void setDBO(String DBO) {
        this.DBO = DBO;
    }

    public String getGendar() {
        return Gendar;
    }

    public void setGendar(String gendar) {
        Gendar = gendar;
    }

    private long DBOLong;



}
