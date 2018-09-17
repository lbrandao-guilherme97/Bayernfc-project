package com.example.brandaoladm.aci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

public class CreateEventCalendarActivity extends AppCompatActivity {

    private Button btn_create_event;
    private  static final String TAG = "CalendarActivity";
    private CalendarView mCalendarView;
    private TextView lbl_event_date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event_calendar);


        lbl_event_date = (TextView) findViewById(R.id.lbleventdate);
        mCalendarView = (CalendarView) findViewById(R.id.calendarView);

        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView CalendarView, int year, int month, int dayOfMonth) {
                month++;
                String event_date =  month + "/" + dayOfMonth + "/" + year;
                Log.d(TAG, "onSelectedDayChange: mm/dd/yyyy:" + event_date);

                Intent incoming = getIntent();
                String date = incoming.getStringExtra("date");
                lbl_event_date.setText(date);

            }
        });


    }

}
