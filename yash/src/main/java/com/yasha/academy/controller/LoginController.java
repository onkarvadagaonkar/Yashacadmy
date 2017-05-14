package com.yasha.academy.controller;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.yasha.academy.database.ItemDAOLesson;
import com.yasha.academy.database.ItemDAOSubject;
import com.yasha.academy.database.ItemDAOUser;
import com.yasha.academy.model.LessonDetail;
import com.yasha.academy.model.LessonDocDetail;
import com.yasha.academy.model.LessonMaster;
import com.yasha.academy.model.SubjectAssignDetail;
import com.yasha.academy.model.UserDetail;
import com.yasha.academy.model.UserMaster;
import com.yasha.academy.utilities.CommonUtilities;
import com.yasha.academy.utilities.DownloadUtility;
import com.yasha.academy.utilities.serverutilities.AsyncUtilities;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Dilip on 22/04/2017.
 */
public class LoginController implements DownloadUtility {

    Context context;
    public  LoginController(Context context)
    {
        this.context=context;

    }
    public void performLogin(String userName,String password)
    {
        JSONObject jsonObject=new JSONObject();

        try {
            jsonObject.put("UserName",userName);
            jsonObject.put("Password",password);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        AsyncUtilities asyncUtilities=new AsyncUtilities(context,true, CommonUtilities.URL+"loginuser",jsonObject.toString(),1,this);
        asyncUtilities.execute();
    }

    public void performSync(String uName, String uPass)
    {
        JSONObject jsonObject=new JSONObject();

        try {
            jsonObject.put("UserName",uName);
            jsonObject.put("Password",uPass);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        AsyncUtilities asyncUtilities=new AsyncUtilities(context,true, CommonUtilities.URL+"syncdata",jsonObject.toString(),2,this);
        asyncUtilities.execute();
    }

    @Override
    public void onComplete(String str, int requestCode, int responseCode) {
        DownloadUtility downloadUtility=  (DownloadUtility) context;

        if(requestCode==1 && responseCode==200)
        {
            if(parseLogin(str))
            {
                downloadUtility.onComplete(CommonUtilities.SUCCESS,requestCode,responseCode);
            }
            else
            {
                downloadUtility.onComplete("Parsing failed ! Please contact adminstrative",requestCode,responseCode);
            }
        }
        else if(requestCode == 2 && responseCode==200)
        {
            if(parseSync(str))
            {
                downloadUtility.onComplete(CommonUtilities.SUCCESS,requestCode,responseCode);
            }
            else
            {
                downloadUtility.onComplete("Parsing failed ! Please contact adminstrative",requestCode,responseCode);
            }
        }
        else
        {
            downloadUtility.onComplete("Server Communication failed ! Please try again",requestCode,responseCode);
        }
    }

    private boolean parseSync(String str)
    {
        Gson gson=new Gson();
        ItemDAOUser itemDAOUser=new ItemDAOUser(context);
        ItemDAOSubject itemDAOSubject=new ItemDAOSubject(context);
        ItemDAOLesson itemDAOLesson=new ItemDAOLesson(context);
        try
        {
            JSONObject jsonObject=new JSONObject(str);
            JSONObject jsonUserDetail= jsonObject.getJSONObject("userDetail");        // user details
            JSONArray jsonMainList=jsonObject.getJSONArray("mainList");               //main list data

            UserDetail userDetail=gson.fromJson(jsonUserDetail.toString(),UserDetail.class);
            userDetail.setEnterDateLong(CommonUtilities.parseDate(userDetail.getEnterDate()));
            userDetail.setChangedDateLong(CommonUtilities.parseDate(userDetail.getChangedDate()));

            long status=itemDAOUser.insert(userDetail);                 // saved userDetails in database

            for(int i=0;i<jsonMainList.length();i++)
            {
                JSONObject innerJson=jsonMainList.getJSONObject(i);
                JSONObject jsonSub=innerJson.getJSONObject("subject");
                JSONArray jsonLessons=innerJson.getJSONArray("lessionList");


                SubjectAssignDetail subjectAssignDetail=gson.fromJson(jsonSub.toString(),SubjectAssignDetail.class);
                subjectAssignDetail.setEnterDateLong(CommonUtilities.parseDate(subjectAssignDetail.getEnterDate()));
                subjectAssignDetail.setChangedDateLong(CommonUtilities.parseDate(subjectAssignDetail.getChangedDate()));

                // ..save subject assign to db
                long delStatus=itemDAOSubject.delete(subjectAssignDetail);
                long insStatus=itemDAOSubject.insert(subjectAssignDetail);

                for(int j=0;j<jsonLessons.length();j++)
                {
                    JSONObject jsonLesson=jsonLessons.getJSONObject(j);

                    JSONArray jsonLesArray=jsonLesson.getJSONArray("lessionDetails");
                    JSONArray jsonDocArray=jsonLesson.getJSONArray("docLessionList");

                    for(int k=0;k<jsonLesArray.length();k++)
                    {
                        LessonDetail lessonDetail = gson.fromJson(jsonLesArray.getString(k), LessonDetail.class);
                        lessonDetail.setEnterDateLong(CommonUtilities.parseDate(lessonDetail.getEnterDate()));
                        lessonDetail.setChangedDateLong(CommonUtilities.parseDate(lessonDetail.getChangedDate()));
                        long dStauts=itemDAOLesson.delete(lessonDetail);
                        long iStatus=itemDAOLesson.insert(lessonDetail);
                    }

                    for(int c=0;c<jsonDocArray.length();c++)
                    {
                        LessonDocDetail lessonDocDetail=gson.fromJson(jsonDocArray.getString(c),LessonDocDetail.class);
                        long lDocDelStatus=itemDAOLesson.delete(lessonDocDetail);
                        long lDInStatus=itemDAOLesson.insert(lessonDocDetail);
                    }

                    LessonMaster lessonMaster =gson.fromJson(jsonLesson.getString("lession"),LessonMaster.class);
                    lessonMaster.setChangedDateLong(CommonUtilities.parseDate(lessonMaster.getChangedDate()));
                    lessonMaster.setEnterDateLong(CommonUtilities.parseDate(lessonMaster.getEnterDate()));

                    long dStatus=itemDAOLesson.delete(lessonMaster);
                    long dLStatus=itemDAOLesson.insert(lessonMaster);
                    // save lesson to db
                }



            }



        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    private boolean parseLogin(String str) {
        JSONObject jsonUMaster=null;
        JSONObject jsonUDetail=null;
        try
        {
            JSONObject jsonObject=new JSONObject(str);
            jsonUMaster =jsonObject.getJSONObject("userMaster");
            jsonUDetail = jsonObject.getJSONObject("userDetail");

            SharedPreferences preferences=context.getSharedPreferences("UserInfo",Context.MODE_PRIVATE);
            SharedPreferences.Editor editor=preferences.edit();
            editor.putString("UserMaster",jsonUMaster.toString());
            editor.putString("UserDetail",jsonUDetail==null?"":jsonUDetail.toString());
            editor.commit();

        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }

        return true;
    }


}
