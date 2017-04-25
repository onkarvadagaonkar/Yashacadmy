package com.yashacadmynagesh.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.daasuu.ahp.AnimateHorizontalProgressBar;
import com.yashacadmynagesh.R;
import com.yashacadmynagesh.bean.AudioBean;
import com.yashacadmynagesh.bean.SubjectBean;

import java.util.ArrayList;

public class AudioAdapter extends ArrayAdapter
{
    Context context;
	public ArrayList<AudioBean> list;
	public AudioAdapter(Context context, ArrayList<AudioBean>  list)
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
	            convertView = mInflater.inflate(R.layout.item_audio, null);
	            TextView t1=(TextView)convertView.findViewById(R.id.title);
		        TextView textView2=(TextView)convertView.findViewById(R.id.txtmark);
				TextView txtStatus=(TextView)convertView.findViewById(R.id.txtStatus);
	            
	            t1.setText(""+list.get(position).title);
		        textView2.setText(list.get(position).mark+" Marks");

		        if(position%2==0)
				   txtStatus.setText("Listened");
		        


	            return convertView;  
	}

}
