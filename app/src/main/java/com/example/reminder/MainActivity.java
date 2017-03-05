package com.example.reminder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createNewEvent(View view) {
        Toast t = Toast.makeText(this, "Creating new event...", Toast.LENGTH_SHORT);
        t.show();
    }
}
