package com.yashacadmynagesh.notes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.yashacadmynagesh.R;
import com.yashacadmynagesh.adapter.LessionAdapter;
import com.yashacadmynagesh.bean.LessionBean;
import com.yashacadmynagesh.fragments.SubjectList;

public class LessionList extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lession_list);
        listView=(ListView)findViewById(R.id.listview);

        ListView listview=(ListView)findViewById(R.id.listview);
        LessionAdapter adapter=new LessionAdapter(this, LessionBean.getLessions());
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(this);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("English");
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
        startActivity(new Intent(this, LessionType.class));
    }
}
