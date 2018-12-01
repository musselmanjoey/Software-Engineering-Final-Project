package com.example.joey.mysqlproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class FridaySet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friday_set);

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
            startActivity(new Intent(this,SetSchedule.class));
        }
        else if(weekdays.getSelectedItemPosition()==1)
        {
            startActivity(new Intent(this,TuesdaySet.class));
        }
        else if(weekdays.getSelectedItemPosition()==2)
        {
            startActivity(new Intent(this,WednesdaySet.class));
        }
        else if(weekdays.getSelectedItemPosition()==3)
        {
            startActivity(new Intent(this,ThursdaySet.class));
        }
        else if(weekdays.getSelectedItemPosition()==4)
        {
            startActivity(new Intent(this,FridaySet.class));
        }
        else if(weekdays.getSelectedItemPosition()==5)
        {
            startActivity(new Intent(this,SaturdaySet.class));
        }
        else if(weekdays.getSelectedItemPosition()==6)
        {
            startActivity(new Intent(this,SundaySet.class));
        }
    }
}
