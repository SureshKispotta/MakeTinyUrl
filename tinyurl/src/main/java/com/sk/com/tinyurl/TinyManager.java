package com.sk.com.tinyurl;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TinyManager
{

    @SuppressLint("StaticFieldLeak")
    public static void getTinnyUrl(final String url_string,Callback callback)
    {
        new AsyncTask<Callback,Void,String>()
        {

            private Callback callback;
            private boolean isError;
            @Override
            protected String doInBackground(Callback... callbacks)
            {
                callback=callbacks[0];
                String tini_url;
                try
                {
                    tini_url=getTinnyUrl(url_string);
                    isError=false;
                } catch (Exception e)
                {
                    tini_url=e.getMessage();
                    isError=true;
                }
                return tini_url;
            }

            @Override
            protected void onPostExecute(String url)
            {
                super.onPostExecute(url);
                if(isError)
                {
                    if(callback!=null)
                        callback.onError(url);
                }else
                {
                    if(callback!=null)
                        callback.onSuccess(url);
                }
            }
        }.execute(callback);
    }





    private static String getTinnyUrl(String url_string) throws Exception
    {
        String result;
        StringBuilder sb = new StringBuilder();
        String tinny_url="http://tinyurl.com/api-create.php?url="+url_string;
        URL url = new URL(tinny_url);
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        try
        {
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                sb.append(inputLine);
            }
            br.close();
            in.close();
            result = sb.toString();
        } finally {
            urlConnection.disconnect();
        }
        return result;
    }

    public interface Callback
    {
        void onSuccess(String url);
        void onError(String error);
    }
}
