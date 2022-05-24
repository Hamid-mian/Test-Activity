package com.example.test_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View v) {
        Intent intent;
        Intent intent1;
        switch (v.getId()) {
            case R.id.repository:
                intent = new Intent(MainActivity.this, Repository.class);
                startActivity(intent);
                break;
            case R.id.test_activity:
                intent1 = new Intent(MainActivity.this, Test_Activity.class);
                startActivity(intent1);
                break;

        } }
}