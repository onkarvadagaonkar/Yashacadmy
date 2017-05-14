package com.yashacadmynagesh.notes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.yashacadmynagesh.R;
import com.yashacadmynagesh.exam.ExamList;
import com.yashacadmynagesh.youtube.VideoListDemoActivity;

public class LessionType extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lession_type);

        String strGson=getIntent().getStringExtra("str");


        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Alphabates");

        findViewById(R.id.layoutVideo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LessionType.this, VideoListDemoActivity.class));
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
                startActivity(new Intent(LessionType.this, DocList.class));
            }
        });

        findViewById(R.id.layoutPaper).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LessionType.this, ExamList.class));
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
