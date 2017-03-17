package com.example.reminder;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelectEventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_event);
    }

    public void selectDate(View view) {
        // use date picker (not right now)
        Intent data = new Intent();
        data.putExtra("date", "2017-03-17");
        this.setResult(Activity.RESULT_OK, data);
        this.finish();
    }
}
