package com.example.brandaoladm.aci.AccessActivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.brandaoladm.aci.R;

import java.util.ArrayList;
import java.util.List;

public class SignupActivity extends AppCompatActivity {

    String name, username, email, psswd;

    EditText lblgetname;
    EditText lblgetuser;
    EditText lblgetemail;
    EditText lblpsswd;
    Button btnsignup;

    List<String> usernames = new ArrayList<>();
    List<String> emails = new ArrayList<>();
    List<String> passwds = new ArrayList<>();


    public List<String> returnUsername(String a) {
        usernames.add(a);
        return usernames;
    }

    public List<String> returnEmail(String b) {
        emails.add(b);
        return emails;
    }

    public List<String> returnPassword(String c) {
        passwds.add(c);
        return passwds;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        //Read label and button values
        lblgetname = (EditText) findViewById(R.id.lblgetname);
        lblgetuser = (EditText) findViewById(R.id.lblgetuser);
        lblgetemail = (EditText) findViewById(R.id.lblusername);
        lblpsswd = (EditText) findViewById(R.id.lblpsswd);
        btnsignup = (Button) findViewById(R.id.btnsignup);

        btnsignup.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                name = lblgetname.getText().toString();
                username = lblgetuser.getText().toString();
                email = lblgetemail.getText().toString();
                psswd = lblpsswd.getText().toString();

                if(name.length() == 3) {
                    returnUsername(name);
                    Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                    startActivity(intent);
                }
            }
        });

    }



}