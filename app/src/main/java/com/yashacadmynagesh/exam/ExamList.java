package com.yashacadmynagesh.exam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.yashacadmynagesh.R;
import com.yashacadmynagesh.adapter.ExamAdapter;
import com.yashacadmynagesh.bean.ExamBean;

import java.util.ArrayList;
import java.util.List;

public class ExamList extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listview;
    List<ExamBean> list;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_list);
        listview=(ListView)findViewById(R.id.listview);


        list=new ArrayList<>();
        ExamBean item1=new ExamBean();
        item1.setExamName("Unit Test 1");
        item1.setTotalTime(30);
        item1.setTotalMarks(15);
        item1.setSubject("History");



        ExamBean item2=new ExamBean();
        item2.setExamName("Unit Test 2");
        item2.setTotalTime(30);
        item2.setTotalMarks(15);
        item2.setSubject("Mathematics");



        ExamBean item3=new ExamBean();
        item3.setExamName("Unit Test 3");
        item3.setTotalTime(30);
        item3.setTotalMarks(15);
        item3.setSubject("English");


        list.add(item1);
        list.add(item2);
        list.add(item3);


        ExamAdapter adapter=new ExamAdapter(this,1,list);

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
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        startActivity(new Intent(this,QuestionPaperActivity.class));
    }
}
