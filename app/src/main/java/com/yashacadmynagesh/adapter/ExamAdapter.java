package com.yashacadmynagesh.adapter;


        import android.content.Context;
        import android.support.annotation.NonNull;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.TextView;

        import com.yashacadmynagesh.R;
        import com.yashacadmynagesh.bean.ExamBean;

        import java.util.List;


/**
 * Created by Onkar on 4/17/2017.
 */

public class ExamAdapter extends ArrayAdapter
{
    Context context;
    List<ExamBean> objects;

    public ExamAdapter(Context context, int resource, List objects)
    {
        super(context, resource, objects);
        this.objects=objects;
        this.context=context;
    }


    class ViewHolder
    {
        TextView txtExamName, txtSubName, txtMarks, txtTime;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ViewHolder holder=null;
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        if(convertView==null)
        {
            convertView=inflater.inflate(R.layout.item_examlist,null);
            holder=new ViewHolder();
            holder.txtExamName=(TextView)convertView.findViewById(R.id.title);
            holder.txtMarks=(TextView)convertView.findViewById(R.id.txtmark);
            holder.txtSubName=(TextView)convertView.findViewById(R.id.examSubject);
            holder.txtTime=(TextView)convertView.findViewById(R.id.txtmin);
            convertView.setTag(holder);
        }
        else
        {
            holder= (ViewHolder) convertView.getTag();
        }

        ExamBean bean=objects.get(position);

        holder.txtExamName.setText(bean.getExamName());
        holder.txtTime.setText("Time :"+bean.getTotalTime()+" min");
        holder.txtSubName.setText("Subject : "+bean.getSubject());
        holder.txtMarks.setText(""+bean.getTotalMarks()+" Marks");



        return convertView;
    }
}
