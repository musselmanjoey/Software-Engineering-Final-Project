package com.example.joey.mysqlproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SaturdaySet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saturday_set);

        final Spinner weekdays = findViewById(R.id.weekday_spinner);
        ArrayAdapter<CharSequence> adaptor = ArrayAdapter.createFromResource
                (this,R.array.weekdays,R.layout.support_simple_spinner_dropdown_item);
        weekdays.setAdapter(adaptor);
    }
}
