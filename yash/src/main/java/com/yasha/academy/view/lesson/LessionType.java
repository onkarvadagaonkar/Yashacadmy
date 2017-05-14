package com.yasha.academy.view.lesson;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.yasha.academy.R;
import com.yasha.academy.controller.LessonController;
import com.yasha.academy.model.GsonVideoList;
import com.yasha.academy.model.LessonDetail;
import com.yasha.academy.model.LessonMaster;
import com.yasha.academy.view.youtube.VideoListDemoActivity;

import java.util.ArrayList;
import java.util.List;


public class LessionType extends AppCompatActivity {

    LessonController controller;
    List<LessonDetail> list;
    List<LessonDetail> Doclist;
    List<LessonDetail> Vdolist;
    List<LessonDetail> Audlist;

    TextView txtCVideo, txtCAudio, txtCDocs, txtCPapers;
    TextView txtMVideo, txtMAudio, txtMDocs, txtMPapers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lession_type);

        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        txtCVideo=(TextView)findViewById(R.id.txtCountVideo);
        txtCAudio=(TextView)findViewById(R.id.txtCountAudio);
        txtCDocs=(TextView)findViewById(R.id.txtCountDocs);
        txtCPapers=(TextView)findViewById(R.id.txtCountPapers);
        txtMVideo=(TextView)findViewById(R.id.txtMarkVideo);
        txtMAudio=(TextView)findViewById(R.id.txtMarkAudio);
        txtMDocs=(TextView)findViewById(R.id.txtMarkDocs);
        txtMPapers=(TextView)findViewById(R.id.txtMarksPapers);

        controller=new LessonController(this);

        final Gson gson=new Gson();
        String strGson=getIntent().getStringExtra("str");
        LessonMaster item=gson.fromJson(strGson,LessonMaster.class);

        list=controller.getLessonDetails(item.getLessonId());

        Doclist=new ArrayList<>();
        Vdolist=new ArrayList<>();
        Audlist=new ArrayList<>();

        for(int i=0;i<list.size();i++)
        {
            LessonDetail model=list.get(i);
            if(model.getLessionType().equalsIgnoreCase("Video"))
            {
                Vdolist.add(model);
            }
            else if(model.getLessionType().equalsIgnoreCase("Doc"))
            {
                Doclist.add(model);
            }
            else if(model.getLessionType().equalsIgnoreCase("Audio"))
            {
                Audlist.add(model);
            }

        }


        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(item.getLessonName()!=null?item.getLessonName():"--");


        findViewById(R.id.layoutVideo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gson gson1=new Gson();
                GsonVideoList gsonVideoList=new GsonVideoList();
                gsonVideoList.list=Vdolist;
                String str=gson1.toJson(gsonVideoList,GsonVideoList.class);
                startActivity(new Intent(LessionType.this, VideoListDemoActivity.class).putExtra("str",str));
            }
        });

        findViewById(R.id.layoutAudio).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(LessionType.this, AudioList.class));
            }
        });

        findViewById(R.id.layoutNote).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // startActivity(new Intent(LessionType.this, DocList.class));
            }
        });

        findViewById(R.id.layoutPaper).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  startActivity(new Intent(LessionType.this, ExamList.class));
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            onBackPressed();
        return super.onOptionsItemSelected(item);
    }
}
