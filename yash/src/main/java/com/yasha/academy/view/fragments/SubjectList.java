package com.yasha.academy.view.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.google.gson.Gson;
import com.yasha.academy.R;
import com.yasha.academy.bean.SubjectBean;
import com.yasha.academy.controller.SubjectController;
import com.yasha.academy.model.SubjectAssignDetail;
import com.yasha.academy.view.adapter.SubjectAdapter;
import com.yasha.academy.view.adapter.SubjectAssignAdapter;
import com.yasha.academy.view.dashboard.MainScreen;
import com.yasha.academy.view.lesson.LessonList;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SubjectList.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SubjectList#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SubjectList extends Fragment implements View.OnClickListener, AdapterView.OnItemClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    GridView gridView;
    SubjectController subjectController;
    private OnFragmentInteractionListener mListener;
    List<SubjectAssignDetail> list;
    public SubjectList() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SubjectList.
     */
    // TODO: Rename and change types and number of parameters
    public static SubjectList newInstance(String param1, String param2) {
        SubjectList fragment = new SubjectList();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root=inflater.inflate(R.layout.fragment_blank, container, false);

        subjectController=new SubjectController(getContext());

        list=subjectController.getAllSubjects();
        SubjectAssignAdapter adapter=new SubjectAssignAdapter(getActivity(), list);
        //SubjectAdapter adapter=new SubjectAdapter(getActivity(), SubjectBean.getSubjectList());


        gridView=(GridView) root.findViewById(R.id.gridView);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(this);
        return  root;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }

    @Override
    public void onClick(View view)
    {

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
    {
        SubjectAssignDetail item=list.get(i);
        Gson gson=new Gson();
        String gsonSub=gson.toJson(item,SubjectAssignDetail.class);
        startActivity(new Intent(getActivity(), LessonList.class).putExtra("str",gsonSub));
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
