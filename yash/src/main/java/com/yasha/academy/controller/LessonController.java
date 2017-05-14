package com.yasha.academy.controller;

import android.content.Context;

import com.yasha.academy.database.ItemDAOLesson;
import com.yasha.academy.model.LessonDetail;
import com.yasha.academy.model.LessonMaster;

import java.util.List;

/**
 * Created by Onkar on 5/14/2017.
 */

public class LessonController
{
    Context context;
    public LessonController(Context context)
    {
        this.context=context;
    }


    public List<LessonMaster> getLessonMasters(long subjectAssignId) {
        ItemDAOLesson itemDAOLesson=new ItemDAOLesson(context);
        return itemDAOLesson.getLessons(subjectAssignId);
    }

    public List<LessonDetail> getLessonDetails(long lessonId) {
        ItemDAOLesson itemDAOLesson=new ItemDAOLesson(context);
        return itemDAOLesson.getLessonDetailsByLessonId(lessonId);

    }
}
