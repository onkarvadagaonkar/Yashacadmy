package com.yasha.academy.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.yasha.academy.R;
import com.yasha.academy.bean.LessionBean;
import com.yasha.academy.model.LessonMaster;

import java.util.ArrayList;
import java.util.List;

public class LessonOAdapter extends ArrayAdapter
{
    Context context;
	public List<LessonMaster> list;
	public LessonOAdapter(Context context, List<LessonMaster> list)
	{
		super(context, R.id.textView1,list);
		// TODO Auto-generated constructor stub
		this.list=list;
		this.context=context;
	}
	
	//#

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
	            LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	            convertView = mInflater.inflate(R.layout.item_lessonm, null);
	            TextView t1=(TextView)convertView.findViewById(R.id.textView1);
		        TextView textView2=(TextView)convertView.findViewById(R.id.textView2);
	            
	            t1.setText(""+list.get(position).getLessonName());
	            //textView2.setText("Marks :"+list.get(position));

		ProgressBar progressBar = (ProgressBar) convertView.findViewById(R.id.animate_progress_bar);
		progressBar.setMax(100);



		return convertView;
	}

}
