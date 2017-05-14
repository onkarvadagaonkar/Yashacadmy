package com.yasha.academy.view.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.yasha.academy.R;
import com.yasha.academy.controller.LoginController;
import com.yasha.academy.utilities.CommonUtilities;
import com.yasha.academy.utilities.DownloadUtility;
import com.yasha.academy.view.dashboard.MainScreen;

public class Sync extends AppCompatActivity implements DownloadUtility {


    LoginController controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sync);
        controller=new LoginController(this);
        String uName= CommonUtilities.getUserName(this);
        String uPass= CommonUtilities.getUserPass(this);
        try {
            controller.performSync(uName, uPass);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void onComplete(String str, int requestCode, int responseCode)
    {
        if(requestCode==2 && str.equals(CommonUtilities.SUCCESS))
        {
            Toast.makeText(this,"Success",Toast.LENGTH_LONG).show();
            startActivity(new Intent(this, MainScreen.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));

        }
        else
        {
            Toast.makeText(this,"Failed",Toast.LENGTH_LONG).show();
            finish();
        }
    }
}
