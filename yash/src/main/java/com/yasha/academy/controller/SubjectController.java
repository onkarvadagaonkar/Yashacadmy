package com.yasha.academy.controller;

import android.content.Context;

import com.yasha.academy.database.ItemDAOSubject;
import com.yasha.academy.model.SubjectAssignDetail;

import java.util.List;

/**
 * Created by Onkar on 5/13/2017.
 */

public class SubjectController {
    Context context;


    public SubjectController(Context context)
    {
        this.context=context;
    }

    public List<SubjectAssignDetail> getAllSubjects() {
        ItemDAOSubject itemDAOSubject=new ItemDAOSubject(context);
        return itemDAOSubject.getAllSubjects();
    }
}
