
package com.example.easyeatproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.StrictMode;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class BackStageFoodPage extends AppCompatActivity {

    private DatabaseReference rootDatabaseref,rootDatabaseref1,rootDatabaseref2,rootDatabaseref3,rootDatabaseref4,rootDatabaseref5,rootDatabaseref6,rootDatabaseref7,rootDatabaseref8,rootDatabaseref9,rootDatabaseref10;
    private DatabaseReference rootDatabaseref11,rootDatabaseref12,rootDatabaseref13,rootDatabaseref14,rootDatabaseref15,rootDatabaseref16,rootDatabaseref17,rootDatabaseref18,rootDatabaseref19,rootDatabaseref20;
    private DatabaseReference rootDatabaseref21,rootDatabaseref22,rootDatabaseref23,rootDatabaseref24,rootDatabaseref25,rootDatabaseref26,rootDatabaseref27,rootDatabaseref28,rootDatabaseref29,rootDatabaseref30;
    private DatabaseReference rootDatabaseref31;
    TextView textView,textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11,textView12,textView13,textView14,textView15,textView16,textView17,textView18,textView19,textView20,textView21,textView22,textView23,textView24,textView25,textView26,textView27,textView28,textView29,textView30,textView31;
    Button button1;
    CheckBox checkBox;
    WebView webView;
    String url = "http://88757johnny.byethost33.com/";
    CookieManager cookieManager;
    String cookieStr;
    Context context =this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_stage_food_page);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);//設定螢幕不隨手機旋轉
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//螢幕保持橫向

        button1 = (Button) findViewById(R.id.button11);
        textView = (TextView) findViewById(R.id.Text_1);
        textView1 = (TextView) findViewById(R.id.Text_2);
        textView2 = (TextView) findViewById(R.id.Text_3);
        textView3 = (TextView) findViewById(R.id.Text_4);
        textView4 = (TextView) findViewById(R.id.Text_5);
        textView5 = (TextView) findViewById(R.id.Text_6);
        textView6 = (TextView) findViewById(R.id.Text_7);
        textView7 = (TextView) findViewById(R.id.Text_8);
        textView8 = (TextView) findViewById(R.id.Text_9);
        textView9 = (TextView) findViewById(R.id.Text_10);
        textView10 = (TextView) findViewById(R.id.Text_11);
        textView11 = (TextView) findViewById(R.id.Text_12);
        textView12 = (TextView) findViewById(R.id.Text_13);
        textView13 = (TextView) findViewById(R.id.Text_14);
        textView14 = (TextView) findViewById(R.id.Text_15);
        textView15 = (TextView) findViewById(R.id.Text_16);
        textView16 = (TextView) findViewById(R.id.Text_17);
        textView17 = (TextView) findViewById(R.id.Text_18);
        textView18 = (TextView) findViewById(R.id.Text_19);
        textView19 = (TextView) findViewById(R.id.Text_20);
        textView20 = (TextView) findViewById(R.id.Text_21);
        textView21 = (TextView) findViewById(R.id.Text_22);
        textView22 = (TextView) findViewById(R.id.Text_23);
        textView23 = (TextView) findViewById(R.id.Text_24);
        textView24 = (TextView) findViewById(R.id.Text_25);
        textView25 = (TextView) findViewById(R.id.Text_26);
        textView26 = (TextView) findViewById(R.id.Text_27);
        textView27 = (TextView) findViewById(R.id.Text_28);
        textView28 = (TextView) findViewById(R.id.Text_29);
        textView29 = (TextView) findViewById(R.id.Text_30);
        textView30 = (TextView) findViewById(R.id.Text_31);
        textView31 = (TextView) findViewById(R.id.Text_32);//++
        checkBox=(CheckBox)findViewById(R.id.checkBox);
        rootDatabaseref = FirebaseDatabase.getInstance().getReference().child("Member/name");//++
        rootDatabaseref1 = FirebaseDatabase.getInstance().getReference().child("Member/name1");
        rootDatabaseref2 = FirebaseDatabase.getInstance().getReference().child("Member/name2");
        rootDatabaseref3 = FirebaseDatabase.getInstance().getReference().child("Member/name3");
        rootDatabaseref4 = FirebaseDatabase.getInstance().getReference().child("Member/name4");
        rootDatabaseref5 = FirebaseDatabase.getInstance().getReference().child("Member/name5");
        rootDatabaseref6 = FirebaseDatabase.getInstance().getReference().child("Member/name6");
        rootDatabaseref7 = FirebaseDatabase.getInstance().getReference().child("Member/name7");
        rootDatabaseref8 = FirebaseDatabase.getInstance().getReference().child("Member/name8");
        rootDatabaseref9 = FirebaseDatabase.getInstance().getReference().child("Member/name9");
        rootDatabaseref10 = FirebaseDatabase.getInstance().getReference().child("Member/name10");
        rootDatabaseref11 = FirebaseDatabase.getInstance().getReference().child("Member/name11");
        rootDatabaseref12 = FirebaseDatabase.getInstance().getReference().child("Member/name12");
        rootDatabaseref13 = FirebaseDatabase.getInstance().getReference().child("Member/name13");
        rootDatabaseref14 = FirebaseDatabase.getInstance().getReference().child("Member/name14");
        rootDatabaseref15 = FirebaseDatabase.getInstance().getReference().child("Member/name15");
        rootDatabaseref16 = FirebaseDatabase.getInstance().getReference().child("Member/name16");
        rootDatabaseref17 = FirebaseDatabase.getInstance().getReference().child("Member/name17");
        rootDatabaseref18 = FirebaseDatabase.getInstance().getReference().child("Member/name18");
        rootDatabaseref19 = FirebaseDatabase.getInstance().getReference().child("Member/name19");
        rootDatabaseref20 = FirebaseDatabase.getInstance().getReference().child("Member/name20");
        rootDatabaseref21 = FirebaseDatabase.getInstance().getReference().child("Member/name21");
        rootDatabaseref22 = FirebaseDatabase.getInstance().getReference().child("Member/name22");
        rootDatabaseref23 = FirebaseDatabase.getInstance().getReference().child("Member/name23");
        rootDatabaseref24 = FirebaseDatabase.getInstance().getReference().child("Member/name24");
        rootDatabaseref25 = FirebaseDatabase.getInstance().getReference().child("Member/name25");
        rootDatabaseref26 = FirebaseDatabase.getInstance().getReference().child("Member/name26");
        rootDatabaseref27 = FirebaseDatabase.getInstance().getReference().child("Member/name27");
        rootDatabaseref28 = FirebaseDatabase.getInstance().getReference().child("Member/name28");
        rootDatabaseref29 = FirebaseDatabase.getInstance().getReference().child("Member/name29");
        rootDatabaseref30 = FirebaseDatabase.getInstance().getReference().child("Member/name30");
        rootDatabaseref31 = FirebaseDatabase.getInstance().getReference().child("Member/name31");
        Wcookie(context);
        Handler myHandler = new Handler();
        myHandler.postDelayed(runTimerstop, 5000);
        if (cookieStr != null) {
            myHandler.removeCallbacks(runTimerstop);
        }

        Button bt_3=(Button)findViewById(R.id.bt_3);
        bt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(BackStageFoodPage.this);
                if(checkBox.isChecked()==true) {
                    alertDialog.setTitle("送餐");
                    alertDialog.setMessage("確定送餐?");
                    alertDialog.setPositiveButton("確定",((dialog, which) -> {}));
                    alertDialog.setNeutralButton("取消",((dialog, which) -> {}));
                }
                if(checkBox.isChecked()==false){
                    alertDialog.setTitle("沒勾選餐桌");
                    alertDialog.setNeutralButton("取消",((dialog, which) -> {}));
                }
                AlertDialog dialog = alertDialog.create();
                dialog.show();
                dialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener((v1 -> {
                    findViewById(R.id.Text_1).setVisibility( View.GONE );findViewById(R.id.Text_2).setVisibility( View.GONE );
                    findViewById(R.id.Text_3).setVisibility( View.GONE );findViewById(R.id.Text_4).setVisibility( View.GONE );
                    findViewById(R.id.Text_5).setVisibility( View.GONE );findViewById(R.id.Text_6).setVisibility( View.GONE );
                    findViewById(R.id.Text_7).setVisibility( View.GONE );findViewById(R.id.Text_8).setVisibility( View.GONE );
                    findViewById(R.id.Text_9).setVisibility( View.GONE );findViewById(R.id.Text_10).setVisibility( View.GONE );
                    findViewById(R.id.Text_11).setVisibility( View.GONE );findViewById(R.id.Text_12).setVisibility( View.GONE );
                    findViewById(R.id.Text_13).setVisibility( View.GONE );findViewById(R.id.Text_14).setVisibility( View.GONE );
                    findViewById(R.id.Text_15).setVisibility( View.GONE );findViewById(R.id.Text_16).setVisibility( View.GONE );
                    findViewById(R.id.Text_17).setVisibility( View.GONE );findViewById(R.id.Text_18).setVisibility( View.GONE );
                    findViewById(R.id.Text_19).setVisibility( View.GONE );findViewById(R.id.Text_20).setVisibility( View.GONE );
                    findViewById(R.id.Text_21).setVisibility( View.GONE );findViewById(R.id.Text_22).setVisibility( View.GONE );
                    findViewById(R.id.Text_23).setVisibility( View.GONE );findViewById(R.id.Text_24).setVisibility( View.GONE );
                    findViewById(R.id.Text_25).setVisibility( View.GONE );findViewById(R.id.Text_26).setVisibility( View.GONE );
                    findViewById(R.id.Text_27).setVisibility( View.GONE );findViewById(R.id.Text_28).setVisibility( View.GONE );
                    findViewById(R.id.Text_29).setVisibility( View.GONE );findViewById(R.id.Text_30).setVisibility( View.GONE );
                    findViewById(R.id.Text_31).setVisibility( View.GONE );findViewById(R.id.Text_32).setVisibility( View.GONE );
                    MySQL.sendfcm("clerk1","桌號1訂單","可出餐",cookieStr,url);
                    setToast("送餐");
                    dialog.dismiss();
                }));
                dialog.getButton(AlertDialog.BUTTON_NEUTRAL).setOnClickListener((v3 -> {
                    setToast("取消");
                    dialog.dismiss();
                }));
                dialog.setCancelable(false);
                dialog.setCanceledOnTouchOutside(false);

            }
        });
        final Animation animation = new AlphaAnimation(1, 0);
        animation.setDuration(500);
        animation.setInterpolator(new LinearInterpolator());
        animation.setRepeatCount(Animation.INFINITE);
        animation.setRepeatMode(Animation.REVERSE);


        button1.startAnimation(animation);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {v.clearAnimation();//燈號
                // v.clearAnimation();
                rootDatabaseref.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data = snapshot.getValue().toString();
                            textView.setText(data);
                            findViewById(R.id.Text_1).setVisibility(View.GONE);
                            findViewById(R.id.Text_1).setVisibility(View.VISIBLE);
                            if (data.length() == 0) {
                                findViewById(R.id.Text_1).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref1.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data1 = snapshot.getValue().toString();
                            textView1.setText(data1);
                            findViewById(R.id.Text_2).setVisibility(View.GONE);
                            findViewById(R.id.Text_2).setVisibility(View.VISIBLE);
                            if (data1.length() == 0) {
                                findViewById(R.id.Text_2).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref2.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data2 = snapshot.getValue().toString();
                            textView2.setText(data2);
                            findViewById(R.id.Text_3).setVisibility(View.GONE);
                            findViewById(R.id.Text_3).setVisibility(View.VISIBLE);
                            if (data2.length() == 0) {
                                findViewById(R.id.Text_3).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref3.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data3 = snapshot.getValue().toString();
                            textView3.setText(data3);
                            findViewById(R.id.Text_4).setVisibility(View.GONE);
                            findViewById(R.id.Text_4).setVisibility(View.VISIBLE);
                            if (data3.length() == 0) {
                                findViewById(R.id.Text_4).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref4.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data4 = snapshot.getValue().toString();
                            textView4.setText(data4);
                            findViewById(R.id.Text_5).setVisibility(View.GONE);
                            findViewById(R.id.Text_5).setVisibility(View.VISIBLE);
                            if (data4.length() == 0) {
                                findViewById(R.id.Text_5).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref5.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data5 = snapshot.getValue().toString();
                            textView5.setText(data5);
                            findViewById(R.id.Text_6).setVisibility(View.GONE);
                            findViewById(R.id.Text_6).setVisibility(View.VISIBLE);
                            if (data5.length() == 0) {
                                findViewById(R.id.Text_6).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref6.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data6 = snapshot.getValue().toString();
                            textView6.setText(data6);
                            findViewById(R.id.Text_7).setVisibility(View.GONE);
                            findViewById(R.id.Text_7).setVisibility(View.VISIBLE);
                            if (data6.length() == 0) {
                                findViewById(R.id.Text_7).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref7.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data7 = snapshot.getValue().toString();
                            textView7.setText(data7);
                            findViewById(R.id.Text_8).setVisibility(View.GONE);
                            findViewById(R.id.Text_8).setVisibility(View.VISIBLE);
                            if (data7.length() == 0) {
                                findViewById(R.id.Text_8).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref8.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data8 = snapshot.getValue().toString();
                            textView8.setText(data8);
                            findViewById(R.id.Text_9).setVisibility(View.GONE);
                            findViewById(R.id.Text_9).setVisibility(View.VISIBLE);
                            if (data8.length() == 0) {
                                findViewById(R.id.Text_9).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref9.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data9 = snapshot.getValue().toString();
                            textView9.setText(data9);
                            findViewById(R.id.Text_10).setVisibility(View.GONE);
                            findViewById(R.id.Text_10).setVisibility(View.VISIBLE);
                            if (data9.length() == 0) {
                                findViewById(R.id.Text_10).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref10.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data10 = snapshot.getValue().toString();
                            textView10.setText(data10);
                            findViewById(R.id.Text_11).setVisibility(View.GONE);
                            findViewById(R.id.Text_11).setVisibility(View.VISIBLE);
                            if (data10.length() == 0) {
                                findViewById(R.id.Text_11).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref11.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data11 = snapshot.getValue().toString();
                            textView11.setText(data11);
                            findViewById(R.id.Text_12).setVisibility(View.GONE);
                            findViewById(R.id.Text_12).setVisibility(View.VISIBLE);
                            if (data11.length() == 0) {
                                findViewById(R.id.Text_12).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref12.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data12 = snapshot.getValue().toString();
                            textView12.setText(data12);
                            findViewById(R.id.Text_13).setVisibility(View.GONE);
                            findViewById(R.id.Text_13).setVisibility(View.VISIBLE);
                            if (data12.length() == 0) {
                                findViewById(R.id.Text_13).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref13.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data13 = snapshot.getValue().toString();
                            textView13.setText(data13);
                            findViewById(R.id.Text_14).setVisibility(View.GONE);
                            findViewById(R.id.Text_14).setVisibility(View.VISIBLE);
                            if (data13.length() == 0) {
                                findViewById(R.id.Text_14).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref14.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data14 = snapshot.getValue().toString();
                            textView14.setText(data14);
                            findViewById(R.id.Text_15).setVisibility(View.GONE);
                            findViewById(R.id.Text_15).setVisibility(View.VISIBLE);
                            if (data14.length() == 0) {
                                findViewById(R.id.Text_15).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref15.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data15 = snapshot.getValue().toString();
                            textView15.setText(data15);
                            findViewById(R.id.Text_16).setVisibility(View.GONE);
                            findViewById(R.id.Text_16).setVisibility(View.VISIBLE);
                            if (data15.length() == 0) {
                                findViewById(R.id.Text_16).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref16.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data16 = snapshot.getValue().toString();
                            textView16.setText(data16);
                            findViewById(R.id.Text_17).setVisibility(View.GONE);
                            findViewById(R.id.Text_17).setVisibility(View.VISIBLE);
                            if (data16.length() == 0) {
                                findViewById(R.id.Text_17).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref17.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data17 = snapshot.getValue().toString();
                            textView17.setText(data17);
                            findViewById(R.id.Text_18).setVisibility(View.GONE);
                            findViewById(R.id.Text_18).setVisibility(View.VISIBLE);
                            if (data17.length() == 0) {
                                findViewById(R.id.Text_18).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref18.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data18 = snapshot.getValue().toString();
                            textView18.setText(data18);
                            findViewById(R.id.Text_19).setVisibility(View.GONE);
                            findViewById(R.id.Text_19).setVisibility(View.VISIBLE);
                            if (data18.length() == 0) {
                                findViewById(R.id.Text_19).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref19.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data19 = snapshot.getValue().toString();
                            textView19.setText(data19);
                            findViewById(R.id.Text_20).setVisibility(View.GONE);
                            findViewById(R.id.Text_20).setVisibility(View.VISIBLE);
                            if (data19.length() == 0) {
                                findViewById(R.id.Text_20).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref20.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data20 = snapshot.getValue().toString();
                            textView20.setText(data20);
                            findViewById(R.id.Text_21).setVisibility(View.GONE);
                            findViewById(R.id.Text_21).setVisibility(View.VISIBLE);
                            if (data20.length() == 0) {
                                findViewById(R.id.Text_21).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref21.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data21 = snapshot.getValue().toString();
                            textView21.setText(data21);
                            findViewById(R.id.Text_22).setVisibility(View.GONE);
                            findViewById(R.id.Text_22).setVisibility(View.VISIBLE);
                            if (data21.length() == 0) {
                                findViewById(R.id.Text_22).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref22.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data22 = snapshot.getValue().toString();
                            textView22.setText(data22);
                            findViewById(R.id.Text_23).setVisibility(View.GONE);
                            findViewById(R.id.Text_23).setVisibility(View.VISIBLE);
                            if (data22.length() == 0) {
                                findViewById(R.id.Text_23).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref23.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data23 = snapshot.getValue().toString();
                            textView23.setText(data23);
                            findViewById(R.id.Text_24).setVisibility(View.GONE);
                            findViewById(R.id.Text_24).setVisibility(View.VISIBLE);
                            if (data23.length() == 0) {
                                findViewById(R.id.Text_24).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref24.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data24 = snapshot.getValue().toString();
                            textView24.setText(data24);
                            findViewById(R.id.Text_25).setVisibility(View.GONE);
                            findViewById(R.id.Text_25).setVisibility(View.VISIBLE);
                            if (data24.length() == 0) {
                                findViewById(R.id.Text_25).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref25.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data25 = snapshot.getValue().toString();
                            textView25.setText(data25);
                            findViewById(R.id.Text_26).setVisibility(View.GONE);
                            findViewById(R.id.Text_26).setVisibility(View.VISIBLE);
                            if (data25.length() == 0) {
                                findViewById(R.id.Text_26).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref26.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data26 = snapshot.getValue().toString();
                            textView26.setText(data26);
                            findViewById(R.id.Text_27).setVisibility(View.GONE);
                            findViewById(R.id.Text_27).setVisibility(View.VISIBLE);
                            if (data26.length() == 0) {
                                findViewById(R.id.Text_27).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref27.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data27 = snapshot.getValue().toString();
                            textView27.setText(data27);
                            findViewById(R.id.Text_28).setVisibility(View.GONE);
                            findViewById(R.id.Text_28).setVisibility(View.VISIBLE);
                            if (data27.length() == 0) {
                                findViewById(R.id.Text_28).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref28.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data28 = snapshot.getValue().toString();
                            textView28.setText(data28);
                            findViewById(R.id.Text_29).setVisibility(View.GONE);
                            findViewById(R.id.Text_29).setVisibility(View.VISIBLE);
                            if (data28.length() == 0) {
                                findViewById(R.id.Text_29).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref29.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data29 = snapshot.getValue().toString();
                            textView29.setText(data29);
                            findViewById(R.id.Text_30).setVisibility(View.GONE);
                            findViewById(R.id.Text_30).setVisibility(View.VISIBLE);
                            if (data29.length() == 0) {
                                findViewById(R.id.Text_30).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref30.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data30 = snapshot.getValue().toString();
                            textView30.setText(data30);
                            findViewById(R.id.Text_31).setVisibility(View.GONE);
                            findViewById(R.id.Text_31).setVisibility(View.VISIBLE);
                            if (data30.length() == 0) {
                                findViewById(R.id.Text_31).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
                rootDatabaseref31.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if (snapshot.exists()) {
                            String data31 = snapshot.getValue().toString();
                            textView31.setText(data31);
                            findViewById(R.id.Text_32).setVisibility(View.GONE);
                            findViewById(R.id.Text_32).setVisibility(View.VISIBLE);
                            if (data31.length() == 0) {
                                findViewById(R.id.Text_32).setVisibility(View.GONE);
                            }
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
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
    private void setToast (String text){
        Toast.makeText(BackStageFoodPage.this, text, Toast.LENGTH_SHORT).show();
    }
}