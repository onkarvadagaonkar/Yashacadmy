package com.yasha.academy.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.yasha.academy.model.LessonDetail;
import com.yasha.academy.model.LessonDocDetail;
import com.yasha.academy.model.LessonMaster;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Onkar on 5/12/2017.
 */

public class ItemDAOLesson
{
    Context context;

    public ItemDAOLesson(Context context)
    {
        this.context=context;
    }


    public long insert(LessonDetail lessonDetail)
    {
        SQLiteDatabase db=new DBHelper(context).getWritableDatabase();
        long status=db.insert("LessonDetail",null,convertToContent(lessonDetail));
        db.close();
        return status;
    }

    public long delete(LessonDetail lessonDetail)
    {
        SQLiteDatabase db=new DBHelper(context).getWritableDatabase();
        long status=db.delete("LessonDetail","LessionDetailId="+lessonDetail.getLessionDetailId(),null);
        db.close();
        return status;
    }

    private ContentValues convertToContent(LessonDetail bean) {
        ContentValues values=new ContentValues();
        values.put("LessionDetailId",bean.getLessionDetailId());
        values.put("LessionId",bean.getLessionId());
        values.put("LessionType",bean.getLessionType());
        values.put("Description",bean.getDescription());
        values.put("Url",bean.getUrl());
        values.put("Url1",bean.getUrl1());
        values.put("Url2",bean.getUrl2());
        values.put("Marks",bean.getMarks());
        values.put("EnterBy",bean.getEnterBy());
        values.put("EnterDate",bean.getEnterDateLong());
        values.put("ChangedBy",bean.getChangedBy());
        values.put("ChangedDate",bean.getChangedDateLong());
        values.put("DeleteStatus",bean.isDeleteStatus());
        return values;
    }
//--------------------------------------------------------------------------------
    public long insert(LessonMaster lessonMaster) {
        SQLiteDatabase db=new DBHelper(context).getWritableDatabase();
        long status=db.insert("LessonMaster",null,convertToContent(lessonMaster));
        db.close();
        return status;
    }


    public long delete(LessonMaster lessonMaster) {
        SQLiteDatabase db=new DBHelper(context).getWritableDatabase();
        long status=db.delete("LessonMaster","LessonName="+lessonMaster.getLessonId(),null);
        db.close();
        return status;
    }

    private ContentValues convertToContent(LessonMaster bean) {
        ContentValues values=new ContentValues();

        values.put("LessonId",bean.getLessonId());
        values.put("LessonName",bean.getLessonName());
        values.put("Alias",bean.getAlias());
        values.put("Description",bean.getDescription());
        values.put("SubjectAssignId",bean.getSubjectAssignId());
        values.put("EnterBy",bean.getEnterBy());
        values.put("EnterDate",bean.getEnterDateLong());
        values.put("ChangedBy",bean.getChangedBy());
        values.put("ChangedDate",bean.getChangedDateLong());
        values.put("DeleteStatus",bean.isDeleteStatus());


        return values;
    }

    public int getLessonCount(long subjectAssignId) {
        int count=0;
        SQLiteDatabase db=new DBHelper(context).getWritableDatabase();

        Cursor cursor=db.rawQuery("Select * from LessonMaster where SubjectAssignId="+subjectAssignId,null);

        if(cursor!=null)
        {
            count=cursor.getCount();
        }


        db.close();
        return count;
    }

