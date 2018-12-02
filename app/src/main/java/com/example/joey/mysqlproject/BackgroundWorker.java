package com.example.joey.mysqlproject;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.view.View;
import android.widget.Button;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class BackgroundWorker extends AsyncTask<String,Void,String> {
    Context context;
    AlertDialog alertDialog;
    BackgroundWorker (Context ctx) {
        context = ctx;
    }
    @Override
    protected String doInBackground(String... params){
        String type = params[0];
        String login_url = "http://ww2.cs.fsu.edu/~musselma/login.php";
        String register_url = "http://ww2.cs.fsu.edu/~musselma/register.php";
        String updateShed_url = "http://ww2.cs.fsu.edu/~musselma/updateShed.php";
        String showShed_url = "http://ww2.cs.fsu.edu/~musselma/showShed.php";
        String getUsers_url = "http://ww2.cs.fsu.edu/~musselma/getUsers.php";
        if(type.equals("login")){
            try {
                String user_name = params[1];
                String password = params[2];
                URL url = new URL(login_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                String post_data = URLEncoder.encode("user_name","UTF-8")+"="+URLEncoder.encode(user_name,"UTF-8")+"&"
                    +URLEncoder.encode("password","UTF-8")+"="+URLEncoder.encode(password,"UTF-8");
                bufferedWriter.write(post_data);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"iso-8859-1"));
                String result="";
                String line="";
                while((line = bufferedReader.readLine())!= null){
                    result += line;
                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                return result;
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(type.equals("register")){
            try {
                String name = params[1];
                String surname = params[2];
                String age = params[3];
                String username = params[4];
                String password = params[5];
                URL url = new URL(register_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                String post_data = URLEncoder.encode("name","UTF-8")+"="+URLEncoder.encode(name,"UTF-8")+"&"
                        +URLEncoder.encode("surname","UTF-8")+"="+URLEncoder.encode(surname,"UTF-8")+"&"
                        +URLEncoder.encode("age","UTF-8")+"="+URLEncoder.encode(age,"UTF-8")+"&"
                        +URLEncoder.encode("username","UTF-8")+"="+URLEncoder.encode(username,"UTF-8")+"&"
                        +URLEncoder.encode("password","UTF-8")+"="+URLEncoder.encode(password,"UTF-8");
                bufferedWriter.write(post_data);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"iso-8859-1"));
                String result="";
                String line="";
                while((line = bufferedReader.readLine())!= null){
                    result += line;
                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                return result;
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(type.equals("submitShed")){
            try {
                String string9 = params[1];
                String string9_30 = params[2];
                String string10 = params[3];
                String string10_30 = params[4];
                String string11 = params[5];
                String string11_30 = params[6];
                String string12 = params[7];
                String string12_30 = params[8];
                String string1 = params[9];
                String string1_30 = params[10];
                String string2 = params[11];
                String string2_30 = params[12];
                String string3 = params[13];
                String string3_30 = params[14];
                String string4 = params[15];
                String string4_30 = params[16];
                String string5 = params[17];
                String string5_30 = params[18];
                String string6 = params[19];
                String string6_30 = params[20];
                String username = params[21];
                String day = params[22];
                URL url = new URL(updateShed_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                String post_data = URLEncoder.encode("string9","UTF-8")+"="+URLEncoder.encode(string9,"UTF-8")+"&"
                        +URLEncoder.encode("string9_30","UTF-8")+"="+URLEncoder.encode(string9_30,"UTF-8")+"&"
                        +URLEncoder.encode("string10","UTF-8")+"="+URLEncoder.encode(string10,"UTF-8")+"&"
                        +URLEncoder.encode("string10_30","UTF-8")+"="+URLEncoder.encode(string10_30,"UTF-8")+"&"
                        +URLEncoder.encode("string11","UTF-8")+"="+URLEncoder.encode(string11,"UTF-8")+"&"
                        +URLEncoder.encode("string11_30","UTF-8")+"="+URLEncoder.encode(string11_30,"UTF-8")+"&"
                        +URLEncoder.encode("string12","UTF-8")+"="+URLEncoder.encode(string12,"UTF-8")+"&"
                        +URLEncoder.encode("string12_30","UTF-8")+"="+URLEncoder.encode(string12_30,"UTF-8")+"&"
                        +URLEncoder.encode("string1","UTF-8")+"="+URLEncoder.encode(string1,"UTF-8")+"&"
                        +URLEncoder.encode("string1_30","UTF-8")+"="+URLEncoder.encode(string1_30,"UTF-8")+"&"
                        +URLEncoder.encode("string2","UTF-8")+"="+URLEncoder.encode(string2,"UTF-8")+"&"
                        +URLEncoder.encode("string2_30","UTF-8")+"="+URLEncoder.encode(string2_30,"UTF-8")+"&"
                        +URLEncoder.encode("string3","UTF-8")+"="+URLEncoder.encode(string3,"UTF-8")+"&"
                        +URLEncoder.encode("string3_30","UTF-8")+"="+URLEncoder.encode(string3_30,"UTF-8")+"&"
                        +URLEncoder.encode("string4","UTF-8")+"="+URLEncoder.encode(string4,"UTF-8")+"&"
                        +URLEncoder.encode("string4_30","UTF-8")+"="+URLEncoder.encode(string4_30,"UTF-8")+"&"
                        +URLEncoder.encode("string5","UTF-8")+"="+URLEncoder.encode(string5,"UTF-8")+"&"
                        +URLEncoder.encode("string5_30","UTF-8")+"="+URLEncoder.encode(string5_30,"UTF-8")+"&"
                        +URLEncoder.encode("string6","UTF-8")+"="+URLEncoder.encode(string6,"UTF-8")+"&"
                        +URLEncoder.encode("string6_30","UTF-8")+"="+URLEncoder.encode(string6_30,"UTF-8")+"&"
                        +URLEncoder.encode("username","UTF-8")+"="+URLEncoder.encode(username,"UTF-8")+"&"
                        +URLEncoder.encode("day","UTF-8")+"="+URLEncoder.encode(day,"UTF-8");
                bufferedWriter.write(post_data);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"iso-8859-1"));
                String result="";
                String line="";
                while((line = bufferedReader.readLine())!= null){
                    result += line;
                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                return result;
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(type.equals("showShed")){
            try {
                String username = params[1];
                URL url = new URL(showShed_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                String post_data = URLEncoder.encode("username","UTF-8")+"="+URLEncoder.encode(username,"UTF-8");
                bufferedWriter.write(post_data);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"iso-8859-1"));
                String result="";
                String line="";
                while((line = bufferedReader.readLine())!= null){
                    result += line;
                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                return result;
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(type.equals("getUsers")){
            try {
                String username = params[1];
                URL url = new URL(getUsers_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                String post_data = URLEncoder.encode("username","UTF-8")+"="+URLEncoder.encode(username,"UTF-8");
                bufferedWriter.write(post_data);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"iso-8859-1"));
                String result="";
                String line="";
                while((line = bufferedReader.readLine())!= null){
                    result += line;
                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                return result;
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    protected void onPreExecute(){
        alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.setTitle("Login Status");
    }

    @Override
    protected void onPostExecute(String result){
        alertDialog.setMessage(result);
        alertDialog.show();
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }


}
