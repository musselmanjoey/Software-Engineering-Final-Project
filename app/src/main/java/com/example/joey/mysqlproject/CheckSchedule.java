package com.example.joey.mysqlproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.StringTokenizer;
import java.util.concurrent.ExecutionException;

public class CheckSchedule extends AppCompatActivity {
    String username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        Bundle mybundle = getIntent().getExtras();
        username = mybundle.getString("Busername");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_schedule);
        String type = "showShed";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, username);
        String[] myTestArray = new String[140];
        for(int i = 0; i < 140; i++){
            myTestArray[i] = "0";
        }
        try {
            String res = backgroundWorker.get();
            String[] myStringArray = res.split(" ");
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
