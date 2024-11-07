package com.example.easyeatproject;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import java.util.ArrayList;

public class MySQL {

    private static HttpClient HC;
    private static HttpPost HP;
    public static String[] selectstatusdata(String i, String i1,String i2, String Wcook, String url){
        String get = "";

        try {
            HC=new DefaultHttpClient();
            HP=new HttpPost(url+"/getaccount.php");
            HP.addHeader("Cookie",Wcook+";expires=Thu,31-DEC-37 23:55:55 GMT;path=/");
            ArrayList<NameValuePair> params=new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("A1",i));
            params.add(new BasicNameValuePair("A2",i1));
            params.add(new BasicNameValuePair("A3",i2));
            HP.setEntity(new UrlEncodedFormEntity(params,HTTP.UTF_8));

            HttpResponse HR=HC.execute(HP);
            HR.getEntity();
            get = EntityUtils.toString(HR.getEntity(),HTTP.UTF_8);
        } catch (Exception e) {
            System.out.print(e.toString());
        }
        String [] result  = get.split("asshole");

        return result;
    }


    public static String Tokenget(String i, String i1, String Wcook, String url){
        String get = "";

        try {
            HC=new DefaultHttpClient();
            HP=new HttpPost(url+"/token.php");
            HP.addHeader("Cookie",Wcook+";expires=Thu,31-DEC-37 23:55:55 GMT;path=/");
            ArrayList<NameValuePair> params=new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("A1",i));
            params.add(new BasicNameValuePair("A2",i1));
            HP.setEntity(new UrlEncodedFormEntity(params,HTTP.UTF_8));

            HttpResponse HR=HC.execute(HP);
            HR.getEntity();
            get = EntityUtils.toString(HR.getEntity(),HTTP.UTF_8);
        } catch (Exception e) {
            System.out.print(e.toString());
        }
        return get;
    }

    public static void updatedata(String i, String i1, String i2, String i3, String i4, String Wcook, String url) {
        String result = "";
        try {

            HC = new DefaultHttpClient();
            HP = new HttpPost(url + "updatedata.php");  //好像多一個/    updatedata.php  如果不能成功 在寫回/updatedata.php
            HP.addHeader("Cookie", Wcook + ";expires=Thu,31-DEC-37 23:55:55 GMT;path=/");
            ArrayList<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("A1", i));
            params.add(new BasicNameValuePair("A2", i1));
            params.add(new BasicNameValuePair("A3", i2));
            params.add(new BasicNameValuePair("A4", i3));
            params.add(new BasicNameValuePair("A5", i4));
            HP.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
            HttpResponse HR = HC.execute(HP);
            HR.getEntity();

        } catch (Exception e) {
            System.out.print(e.toString());
        }
    }

    public static void  sendfcm(String account, String title,String body, String Wcook, String url){

        try {
            HC=new DefaultHttpClient();
            HP=new HttpPost(url + "FcmPush.php");
            HP.addHeader("Cookie",Wcook+";expires=Thu,31-DEC-37 23:55:55 GMT;path=/");
            ArrayList<NameValuePair> params=new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("account",account));
            params.add(new BasicNameValuePair("title",title));
            params.add(new BasicNameValuePair("body",body));
            HP.setEntity(new UrlEncodedFormEntity(params,HTTP.UTF_8));
            HttpResponse HR = HC.execute(HP);
            HR.getEntity();
        } catch (Exception e) {
            System.out.print(e.toString());
        }
    }

}
