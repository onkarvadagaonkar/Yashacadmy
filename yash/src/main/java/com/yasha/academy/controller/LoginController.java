package com.yasha.academy.controller;

import android.content.Context;

import com.yasha.academy.utilities.DownloadUtility;
import com.yasha.academy.utilities.serverutilities.AsyncUtilities;

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
        AsyncUtilities asyncUtilities=new AsyncUtilities(context,true,"Url",jsonObject.toString(),1,this);
        asyncUtilities.execute();
    }

    @Override
    public void onComplete(String str, int requestCode, int responseCode) {
        if(requestCode==1 && responseCode==200)
        {

            ((DownloadUtility) context).onComplete("",requestCode,responseCode);
        }
        else
        {
            ((DownloadUtility) context).onComplete("Error",requestCode,responseCode);
        }
    }
}
