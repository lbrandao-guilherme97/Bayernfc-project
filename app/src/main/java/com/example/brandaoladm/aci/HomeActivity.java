package com.example.brandaoladm.aci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private static final String TAG = "HomeActivity";

    private TextView the_date;
    private Button btn_go_calendar;
    private Button btn_event_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        the_date = (TextView) findViewById(R.id.date);
        btn_go_calendar = (Button) findViewById(R.id.btngocalendar);
        btn_event_name = (Button) findViewById(R.id.btneventname);

        Intent incoming = getIntent();
        String date = incoming.getStringExtra("date");
        the_date.setText(date);

        btn_go_calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,CreateEventCalendarActivity.class);
                startActivity(intent);
            }
        });

        btn_event_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,EventDescriptionActivity.class);
                startActivity(intent);
            }
        });
    }
}
