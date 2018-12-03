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
            String[] myStringArray = res.split(" ");
            if(myStringArray[0].equals("1")){
                //make block green
            }
            else{
                //make block red
            }
            if(myStringArray[1].equals("1")){
                //make block green
            }
            else{
                //make block red
            }if(myStringArray[2].equals("1")){
                //make block green
            }
            else{
                //make block red
            }if(myStringArray[3].equals("1")){
                //make block green
            }
            else{
                //make block red
            }if(myStringArray[4].equals("1")){
                //make block green
            }
            else{
                //make block red
            }if(myStringArray[5].equals("1")){
                //make block green
            }
            else{
                //make block red
            }if(myStringArray[6].equals("1")){
                //make block green
            }
            else{
                //make block red
            }if(myStringArray[7].equals("1")){
                //make block green
            }
            else{
                //make block red
            }if(myStringArray[8].equals("1")){
                //make block green
            }
            else{
                //make block red
            }if(myStringArray[9].equals("1")){
                //make block green
            }
            else{
                //make block red
            }if(myStringArray[10].equals("1")){
                //make block green
            }
            else{
                //make block red
            }if(myStringArray[11].equals("1")){
                //make block green
            }
            else{
                //make block red
            }if(myStringArray[12].equals("1")){
                //make block green
            }
            else{
                //make block red
            }if(myStringArray[13].equals("1")){
                //make block green
            }
            else{
                //make block red
            }if(myStringArray[14].equals("1")){
                //make block green
            }
            else{
                //make block red
            }if(myStringArray[15].equals("1")){
                //make block green
            }
            else{
                //make block red
            }if(myStringArray[16].equals("1")){
                //make block green
            }
            else{
                //make block red
            }if(myStringArray[17].equals("1")){
                //make block green
            }
            else{
                //make block red
            }if(myStringArray[18].equals("1")){
                //make block green
            }
            else{
                //make block red
            }if(myStringArray[19].equals("1")){
                //make block green
            }
            else{
                //make block red
            }if(myStringArray[20].equals("1")){
                //make block green
            }
            else{
                //make block red
            }
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
