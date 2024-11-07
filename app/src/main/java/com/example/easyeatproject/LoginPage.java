package com.example.easyeatproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LoginPage extends AppCompatActivity {

    private EditText username = null;
    private EditText password = null;
    private TextView attempts;
    private TextView test;
    private Button login;
    public String token;
    int counter = 3;
    WebView webView;
    String url = "http://88757johnny.byethost33.com/";
    CookieManager cookieManager;
    String cookieStr;
    Context context =this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectDiskReads().detectDiskWrites().detectNetwork().penaltyLog().build());
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectLeakedClosableObjects().penaltyLog().penaltyDeath().build());
        username = (EditText) findViewById(R.id.editText);
        password = (EditText) findViewById(R.id.editText2);
        attempts = (TextView) findViewById(R.id.textView8);
        test = (TextView) findViewById(R.id.textView9);


        attempts.setText(Integer.toString(counter));
        login = (Button) findViewById(R.id.bt_2);
        Wcookie(context);
        Handler myHandler = new Handler();
        myHandler.postDelayed(runTimerstop, 15000);
        if (cookieStr != null) {
            myHandler.removeCallbacks(runTimerstop);
        }

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseInstanceId.getInstance().getInstanceId().addOnCompleteListener(new OnCompleteListener<InstanceIdResult>() {
                    @Override
                    public void onComplete(@NonNull Task<InstanceIdResult> task) {
                      if(task.isSuccessful()){
                            token = task.getResult().getToken();
                            MySQL.Tokenget(username.getText().toString(),token,cookieStr,url);
                      }else{
                          test.setText("失敗");
                      }
                    }
                });

                String [] s = MySQL.selectstatusdata(username.getText().toString(),password.getText().toString(),token,cookieStr,url);

                if(s[0].equals("顧客")){
                    Toast.makeText(getApplicationContext(), "顧客身分登入",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent();
                    intent.setClass(LoginPage.this, CustOrderPage.class);
                    startActivity(intent);
                }else if(s[0].equals("店員")){
                    Toast.makeText(getApplicationContext(), "店員身分登入",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent();
                    intent.setClass(LoginPage.this, FrontSideCustSeatPage.class);
                    startActivity(intent);
                }else if(s[0].equals("廚房")){
                    Toast.makeText(getApplicationContext(), "廚房身分登入",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent();
                    intent.setClass(LoginPage.this, BackStageFoodPage.class);
                    startActivity(intent);
                }else if(s[0].equals("店長")){
                    Toast.makeText(getApplicationContext(), "店長身分登入",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent();
                    intent.setClass(LoginPage.this, AdminMenuPage.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(), "驗證錯誤",
                            Toast.LENGTH_SHORT).show();
                    attempts.setBackgroundColor(Color.RED);
                    counter--;
                    attempts.setText(Integer.toString(counter));
                    if(counter==0){
                        login.setEnabled(false);
                    }
                }
            }
        });
    }

    private void setToast (String text){
        Toast.makeText(LoginPage.this, text, Toast.LENGTH_SHORT).show();
    }
    private void Wcookie(Context context) {
        CookieSyncManager.createInstance(context);
        cookieManager = CookieManager.getInstance();
        webView = new WebView(context);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                cookieManager.setAcceptCookie(true);
                cookieStr = cookieManager.getCookie(url);
            }
        });
        String url = "http://88757johnny.byethost33.com/";
        webView.loadUrl(url);
        webView.clearHistory();
        webView.clearCache(true);

        cookieManager.removeAllCookie();
        cookieManager.removeSessionCookie();
    }
    private Runnable runTimerstop = new Runnable() {
        @Override
        public void run() {
            select(null);
        }
    };
    public void select(String id) {
        try {
        } catch (Exception e) {
            Log.e("log_tag", e.toString());
        }
    }
}

