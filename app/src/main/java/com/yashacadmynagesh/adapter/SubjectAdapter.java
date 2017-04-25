package com.yashacadmynagesh.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.daasuu.ahp.AnimateHorizontalProgressBar;
import com.yashacadmynagesh.R;
import com.yashacadmynagesh.bean.SubjectBean;

public class SubjectAdapter extends ArrayAdapter
{
    Context context;
	public ArrayList<SubjectBean> list;
	public SubjectAdapter(Context context, ArrayList<SubjectBean>  list)
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
	            convertView = mInflater.inflate(R.layout.item_subject, null);
	            TextView t1=(TextView)convertView.findViewById(R.id.textView1);
		        TextView textView2=(TextView)convertView.findViewById(R.id.textView2);
	            
	            t1.setText(""+list.get(position).getSubjectName());
		        textView2.setText("Total lessions :  "+list.get(position).lession);

		      	AnimateHorizontalProgressBar progressBar = (AnimateHorizontalProgressBar) convertView.findViewById(R.id.animate_progress_bar);
		    	progressBar.setMax(100);
	       		progressBar.setProgressWithAnim(list.get(position).percentage);

	            return convertView;  
	}

}