    public List<LessonMaster> getLessons(long subjectAssignId) {
        List<LessonMaster> list=new ArrayList<>();
        SQLiteDatabase db=new DBHelper(context).getWritableDatabase();
        Cursor cursor=db.rawQuery("Select * from LessonMaster where SubjectAssignId="+subjectAssignId,null);
        if(cursor!=null)
        {
            if(cursor.moveToFirst())
            {
                int i=0;
                while(cursor.getCount()>i)
                {
                    LessonMaster master=new LessonMaster();
                    master.setLessonId(cursor.getLong(cursor.getColumnIndex("LessonId")));
                    master.setLessonName(cursor.getString(cursor.getColumnIndex("LessonName")));
                    master.setAlias(cursor.getString(cursor.getColumnIndex("Alias")));
                    master.setDescription(cursor.getString(cursor.getColumnIndex("Description")));
                    master.setSubjectAssignId(cursor.getLong(cursor.getColumnIndex("SubjectAssignId")));
                    master.setEnterBy(cursor.getLong(cursor.getColumnIndex("EnterBy")));
                    master.setEnterDateLong(cursor.getLong(cursor.getColumnIndex("EnterDate")));
                    master.setChangedBy(cursor.getLong(cursor.getColumnIndex("ChangedBy")));
                    master.setChangedDateLong(cursor.getLong(cursor.getColumnIndex("ChangedDate")));
                    master.setDeleteStatus(Integer.parseInt(cursor.getString(cursor.getColumnIndex("DeleteStatus")))>0);
                    i++;
                    cursor.moveToNext();
                    list.add(master);
                }
            }
        }
        db.close();
        return list;
    }

    public List<LessonDetail> getLessonDetailsByLessonId(long lessonId) {
        List<LessonDetail> list=new ArrayList<>();

        SQLiteDatabase db=new DBHelper(context).getWritableDatabase();
        Cursor cursor=db.rawQuery("Select * from LessonDetail where LessionId="+lessonId,null);

        if(cursor!=null)
        {
            if(cursor.moveToFirst())
            {
                int i=0;

                while(cursor.getCount()>i)
                {
                    LessonDetail item=new LessonDetail();
                    item.setLessionDetailId(cursor.getLong(cursor.getColumnIndex("LessionDetailId")));
                    item.setLessionId(cursor.getLong(cursor.getColumnIndex("LessionId")));
                    item.setLessionType(cursor.getString(cursor.getColumnIndex("LessionType")));
                    item.setTitile(cursor.getString(cursor.getColumnIndex("Titile")));
                    item.setDescription(cursor.getString(cursor.getColumnIndex("Description")));
                    item.setUrl(cursor.getString(cursor.getColumnIndex("Url")));
                    item.setUrl1(cursor.getString(cursor.getColumnIndex("Url1")));
                    item.setUrl2(cursor.getString(cursor.getColumnIndex("Url2")));
                    item.setMarks(cursor.getString(cursor.getColumnIndex("Marks")));
                    item.setEnterBy(cursor.getLong(cursor.getColumnIndex("EnterBy")));
                    item.setEnterDateLong(cursor.getLong(cursor.getColumnIndex("EnterDate")));
                    item.setChangedBy(cursor.getLong(cursor.getColumnIndex("ChangedBy")));
                    item.setChangedDateLong(cursor.getLong(cursor.getColumnIndex("ChangedDate")));
                    item.setDeleteStatus(Integer.parseInt(cursor.getString(cursor.getColumnIndex("DeleteStatus")))>0);
                    i++;
                    cursor.moveToNext();
                }
            }
        }

        db.close();
        return list;
    }

    public long insert(LessonDocDetail lessonDocDetail) {
        SQLiteDatabase db=new DBHelper(context).getWritableDatabase();
        long status=db.insert("LessonDocDetail",null,convertToContent(lessonDocDetail));
        db.close();
        return status;
    }

    private ContentValues convertToContent(LessonDocDetail lessonDocDetail) {
        ContentValues values=new ContentValues();
        values.put("RecId",lessonDocDetail.getRecId());
        values.put("LessionDetailId",lessonDocDetail.getLessionDetailId());
        values.put("SequenceNo",lessonDocDetail.getSequenceNo());
        values.put("Path",lessonDocDetail.getPath());
        return values;
    }


    public long delete(LessonDocDetail lessonDocDetail) {
        SQLiteDatabase db=new DBHelper(context).getWritableDatabase();
        long status=db.delete("LessonDocDetail","RecId="+lessonDocDetail.getRecId(),null);
        db.close();
        return status;
    }

}
