package com.yasha.academy.view;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yasha.academy.R;
import com.yasha.academy.utilities.CommonUtilities;
import com.yasha.academy.view.dashboard.MainScreen;
import com.yasha.academy.view.login.LoginActivity;

public class Launch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        Handler h=new Handler();
        h.postDelayed(
                new Runnable() {
                      @Override
                      public void run() {
                            if(CommonUtilities.getUserId(Launch.this)==0 )
                            {
                                startActivity(new Intent(Launch.this, LoginActivity.class));
                            }
                          else
                            {
                                startActivity(new Intent(Launch.this, MainScreen.class));
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        finish();
                                    }
                                });
                            }
                      }
                },2000);


    }
}
