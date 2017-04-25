package com.yashacadmynagesh.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.daasuu.ahp.AnimateHorizontalProgressBar;
import com.yashacadmynagesh.R;
import com.yashacadmynagesh.bean.LessionBean;
import com.yashacadmynagesh.bean.SubjectBean;

import java.util.ArrayList;

public class LessionAdapter extends ArrayAdapter
{
    Context context;
	public ArrayList<LessionBean> list;
	public LessionAdapter(Context context, ArrayList<LessionBean>  list)
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
	            convertView = mInflater.inflate(R.layout.item_subject1, null);
	            TextView t1=(TextView)convertView.findViewById(R.id.textView1);
		        TextView textView2=(TextView)convertView.findViewById(R.id.textView2);
	            
	            t1.setText(""+list.get(position).lessionName);
	            textView2.setText("Marks :"+list.get(position).Marks);

		AnimateHorizontalProgressBar progressBar = (AnimateHorizontalProgressBar) convertView.findViewById(R.id.animate_progress_bar);
		progressBar.setMax(100);
		progressBar.setProgressWithAnim(list.get(position).Marks*(position+1));


		return convertView;
	}

}
