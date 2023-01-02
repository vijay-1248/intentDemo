package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView appName = findViewById(R.id.appName);
        TextView developerName = findViewById( R.id.developerName );
        TextView startDate = findViewById( R.id.date );

        Intent fromSplashScreen = getIntent();
        appName.setText(fromSplashScreen.getStringExtra("appName"));
        developerName.setText(fromSplashScreen.getStringExtra("developerName"));
        startDate.setText(fromSplashScreen.getStringExtra("Date"));

    }
}