package com.example.reminder;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CreateEventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);
    }

    public void showDatePickerDialog(View v) {
        DatePickerFragment newFragment = new DatePickerFragment();
        newFragment.setActivity(this);
        newFragment.show(this.getFragmentManager(), "datePicker");
    }

    public void onCreate(View view) {
        TextView tv = (TextView) findViewById(R.id.selectedDateTextView);
        Intent data = new Intent();
        data.putExtra("date", tv.getText());
        setResult(Activity.RESULT_OK, data);
        finish();
    }
}
