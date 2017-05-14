package com.yasha.academy.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Onkar on 5/6/2017.
 */

public class DBHelper extends SQLiteOpenHelper
{



    public DBHelper(Context context) {
        super(context, "NKTopEducation", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        String userMaster="Create Table UserMaster (UserId Integer primary key, EnterDate integer, EnterBy integer, ChangedDate integer, ChangedBy integer"+
        "Name Text, UserName Text, Password Text, MobileNo Text, MobileNo1 Text, Address Text, ReffernceBy Text, "+
        "IsActive Text, DeleteStatus Text)";

        String userDetail="Create table UserDetail (RecId Integer primary key, UserId Integer, StandardId Integer, MediumId Integer, MediumSubTypeId Integer, PublicationId Integer, EnterDate Integer, EnterBy Integer, ChangedDate Integer, ChangedBy Integer, IsActive Text, StandardName Text, PublicationName Text, MediumName text,MediumSubTypeName text)";

        String mediumMaster="Create Table MediumMaster (MediumId Integer primary key, MediumName Text, Alias Text, Description Text, EnterBy Integer, EnterDate Integer, ChangedBy Integer, ChangedDate Integer, DeleteStatus Text)";

        String mediumSubType="Create table MediumSubType (MediumSubTypeId Integer primary key, MediumSubTypeName text, Alias text, Description text, EnterBy Integer, EnterDate Integer, ChangedBy Integer, ChangedDate Integer, DeleteStatus text)";

        String publication="Create table  Publication ( PublicationId Integer primary key, PublicationName text, Alias text, Description text, EnterBy Integer, EnterDate Integer, ChangedBy Integer, ChangedDate Integer, DeleteStatus text)";

        String publicationDetail="Create table PublicationDetail ( PublicationDetailId Integer primary key, StandardId Integer, MediumId Integer, MediumSubTypeId Integer, PublicationId Integer, Description text, Alias text, EnterBy Integer, EnterDate Integer, ChangedBy Integer, ChangedDate Integer, DeleteStatus text )";

        String standardMaster ="Create table StandardMaster ( StandardId Integer primary key, StandardName text, Description text, Alias text, EnterBy Integer, EnterDate Integer, ChangedBy Integer, ChangedDate Integer, DeleteStatus text)";

        String paperDetail="Create table PaperDetail (PaperDetailId Integer primary key , PaperId Integer, QuestionId Integer, EnterBy Integer, EnterDate Integer, ChangedBy Integer, ChangedDate Integer, DeleteStatus text)";

        String paperMaster="Create table PaperMaster (PaperId Integer primary key , PaperName text, SubjectAssignId Integer, Description text, Marks float, LessonId Integer, EnterBy Integer, EnterDate Integer, ChangedBy Integer, ChangedDate Integer, DeleteStatus text)";

        String questionMaster="Create table QuestionMaster( QuestionId Integer primary key, QuestionName text, Question text, Option1 text, Option2 text, Option3 text, Option4 text, Option5 text, Option6 text, Answer text, Description text, Marks float, Attachment1 text, Attachment2 text, IsCommon text, EnterBy Integer, EnterDate Integer, ChangedBy Integer, ChangedDate Integer, DeleteStatus text)";

        String lessonDetail="Create table LessonDetail ( LessionDetailId Integer primary key, LessionId Integer, LessionType text, Titile text, Description text, Url text, Url1 text, Url2 text, Marks float, EnterBy Integer, EnterDate Integer, ChangedBy Integer, ChangedDate Integer, DeleteStatus text)";

        String lessonMaster="Create table LessonMaster (LessonId Integer primary key , LessonName text, Alias text, Description text, SubjectAssignId Integer, EnterBy Integer, EnterDate Integer, ChangedBy Integer, ChangedDate Integer, DeleteStatus text)";

        String lessonType="Create table LessonType ( LessonTypeId Integer primary key, LessonTypeName text, Alias text, Description text, EnterBy Integer, EnterDate Integer, ChangedBy Integer, ChangedDate Integer, DeleteStatus text)";

        String subjectAssignDetail="Create table SubjectAssignDetail (SubjectAssignId Integer primary key, SubjectId Integer, StandardId Integer, MediumId Integer, MediumSubTypeId Integer, PublicationId Integer, Description text, Alias text, EnterBy Integer, EnterDate Integer, ChangedBy Integer, ChangedDate Integer,SubjectName text, DeleteStatus text)";

        String subjectMaster="Create table SubjectMaster(SubjectId Integer primary key, SubjectName text, Alias text, Description text, EnterBy Integer, EnterDate Integer, ChangedBy Integer, ChangedDate Integer, DeleteStatus  text)";

        String lessonDocDetail="Create table LessonDocDetail (RecId Integer primary key, LessionDetailId Integer, SequenceNo Integer, Path text, other text)";

        sqLiteDatabase.execSQL(userMaster);
        sqLiteDatabase.execSQL(userDetail);

        sqLiteDatabase.execSQL(mediumMaster);
        sqLiteDatabase.execSQL(mediumSubType);
        sqLiteDatabase.execSQL(publication);
        sqLiteDatabase.execSQL(publicationDetail);
        sqLiteDatabase.execSQL(standardMaster);
        sqLiteDatabase.execSQL(paperDetail);
        sqLiteDatabase.execSQL(paperMaster);
        sqLiteDatabase.execSQL(questionMaster);
        sqLiteDatabase.execSQL(lessonDetail);
        sqLiteDatabase.execSQL(lessonMaster);
        sqLiteDatabase.execSQL(lessonType);
        sqLiteDatabase.execSQL(subjectAssignDetail);
        sqLiteDatabase.execSQL(subjectMaster);
        sqLiteDatabase.execSQL(lessonDocDetail);



    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
