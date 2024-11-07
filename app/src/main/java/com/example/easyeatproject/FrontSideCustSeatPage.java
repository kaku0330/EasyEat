package com.example.easyeatproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class FrontSideCustSeatPage extends AppCompatActivity {

    private DatabaseReference rootDatabaseref,rootDatabaseref1,rootDatabaseref2,rootDatabaseref3,rootDatabaseref4,rootDatabaseref5,rootDatabaseref6,rootDatabaseref7,rootDatabaseref8,rootDatabaseref9,rootDatabaseref10;
    private DatabaseReference rootDatabaseref11,rootDatabaseref12,rootDatabaseref13,rootDatabaseref14,rootDatabaseref15,rootDatabaseref16,rootDatabaseref17,rootDatabaseref18,rootDatabaseref19,rootDatabaseref20;
    private DatabaseReference rootDatabaseref21,rootDatabaseref22,rootDatabaseref23,rootDatabaseref24,rootDatabaseref25,rootDatabaseref26,rootDatabaseref27,rootDatabaseref28,rootDatabaseref29,rootDatabaseref30;
    private DatabaseReference rootDatabaseref31,rootDatabaseref32;
    TextView textView,textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11,textView12,textView13,textView14,textView15,textView16,textView17,textView18,textView19,textView20,textView21,textView22,textView23,textView24,textView25,textView26,textView27,textView28,textView29,textView30,textView31,textView32;
    Button bt_1,bt2,bt3,bt8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_side_cust_seat_page);



        bt_1 = (Button) findViewById(R.id.bt_1);
        bt2 = (Button) findViewById(R.id.bt_2);
        bt3 = (Button) findViewById(R.id.bt_3);
        bt8= (Button) findViewById(R.id.bt_8);
        textView = (TextView)findViewById(R.id.tv1);textView1 = (TextView)findViewById(R.id.tv2);textView2 = (TextView)findViewById(R.id.tv3);
        textView3= (TextView)findViewById(R.id.tv4);textView4 = (TextView)findViewById(R.id.tv5);textView5 = (TextView)findViewById(R.id.tv6);
        textView6 = (TextView)findViewById(R.id.tv7);textView7 = (TextView)findViewById(R.id.tv8);textView8 = (TextView)findViewById(R.id.tv9);
        textView9 = (TextView)findViewById(R.id.tv10);textView10 = (TextView)findViewById(R.id.tv11);textView11 = (TextView)findViewById(R.id.tv12);
        textView12 = (TextView)findViewById(R.id.tv13);textView13 = (TextView)findViewById(R.id.tv14);textView14 = (TextView)findViewById(R.id.tv15);
        textView15 = (TextView)findViewById(R.id.tv16);textView16 = (TextView)findViewById(R.id.tv17);textView17 = (TextView)findViewById(R.id.tv18);
        textView18 = (TextView)findViewById(R.id.tv19);textView19 = (TextView)findViewById(R.id.tv20);textView20 = (TextView)findViewById(R.id.tv21);
        textView21 = (TextView)findViewById(R.id.tv22);textView22 = (TextView)findViewById(R.id.tv23);textView23 = (TextView)findViewById(R.id.tv24);
        textView24 = (TextView)findViewById(R.id.tv25);textView25 = (TextView)findViewById(R.id.tv26);textView26 = (TextView)findViewById(R.id.tv27);
        textView27 = (TextView)findViewById(R.id.tv28);textView28 = (TextView)findViewById(R.id.tv29);textView29 = (TextView)findViewById(R.id.tv30);
        textView30 = (TextView)findViewById(R.id.tv31);textView31 = (TextView)findViewById(R.id.tv32);textView32 = (TextView)findViewById(R.id.textView12);//++

        rootDatabaseref= FirebaseDatabase.getInstance().getReference().child("Member/name");//++
        rootDatabaseref1= FirebaseDatabase.getInstance().getReference().child("Member/name1");
        rootDatabaseref2= FirebaseDatabase.getInstance().getReference().child("Member/name2");
        rootDatabaseref3= FirebaseDatabase.getInstance().getReference().child("Member/name3");
        rootDatabaseref4= FirebaseDatabase.getInstance().getReference().child("Member/name4");
        rootDatabaseref5= FirebaseDatabase.getInstance().getReference().child("Member/name5");
        rootDatabaseref6= FirebaseDatabase.getInstance().getReference().child("Member/name6");
        rootDatabaseref7= FirebaseDatabase.getInstance().getReference().child("Member/name7");
        rootDatabaseref8= FirebaseDatabase.getInstance().getReference().child("Member/name8");
        rootDatabaseref9= FirebaseDatabase.getInstance().getReference().child("Member/name9");
        rootDatabaseref10= FirebaseDatabase.getInstance().getReference().child("Member/name10");
        rootDatabaseref11= FirebaseDatabase.getInstance().getReference().child("Member/name11");
        rootDatabaseref12= FirebaseDatabase.getInstance().getReference().child("Member/name12");
        rootDatabaseref13= FirebaseDatabase.getInstance().getReference().child("Member/name13");
        rootDatabaseref14= FirebaseDatabase.getInstance().getReference().child("Member/name14");
        rootDatabaseref15= FirebaseDatabase.getInstance().getReference().child("Member/name15");
        rootDatabaseref16= FirebaseDatabase.getInstance().getReference().child("Member/name16");
        rootDatabaseref17= FirebaseDatabase.getInstance().getReference().child("Member/name17");
        rootDatabaseref18= FirebaseDatabase.getInstance().getReference().child("Member/name18");
        rootDatabaseref19= FirebaseDatabase.getInstance().getReference().child("Member/name19");
        rootDatabaseref20= FirebaseDatabase.getInstance().getReference().child("Member/name20");
        rootDatabaseref21= FirebaseDatabase.getInstance().getReference().child("Member/name21");
        rootDatabaseref22= FirebaseDatabase.getInstance().getReference().child("Member/name22");
        rootDatabaseref23= FirebaseDatabase.getInstance().getReference().child("Member/name23");
        rootDatabaseref24= FirebaseDatabase.getInstance().getReference().child("Member/name24");
        rootDatabaseref25= FirebaseDatabase.getInstance().getReference().child("Member/name25");
        rootDatabaseref26= FirebaseDatabase.getInstance().getReference().child("Member/name26");
        rootDatabaseref27= FirebaseDatabase.getInstance().getReference().child("Member/name27");
        rootDatabaseref28= FirebaseDatabase.getInstance().getReference().child("Member/name28");
        rootDatabaseref29= FirebaseDatabase.getInstance().getReference().child("Member/name29");
        rootDatabaseref30= FirebaseDatabase.getInstance().getReference().child("Member/name30");
        rootDatabaseref31= FirebaseDatabase.getInstance().getReference().child("Member/name31");
        rootDatabaseref32= FirebaseDatabase.getInstance().getReference().child("Member/name32");

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);//設定螢幕不隨手機旋轉
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//螢幕保持橫向


        Button bt8 = (Button) findViewById(R.id.bt_8);
        bt8 = (Button) findViewById(R.id.bt_8);
        bt8.setOnClickListener((v) -> {
            Intent intent = new Intent();
            intent.setClass(FrontSideCustSeatPage.this, FrontSideCheckout.class);
            startActivity(intent);
        });


        final Animation animation = new AlphaAnimation(1, 0);
        animation.setDuration(500);
        animation.setInterpolator(new LinearInterpolator());
        animation.setRepeatCount(Animation.INFINITE);
        animation.setRepeatMode(Animation.REVERSE);


        bt_1.startAnimation(animation);


        bt_1.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) { v.clearAnimation();//燈號
                                        // v.clearAnimation();
                                        rootDatabaseref.addValueEventListener(new ValueEventListener() {
                                            @Override
                                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                                if (snapshot.exists())
                                                {
                                                    String data = snapshot.getValue().toString();
                                                    textView.setText(data);
                                                    findViewById(R.id.tv1).setVisibility(View.GONE);
                                                    findViewById(R.id.tv1).setVisibility(View.VISIBLE);
                                                    TextView tv1= (TextView)findViewById(R.id.tv1);
                                                    if (data.length() == 0) {
                                                        findViewById(R.id.tv1).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data1 = snapshot.getValue().toString(); //從資料庫抓資料後放進data1
                                                    textView1.setText(data1);
                                                    findViewById(R.id.tv2).setVisibility(View.GONE);
                                                    findViewById(R.id.tv2).setVisibility(View.VISIBLE);
                                                    TextView tv2= (TextView)findViewById(R.id.tv2);//例:text質是 芒果牛奶冰　　　　　　3　　　　　　　390
                                                    if (data1.length() == 0) {  //判段text是否是""
                                                        findViewById(R.id.tv2).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data2 = snapshot.getValue().toString();
                                                    textView2.setText(data2);
                                                    findViewById(R.id.tv3).setVisibility(View.GONE);
                                                    findViewById(R.id.tv3).setVisibility(View.VISIBLE);
                                                    TextView tv3= (TextView)findViewById(R.id.tv3);
                                                    if (data2.length() == 0) {
                                                        findViewById(R.id.tv3).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data3 = snapshot.getValue().toString();
                                                    textView3.setText(data3);
                                                    findViewById(R.id.tv4).setVisibility(View.GONE);
                                                    findViewById(R.id.tv4).setVisibility(View.VISIBLE);
                                                    TextView tv4= (TextView)findViewById(R.id.tv4);
                                                    if (data3.length() == 0) {
                                                        findViewById(R.id.tv4).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data4 = snapshot.getValue().toString();
                                                    textView4.setText(data4);
                                                    findViewById(R.id.tv5).setVisibility(View.GONE);
                                                    findViewById(R.id.tv5).setVisibility(View.VISIBLE);
                                                    TextView tv5= (TextView)findViewById(R.id.tv5);
                                                    if (data4.length() == 0) {
                                                        findViewById(R.id.tv5).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data5 = snapshot.getValue().toString();
                                                    textView5.setText(data5);
                                                    findViewById(R.id.tv6).setVisibility(View.GONE);
                                                    findViewById(R.id.tv6).setVisibility(View.VISIBLE);
                                                    TextView tv6= (TextView)findViewById(R.id.tv6);
                                                    if (data5.length() == 0) {
                                                        findViewById(R.id.tv6).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data6 = snapshot.getValue().toString();
                                                    textView6.setText(data6);
                                                    TextView tv7= (TextView)findViewById(R.id.tv7);
                                                    findViewById(R.id.tv7).setVisibility(View.GONE);
                                                    findViewById(R.id.tv7).setVisibility(View.VISIBLE);
                                                    if (data6.length() == 0) {
                                                        findViewById(R.id.tv7).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data7 = snapshot.getValue().toString();
                                                    textView7.setText(data7);
                                                    findViewById(R.id.tv8).setVisibility(View.GONE);
                                                    findViewById(R.id.tv8).setVisibility(View.VISIBLE);
                                                    TextView tv8= (TextView)findViewById(R.id.tv8);
                                                    if (data7.length() == 0) {
                                                        findViewById(R.id.tv8).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data8 = snapshot.getValue().toString();
                                                    textView8.setText(data8);
                                                    findViewById(R.id.tv9).setVisibility(View.GONE);
                                                    findViewById(R.id.tv9).setVisibility(View.VISIBLE);
                                                    TextView tv9= (TextView)findViewById(R.id.tv9);
                                                    if (data8.length() == 0) {
                                                        findViewById(R.id.tv9).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data9 = snapshot.getValue().toString();
                                                    textView9.setText(data9);
                                                    findViewById(R.id.tv10).setVisibility(View.GONE);
                                                    findViewById(R.id.tv10).setVisibility(View.VISIBLE);
                                                    TextView tv10= (TextView)findViewById(R.id.tv10);
                                                    if (data9.length() == 0) {
                                                        findViewById(R.id.tv10).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data10 = snapshot.getValue().toString();
                                                    textView10.setText(data10);
                                                    findViewById(R.id.tv11).setVisibility(View.GONE);
                                                    findViewById(R.id.tv11).setVisibility(View.VISIBLE);
                                                    TextView tv11= (TextView)findViewById(R.id.tv11);
                                                    if (data10.length() == 0) {
                                                        findViewById(R.id.tv11).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data11 = snapshot.getValue().toString();
                                                    textView11.setText(data11);
                                                    findViewById(R.id.tv12).setVisibility(View.GONE);
                                                    findViewById(R.id.tv12).setVisibility(View.VISIBLE);
                                                    TextView tv12= (TextView)findViewById(R.id.tv12);
                                                    if (data11.length() == 0) {
                                                        findViewById(R.id.tv12).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data12 = snapshot.getValue().toString();
                                                    textView12.setText(data12);
                                                    findViewById(R.id.tv13).setVisibility(View.GONE);
                                                    findViewById(R.id.tv13).setVisibility(View.VISIBLE);
                                                    TextView tv13= (TextView)findViewById(R.id.tv13);
                                                    if (data12.length() == 0) {
                                                        findViewById(R.id.tv13).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data13 = snapshot.getValue().toString();
                                                    textView13.setText(data13);
                                                    findViewById(R.id.tv14).setVisibility(View.GONE);
                                                    findViewById(R.id.tv14).setVisibility(View.VISIBLE);
                                                    TextView tv14= (TextView)findViewById(R.id.tv14);
                                                    if (data13.length() == 0) {
                                                        findViewById(R.id.tv14).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data14 = snapshot.getValue().toString();
                                                    textView14.setText(data14);
                                                    findViewById(R.id.tv15).setVisibility(View.GONE);
                                                    findViewById(R.id.tv15).setVisibility(View.VISIBLE);
                                                    TextView tv15= (TextView)findViewById(R.id.tv15);
                                                    if (data14.length() == 0) {
                                                        findViewById(R.id.tv15).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data15 = snapshot.getValue().toString();
                                                    textView15.setText(data15);
                                                    findViewById(R.id.tv16).setVisibility(View.GONE);
                                                    findViewById(R.id.tv16).setVisibility(View.VISIBLE);
                                                    TextView tv16= (TextView)findViewById(R.id.tv16);
                                                    if (data15.length() == 0) {
                                                        findViewById(R.id.tv16).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data16 = snapshot.getValue().toString();
                                                    textView16.setText(data16);
                                                    findViewById(R.id.tv17).setVisibility(View.GONE);
                                                    findViewById(R.id.tv17).setVisibility(View.VISIBLE);
                                                    TextView tv17= (TextView)findViewById(R.id.tv17);
                                                    if (data16.length() == 0) {
                                                        findViewById(R.id.tv17).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data17 = snapshot.getValue().toString();
                                                    textView17.setText(data17);
                                                    findViewById(R.id.tv18).setVisibility(View.GONE);
                                                    findViewById(R.id.tv18).setVisibility(View.VISIBLE);
                                                    TextView tv18= (TextView)findViewById(R.id.tv18);
                                                    if (data17.length() == 0) {
                                                        findViewById(R.id.tv18).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data18 = snapshot.getValue().toString();
                                                    textView18.setText(data18);
                                                    findViewById(R.id.tv19).setVisibility(View.GONE);
                                                    findViewById(R.id.tv19).setVisibility(View.VISIBLE);
                                                    TextView tv19= (TextView)findViewById(R.id.tv19);
                                                    if (data18.length() == 0) {
                                                        findViewById(R.id.tv19).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data19 = snapshot.getValue().toString();
                                                    textView19.setText(data19);
                                                    findViewById(R.id.tv20).setVisibility(View.GONE);
                                                    findViewById(R.id.tv20).setVisibility(View.VISIBLE);
                                                    TextView tv20= (TextView)findViewById(R.id.tv20);
                                                    if (data19.length() == 0) {
                                                        findViewById(R.id.tv20).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data20 = snapshot.getValue().toString();
                                                    textView20.setText(data20);
                                                    findViewById(R.id.tv21).setVisibility(View.GONE);
                                                    findViewById(R.id.tv21).setVisibility(View.VISIBLE);
                                                    TextView tv21= (TextView)findViewById(R.id.tv21);
                                                    if (data20.length() == 0) {
                                                        findViewById(R.id.tv21).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data21 = snapshot.getValue().toString();
                                                    textView21.setText(data21);
                                                    findViewById(R.id.tv22).setVisibility(View.GONE);
                                                    findViewById(R.id.tv22).setVisibility(View.VISIBLE);
                                                    TextView tv22= (TextView)findViewById(R.id.tv22);
                                                    if (data21.length() == 0) {
                                                        findViewById(R.id.tv22).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data22 = snapshot.getValue().toString();
                                                    textView22.setText(data22);
                                                    findViewById(R.id.tv23).setVisibility(View.GONE);
                                                    findViewById(R.id.tv23).setVisibility(View.VISIBLE);
                                                    TextView tv23= (TextView)findViewById(R.id.tv23);
                                                    if (data22.length() == 0) {
                                                        findViewById(R.id.tv23).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data23 = snapshot.getValue().toString();
                                                    textView23.setText(data23);
                                                    findViewById(R.id.tv24).setVisibility(View.GONE);
                                                    findViewById(R.id.tv24).setVisibility(View.VISIBLE);
                                                    TextView tv24= (TextView)findViewById(R.id.tv24);
                                                    if (data23.length() == 0) {
                                                        findViewById(R.id.tv24).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data24 = snapshot.getValue().toString();
                                                    textView24.setText(data24);
                                                    findViewById(R.id.tv25).setVisibility(View.GONE);
                                                    findViewById(R.id.tv25).setVisibility(View.VISIBLE);
                                                    TextView tv25 = (TextView)findViewById(R.id.tv25);
                                                    if (data24.length() == 0) {
                                                        findViewById(R.id.tv25).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data25 = snapshot.getValue().toString();
                                                    textView25.setText(data25);
                                                    findViewById(R.id.tv26).setVisibility(View.GONE);
                                                    findViewById(R.id.tv26).setVisibility(View.VISIBLE);
                                                    TextView tv26= (TextView)findViewById(R.id.tv26);
                                                    if (data25.length() == 0) {
                                                        findViewById(R.id.tv26).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data26 = snapshot.getValue().toString();
                                                    textView26.setText(data26);
                                                    findViewById(R.id.tv27).setVisibility(View.GONE);
                                                    findViewById(R.id.tv27).setVisibility(View.VISIBLE);
                                                    TextView tv27= (TextView)findViewById(R.id.tv27);
                                                    if (data26.length() == 0) {
                                                        findViewById(R.id.tv27).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data27 = snapshot.getValue().toString();
                                                    textView27.setText(data27);
                                                    findViewById(R.id.tv28).setVisibility(View.GONE);
                                                    findViewById(R.id.tv28).setVisibility(View.VISIBLE);
                                                    TextView tv28= (TextView)findViewById(R.id.tv28);
                                                    if (data27.length() == 0) {
                                                        findViewById(R.id.tv28).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data28 = snapshot.getValue().toString();
                                                    textView28.setText(data28);
                                                    findViewById(R.id.tv29).setVisibility(View.GONE);
                                                    findViewById(R.id.tv29).setVisibility(View.VISIBLE);
                                                    TextView tv29= (TextView)findViewById(R.id.tv29);
                                                    if (data28.length() == 0) {
                                                        findViewById(R.id.tv29).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data29 = snapshot.getValue().toString();
                                                    textView29.setText(data29);
                                                    findViewById(R.id.tv30).setVisibility(View.GONE);
                                                    findViewById(R.id.tv30).setVisibility(View.VISIBLE);
                                                    TextView tv30= (TextView)findViewById(R.id.tv30);
                                                    if (data29.length() == 0) {
                                                        findViewById(R.id.tv30).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data30 = snapshot.getValue().toString();
                                                    textView30.setText(data30);
                                                    findViewById(R.id.tv31).setVisibility(View.GONE);
                                                    findViewById(R.id.tv31).setVisibility(View.VISIBLE);
                                                    TextView tv31= (TextView)findViewById(R.id.tv31);
                                                    if (data30.length() == 0) {
                                                        findViewById(R.id.tv31).setVisibility(View.GONE);
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
                                                if (snapshot.exists())
                                                {
                                                    String data31 = snapshot.getValue().toString();
                                                    textView31.setText(data31);
                                                    findViewById(R.id.tv32).setVisibility(View.GONE);
                                                    findViewById(R.id.tv32).setVisibility(View.VISIBLE);
                                                    TextView tv32= (TextView)findViewById(R.id.tv32);
                                                    if (data31.length() == 0) {
                                                        findViewById(R.id.tv32).setVisibility(View.GONE);
                                                    }

                                                }
                                            }

                                            @Override
                                            public void onCancelled(@NonNull DatabaseError error) {

                                            }
                                        });
                                        rootDatabaseref32.addValueEventListener(new ValueEventListener() {
                                            @Override
                                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                                if (snapshot.exists())
                                                {
                                                    String data32 = snapshot.getValue().toString();
                                                    textView32.setText(data32);
                                                }
                                            }

                                            @Override
                                            public void onCancelled(@NonNull DatabaseError error) {

                                            }
                                        });
                                    }
                                });


                bt2.setOnClickListener(new View.OnClickListener() {

                    @Override

                    public void onClick(final View view) {

                        //view.clearAnimation();

                    }
                });

            }
        }
