package com.yasha.academy.view.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.yasha.academy.R;
import com.yasha.academy.controller.LoginController;
import com.yasha.academy.utilities.DownloadUtility;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener,DownloadUtility
{

    Button email_sign_in_button;
    EditText email,password;
    LoginController loginController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email=(EditText)findViewById(R.id.email);
        password=(EditText)findViewById(R.id.password);

        email_sign_in_button=(Button)findViewById(R.id.email_sign_in_button);
        email_sign_in_button.setOnClickListener(this);
        loginController=new LoginController(this);
    }

    @Override
    public void onClick(View view) {
        if(email.getText().toString().trim().equalsIgnoreCase(""))
        {

        }
        else if(password.getText().toString().trim().equalsIgnoreCase(""))
        {

        }
        else
        {
            loginController.performLogin(email.getText().toString().trim(),password.getText().toString().trim());
        }
    }

    @Override
    public void onComplete(String str, int requestCode, int responseCode) {

    }
}
