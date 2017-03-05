package com.example.reminder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static final int CREATE_EVENT_REQUEST = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onNewEvent(View view) {
        Intent intent = new Intent(this, CreateEventActivity.class);
        startActivityForResult(intent, CREATE_EVENT_REQUEST);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CREATE_EVENT_REQUEST) {
            if (resultCode == RESULT_OK) {
                Toast t = Toast.makeText(this, data.getStringExtra("date"), Toast.LENGTH_SHORT);
                t.show();
            }
        }
    }
}
