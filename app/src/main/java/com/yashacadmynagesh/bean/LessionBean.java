package com.yashacadmynagesh.bean;

import java.util.ArrayList;

/**
 * Created by Dilip on 16/04/2017.
 */
public class LessionBean
{
    public int lessionId ,Marks;
    public String lessionName;

    public static ArrayList<LessionBean> getLessions()
    {
        ArrayList<LessionBean> list=new ArrayList<>();
        LessionBean bean=new LessionBean();
        bean.lessionName="Alphabates";
        bean.Marks=10;
        list.add(bean );

        bean=new LessionBean();
        bean.lessionName="Vocab";
        bean.Marks=10;
        list.add(bean );

        bean=new LessionBean();
        bean.lessionName="Articles";
        bean.Marks=10;
        list.add(bean );

        bean=new LessionBean();
        bean.lessionName="Phrases";
        bean.Marks=10;
        list.add(bean );

        bean=new LessionBean();
        bean.lessionName="Tenses";
        bean.Marks=10;
        list.add(bean );

        bean=new LessionBean();
        bean.lessionName="Letter writting";
        bean.Marks=10;
        list.add(bean );
        bean=new LessionBean();
        bean.lessionName="Eassey writting";
        bean.Marks=10;
        list.add(bean );

        bean=new LessionBean();
        bean.lessionName="Group Disscussion";
        bean.Marks=10;
        list.add(bean );




        return list;
    }
}
