package com.yasha.academy.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.yasha.academy.model.UserDetail;
import com.yasha.academy.model.UserMaster;

/**
 * Created by Onkar on 5/6/2017.
 */

public class ItemDAOUser
{
    Context context;

    public ItemDAOUser(Context context)
    {
        this.context=context;
    }

    public void insert(UserMaster userMaster)
    {
        SQLiteDatabase db=new DBHelper(context).getWritableDatabase();
        long status=db.insert("UserMaster",null,toContentValues(userMaster));
        db.close();

    }

    private ContentValues toContentValues(UserMaster userMaster)
    {
        ContentValues values=new ContentValues();
        values.put("",userMaster.getMobileNo());
        values.put("",userMaster.getAddress());
        values.put("",userMaster.getChangedBy());
        /*values.put("",userMaster);
        values.put("",userMaster.);
        values.put("",userMaster.);
        values.put("",userMaster.);
        values.put("",userMaster.);
        values.put("",userMaster.);
        values.put("",userMaster.);
        values.put("",userMaster.);
        values.put("",userMaster.);
        values.put("",userMaster.);
        values.put("",userMaster.);*/
        return values;
    }

    public long insert(UserDetail userDetail) {
        SQLiteDatabase db=new DBHelper(context).getWritableDatabase();
        long status=db.insert("UserDetail",null,toContentValues(userDetail));
        db.close();
        return status;
    }


    public long delete(UserDetail userDetail) {
        SQLiteDatabase db=new DBHelper(context).getWritableDatabase();
        long status=db.delete("UserDetail","RecId="+userDetail.getRecId(),null);
        db.close();
        return status;
    }

    private ContentValues toContentValues(UserDetail userDetail)
    {
        ContentValues values=new ContentValues();
        values.put("UserId",userDetail.getUserId());
        values.put("StandardId",userDetail.getStandardId());
        values.put("MediumId",userDetail.getMediumId());
        values.put("MediumSubTypeId",userDetail.getMediumSubTypeId());
        values.put("PublicationId",userDetail.getPublicationId());
        values.put("EnterDate",userDetail.getEnterDateLong());
        values.put("EnterBy",userDetail.getEnterBy());
        values.put("ChangedDate",userDetail.getChangedDateLong());
        values.put("ChangedBy",userDetail.getChangedBy());
        values.put("IsActive",userDetail.isActive());
        values.put("RecId",userDetail.getRecId());
        values.put("MediumSubTypeName",userDetail.getMediumSubTypeName());
        values.put("MediumName",userDetail.getMediumName());
        values.put("PublicationName",userDetail.getPublicationName());
        values.put("StandardName",userDetail.getStandardName());
        return values;
    }
}
