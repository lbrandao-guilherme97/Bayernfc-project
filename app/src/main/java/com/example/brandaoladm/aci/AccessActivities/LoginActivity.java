package com.example.brandaoladm.aci.AccessActivities;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

import com.example.brandaoladm.aci.CalendarActivity;
import com.example.brandaoladm.aci.HomeActivity;
import com.example.brandaoladm.aci.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "LoginActivity";

    private Button btn_login;
    private Button btn_signup;
    private Button btn_forgot_psswrd;
    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login = (Button) findViewById(R.id.btnlogin);
        btn_signup = (Button) findViewById(R.id.btnsignup);
        btn_forgot_psswrd = (Button) findViewById(R.id.btnforgotpsswrd);
        username = (EditText) findViewById(R.id.lblusername);
        password = (EditText) findViewById(R.id.lblpsswd);

        //SignupActivity signup = new SignupActivity();

        btn_login.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                //for (int i = 0; i <signup.usernames.size(); i++) {
                    //if(signup.usernames.get(i) == "abc") {

                        if(username.getText().toString().equals("brandaoladm") && password.getText().toString().equals("12345")) {
                            Intent intent = new Intent(LoginActivity.this,CalendarActivity.class);
                            startActivity(intent);
                        }

                  //  }
               // }
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
