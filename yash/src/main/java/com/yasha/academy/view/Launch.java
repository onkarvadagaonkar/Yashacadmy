package com.yasha.academy.view;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yasha.academy.R;

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

                      }
                },4000);

    }
}
