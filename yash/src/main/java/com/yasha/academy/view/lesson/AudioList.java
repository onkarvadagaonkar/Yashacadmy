package com.yasha.academy.view.lesson;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.yasha.academy.R;
import com.yasha.academy.bean.AudioBean;
import com.yasha.academy.view.adapter.AudioAdapter;


public class AudioList extends AppCompatActivity implements AdapterView.OnItemClickListener {


    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_list);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listview=(ListView)findViewById(R.id.listview);
        AudioAdapter adapter=new AudioAdapter(this, AudioBean.getAudioLession());
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(this);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Audio Notes");
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            onBackPressed();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
    {
        startActivity(new Intent(this,AudioPlayer.class));
    }
}
