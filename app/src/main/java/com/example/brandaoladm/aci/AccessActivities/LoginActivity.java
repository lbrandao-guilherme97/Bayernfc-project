package com.example.brandaoladm.aci.AccessActivities;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.brandaoladm.aci.CalendarActivity;
import com.example.brandaoladm.aci.HomeActivity;
import com.example.brandaoladm.aci.R;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "LoginActivity";

    private Button btn_login;
    private Button btn_signup;
    private Button btn_forgot_psswrd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login = (Button) findViewById(R.id.btnlogin);
        btn_signup = (Button) findViewById(R.id.btnsignup);
        btn_forgot_psswrd = (Button) findViewById(R.id.btnforgotpsswrd);

        btn_login.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,CalendarActivity.class);
                startActivity(intent);
            }
        });

        btn_signup.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,SignupActivity.class);
                startActivity(intent);
            }
        });

        btn_forgot_psswrd.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,ForgotYourPasswordActivity.class);
                startActivity(intent);
            }
        });


    }
}
