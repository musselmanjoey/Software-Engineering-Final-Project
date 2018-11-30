package com.example.joey.mysqlproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {
    EditText UsernameEt, PasswordEt;

    public MainActivity() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UsernameEt = (EditText)findViewById(R.id.etUserName);
        PasswordEt = (EditText)findViewById(R.id.etPassword);

    }
    public void OnLogin(View view) {


        String username = UsernameEt.getText().toString();
        String password = PasswordEt.getText().toString();
        String type = "login";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, username, password);

        try {
            String res = backgroundWorker.get();
            if (res.equals("login success")) {
                Intent myintent = new Intent(this,HomePage.class);
                Bundle mybundle = new Bundle();

                mybundle.putString("Busername",username);
                myintent.putExtras(mybundle);
                startActivity(myintent);

            }
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




    }
    public void OpenReg(View view){
        startActivity(new Intent(this,Register.class));
    }

}
