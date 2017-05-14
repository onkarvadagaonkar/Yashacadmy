package com.yasha.academy.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.yasha.academy.R;
import com.yasha.academy.bean.SubjectBean;
import com.yasha.academy.database.ItemDAOLesson;
import com.yasha.academy.model.SubjectAssignDetail;

import java.util.ArrayList;
import java.util.List;

public class SubjectAssignAdapter extends ArrayAdapter
{
    Context context;
	public List<SubjectAssignDetail> list;
	ItemDAOLesson itemDAOLesson;
	public SubjectAssignAdapter(Context context, List<SubjectAssignDetail>  list)
	{
		super(context, R.id.textView1,list);
		// TODO Auto-generated constructor stub
		this.list=list;
		this.context=context;
		itemDAOLesson=new ItemDAOLesson(context);
	}
	
	//#

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
	            LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	            convertView = mInflater.inflate(R.layout.item_subject, null);
	            TextView t1=(TextView)convertView.findViewById(R.id.textView1);
		        TextView textView2=(TextView)convertView.findViewById(R.id.textView2);
	            
	            t1.setText(""+list.get(position).getSubjectName());

				int lessonCount=itemDAOLesson.getLessonCount(list.get(position).getSubjectAssignId());
				textView2.setText("Total lesson :  "+lessonCount);
		      	ProgressBar progressBar = (ProgressBar) convertView.findViewById(R.id.animate_progress_bar);

		    	progressBar.setMax(100);
	       	//	progressBar.setProgressWithAnim(list.get(position).percentage);

	            return convertView;  
	}

}
