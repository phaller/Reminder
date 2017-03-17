package com.example.reminder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static final int PICK_DATE_REQUEST = 0;
    static final int CHANGE_PREFS = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createNewEvent(View view) {
        //Toast t = Toast.makeText(this, "Creating new event...", Toast.LENGTH_SHORT);
        //t.show();

        Intent intent = new Intent(this, SelectEventActivity.class);
        startActivityForResult(intent, PICK_DATE_REQUEST);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == PICK_DATE_REQUEST) {
            if (resultCode == RESULT_OK) {
                Toast t = Toast.makeText(this, "coming from SelectEventActivity, date = " + data.getStringExtra("date"), Toast.LENGTH_LONG);
                t.show();
            }
        } else if (requestCode == CHANGE_PREFS) {
            // returned from a different activity
            // do something else
        }
    }
}
