package com.example.joey.mysqlproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        String[] myStringArray;
        try {
            String res = backgroundWorker.get();
            myStringArray = res.split(" ");

            final List<String> other_list = new ArrayList<>(Arrays.asList(myStringArray));

            final Spinner other_spinner = findViewById(R.id.other_user_spinner);
            final ArrayAdapter<String> adaptor = new ArrayAdapter<>
                    (this, R.layout.support_simple_spinner_dropdown_item,other_list);
            other_spinner.setAdapter(adaptor);


        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void Go(View view)
    {
        
    }
}
