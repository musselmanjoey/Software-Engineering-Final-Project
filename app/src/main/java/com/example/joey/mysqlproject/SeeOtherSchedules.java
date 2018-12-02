package com.example.joey.mysqlproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.concurrent.ExecutionException;

public class SeeOtherSchedules extends AppCompatActivity {
    String username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Bundle mybundle = getIntent().getExtras();
        username = mybundle.getString("Busername");
        setContentView(R.layout.activity_see_other_schedules);
        String type = "getUsers";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, username);

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
