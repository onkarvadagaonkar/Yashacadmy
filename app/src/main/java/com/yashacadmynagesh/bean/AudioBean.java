package com.yashacadmynagesh.bean;

import java.util.ArrayList;

/**
 * Created by Dilip on 17/04/2017.
 */
public class AudioBean
{
    public int Id,mark;
    public String title,desc,Url,solved;


    static public ArrayList<AudioBean>  getAudioLession()
    {
        ArrayList<AudioBean> list=new ArrayList<>();

        AudioBean bean=new AudioBean();
        bean.title="Alphabates Songs";
        bean.Url="";
        bean.mark=5;
        list.add(bean);

        bean=new AudioBean();
        bean.title="Alphabates Songs 2";
        bean.Url="";
        bean.mark=5;
        list.add(bean);


        bean=new AudioBean();
        bean.title="Numbers  Songs 1";
        bean.Url="";
        bean.mark=5;
        list.add(bean);


        bean=new AudioBean();
        bean.title="Numbers Songs 2";
        bean.Url="";
        bean.mark=5;
        list.add(bean);



        return  list;

    }

    static public ArrayList<AudioBean>  getDocLession()
    {
        ArrayList<AudioBean> list=new ArrayList<>();

        AudioBean bean=new AudioBean();
        bean.title="Alphabates 1";
        bean.Url="";
        bean.mark=5;
        list.add(bean);

        bean=new AudioBean();
        bean.title="Alphabates  2";
        bean.Url="";
        bean.mark=5;
        list.add(bean);


        bean=new AudioBean();
        bean.title="Numbers   1";
        bean.Url="";
        bean.mark=5;
        list.add(bean);


        bean=new AudioBean();
        bean.title="Numbers  2";
        bean.Url="";
        bean.mark=5;
        list.add(bean);


        bean=new AudioBean();
        bean.title="Symbols 1";
        bean.Url="";
        bean.mark=5;
        list.add(bean);


        bean=new AudioBean();
        bean.title="Symbols 2";
        bean.Url="";
        bean.mark=5;
        list.add(bean);

        return  list;

    }
}
