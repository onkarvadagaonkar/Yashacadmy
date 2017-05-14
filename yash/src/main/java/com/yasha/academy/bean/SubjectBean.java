package com.yasha.academy.bean;

import java.util.ArrayList;

/**
 * Created by Dilip on 16/04/2017.
 */
public class SubjectBean
{
    public int subjectId;
    public String subjectName;
    public int percentage=0;
    public int lession=10;

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }



    public static ArrayList<SubjectBean> getSubjectList()
    {
        ArrayList<SubjectBean>  subjects=new ArrayList<>();
        SubjectBean bean=new SubjectBean();
        bean.setSubjectId(1);
        bean.percentage=59;

        bean.setSubjectName("Marathi");
        subjects.add(bean);
        bean=new SubjectBean();
        bean.setSubjectId(2);
        bean.percentage=34;
        bean.setSubjectName("English");
        subjects.add(bean);
        bean=new SubjectBean();
        bean.setSubjectId(3);
        bean.percentage=89;
        bean.setSubjectName("Hindi");
        subjects.add(bean);
        bean=new SubjectBean();
        bean.setSubjectId(4);
        bean.percentage=39;
        bean.setSubjectName("Maths");
        subjects.add(bean);
        bean=new SubjectBean();
        bean.setSubjectId(5);
        bean.percentage=59;
        bean.setSubjectName("Science");
        subjects.add(bean);
        bean=new SubjectBean();
        bean.setSubjectId(2);
        bean.percentage=12;
        bean.setSubjectName("Social-Science");
        subjects.add(bean);


        return subjects;
    }
}
