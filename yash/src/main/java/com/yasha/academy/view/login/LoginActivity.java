package com.yasha.academy.view.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.yasha.academy.R;
import com.yasha.academy.controller.LoginController;
import com.yasha.academy.utilities.CommonUtilities;
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
        email=(EditText)findViewById(R.id.input_email);
        password=(EditText)findViewById(R.id.input_password);

        email_sign_in_button=(Button)findViewById(R.id.btn_login);
        email_sign_in_button.setOnClickListener(this);
        loginController=new LoginController(this);
    }

    @Override
    public void onClick(View view) {
        if(email.getText().toString().trim().equalsIgnoreCase(""))
        {
            Toast.makeText(this,"Please enter the email",Toast.LENGTH_LONG).show();
        }
        else if(password.getText().toString().trim().equalsIgnoreCase(""))
        {
            Toast.makeText(this,"Please enter the password",Toast.LENGTH_LONG).show();
        }
        else
        {
            loginController.performLogin(email.getText().toString().trim(),password.getText().toString().trim());
        }
    }

    @Override
    public void onComplete(String str, int requestCode, int responseCode)
    {
            if(requestCode==1 && str.equals(CommonUtilities.SUCCESS))
            {
                startActivity(new Intent(this,Sync.class));
            }
            else
            {
                Toast.makeText(this,str,Toast.LENGTH_LONG).show();
            }
    }
}
