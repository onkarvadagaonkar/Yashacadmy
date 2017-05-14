package com.yasha.academy.view.lesson;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.gson.Gson;
import com.yasha.academy.R;
import com.yasha.academy.bean.LessionBean;
import com.yasha.academy.controller.LessonController;
import com.yasha.academy.model.LessonMaster;
import com.yasha.academy.model.SubjectAssignDetail;
import com.yasha.academy.view.adapter.LessonAdapter;
import com.yasha.academy.view.adapter.LessonOAdapter;

import java.util.List;




public class LessonList extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {

    ListView listView;
    SubjectAssignDetail bean;
    LessonController controller;
    List<LessonMaster> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lession_list);
        listView=(ListView)findViewById(R.id.listview);
        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        controller=new LessonController(this);
        Gson gson=new Gson();
        Intent intent= getIntent();
        String gsonStr=intent.getStringExtra("str");


        bean=gson.fromJson(gsonStr,SubjectAssignDetail.class);

        ListView listview=(ListView)findViewById(R.id.listview);
        //LessonAdapter adapter=new LessonAdapter(this, LessionBean.getLessions());
        list=controller.getLessonMasters(bean.getSubjectAssignId());

        LessonOAdapter adapter=new LessonOAdapter(this, list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(this);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(bean.getSubjectName()!=null?bean.getSubjectName():"--");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            onBackPressed();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //startActivity(new Intent(this, LessionType.class));

        Gson gson=new Gson();
        LessonMaster item=list.get(i);
        String str=gson.toJson(item,LessonMaster.class);
        startActivity(new Intent(this,LessionType.class).putExtra("str",str));
    }
}
