package com.example.easyeatproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.MimeTypeMap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.text.BreakIterator;

public class CustOrderPage extends AppCompatActivity {
    private  static final int PICK_VIDEO_REQUEST=1;
    WebView webView;
    String url = "http://88757johnny.byethost33.com/";
    CookieManager cookieManager;
    String cookieStr;
    Context context =this;
    TextView z,z1,z2,z3,z4,z5,z6,z7,z8,z9,z10,z11,z12,z13,z14,z15,z16,z17,z18,z19,z20,z21,z22,z23,z24,z25,z26,z27,z28,z29,z30,z31,a1,tv1,tv10;//++
    Member member;
    String a = "0";
    public int[] subcount = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    FirebaseDatabase rootNode;
    DatabaseReference reference;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cust_order_page);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);//設定螢幕不隨手機旋轉
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//螢幕保持橫向
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectDiskReads().detectDiskWrites().detectNetwork().penaltyLog().build());
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectLeakedClosableObjects().penaltyLog().penaltyDeath().build());
        Button bt_1 = (Button)findViewById( R.id.bt_1);
        bt_1.setOnClickListener( this::onClick1 );

        Button bt_2 = (Button)findViewById( R.id.bt_2);
        bt_2.setOnClickListener( this::onClick2 );

        Button bt_3 = (Button)findViewById( R.id.bt_3);
        bt_3.setOnClickListener( this::onClick3  );

        Button bt_4 = (Button)findViewById( R.id.bt_4);
        bt_4.setOnClickListener( this::onClick4  );

        TextView tv3 = (TextView) findViewById(R.id.tv_3);

        reference =FirebaseDatabase.getInstance().getReference().child("Member");
        member = new Member();

        z=(TextView) findViewById(R.id.Tv_1);z1=(TextView) findViewById(R.id.Tv_2);z2=(TextView) findViewById(R.id.Tv_3);//++
        z3=(TextView) findViewById(R.id.Tv_4);z4=(TextView) findViewById(R.id.Tv_5);z5=(TextView) findViewById(R.id.Tv_6);
        z6=(TextView) findViewById(R.id.Tv_7);z7=(TextView) findViewById(R.id.Tv_8);z8=(TextView) findViewById(R.id.Tv_9);
        z9=(TextView) findViewById(R.id.Tv_10);z10=(TextView) findViewById(R.id.Tv_11);z11=(TextView) findViewById(R.id.Tv_12);
        z12=(TextView) findViewById(R.id.Tv_13);z13=(TextView) findViewById(R.id.Tv_14);z14=(TextView) findViewById(R.id.Tv_15);
        z15=(TextView) findViewById(R.id.Tv_16);z16=(TextView) findViewById(R.id.Tv_17);z17=(TextView) findViewById(R.id.Tv_18);
        z18=(TextView) findViewById(R.id.Tv_19);z19=(TextView) findViewById(R.id.Tv_20);z20=(TextView) findViewById(R.id.Tv_21);
        z21=(TextView) findViewById(R.id.Tv_22);z22=(TextView) findViewById(R.id.Tv_23);z23=(TextView) findViewById(R.id.Tv_24);
        z24=(TextView) findViewById(R.id.Tv_25);z25=(TextView) findViewById(R.id.Tv_26);z26=(TextView) findViewById(R.id.Tv_27);
        z27=(TextView) findViewById(R.id.Tv_28);z28=(TextView) findViewById(R.id.Tv_29);z29=(TextView) findViewById(R.id.Tv_30);
        z30=(TextView) findViewById(R.id.Tv_31);z31=(TextView) findViewById(R.id.Tv_32);a1=(TextView) findViewById(R.id.tv_3);
        tv10 =findViewById(R.id.tv_10);
        Wcookie(context);
        Handler myHandler = new Handler();
        myHandler.postDelayed(runTimerstop, 5000);
        if (cookieStr != null) {
            myHandler.removeCallbacks(runTimerstop);
        }

    }

    public void showListAlertDialog(View v) {
        final String[] subj = { "1","2","3","4","5","6","7","8","9","10" };
        final String[] w = { "130","100","130","55","180","180","50","50","50","50","55","50","40","35","35","30","40","35","30","40","40","55" };

        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("選擇數量");
        builder.setItems(subj, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                TextView tv3 = (TextView) findViewById(R.id.tv_3);
                String str = tv3.getText().toString();
                switch(v.getId()) {
                    case R.id.bt_aa:
                        Toast.makeText(CustOrderPage.this,"芒果牛奶冰 數量"+subj[which], Toast.LENGTH_SHORT).show();
                        findViewById(R.id.Tv_1).setVisibility( View.VISIBLE);
                        TextView text1 = (TextView)findViewById(R.id.Tv_1);
                        subcount[0] = subcount[0]+Integer.parseInt(subj[which]);
                        text1.setText("芒果牛奶冰　　　　　　"+subcount[0]+"　　　　　　　"+Integer.parseInt(w[0])*subcount[0]);
                        findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                        if (w[w[0].length()] != null){
                                if(tv3.getText() == "" )
                                {
                                    tv3.setText("0");
                                }
                            ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[0])*Integer.parseInt(subj[which])));
                        }
                        break;
                    case R.id.bt_ab:
                        Toast.makeText(CustOrderPage.this,"奇異果牛奶冰 數量"+subj[which], Toast.LENGTH_SHORT).show();
                        findViewById(R.id.Tv_2).setVisibility( View.VISIBLE);
                        TextView text2 = (TextView)findViewById(R.id.Tv_2);
                        subcount[1] = subcount[1]+Integer.parseInt(subj[which]);
                        text2.setText("奇異果牛奶冰　　　　　"+subcount[1]+"　　　　　　　"+Integer.parseInt(w[1])*subcount[1]);
                        findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                        if (w[w[0].length()] != null){
                            if(tv3.getText() == "0" )
                            {
                                tv3.setText("0");
                            }
                            ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[1])*Integer.parseInt(subj[which])));
                        }
                        break;
                    case R.id.bt_ac:
                        Toast.makeText(CustOrderPage.this,"奇異果西瓜牛奶冰 數量"+subj[which], Toast.LENGTH_SHORT).show();
                        findViewById(R.id.Tv_3).setVisibility( View.VISIBLE);
                        TextView text3 = (TextView)findViewById(R.id.Tv_3);
                        subcount[2] = subcount[2]+Integer.parseInt(subj[which]);
                        text3.setText("奇異果西瓜牛奶冰　　　"+subcount[2]+"　　　　　　　"+Integer.parseInt(w[2])*subcount[2]);
                        findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                        if (w[w[0].length()] != null){
                            if(tv3.getText() == "0" )
                            {
                                tv3.setText("0");
                            }
                            ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[2])*Integer.parseInt(subj[which])));
                        }
                        break;
                    case R.id.bt_ad:
                        Toast.makeText(CustOrderPage.this,"紅豆薏仁牛奶冰 數量"+subj[which], Toast.LENGTH_SHORT).show();
                        findViewById(R.id.Tv_4).setVisibility( View.VISIBLE);
                        TextView text4 = (TextView)findViewById(R.id.Tv_4);
                        subcount[3] = subcount[3]+Integer.parseInt(subj[which]);
                        text4.setText("紅豆薏仁牛奶冰　　　　"+subcount[3]+"　　　　　　　"+Integer.parseInt(w[3])*subcount[3]);
                        findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                        if (w[w[0].length()] != null){
                            if(tv3.getText() == "0" )
                            {
                                tv3.setText("0");
                            }
                            ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[3])*Integer.parseInt(subj[which])));
                        }
                        break;
                    case R.id.bt_ae:
                        Toast.makeText(CustOrderPage.this,"綜合水果牛奶冰 數量"+subj[which], Toast.LENGTH_SHORT).show();
                        findViewById(R.id.Tv_5).setVisibility( View.VISIBLE);
                        TextView text5 = (TextView)findViewById(R.id.Tv_5);
                        subcount[4] = subcount[4]+Integer.parseInt(subj[which]);
                        text5.setText("綜合水果牛奶冰　　　　"+subcount[4]+"　　　　　　　"+Integer.parseInt(w[4])*subcount[4]);
                        findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                        if (w[w[0].length()] != null){
                            if(tv3.getText() == "0" )
                            {
                                tv3.setText("0");
                            }
                            ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[4])*Integer.parseInt(subj[which])));
                        }
                        break;
                    case R.id.bt_af:
                        Toast.makeText(CustOrderPage.this,"綠豆薏仁牛奶冰 數量"+subj[which], Toast.LENGTH_SHORT).show();
                        findViewById(R.id.Tv_6).setVisibility( View.VISIBLE);
                        TextView text6 = (TextView)findViewById(R.id.Tv_6);
                        subcount[5] = subcount[5]+Integer.parseInt(subj[which]);
                        text6.setText("綠豆薏仁牛奶冰　　　　"+subcount[5]+"　　　　　　　"+Integer.parseInt(w[5])*subcount[5]);
                        findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                        if (w[w[0].length()] != null){
                            if(tv3.getText() == "0" )
                            {
                                tv3.setText("0");
                            }
                            ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[5])*Integer.parseInt(subj[which])));
                        }
                        break;
                    case R.id.bt_ba:
                        Toast.makeText(CustOrderPage.this,"牛奶冰 數量"+subj[which], Toast.LENGTH_SHORT).show();
                        findViewById(R.id.Tv_7).setVisibility( View.VISIBLE);
                        TextView text7 = (TextView)findViewById(R.id.Tv_7);
                        subcount[6] = subcount[6]+Integer.parseInt(subj[which]);
                        text7.setText("牛奶冰　　　　　　　　"+subcount[6]+"　　　　　　　"+Integer.parseInt(w[6])*subcount[6]);
                        findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                        if (w[w[0].length()] != null){
                            if(tv3.getText() == "0" )
                            {
                                tv3.setText("0");
                            }
                            ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[6])*Integer.parseInt(subj[which])));
                        }
                        break;
                    case R.id.bt_bb:
                        Toast.makeText(CustOrderPage.this,"花生牛奶冰 數量"+subj[which], Toast.LENGTH_SHORT).show();
                        findViewById(R.id.Tv_8).setVisibility( View.VISIBLE);
                        TextView text8 = (TextView)findViewById(R.id.Tv_8);
                        subcount[7] = subcount[7]+Integer.parseInt(subj[which]);
                        text8.setText("花生牛奶冰　　　　　　"+subcount[7]+"　　　　　　　"+Integer.parseInt(w[7])*subcount[7]);
                        findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                        if (w[w[0].length()] != null){
                            if(tv3.getText() == "0" )
                            {
                                tv3.setText("0");
                            }
                            ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[7])*Integer.parseInt(subj[which])));
                        }
                        break;
                    case R.id.bt_bc:
                        Toast.makeText(CustOrderPage.this,"珍珠牛奶冰 數量"+subj[which], Toast.LENGTH_SHORT).show();
                        findViewById(R.id.Tv_9).setVisibility( View.VISIBLE);
                        TextView text9 = (TextView)findViewById(R.id.Tv_9);
                        subcount[8] = subcount[8]+Integer.parseInt(subj[which]);
                        text9.setText("珍珠牛奶冰　　　　　　"+subcount[8]+"　　　　　　　"+Integer.parseInt(w[8])*subcount[8]);
                        findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                        if (w[w[0].length()] != null){
                            if(tv3.getText() == "0" )
                            {
                                tv3.setText("0");
                            }
                            ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[8])*Integer.parseInt(subj[which])));
                        }
                        break;
                    case R.id.bt_bd:
                        Toast.makeText(CustOrderPage.this,"紅豆牛奶冰 數量"+subj[which], Toast.LENGTH_SHORT).show();
                        findViewById(R.id.Tv_10).setVisibility( View.VISIBLE);
                        TextView text10 = (TextView)findViewById(R.id.Tv_10);
                        subcount[9] = subcount[9]+Integer.parseInt(subj[which]);
                        text10.setText("紅豆牛奶冰　　　　　　"+subcount[9]+"　　　　　　　"+Integer.parseInt(w[9])*subcount[9]);
                        findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                        if (w[w[0].length()] != null){
                            if(tv3.getText() == "0" )
                            {
                                tv3.setText("0");
                            }
                            ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[9])*Integer.parseInt(subj[which])));
                        }
                        break;
                    case R.id.bt_be:
                        Toast.makeText(CustOrderPage.this,"紅豆花生牛奶冰 數量"+subj[which], Toast.LENGTH_SHORT).show();
                        findViewById(R.id.Tv_11).setVisibility( View.VISIBLE);
                        TextView text11 = (TextView)findViewById(R.id.Tv_11);
                        subcount[10] = subcount[10]+Integer.parseInt(subj[which]);
                        text11.setText("紅豆花生牛奶冰　　　　"+subcount[10]+"　　　　　　　"+Integer.parseInt(w[10])*subcount[10]);
                        findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                        if (w[w[0].length()] != null){
                            if(tv3.getText() == "0" )
                            {
                                tv3.setText("0");
                            }
                            ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[10])*Integer.parseInt(subj[which])));
                        }
                        break;
                    case R.id.bt_bf:
                        Toast.makeText(CustOrderPage.this,"綠豆牛奶冰 數量"+subj[which], Toast.LENGTH_SHORT).show();
                        findViewById(R.id.Tv_12).setVisibility( View.VISIBLE);
                        TextView text12 = (TextView)findViewById(R.id.Tv_12);
                        subcount[11] = subcount[11]+Integer.parseInt(subj[which]);
                        text12.setText("綠豆牛奶冰　　　　　　"+subcount[11]+"　　　　　　　"+Integer.parseInt(w[11])*subcount[11]);
                        findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                        if (w[w[0].length()] != null){
                            if(tv3.getText() == "0" )
                            {
                                tv3.setText("0");
                            }
                            ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[11])*Integer.parseInt(subj[which])));
                        }
                        break;
                    case R.id.bt_ca:
                        Toast.makeText(CustOrderPage.this,"熱 花生豆花 數量"+subj[which], Toast.LENGTH_SHORT).show();
                        findViewById(R.id.Tv_13).setVisibility( View.VISIBLE);
                        TextView text13 = (TextView)findViewById(R.id.Tv_13);
                        subcount[12] = subcount[12]+Integer.parseInt(subj[which]);
                        text13.setText("冰　花生豆花　　　　　"+subcount[12]+"　　　　　　　"+Integer.parseInt(w[12])*subcount[12]);
                        findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                        if (w[w[0].length()] != null){
                            if(tv3.getText() == "0" )
                            {
                                tv3.setText("0");
                            }
                            ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[12])*Integer.parseInt(subj[which])));
                        }
                        break;
                    case R.id.bt_ca1:
                        Toast.makeText(CustOrderPage.this,"熱 花生豆花 數量"+subj[which], Toast.LENGTH_SHORT).show();
                        findViewById(R.id.Tv_14).setVisibility( View.VISIBLE);
                        TextView text14 = (TextView)findViewById(R.id.Tv_14);
                        subcount[13] = subcount[13]+Integer.parseInt(subj[which]);
                        text14.setText("熱　花生豆花　　　　　"+subcount[13]+"　　　　　　　"+Integer.parseInt(w[12])*subcount[13]);
                        findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                        if (w[w[0].length()] != null){
                            if(tv3.getText() == "0" )
                            {
                                tv3.setText("0");
                            }
                            ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[12])*Integer.parseInt(subj[which])));
                        }
                        break;
                case R.id.bt_cb:
                    Toast.makeText(CustOrderPage.this,"冰 珍珠豆花 數量"+subj[which], Toast.LENGTH_SHORT).show();
                    findViewById(R.id.Tv_15).setVisibility( View.VISIBLE);
                    TextView text15 = (TextView)findViewById(R.id.Tv_15);
                    subcount[14] = subcount[14]+Integer.parseInt(subj[which]);
                    text15.setText("冰　珍珠豆花　　　　　"+subcount[14]+"　　　　　　　"+Integer.parseInt(w[13])*subcount[14]);
                    findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                    if (w[w[0].length()] != null){
                        if(tv3.getText() == "0" )
                        {
                            tv3.setText("0");
                        }
                        ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[13])*Integer.parseInt(subj[which])));
                    }
                    break;
                case R.id.bt_cb1:
                    Toast.makeText(CustOrderPage.this,"熱 珍珠豆花 數量"+subj[which], Toast.LENGTH_SHORT).show();
                    findViewById(R.id.Tv_16).setVisibility( View.VISIBLE);
                    TextView text16 = (TextView)findViewById(R.id.Tv_16);
                    subcount[15] = subcount[15]+Integer.parseInt(subj[which]);
                    text16.setText("熱　珍珠豆花　　　　　"+subcount[15]+"　　　　　　　"+Integer.parseInt(w[13])*subcount[15]);
                    findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                    if (w[w[0].length()] != null){
                        if(tv3.getText() == "0" )
                        {
                            tv3.setText("0");
                        }
                        ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[13])*Integer.parseInt(subj[which])));
                    }
                    break;
                case R.id.bt_cc:
                    Toast.makeText(CustOrderPage.this,"冰 紅豆豆花 數量"+subj[which], Toast.LENGTH_SHORT).show();
                    findViewById(R.id.Tv_17).setVisibility( View.VISIBLE);
                    TextView text17 = (TextView)findViewById(R.id.Tv_17);
                    subcount[16] = subcount[16]+Integer.parseInt(subj[which]);
                    text17.setText("冰　紅豆豆花　　　　　"+subcount[16]+"　　　　　　　"+Integer.parseInt(w[14])*subcount[16]);
                    findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                    if (w[w[0].length()] != null){
                        if(tv3.getText() == "0" )
                        {
                            tv3.setText("0");
                        }
                        ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[14])*Integer.parseInt(subj[which])));
                    }
                    break;
                case R.id.bt_cc1:
                    Toast.makeText(CustOrderPage.this,"熱 紅豆豆花 數量"+subj[which], Toast.LENGTH_SHORT).show();
                    findViewById(R.id.Tv_18).setVisibility( View.VISIBLE);
                    TextView text18 = (TextView)findViewById(R.id.Tv_18);
                    subcount[17] = subcount[17]+Integer.parseInt(subj[which]);
                    text18.setText("熱　紅豆豆花　　　　　"+subcount[17]+"　　　　　　　"+Integer.parseInt(w[14])*subcount[17]);
                    findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                    if (w[w[0].length()] != null){
                        if(tv3.getText() == "0" )
                        {
                            tv3.setText("0");
                        }
                        ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[14])*Integer.parseInt(subj[which])));
                    }
                    break;
                case R.id.bt_cd:
                    Toast.makeText(CustOrderPage.this,"冰 原味豆花 數量"+subj[which], Toast.LENGTH_SHORT).show();
                    findViewById(R.id.Tv_19).setVisibility( View.VISIBLE);
                    TextView text19 = (TextView)findViewById(R.id.Tv_19);
                    subcount[0] = subcount[0]+Integer.parseInt(subj[which]);
                    text19.setText("冰　原味豆花　　　　　"+subcount[18]+"　　　　　　　"+Integer.parseInt(w[15])*subcount[18]);
                    findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                    if (w[w[0].length()] != null){
                        if(tv3.getText() == "0" )
                        {
                            tv3.setText("0");
                        }
                        ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[15])*Integer.parseInt(subj[which])));
                    }
                    break;
                case R.id.bt_cd1:
                    Toast.makeText(CustOrderPage.this,"熱 原味豆花 數量"+subj[which], Toast.LENGTH_SHORT).show();
                    findViewById(R.id.Tv_20).setVisibility( View.VISIBLE);
                    TextView text20 = (TextView)findViewById(R.id.Tv_20);
                    subcount[19] = subcount[19]+Integer.parseInt(subj[which]);
                    text20.setText("熱　原味豆花　　　　　"+subcount[19]+"　　　　　　　"+Integer.parseInt(w[15])*subcount[19]);
                    findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                    if (w[w[0].length()] != null){
                        if(tv3.getText() == "0" )
                        {
                            tv3.setText("0");
                        }
                        ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[15])*Integer.parseInt(subj[which])));
                    }
                    break;
                case R.id.bt_ce:
                    Toast.makeText(CustOrderPage.this,"冰 綜合豆花 數量"+subj[which], Toast.LENGTH_SHORT).show();
                    findViewById(R.id.Tv_21).setVisibility( View.VISIBLE);
                    TextView text21 = (TextView)findViewById(R.id.Tv_21);
                    subcount[20] = subcount[20]+Integer.parseInt(subj[which]);
                    text21.setText("冰　綜合豆花　　　　　"+subcount[20]+"　　　　　　　"+Integer.parseInt(w[16])*subcount[20]);
                    findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                    if (w[w[0].length()] != null){
                        if(tv3.getText() == "0" )
                        {
                            tv3.setText("0");
                        }
                        ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[16])*Integer.parseInt(subj[which])));
                    }
                    break;
                case R.id.bt_ce1:
                    Toast.makeText(CustOrderPage.this,"熱 綜合豆花 數量"+subj[which], Toast.LENGTH_SHORT).show();
                    findViewById(R.id.Tv_22).setVisibility( View.VISIBLE);
                    TextView text22 = (TextView)findViewById(R.id.Tv_22);
                    subcount[21] = subcount[21]+Integer.parseInt(subj[which]);
                    text22.setText("熱　綜合豆花　　　　　"+subcount[21]+"　　　　　　　"+Integer.parseInt(w[16])*subcount[21]);
                    findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                    if (w[w[0].length()] != null){
                        if(tv3.getText() == "0" )
                        {
                            tv3.setText("0");
                        }
                        ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[16])*Integer.parseInt(subj[which])));
                    }
                    break;
                case R.id.bt_cf:
                    Toast.makeText(CustOrderPage.this,"冰 綠豆豆花 數量"+subj[which], Toast.LENGTH_SHORT).show();
                    findViewById(R.id.Tv_23).setVisibility( View.VISIBLE);
                    TextView text23 = (TextView)findViewById(R.id.Tv_23);
                    subcount[22] = subcount[22]+Integer.parseInt(subj[which]);
                    text23.setText("冰　綠豆豆花　　　　　"+subcount[22]+"　　　　　　　"+Integer.parseInt(w[17])*subcount[22]);
                    findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                    if (w[w[0].length()] != null){
                        if(tv3.getText() == "0" )
                        {
                            tv3.setText("0");
                        }
                        ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[17])*Integer.parseInt(subj[which])));
                    }
                    break;
                case R.id.bt_cf1:
                    Toast.makeText(CustOrderPage.this,"熱 綠豆豆花 數量"+subj[which], Toast.LENGTH_SHORT).show();
                    findViewById(R.id.Tv_24).setVisibility( View.VISIBLE);
                    TextView text24 = (TextView)findViewById(R.id.Tv_24);
                    subcount[23] = subcount[23]+Integer.parseInt(subj[which]);
                    text24.setText("熱　綠豆豆花　　　　　"+subcount[23]+"　　　　　　　"+Integer.parseInt(w[17])*subcount[23]);
                    findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                    if (w[w[0].length()] != null){
                        if(tv3.getText() == "0" )
                        {
                            tv3.setText("0");
                        }
                        ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[17])*Integer.parseInt(subj[which])));
                    }
                    break;
                case R.id.bt_da:
                    Toast.makeText(CustOrderPage.this,"冰 紅豆湯 數量"+subj[which], Toast.LENGTH_SHORT).show();
                    findViewById(R.id.Tv_25).setVisibility( View.VISIBLE);
                    TextView text25 = (TextView)findViewById(R.id.Tv_25);
                    subcount[24] = subcount[24]+Integer.parseInt(subj[which]);
                    text25.setText("冰　紅豆湯　　　　　　"+subcount[24]+"　　　　　　　"+Integer.parseInt(w[18])*subcount[24]);
                    findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                    if (w[w[0].length()] != null){
                        if(tv3.getText() == "0" )
                        {
                            tv3.setText("0");
                        }
                        ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[18])*Integer.parseInt(subj[which])));
                    }
                    break;
                case R.id.bt_da1:
                    Toast.makeText(CustOrderPage.this,"熱 紅豆湯 數量"+subj[which], Toast.LENGTH_SHORT).show();
                    findViewById(R.id.Tv_26).setVisibility( View.VISIBLE);
                    TextView text26 = (TextView)findViewById(R.id.Tv_26);
                    subcount[25] = subcount[25]+Integer.parseInt(subj[which]);
                    text26.setText("熱　紅豆湯　　　　　　"+subcount[25]+"　　　　　　　"+Integer.parseInt(w[18])*subcount[25]);
                    findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                    if (w[w[0].length()] != null){
                        if(tv3.getText() == "0" )
                        {
                            tv3.setText("0");
                        }
                        ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[18])*Integer.parseInt(subj[which])));
                    }
                    break;
                case R.id.bt_db:
                    Toast.makeText(CustOrderPage.this,"冰 紅豆薏仁湯 數量"+subj[which], Toast.LENGTH_SHORT).show();
                    findViewById(R.id.Tv_27).setVisibility( View.VISIBLE);
                    TextView text27 = (TextView)findViewById(R.id.Tv_27);
                    subcount[26] = subcount[26]+Integer.parseInt(subj[which]);
                    text27.setText("冰　紅豆薏仁湯　　　　"+subcount[26]+"　　　　　　　"+Integer.parseInt(w[19])*subcount[26]);
                    findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                    if (w[w[0].length()] != null){
                        if(tv3.getText() == "0" )
                        {
                            tv3.setText("0");
                        }
                        ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[19])*Integer.parseInt(subj[which])));
                    }
                    break;
                case R.id.bt_db1:
                    Toast.makeText(CustOrderPage.this,"熱 紅豆薏仁湯 數量"+subj[which], Toast.LENGTH_SHORT).show();
                    findViewById(R.id.Tv_28).setVisibility( View.VISIBLE);
                    TextView text28 = (TextView)findViewById(R.id.Tv_28);
                    subcount[27] = subcount[27]+Integer.parseInt(subj[which]);
                    text28.setText("熱　紅豆薏仁湯　　　　"+subcount[27]+"　　　　　　　"+Integer.parseInt(w[19])*subcount[27]);
                    findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                    if (w[w[0].length()] != null){
                        if(tv3.getText() == "0" )
                        {
                            tv3.setText("0");
                        }
                        ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[19])*Integer.parseInt(subj[which])));
                    }
                    break;
                case R.id.bt_dc:
                    Toast.makeText(CustOrderPage.this,"冰 綠豆湯 數量"+subj[which], Toast.LENGTH_SHORT).show();
                    findViewById(R.id.Tv_29).setVisibility( View.VISIBLE);
                    TextView text29 = (TextView)findViewById(R.id.Tv_29);
                    subcount[28] = subcount[28]+Integer.parseInt(subj[which]);
                    text29.setText("冰　綠豆湯　　　　　　"+subcount[28]+"　　　　　　　"+Integer.parseInt(w[20])*subcount[28]);
                    findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                    if (w[w[0].length()] != null){
                        if(tv3.getText() == "0" )
                        {
                            tv3.setText("0");
                        }
                        ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[20])*Integer.parseInt(subj[which])));
                    }
                    break;
                case R.id.bt_dc1:
                    Toast.makeText(CustOrderPage.this,"熱 綠豆湯 數量"+subj[which], Toast.LENGTH_SHORT).show();
                    findViewById(R.id.Tv_30).setVisibility( View.VISIBLE);
                    TextView text30 = (TextView)findViewById(R.id.Tv_30);
                    subcount[29] = subcount[29]+Integer.parseInt(subj[which]);
                    text30.setText("熱　綠豆湯　　　　　　"+subcount[29]+"　　　　　　　"+Integer.parseInt(w[20])*subcount[29]);
                    findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                    if (w[w[0].length()] != null){
                        if(tv3.getText() == "0" )
                        {
                            tv3.setText("0");
                        }
                        ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[20])*Integer.parseInt(subj[which])));
                    }
                    break;
                case R.id.bt_dd:
                    Toast.makeText(CustOrderPage.this,"冰 綠豆薏仁湯 數量"+subj[which], Toast.LENGTH_SHORT).show();
                    findViewById(R.id.Tv_31).setVisibility( View.VISIBLE);
                    TextView text31 = (TextView)findViewById(R.id.Tv_31);
                    subcount[30] = subcount[30]+Integer.parseInt(subj[which]);
                    text31.setText("冰　綠豆薏仁湯　　　　"+subcount[30]+"　　　　　　　"+Integer.parseInt(w[21])*subcount[30]);
                    findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                    if (w[w[0].length()] != null){
                        if(tv3.getText() == "0" )
                        {
                            tv3.setText("0");
                        }
                        ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[21])*Integer.parseInt(subj[which])));
                    }
                    break;
                case R.id.bt_dd1:
                    Toast.makeText(CustOrderPage.this,"熱 綠豆薏仁湯 數量"+subj[which], Toast.LENGTH_SHORT).show();
                    findViewById(R.id.Tv_32).setVisibility( View.VISIBLE);
                    TextView text32 = (TextView)findViewById(R.id.Tv_32);
                    subcount[31] = subcount[31]+Integer.parseInt(subj[which]);
                    text32.setText("熱　綠豆薏仁湯　　　　"+subcount[31]+"　　　　　　　"+Integer.parseInt(w[21])*subcount[31]);
                    findViewById(R.id.bt_7).setVisibility( View.VISIBLE );
                    if (w[w[0].length()] != null){
                        if(tv3.getText() == "0" )
                        {
                            tv3.setText("0");
                        }
                        ((TextView)findViewById(R.id.tv_3)).setText(Integer.toString(Integer.parseInt(tv3.getText().toString())+Integer.parseInt(w[21])*Integer.parseInt(subj[which])));
                    }
                    break;
                }
            }
        });
        AlertDialog dialog= builder.create();
        dialog.show();
    }
    public void onDelectClick(View v) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(CustOrderPage.this);
        TextView tv3 = (TextView) findViewById(R.id.tv_3);
        if(Integer.toString(Integer.parseInt(tv3.getText().toString())) == "0" )
        {
            alertDialog.setTitle("無餐點紀錄");
        }
        if(Integer.toString(Integer.parseInt(tv3.getText().toString())) != "0" )
        {
            alertDialog.setTitle("清除訂單");
            alertDialog.setMessage("請選擇項目");
        }
        if(Integer.toString(Integer.parseInt(tv3.getText().toString())) != "0" )
        {
        alertDialog.setPositiveButton("確定",((dialog, which) -> {}));
        }
        alertDialog.setNeutralButton("取消",((dialog, which) -> {}));
        AlertDialog dialog = alertDialog.create();
        dialog.show();
        dialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener((v1 -> {
            findViewById(R.id.Tv_1).setVisibility( View.GONE );findViewById(R.id.Tv_2).setVisibility( View.GONE );
            findViewById(R.id.Tv_3).setVisibility( View.GONE );findViewById(R.id.Tv_4).setVisibility( View.GONE );
            findViewById(R.id.Tv_5).setVisibility( View.GONE );findViewById(R.id.Tv_6).setVisibility( View.GONE );
            findViewById(R.id.Tv_7).setVisibility( View.GONE );findViewById(R.id.Tv_8).setVisibility( View.GONE );
            findViewById(R.id.Tv_9).setVisibility( View.GONE );findViewById(R.id.Tv_10).setVisibility( View.GONE );
            findViewById(R.id.Tv_11).setVisibility( View.GONE );findViewById(R.id.Tv_12).setVisibility( View.GONE );
            findViewById(R.id.Tv_13).setVisibility( View.GONE );findViewById(R.id.Tv_14).setVisibility( View.GONE );
            findViewById(R.id.Tv_15).setVisibility( View.GONE );findViewById(R.id.Tv_16).setVisibility( View.GONE );
            findViewById(R.id.Tv_17).setVisibility( View.GONE );findViewById(R.id.Tv_18).setVisibility( View.GONE );
            findViewById(R.id.Tv_19).setVisibility( View.GONE );findViewById(R.id.Tv_20).setVisibility( View.GONE );
            findViewById(R.id.Tv_21).setVisibility( View.GONE );findViewById(R.id.Tv_22).setVisibility( View.GONE );
            findViewById(R.id.Tv_23).setVisibility( View.GONE );findViewById(R.id.Tv_24).setVisibility( View.GONE );
            findViewById(R.id.Tv_25).setVisibility( View.GONE );findViewById(R.id.Tv_26).setVisibility( View.GONE );
            findViewById(R.id.Tv_27).setVisibility( View.GONE );findViewById(R.id.Tv_28).setVisibility( View.GONE );
            findViewById(R.id.Tv_29).setVisibility( View.GONE );findViewById(R.id.Tv_30).setVisibility( View.GONE );
            findViewById(R.id.Tv_31).setVisibility( View.GONE );findViewById(R.id.Tv_32).setVisibility( View.GONE );
            ((TextView) findViewById(R.id.tv_3)).setText(a);
            subcount = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            setToast("已刪除");
            dialog.dismiss();
        }));
        dialog.getButton(AlertDialog.BUTTON_NEUTRAL).setOnClickListener((v3 -> {
            setToast("取消");
            dialog.dismiss();
        }));
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
    }

        public void onServiceClick(View v) {
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(CustOrderPage.this);
            alertDialog.setTitle("服務鈴/結帳");
            alertDialog.setMessage("請選擇要服務的項目");
            TextView tv3 = (TextView) findViewById(R.id.tv_3);
            if(Integer.toString(Integer.parseInt(tv3.getText().toString())) != "0" )
            {
            alertDialog.setPositiveButton("結帳",((dialog, which) -> {}));
            }
            alertDialog.setNegativeButton("服務鈴",((dialog, which) -> {}));
            alertDialog.setNeutralButton("取消",((dialog, which) -> {}));
            AlertDialog dialog = alertDialog.create();
            dialog.show();
            dialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener((v1 -> {
                AlertDialog.Builder outDialog = new AlertDialog.Builder(CustOrderPage.this);
                outDialog.setTitle("結帳");
                outDialog.setMessage(tv3.getText()+"元");
                outDialog.setPositiveButton("結帳",((w, which) -> {}));
                outDialog.setNeutralButton("取消",((w, which) -> {}));
                AlertDialog oDialog = outDialog.create();
                oDialog.show();
                oDialog.getButton(oDialog.BUTTON_POSITIVE).setOnClickListener((v4 -> {
                    MySQL.sendfcm("clerk1","桌號1","可結帳",cookieStr,url);
                    setToast("請至櫃台結帳，謝謝光臨");
                    findViewById(R.id.Tv_1).setVisibility( View.GONE );findViewById(R.id.Tv_2).setVisibility( View.GONE );
                    findViewById(R.id.Tv_3).setVisibility( View.GONE );findViewById(R.id.Tv_4).setVisibility( View.GONE );
                    findViewById(R.id.Tv_5).setVisibility( View.GONE );findViewById(R.id.Tv_6).setVisibility( View.GONE );
                    findViewById(R.id.Tv_7).setVisibility( View.GONE );findViewById(R.id.Tv_8).setVisibility( View.GONE );
                    findViewById(R.id.Tv_9).setVisibility( View.GONE );findViewById(R.id.Tv_10).setVisibility( View.GONE );
                    findViewById(R.id.Tv_11).setVisibility( View.GONE );findViewById(R.id.Tv_12).setVisibility( View.GONE );
                    findViewById(R.id.Tv_13).setVisibility( View.GONE );findViewById(R.id.Tv_14).setVisibility( View.GONE );
                    findViewById(R.id.Tv_15).setVisibility( View.GONE );findViewById(R.id.Tv_16).setVisibility( View.GONE );
                    findViewById(R.id.Tv_17).setVisibility( View.GONE );findViewById(R.id.Tv_18).setVisibility( View.GONE );
                    findViewById(R.id.Tv_19).setVisibility( View.GONE );findViewById(R.id.Tv_20).setVisibility( View.GONE );
                    findViewById(R.id.Tv_21).setVisibility( View.GONE );findViewById(R.id.Tv_22).setVisibility( View.GONE );
                    findViewById(R.id.Tv_23).setVisibility( View.GONE );findViewById(R.id.Tv_24).setVisibility( View.GONE );
                    findViewById(R.id.Tv_25).setVisibility( View.GONE );findViewById(R.id.Tv_26).setVisibility( View.GONE );
                    findViewById(R.id.Tv_27).setVisibility( View.GONE );findViewById(R.id.Tv_28).setVisibility( View.GONE );
                    findViewById(R.id.Tv_29).setVisibility( View.GONE );findViewById(R.id.Tv_30).setVisibility( View.GONE );
                    findViewById(R.id.Tv_31).setVisibility( View.GONE );findViewById(R.id.Tv_32).setVisibility( View.GONE );

                    ((TextView)findViewById(R.id.Tv_1)).setText("");((TextView)findViewById(R.id.Tv_2)).setText("");((TextView)findViewById(R.id.Tv_3)).setText("");
                    ((TextView)findViewById(R.id.Tv_4)).setText("");((TextView)findViewById(R.id.Tv_5)).setText("");((TextView)findViewById(R.id.Tv_6)).setText("");
                    ((TextView)findViewById(R.id.Tv_7)).setText("");((TextView)findViewById(R.id.Tv_8)).setText("");((TextView)findViewById(R.id.Tv_9)).setText("");
                    ((TextView)findViewById(R.id.Tv_10)).setText("");((TextView)findViewById(R.id.Tv_11)).setText("");((TextView)findViewById(R.id.Tv_12)).setText("");
                    ((TextView)findViewById(R.id.Tv_13)).setText("");((TextView)findViewById(R.id.Tv_14)).setText("");((TextView)findViewById(R.id.Tv_15)).setText("");
                    ((TextView)findViewById(R.id.Tv_16)).setText("");((TextView)findViewById(R.id.Tv_17)).setText("");((TextView)findViewById(R.id.Tv_18)).setText("");
                    ((TextView)findViewById(R.id.Tv_19)).setText("");((TextView)findViewById(R.id.Tv_20)).setText("");((TextView)findViewById(R.id.Tv_21)).setText("");
                    ((TextView)findViewById(R.id.Tv_22)).setText("");((TextView)findViewById(R.id.Tv_23)).setText("");((TextView)findViewById(R.id.Tv_24)).setText("");
                    ((TextView)findViewById(R.id.Tv_25)).setText("");((TextView)findViewById(R.id.Tv_26)).setText("");((TextView)findViewById(R.id.Tv_27)).setText("");
                    ((TextView)findViewById(R.id.Tv_28)).setText("");((TextView)findViewById(R.id.Tv_29)).setText("");((TextView)findViewById(R.id.Tv_30)).setText("");
                    ((TextView)findViewById(R.id.Tv_31)).setText("");((TextView)findViewById(R.id.Tv_32)).setText("");
                    ((TextView)findViewById(R.id.tv_3)).setText("0");
                    oDialog.dismiss();
                    dialog.dismiss();
                }));
                oDialog.getButton(oDialog.BUTTON_NEUTRAL).setOnClickListener((v5 -> {
                    setToast("取消");
                    oDialog.dismiss();
                    dialog.dismiss();
                }));
                oDialog.setCancelable(false);
                oDialog.setCanceledOnTouchOutside(false);
            }));
            dialog.getButton(AlertDialog.BUTTON_NEGATIVE).setOnClickListener((v2 ->{

                MySQL.sendfcm("clerk1","桌號1","需要服務",cookieStr,url);
                setToast("馬上為你服務");
                dialog.dismiss();
            }));
            dialog.getButton(AlertDialog.BUTTON_NEUTRAL).setOnClickListener((v3 -> {
                setToast("取消");
                dialog.dismiss();
            }));
            dialog.setCancelable(false);
            dialog.setCanceledOnTouchOutside(false);
        }

    public void onSendoutClick(View v) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(CustOrderPage.this);
        TextView tv_3 = (TextView) findViewById(R.id.tv_3);
        if(Integer.toString(Integer.parseInt(tv_3.getText().toString())) == "0" )
        {
            alertDialog.setTitle("無餐點紀錄");
        }
        if(Integer.toString(Integer.parseInt(tv_3.getText().toString())) != "0" )
        {
            alertDialog.setTitle("送出訂單");
            alertDialog.setMessage("確定送出?");
            alertDialog.setPositiveButton("確定",((dialog, which) -> {}));
        }
        alertDialog.setNeutralButton("取消",((dialog, which) -> {}));
        AlertDialog dialog = alertDialog.create();
        dialog.show();
        dialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(v1 -> {

                    String name=(z.getText().toString().trim());String name1=(z1.getText().toString().trim());String name2=(z2.getText().toString().trim());//++
                    String name3=(z3.getText().toString().trim());String name4=(z4.getText().toString().trim());String name5=(z5.getText().toString().trim());
                    String name6=(z6.getText().toString().trim());String name7=(z7.getText().toString().trim());String name8=(z8.getText().toString().trim());
                    String name9=(z9.getText().toString().trim());String name10=(z10.getText().toString().trim());String name11=(z11.getText().toString().trim());
                    String name12=(z12.getText().toString().trim());String name13=(z13.getText().toString().trim());String name14=(z14.getText().toString().trim());
                    String name15=(z15.getText().toString().trim());String name16=(z16.getText().toString().trim());String name17=(z17.getText().toString().trim());
                    String name18=(z18.getText().toString().trim());String name19=(z19.getText().toString().trim());String name20=(z20.getText().toString().trim());
                    String name21=(z21.getText().toString().trim());String name22=(z22.getText().toString().trim());String name23=(z23.getText().toString().trim());
                    String name24=(z24.getText().toString().trim());String name25=(z25.getText().toString().trim());String name26=(z26.getText().toString().trim());
                    String name27=(z27.getText().toString().trim());String name28=(z28.getText().toString().trim());String name29=(z29.getText().toString().trim());
                    String name30=(z30.getText().toString().trim());String name31=(z31.getText().toString().trim());String name32=(tv_3.getText().toString().trim());
                    rootNode = FirebaseDatabase.getInstance();
                    member.setName(name);member.setName1(name1);member.setName2(name2);member.setName3(name3);member.setName4(name4); //++
                    member.setName5(name5);member.setName6(name6);member.setName7(name7);member.setName8(name8);member.setName9(name9);
                    member.setName10(name10);member.setName11(name11);member.setName12(name12);member.setName13(name13);member.setName14(name14);
                    member.setName15(name15);member.setName16(name16);member.setName17(name17);member.setName18(name18);member.setName19(name19);
                    member.setName20(name20);member.setName21(name21);member.setName22(name22);member.setName23(name23);member.setName24(name24);
                    member.setName25(name25);member.setName26(name26);member.setName27(name27);member.setName28(name28);member.setName29(name29);
                    member.setName30(name30);member.setName31(name31);member.setName32(name32);
                    reference.setValue(member);
            subcount = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            MySQL.sendfcm("kitchen1","桌號1","已提出訂單",cookieStr,url);
            setToast("訂單已送出，請耐心等候餐點");

            a = tv_3.getText().toString();
            findViewById(R.id.Tv_1).setVisibility( View.GONE );findViewById(R.id.Tv_2).setVisibility( View.GONE );
            findViewById(R.id.Tv_3).setVisibility( View.GONE );findViewById(R.id.Tv_4).setVisibility( View.GONE );
            findViewById(R.id.Tv_5).setVisibility( View.GONE );findViewById(R.id.Tv_6).setVisibility( View.GONE );
            findViewById(R.id.Tv_7).setVisibility( View.GONE );findViewById(R.id.Tv_8).setVisibility( View.GONE );
            findViewById(R.id.Tv_9).setVisibility( View.GONE );findViewById(R.id.Tv_10).setVisibility( View.GONE );
            findViewById(R.id.Tv_11).setVisibility( View.GONE );findViewById(R.id.Tv_12).setVisibility( View.GONE );
            findViewById(R.id.Tv_13).setVisibility( View.GONE );findViewById(R.id.Tv_14).setVisibility( View.GONE );
            findViewById(R.id.Tv_15).setVisibility( View.GONE );findViewById(R.id.Tv_16).setVisibility( View.GONE );
            findViewById(R.id.Tv_17).setVisibility( View.GONE );findViewById(R.id.Tv_18).setVisibility( View.GONE );
            findViewById(R.id.Tv_19).setVisibility( View.GONE );findViewById(R.id.Tv_20).setVisibility( View.GONE );
            findViewById(R.id.Tv_21).setVisibility( View.GONE );findViewById(R.id.Tv_22).setVisibility( View.GONE );
            findViewById(R.id.Tv_23).setVisibility( View.GONE );findViewById(R.id.Tv_24).setVisibility( View.GONE );
            findViewById(R.id.Tv_25).setVisibility( View.GONE );findViewById(R.id.Tv_26).setVisibility( View.GONE );
            findViewById(R.id.Tv_27).setVisibility( View.GONE );findViewById(R.id.Tv_28).setVisibility( View.GONE );
            findViewById(R.id.Tv_29).setVisibility( View.GONE );findViewById(R.id.Tv_30).setVisibility( View.GONE );
            findViewById(R.id.Tv_31).setVisibility( View.GONE );findViewById(R.id.Tv_32).setVisibility( View.GONE );
            dialog.dismiss();
        });
        dialog.getButton(AlertDialog.BUTTON_NEUTRAL).setOnClickListener((v3 -> {
            setToast("取消");
            dialog.dismiss();
        }));

        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
    }

    private void setToast (String text){
        Toast.makeText(CustOrderPage.this, text, Toast.LENGTH_SHORT).show();
    }


    public void onClick1(View v)
    {
        switch( v.getId() )
        {
            case R.id.bt_1:
                // 顯示文字)
                findViewById(R.id.bt_aa).setVisibility( View.VISIBLE );
                findViewById(R.id.bt_ab).setVisibility( View.VISIBLE );
                findViewById(R.id.bt_ac).setVisibility( View.VISIBLE );
                findViewById(R.id.bt_ad).setVisibility( View.VISIBLE );
                findViewById(R.id.bt_ae).setVisibility( View.VISIBLE );
                findViewById(R.id.bt_af).setVisibility( View.VISIBLE );

                findViewById(R.id.iv_aa).setVisibility( View.VISIBLE );
                findViewById(R.id.iv_ab).setVisibility( View.VISIBLE );
                findViewById(R.id.iv_ac).setVisibility( View.VISIBLE );
                findViewById(R.id.iv_ad).setVisibility( View.VISIBLE );
                findViewById(R.id.iv_ae).setVisibility( View.VISIBLE );
                findViewById(R.id.iv_af).setVisibility( View.VISIBLE );

                findViewById(R.id.bt_ba).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_bb).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_bc).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_bd).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_be).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_bf).setVisibility( View.INVISIBLE );

                findViewById(R.id.iv_ba).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_bb).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_bc).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_bd).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_be).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_bf).setVisibility( View.INVISIBLE );
                //第3頁2個BUTTON和一個TEXTVIEW
                findViewById(R.id.bt_ca).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_ca1).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_cb).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_cb1).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_cc).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_cc1).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_cd).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_cd1).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_ce).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_ce1).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_cf).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_cf1).setVisibility( View.INVISIBLE );

                findViewById(R.id.iv_ca).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_cb).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_cc).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_cd).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_ce).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_cf).setVisibility( View.INVISIBLE );

                findViewById(R.id.tV_ca).setVisibility( View.INVISIBLE );
                findViewById(R.id.tV_cb).setVisibility( View.INVISIBLE );
                findViewById(R.id.tV_cc).setVisibility( View.INVISIBLE );
                findViewById(R.id.tV_cd).setVisibility( View.INVISIBLE );
                findViewById(R.id.tV_ce).setVisibility( View.INVISIBLE );
                findViewById(R.id.tV_cf).setVisibility( View.INVISIBLE );

                findViewById(R.id.bt_da).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_da1).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_db).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_db1).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_dc).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_dc1).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_dd).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_dd1).setVisibility( View.INVISIBLE );


                findViewById(R.id.iv_da).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_db).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_dc).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_dd).setVisibility( View.INVISIBLE );

                findViewById(R.id.tV_da).setVisibility( View.INVISIBLE );
                findViewById(R.id.tV_db).setVisibility( View.INVISIBLE );
                findViewById(R.id.tV_dc).setVisibility( View.INVISIBLE );
                findViewById(R.id.tV_dd).setVisibility( View.INVISIBLE );
                break;
        }
    }
        public void onClick2(View v)
        {
            switch( v.getId() )
            {
                case R.id.bt_2:
                    // 顯示文字)
                    findViewById(R.id.bt_aa).setVisibility( View.INVISIBLE );
                    findViewById(R.id.bt_ab).setVisibility( View.INVISIBLE );
                    findViewById(R.id.bt_ac).setVisibility( View.INVISIBLE );
                    findViewById(R.id.bt_ad).setVisibility( View.INVISIBLE );
                    findViewById(R.id.bt_ae).setVisibility( View.INVISIBLE );
                    findViewById(R.id.bt_af).setVisibility( View.INVISIBLE );

                    findViewById(R.id.iv_aa).setVisibility( View.INVISIBLE );
                    findViewById(R.id.iv_ab).setVisibility( View.INVISIBLE );
                    findViewById(R.id.iv_ac).setVisibility( View.INVISIBLE );
                    findViewById(R.id.iv_ad).setVisibility( View.INVISIBLE );
                    findViewById(R.id.iv_ae).setVisibility( View.INVISIBLE );
                    findViewById(R.id.iv_af).setVisibility( View.INVISIBLE );

                    findViewById(R.id.bt_ba).setVisibility( View.VISIBLE );
                    findViewById(R.id.bt_bb).setVisibility( View.VISIBLE );
                    findViewById(R.id.bt_bc).setVisibility( View.VISIBLE );
                    findViewById(R.id.bt_bd).setVisibility( View.VISIBLE );
                    findViewById(R.id.bt_be).setVisibility( View.VISIBLE );
                    findViewById(R.id.bt_bf).setVisibility( View.VISIBLE );

                    findViewById(R.id.iv_ba).setVisibility( View.VISIBLE );
                    findViewById(R.id.iv_bb).setVisibility( View.VISIBLE );
                    findViewById(R.id.iv_bc).setVisibility( View.VISIBLE );
                    findViewById(R.id.iv_bd).setVisibility( View.VISIBLE );
                    findViewById(R.id.iv_be).setVisibility( View.VISIBLE );
                    findViewById(R.id.iv_bf).setVisibility( View.VISIBLE );

                    findViewById(R.id.bt_ca).setVisibility( View.INVISIBLE );
                    findViewById(R.id.bt_ca1).setVisibility( View.INVISIBLE );
                    findViewById(R.id.bt_cb).setVisibility( View.INVISIBLE );
                    findViewById(R.id.bt_cb1).setVisibility( View.INVISIBLE );
                    findViewById(R.id.bt_cc).setVisibility( View.INVISIBLE );
                    findViewById(R.id.bt_cc1).setVisibility( View.INVISIBLE );
                    findViewById(R.id.bt_cd).setVisibility( View.INVISIBLE );
                    findViewById(R.id.bt_cd1).setVisibility( View.INVISIBLE );
                    findViewById(R.id.bt_ce).setVisibility( View.INVISIBLE );
                    findViewById(R.id.bt_ce1).setVisibility( View.INVISIBLE );
                    findViewById(R.id.bt_cf).setVisibility( View.INVISIBLE );
                    findViewById(R.id.bt_cf1).setVisibility( View.INVISIBLE );

                    findViewById(R.id.iv_ca).setVisibility( View.INVISIBLE );
                    findViewById(R.id.iv_cb).setVisibility( View.INVISIBLE );
                    findViewById(R.id.iv_cc).setVisibility( View.INVISIBLE );
                    findViewById(R.id.iv_cd).setVisibility( View.INVISIBLE );
                    findViewById(R.id.iv_ce).setVisibility( View.INVISIBLE );
                    findViewById(R.id.iv_cf).setVisibility( View.INVISIBLE );

                    findViewById(R.id.tV_ca).setVisibility( View.INVISIBLE );
                    findViewById(R.id.tV_cb).setVisibility( View.INVISIBLE );
                    findViewById(R.id.tV_cc).setVisibility( View.INVISIBLE );
                    findViewById(R.id.tV_cd).setVisibility( View.INVISIBLE );
                    findViewById(R.id.tV_ce).setVisibility( View.INVISIBLE );
                    findViewById(R.id.tV_cf).setVisibility( View.INVISIBLE );

                    findViewById(R.id.bt_da).setVisibility( View.INVISIBLE );
                    findViewById(R.id.bt_da1).setVisibility( View.INVISIBLE );
                    findViewById(R.id.bt_db).setVisibility( View.INVISIBLE );
                    findViewById(R.id.bt_db1).setVisibility( View.INVISIBLE );
                    findViewById(R.id.bt_dc).setVisibility( View.INVISIBLE );
                    findViewById(R.id.bt_dc1).setVisibility( View.INVISIBLE );
                    findViewById(R.id.bt_dd).setVisibility( View.INVISIBLE );
                    findViewById(R.id.bt_dd1).setVisibility( View.INVISIBLE );


                    findViewById(R.id.iv_da).setVisibility( View.INVISIBLE );
                    findViewById(R.id.iv_db).setVisibility( View.INVISIBLE );
                    findViewById(R.id.iv_dc).setVisibility( View.INVISIBLE );
                    findViewById(R.id.iv_dd).setVisibility( View.INVISIBLE );

                    findViewById(R.id.tV_da).setVisibility( View.INVISIBLE );
                    findViewById(R.id.tV_db).setVisibility( View.INVISIBLE );
                    findViewById(R.id.tV_dc).setVisibility( View.INVISIBLE );
                    findViewById(R.id.tV_dd).setVisibility( View.INVISIBLE );
                    break;
            }
        }
    public void onClick3(View v)
    {
        switch( v.getId() )
        {
            case R.id.bt_3:
                // 顯示文字)
                findViewById(R.id.bt_aa).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_ab).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_ac).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_ad).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_ae).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_af).setVisibility( View.INVISIBLE );

                findViewById(R.id.iv_aa).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_ab).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_ac).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_ad).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_ae).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_af).setVisibility( View.INVISIBLE );

                findViewById(R.id.bt_ba).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_bb).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_bc).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_bd).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_be).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_bf).setVisibility( View.INVISIBLE );

                findViewById(R.id.iv_ba).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_bb).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_bc).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_bd).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_be).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_bf).setVisibility( View.INVISIBLE );

                findViewById(R.id.bt_ca).setVisibility( View.VISIBLE );
                findViewById(R.id.bt_ca1).setVisibility( View.VISIBLE );
                findViewById(R.id.bt_cb).setVisibility( View.VISIBLE );
                findViewById(R.id.bt_cb1).setVisibility( View.VISIBLE );
                findViewById(R.id.bt_cc).setVisibility( View.VISIBLE );
                findViewById(R.id.bt_cc1).setVisibility( View.VISIBLE );
                findViewById(R.id.bt_cd).setVisibility( View.VISIBLE );
                findViewById(R.id.bt_cd1).setVisibility( View.VISIBLE );
                findViewById(R.id.bt_ce).setVisibility( View.VISIBLE );
                findViewById(R.id.bt_ce1).setVisibility( View.VISIBLE );
                findViewById(R.id.bt_cf).setVisibility( View.VISIBLE );
                findViewById(R.id.bt_cf1).setVisibility( View.VISIBLE );

                findViewById(R.id.iv_ca).setVisibility( View.VISIBLE );
                findViewById(R.id.iv_cb).setVisibility( View.VISIBLE );
                findViewById(R.id.iv_cc).setVisibility( View.VISIBLE );
                findViewById(R.id.iv_cd).setVisibility( View.VISIBLE );
                findViewById(R.id.iv_ce).setVisibility( View.VISIBLE );
                findViewById(R.id.iv_cf).setVisibility( View.VISIBLE );

                findViewById(R.id.tV_ca).setVisibility( View.VISIBLE );
                findViewById(R.id.tV_cb).setVisibility( View.VISIBLE );
                findViewById(R.id.tV_cc).setVisibility( View.VISIBLE );
                findViewById(R.id.tV_cd).setVisibility( View.VISIBLE );
                findViewById(R.id.tV_ce).setVisibility( View.VISIBLE );
                findViewById(R.id.tV_cf).setVisibility( View.VISIBLE );

                findViewById(R.id.bt_da).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_da1).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_db).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_db1).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_dc).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_dc1).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_dd).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_dd1).setVisibility( View.INVISIBLE );


                findViewById(R.id.iv_da).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_db).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_dc).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_dd).setVisibility( View.INVISIBLE );

                findViewById(R.id.tV_da).setVisibility( View.INVISIBLE );
                findViewById(R.id.tV_db).setVisibility( View.INVISIBLE );
                findViewById(R.id.tV_dc).setVisibility( View.INVISIBLE );
                findViewById(R.id.tV_dd).setVisibility( View.INVISIBLE );
                break;
        }
    }
    public void onClick4(View v)
    {
        switch( v.getId() )
        {
            case R.id.bt_4:
                // 顯示文字)
                findViewById(R.id.bt_aa).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_ab).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_ac).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_ad).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_ae).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_af).setVisibility( View.INVISIBLE );

                findViewById(R.id.iv_aa).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_ab).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_ac).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_ad).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_ae).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_af).setVisibility( View.INVISIBLE );

                findViewById(R.id.bt_ba).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_bb).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_bc).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_bd).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_be).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_bf).setVisibility( View.INVISIBLE );

                findViewById(R.id.iv_ba).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_bb).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_bc).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_bd).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_be).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_bf).setVisibility( View.INVISIBLE );

                findViewById(R.id.bt_ca).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_ca1).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_cb).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_cb1).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_cc).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_cc1).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_cd).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_cd1).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_ce).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_ce1).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_cf).setVisibility( View.INVISIBLE );
                findViewById(R.id.bt_cf1).setVisibility( View.INVISIBLE );

                findViewById(R.id.iv_ca).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_cb).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_cc).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_cd).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_ce).setVisibility( View.INVISIBLE );
                findViewById(R.id.iv_cf).setVisibility( View.INVISIBLE );

                findViewById(R.id.tV_ca).setVisibility( View.INVISIBLE );
                findViewById(R.id.tV_cb).setVisibility( View.INVISIBLE );
                findViewById(R.id.tV_cc).setVisibility( View.INVISIBLE );
                findViewById(R.id.tV_cd).setVisibility( View.INVISIBLE );
                findViewById(R.id.tV_ce).setVisibility( View.INVISIBLE );
                findViewById(R.id.tV_cf).setVisibility( View.INVISIBLE );

                findViewById(R.id.bt_da).setVisibility( View.VISIBLE );
                findViewById(R.id.bt_da1).setVisibility( View.VISIBLE );
                findViewById(R.id.bt_db).setVisibility( View.VISIBLE );
                findViewById(R.id.bt_db1).setVisibility( View.VISIBLE );
                findViewById(R.id.bt_dc).setVisibility( View.VISIBLE );
                findViewById(R.id.bt_dc1).setVisibility( View.VISIBLE );
                findViewById(R.id.bt_dd).setVisibility( View.VISIBLE );
                findViewById(R.id.bt_dd1).setVisibility( View.VISIBLE );


                findViewById(R.id.iv_da).setVisibility( View.VISIBLE );
                findViewById(R.id.iv_db).setVisibility( View.VISIBLE );
                findViewById(R.id.iv_dc).setVisibility( View.VISIBLE );
                findViewById(R.id.iv_dd).setVisibility( View.VISIBLE );

                findViewById(R.id.tV_da).setVisibility( View.VISIBLE );
                findViewById(R.id.tV_db).setVisibility( View.VISIBLE );
                findViewById(R.id.tV_dc).setVisibility( View.VISIBLE );
                findViewById(R.id.tV_dd).setVisibility( View.VISIBLE );
                break;
        }
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

        }
    };

    }

