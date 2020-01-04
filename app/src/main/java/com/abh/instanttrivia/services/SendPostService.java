package com.abh.instanttrivia.services;

import android.os.AsyncTask;

import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SendPostService extends AsyncTask<String,Void,String> {
    @Override
    protected String doInBackground(String... params) {

        String data = "";

        HttpURLConnection httpURLConnection = null;
        try{
            httpURLConnection = (HttpURLConnection) new URL(params[0]).openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);

            DataOutputStream write = new DataOutputStream(httpURLConnection.getOutputStream());
            write.writeBytes("PostData=" + params[1]);
            write.flush();
            write.close();

            InputStream inputStream = httpURLConnection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

            int inputStreamData = inputStreamReader.read();
            while (inputStreamData != -1){
                char current = (char) inputStreamData;
                inputStreamData = inputStreamReader.read();
                data += current;
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(httpURLConnection != null){
                httpURLConnection.disconnect();
            }
        }
        return null;
    }

    @Override
    protected void onPostExecute(String result){

    }
}
