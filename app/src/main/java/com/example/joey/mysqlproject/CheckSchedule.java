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
        try {
            String res = backgroundWorker.get();
            /*StringTokenizer defaultTokenizer = new StringTokenizer(res);

            System.out.println("Total number of tokens found : " + defaultTokenizer.countTokens());

            while (defaultTokenizer.hasMoreTokens())
            {
                System.out.println(defaultTokenizer.nextToken());
            }

            System.out.println("Total number of tokens found : " + defaultTokenizer.countTokens());*/
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
