package com.example.joey.mysqlproject;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff.Mode;

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
            String[] myStringArray = res.split(" ");
            int x = 0;


            //MONDAY

            if (myStringArray[x].equals("1"))
            {
                    ImageView imgStatus = findViewById(R.id.box_mon_9);
                    Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                    int iconColor = android.graphics.Color.GREEN;
                    d.setColorFilter(iconColor, Mode.MULTIPLY);
                    imgStatus.setImageDrawable(d);
            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_mon_930);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_mon_10);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_mon_1030);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_mon_11);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_mon_1130);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_mon_12);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_mon_1230);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_mon_1);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_mon_130);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_mon_2);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_mon_230);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_mon_3);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_mon_330);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_mon_4);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_mon_430);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_mon_5);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_mon_530);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_mon_6);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1")) {
                ImageView imgStatus = findViewById(R.id.box_mon_630);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }

            //TUESDAY
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_tues_9);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);
            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_tues_930);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_tues_10);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_tues_1030);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_tues_11);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_tues_1130);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_tues_12);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_tues_1230);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_tues_1);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_tues_130);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_tues_2);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_tues_230);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_tues_3);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_tues_330);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_tues_4);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_tues_430);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_tues_5);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_tues_530);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_tues_6);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1")) {
                ImageView imgStatus = findViewById(R.id.box_tues_630);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }

//Wednesday
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_wed_9);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);
            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_wed_930);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_wed_10);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_wed_1030);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_wed_11);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_wed_1130);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_wed_12);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_wed_1230);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_wed_1);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_wed_130);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_wed_2);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_wed_230);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_wed_3);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_wed_330);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_wed_4);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_wed_430);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_wed_5);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_wed_530);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_wed_6);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1")) {
                ImageView imgStatus = findViewById(R.id.box_wed_630);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }

//Thursday
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_thur_9);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);
            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_thur_930);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_thur_10);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_thur_1030);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_thur_11);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_thur_1130);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_thur_12);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_thur_1230);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_thur_1);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_thur_130);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_thur_2);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_thur_230);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_thur_3);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_thur_330);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_thur_4);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_thur_430);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_thur_5);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_thur_530);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_thur_6);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1")) {
                ImageView imgStatus = findViewById(R.id.box_thur_630);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
//Friday

            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_fri_9);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);
            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_fri_930);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_fri_10);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_fri_1030);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_fri_11);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_fri_1130);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_fri_12);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_fri_1230);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_fri_1);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_fri_130);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_fri_2);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_fri_230);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_fri_3);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_fri_330);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_fri_4);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_fri_430);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_fri_5);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_fri_530);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_fri_6);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1")) {
                ImageView imgStatus = findViewById(R.id.box_fri_630);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
//Saturday

            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sat_9);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);
            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sat_930);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sat_10);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sat_1030);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sat_11);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sat_1130);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sat_12);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sat_1230);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sat_1);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sat_130);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sat_2);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sat_230);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sat_3);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sat_330);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sat_4);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sat_430);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sat_5);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sat_530);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sat_6);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1")) {
                ImageView imgStatus = findViewById(R.id.box_sat_630);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
//Sunday
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sun_9);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);
            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sun_930);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sun_10);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sun_1030);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sun_11);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sun_1130);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sun_12);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sun_1230);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sun_1);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sun_130);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sun_2);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sun_230);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sun_3);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sun_330);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sun_4);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sun_430);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sun_5);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sun_530);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_sun_6);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;
            if (myStringArray[x].equals("1")) {
                ImageView imgStatus = findViewById(R.id.box_sun_630);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);
            }

        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
