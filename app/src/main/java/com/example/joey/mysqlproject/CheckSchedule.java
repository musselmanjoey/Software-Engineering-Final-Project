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
            if (myStringArray[x].equals("1"))
            {
                ImageView imgStatus = findViewById(R.id.box_mon_630);
                Drawable d = getResources().getDrawable(R.drawable.ic_launcher_background);
                int iconColor = android.graphics.Color.GREEN;
                d.setColorFilter(iconColor, Mode.MULTIPLY);
                imgStatus.setImageDrawable(d);

            }
            x++;


        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
