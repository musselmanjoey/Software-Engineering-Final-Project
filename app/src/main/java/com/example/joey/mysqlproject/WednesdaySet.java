package com.example.joey.mysqlproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;

public class WednesdaySet extends AppCompatActivity {
    String string9;
    String string9_30;
    String string10;
    String string10_30;
    String string11;
    String string11_30;
    String string12;
    String string12_30;
    String string1;
    String string1_30;
    String string2;
    String string2_30;
    String string3;
    String string3_30;
    String string4;
    String string4_30;
    String string5;
    String string5_30;
    String string6;
    String string6_30;
    String username;
    String day;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_schedule);

        Bundle mybundle = getIntent().getExtras();
        username = mybundle.getString("Busername");
        day = "Wednesday";
        string9 = "false";
        string9_30 = "false";
        string10 = "false";
        string10_30 = "false";
        string11 = "false";
        string11_30 = "false";
        string12 = "false";
        string12_30 = "false";
        string1 = "false";
        string1_30 = "false";
        string2 = "false";
        string2_30 = "false";
        string3 = "false";
        string3_30 = "false";
        string4 = "false";
        string4_30 = "false";
        string5 = "false";
        string5_30 = "false";
        string6 = "false";
        string6_30 = "false";

        final Spinner weekdays = findViewById(R.id.weekday_spinner);
        ArrayAdapter<CharSequence> adaptor = ArrayAdapter.createFromResource
                (this,R.array.weekdays,R.layout.support_simple_spinner_dropdown_item);
        weekdays.setAdapter(adaptor);
    }

    public void Go(View view)
    {
        final Spinner weekdays = findViewById(R.id.weekday_spinner);

        if(weekdays.getSelectedItemPosition()==0)
        {
            Intent myintent = new Intent(this,SetSchedule.class);
            Bundle mybundle = new Bundle();

            mybundle.putString("Busername",username);
            myintent.putExtras(mybundle);
            startActivity(myintent);
        }
        else if(weekdays.getSelectedItemPosition()==1)
        {
            Intent myintent = new Intent(this,TuesdaySet.class);
            Bundle mybundle = new Bundle();

            mybundle.putString("Busername",username);
            myintent.putExtras(mybundle);
            startActivity(myintent);
        }
        else if(weekdays.getSelectedItemPosition()==2)
        {
            Intent myintent = new Intent(this,WednesdaySet.class);
            Bundle mybundle = new Bundle();

            mybundle.putString("Busername",username);
            myintent.putExtras(mybundle);
            startActivity(myintent);
        }
        else if(weekdays.getSelectedItemPosition()==3)
        {
            Intent myintent = new Intent(this,ThursdaySet.class);
            Bundle mybundle = new Bundle();

            mybundle.putString("Busername",username);
            myintent.putExtras(mybundle);
            startActivity(myintent);
        }
        else if(weekdays.getSelectedItemPosition()==4)
        {
            Intent myintent = new Intent(this,FridaySet.class);
            Bundle mybundle = new Bundle();

            mybundle.putString("Busername",username);
            myintent.putExtras(mybundle);
            startActivity(myintent);
        }
        else if(weekdays.getSelectedItemPosition()==5)
        {
            Intent myintent = new Intent(this,SaturdaySet.class);
            Bundle mybundle = new Bundle();

            mybundle.putString("Busername",username);
            myintent.putExtras(mybundle);
            startActivity(myintent);
        }
        else if(weekdays.getSelectedItemPosition()==6)
        {
            Intent myintent = new Intent(this,SundaySet.class);
            Bundle mybundle = new Bundle();

            mybundle.putString("Busername",username);
            myintent.putExtras(mybundle);
            startActivity(myintent);
        }
    }

    public void SubmitShed(View view) {
        String type = "submitShed";
        final CheckBox CB9 = findViewById(R.id.CB9);
        final CheckBox CB9_30 = findViewById(R.id.CB9_30);
        final CheckBox CB10 = findViewById(R.id.CB10);
        final CheckBox CB10_30 = findViewById(R.id.CB10_30);
        final CheckBox CB11 = findViewById(R.id.CB11);
        final CheckBox CB11_30 = findViewById(R.id.CB11_30);
        final CheckBox CB12 = findViewById(R.id.CB12);
        final CheckBox CB12_30 = findViewById(R.id.CB12_30);
        final CheckBox CB1 = findViewById(R.id.CB1);
        final CheckBox CB1_30 = findViewById(R.id.CB1_30);
        final CheckBox CB2 = findViewById(R.id.CB2);
        final CheckBox CB2_30 = findViewById(R.id.CB2_30);
        final CheckBox CB3 = findViewById(R.id.CB3);
        final CheckBox CB3_30 = findViewById(R.id.CB3_30);
        final CheckBox CB4 = findViewById(R.id.CB4);
        final CheckBox CB4_30 = findViewById(R.id.CB4_30);
        final CheckBox CB5 = findViewById(R.id.CB5);
        final CheckBox CB5_30 = findViewById(R.id.CB5_30);
        final CheckBox CB6 = findViewById(R.id.CB6);
        final CheckBox CB6_30 = findViewById(R.id.CB6_30);

        if(CB9.isChecked()){
            string9 = "true";
        }
        else{
            string9 = "false";
        }
        if(CB9_30.isChecked()){
            string9_30 = "true";
        }
        else{
            string9_30 = "false";
        }
        if(CB10.isChecked()){
            string10 = "true";
        }
        else{
            string10 = "false";
        }
        if(CB10_30.isChecked()){
            string10_30 = "true";
        }
        else{
            string10_30 = "false";
        }
        if(CB11.isChecked()){
            string11 = "true";
        }
        else{
            string11 = "false";
        }
        if(CB11_30.isChecked()){
            string11_30 = "true";
        }
        else{
            string11_30 = "false";
        }
        if(CB12.isChecked()){
            string12 = "true";
        }
        else{
            string12 = "false";
        }
        if(CB12_30.isChecked()){
            string12_30 = "true";
        }
        else{
            string12_30 = "false";
        }
        if(CB1.isChecked()){
            string1 = "true";
        }
        else{
            string1 = "false";
        }
        if(CB1_30.isChecked()){
            string1_30 = "true";
        }
        else{
            string1_30 = "false";
        }
        if(CB2.isChecked()){
            string2 = "true";
        }
        else{
            string2 = "false";
        }
        if(CB2_30.isChecked()){
            string2_30 = "true";
        }
        else{
            string2_30 = "false";
        }
        if(CB3.isChecked()){
            string3 = "true";
        }
        else{
            string3 = "false";
        }
        if(CB3_30.isChecked()){
            string3_30 = "true";
        }
        else{
            string3_30 = "false";
        }
        if(CB4.isChecked()){
            string4 = "true";
        }
        else{
            string4 = "false";
        }
        if(CB4_30.isChecked()){
            string4_30 = "true";
        }
        else{
            string4_30 = "false";
        }
        if(CB5.isChecked()){
            string5 = "true";
        }
        else{
            string5 = "false";
        }
        if(CB5_30.isChecked()){
            string5_30 = "true";
        }
        else{
            string5_30 = "false";
        }
        if(CB6.isChecked()){
            string6 = "true";
        }
        else{
            string6 = "false";
        }
        if(CB6_30.isChecked()){
            string6_30 = "true";
        }
        else{
            string6_30 = "false";
        }

        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, string9, string9_30, string10, string10_30, string11, string11_30, string12, string12_30, string1, string1_30, string2, string2_30, string3, string3_30, string4, string4_30, string5, string5_30, string6, string6_30, username, day);
    }

}

