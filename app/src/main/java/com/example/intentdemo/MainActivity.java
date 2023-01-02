package com.example.intentdemo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;

import java.time.LocalDate;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent launchSecondActivity = new Intent(this , SecondActivity.class);

        launchSecondActivity.putExtra("appName","IntentDemo");
        launchSecondActivity.putExtra("developerName","vijay sekhar");
        launchSecondActivity.putExtra("Date", LocalDate.MAX.getDayOfMonth());

        Button finish = findViewById(R.id.finish);

        finish.setOnClickListener(view -> {
            startActivity(launchSecondActivity);
            finish();
        });
    }
}