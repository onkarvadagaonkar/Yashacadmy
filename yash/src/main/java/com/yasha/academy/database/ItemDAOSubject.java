package com.yasha.academy.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.yasha.academy.model.SubjectAssignDetail;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Onkar on 5/12/2017.
 */

public class ItemDAOSubject
{
    Context context;

    public ItemDAOSubject(Context context)
    {
        this.context=context;
    }


    public long insert(SubjectAssignDetail subjectAssignDetail)
    {
        SQLiteDatabase db=new DBHelper(context).getWritableDatabase();
        long status=db.insert("SubjectAssignDetail",null,convertToContent(subjectAssignDetail));
        db.close();
        return status;
    }


    public long delete(SubjectAssignDetail subjectAssignDetail) {
        long status=0;
        SQLiteDatabase db=new DBHelper(context).getWritableDatabase();
        status=db.delete("SubjectAssignDetail","SubjectAssignId="+subjectAssignDetail.getSubjectAssignId(),null);
        db.close();
        return status;
    }

    private ContentValues convertToContent(SubjectAssignDetail bean) {
        ContentValues value=new ContentValues();
        value.put("SubjectAssignId",bean.getSubjectAssignId());
        value.put("SubjectId",bean.getSubjectId());
        value.put("StandardId",bean.getStandardId());
        value.put("MediumId",bean.getMediumId());
        value.put("MediumSubTypeId",bean.getMediumSubTypeId());
        value.put("PublicationId",bean.getPublicationId());
        value.put("Description",bean.getDescription());
        value.put("Alias",bean.getAlias());
        value.put("EnterBy",bean.getEnterBy());
        value.put("EnterDate",bean.getEnterDateLong());
        value.put("ChangedBy",bean.getChangedBy());
        value.put("ChangedDate",bean.getChangedDateLong());
        value.put("SubjectName",bean.getSubjectName());
        value.put("DeleteStatus",bean.isDeleteStatus());

        return value;
    }

    public List<SubjectAssignDetail> getAllSubjects() {
        List<SubjectAssignDetail> list=new ArrayList<>();

        SQLiteDatabase db=new DBHelper(context).getWritableDatabase();

        Cursor cursor=db.rawQuery("Select * from SubjectAssignDetail where DeleteStatus<1",null);

        if(cursor!=null)
        {
            if(cursor.moveToFirst())
            {
                int i=0;

                while(cursor.getCount()>i)
                {
                    SubjectAssignDetail item=new SubjectAssignDetail();
                    item.setSubjectAssignId(cursor.getLong(cursor.getColumnIndex("SubjectAssignId")));
                    item.setSubjectId(cursor.getLong(cursor.getColumnIndex("SubjectId")));
                    item.setStandardId(cursor.getLong(cursor.getColumnIndex("StandardId")));
                    item.setMediumId(cursor.getLong(cursor.getColumnIndex("MediumId")));
                    item.setMediumSubTypeId(cursor.getLong(cursor.getColumnIndex("MediumSubTypeId")));
                    item.setPublicationId(cursor.getLong(cursor.getColumnIndex("PublicationId")));
                    item.setDescription(cursor.getString(cursor.getColumnIndex("Description")));
                    item.setAlias(cursor.getString(cursor.getColumnIndex("Alias")));
                    item.setEnterBy(cursor.getLong(cursor.getColumnIndex("EnterBy")));
                    item.setEnterDateLong(cursor.getLong(cursor.getColumnIndex("EnterDate")));
                    item.setChangedBy(cursor.getLong(cursor.getColumnIndex("ChangedBy")));
                    item.setChangedDateLong(cursor.getLong(cursor.getColumnIndex("ChangedDate")));
                    item.setSubjectName(cursor.getString(cursor.getColumnIndex("SubjectName")));
                    item.setDeleteStatus(Integer.parseInt(cursor.getString(cursor.getColumnIndex("DeleteStatus")))>0);
                    i++;
                    cursor.moveToNext();
                    list.add(item);
                }
            }
        }

        db.close();
        return list;
    }

}
