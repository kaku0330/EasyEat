package com.example.easyeatproject;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class AdminAccountPage1 extends AppCompatActivity {
    WebView webView;
    String url = "http://88757johnny.byethost33.com/";
    CookieManager cookieManager;
    String cookieStr, id_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_account_page1);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);//設定螢幕不隨手機旋轉
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//螢幕保持橫向
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectDiskReads().detectDiskWrites().detectNetwork().penaltyLog().build());
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectLeakedClosableObjects().penaltyLog().penaltyDeath().build());
        Context context =this;
        Wcookie(context);
        Handler myHandler = new Handler();
        myHandler.postDelayed(runTimerstop, 15000);
        if (cookieStr != null) {
            myHandler.removeCallbacks(runTimerstop);
        }
    }

    public void onModifyClick(View v) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(AdminAccountPage1.this);
        alertDialog.setTitle("修改");
        alertDialog.setMessage("確定要修改?");
        alertDialog.setPositiveButton("確定",((dialog, which) -> {}));
        alertDialog.setNeutralButton("取消",((dialog, which) -> {}));
        AlertDialog dialog = alertDialog.create();
        dialog.show();
        dialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener((v1 -> {
            EditText edat = (EditText)findViewById(R.id.editTextTextPersonName2);
            EditText edpd = (EditText)findViewById(R.id.editTextTextPassword3);
            MySQL.updatedata("Account","password",edpd.getText().toString(),"account",edat.getText().toString(),cookieStr,url);

            setToast("修改完畢");
            dialog.dismiss();
        }));
        dialog.getButton(AlertDialog.BUTTON_NEUTRAL).setOnClickListener((v2 -> {
            setToast("取消");
            dialog.dismiss();
        }));
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
    }

    private void setToast (String text){
        Toast.makeText(AdminAccountPage1.this, text, Toast.LENGTH_SHORT).show();
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

