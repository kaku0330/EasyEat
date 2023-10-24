package com.example.easyeatproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FrontSideCheckout extends AppCompatActivity {

    private DatabaseReference rootDatabaseref, rootDatabaseref1, rootDatabaseref2, rootDatabaseref3, rootDatabaseref4, rootDatabaseref5, rootDatabaseref6, rootDatabaseref7, rootDatabaseref8, rootDatabaseref9, rootDatabaseref10;
    private DatabaseReference rootDatabaseref11, rootDatabaseref12, rootDatabaseref13, rootDatabaseref14, rootDatabaseref15, rootDatabaseref16, rootDatabaseref17, rootDatabaseref18, rootDatabaseref19, rootDatabaseref20;
    private DatabaseReference rootDatabaseref21, rootDatabaseref22, rootDatabaseref23, rootDatabaseref24, rootDatabaseref25, rootDatabaseref26, rootDatabaseref27, rootDatabaseref28, rootDatabaseref29, rootDatabaseref30;
    private DatabaseReference rootDatabaseref31, rootDatabaseref32;
    TextView textView, textView1, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, textView21, textView22, textView23, textView24, textView25, textView26, textView27, textView28, textView29, textView30, textView31, textView32;
    Button button12;
    FirebaseDatabase rootNode;
    DatabaseReference reference;
    Member member;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_side_checkout);
        button12 = (Button) findViewById(R.id.button12);
        textView = (TextView) findViewById(R.id.textV_1);
        textView1 = (TextView) findViewById(R.id.textV_2);
        textView2 = (TextView) findViewById(R.id.textV_3);
        textView3 = (TextView) findViewById(R.id.textV_4);
        textView4 = (TextView) findViewById(R.id.textV_5);
        textView5 = (TextView) findViewById(R.id.textV_6);
        textView6 = (TextView) findViewById(R.id.textV_7);
        textView7 = (TextView) findViewById(R.id.textV_8);
        textView8 = (TextView) findViewById(R.id.textV_9);
        textView9 = (TextView) findViewById(R.id.textV_10);
        textView10 = (TextView) findViewById(R.id.textV_11);
        textView11 = (TextView) findViewById(R.id.textV_12);
        textView12 = (TextView) findViewById(R.id.textV_13);
        textView13 = (TextView) findViewById(R.id.textV_14);
        textView14 = (TextView) findViewById(R.id.textV_15);
        textView15 = (TextView) findViewById(R.id.textV_16);
        textView16 = (TextView) findViewById(R.id.textV_17);
        textView17 = (TextView) findViewById(R.id.textV_18);
        textView18 = (TextView) findViewById(R.id.textV_19);
        textView19 = (TextView) findViewById(R.id.textV_20);
        textView20 = (TextView) findViewById(R.id.textV_21);
        textView21 = (TextView) findViewById(R.id.textV_22);
        textView22 = (TextView) findViewById(R.id.textV_23);
        textView23 = (TextView) findViewById(R.id.textV_24);
        textView24 = (TextView) findViewById(R.id.textV_25);
        textView25 = (TextView) findViewById(R.id.textV_26);
        textView26 = (TextView) findViewById(R.id.textV_27);
        textView27 = (TextView) findViewById(R.id.textV_28);
        textView28 = (TextView) findViewById(R.id.textV_29);
        textView29 = (TextView) findViewById(R.id.textV_30);
        textView30 = (TextView) findViewById(R.id.textV_31);
        textView31 = (TextView) findViewById(R.id.textV_32);
        textView32 = (TextView) findViewById(R.id.textView14);


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
        rootDatabaseref32 = FirebaseDatabase.getInstance().getReference().child("Member/name32");


        Button bt_1 = (Button) findViewById(R.id.bt_1);
        bt_1 = (Button) findViewById(R.id.bt_1);
        bt_1.setOnClickListener((v) -> {
            Intent intent = new Intent();
            intent.setClass(FrontSideCheckout.this, FrontSideCustSeatPage.class);
            startActivity(intent);
        });

        Button button1 = (Button) findViewById(R.id.button1);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener((v) -> {
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(FrontSideCheckout.this);
            TextView textView0  = (TextView) findViewById(R.id.textView14);
                alertDialog.setTitle("結帳");
                alertDialog.setMessage(textView0.getText()+"元");
                alertDialog.setPositiveButton("確定",((dialog, which) -> {}));
            alertDialog.setNeutralButton("取消",((dialog, which) -> {}));
            AlertDialog dialog = alertDialog.create();
            dialog.show();
            dialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(v1 -> {
                reference =FirebaseDatabase.getInstance().getReference().child("Member");
                member = new Member();

                ((TextView)findViewById(R.id.textV_1)).setText("");((TextView)findViewById(R.id.textV_2)).setText("");((TextView)findViewById(R.id.textV_3)).setText("");
                ((TextView)findViewById(R.id.textV_4)).setText("");((TextView)findViewById(R.id.textV_5)).setText("");((TextView)findViewById(R.id.textV_6)).setText("");
                ((TextView)findViewById(R.id.textV_7)).setText("");((TextView)findViewById(R.id.textV_8)).setText("");((TextView)findViewById(R.id.textV_9)).setText("");
                ((TextView)findViewById(R.id.textV_10)).setText("");((TextView)findViewById(R.id.textV_11)).setText("");((TextView)findViewById(R.id.textV_12)).setText("");
                ((TextView)findViewById(R.id.textV_13)).setText("");((TextView)findViewById(R.id.textV_14)).setText("");((TextView)findViewById(R.id.textV_15)).setText("");
                ((TextView)findViewById(R.id.textV_16)).setText("");((TextView)findViewById(R.id.textV_17)).setText("");((TextView)findViewById(R.id.textV_18)).setText("");
                ((TextView)findViewById(R.id.textV_19)).setText("");((TextView)findViewById(R.id.textV_20)).setText("");((TextView)findViewById(R.id.textV_21)).setText("");
                ((TextView)findViewById(R.id.textV_22)).setText("");((TextView)findViewById(R.id.textV_23)).setText("");((TextView)findViewById(R.id.textV_24)).setText("");
                ((TextView)findViewById(R.id.textV_25)).setText("");((TextView)findViewById(R.id.textV_26)).setText("");((TextView)findViewById(R.id.textV_27)).setText("");
                ((TextView)findViewById(R.id.textV_28)).setText("");((TextView)findViewById(R.id.textV_29)).setText("");((TextView)findViewById(R.id.textV_30)).setText("");
                ((TextView)findViewById(R.id.textV_31)).setText("");((TextView)findViewById(R.id.textV_32)).setText("");((TextView)findViewById(R.id.textView14)).setText("0");

                String name=(textView.getText().toString().trim());String name1=(textView1.getText().toString().trim());String name2=(textView2.getText().toString().trim());//++
                String name3=(textView3.getText().toString().trim());String name4=(textView4.getText().toString().trim());String name5=(textView5.getText().toString().trim());
                String name6=(textView6.getText().toString().trim());String name7=(textView7.getText().toString().trim());String name8=(textView8.getText().toString().trim());
                String name9=(textView9.getText().toString().trim());String name10=(textView10.getText().toString().trim());String name11=(textView11.getText().toString().trim());
                String name12=(textView12.getText().toString().trim());String name13=(textView13.getText().toString().trim());String name14=(textView14.getText().toString().trim());
                String name15=(textView15.getText().toString().trim());String name16=(textView16.getText().toString().trim());String name17=(textView17.getText().toString().trim());
                String name18=(textView18.getText().toString().trim());String name19=(textView19.getText().toString().trim());String name20=(textView20.getText().toString().trim());
                String name21=(textView21.getText().toString().trim());String name22=(textView22.getText().toString().trim());String name23=(textView23.getText().toString().trim());
                String name24=(textView24.getText().toString().trim());String name25=(textView25.getText().toString().trim());String name26=(textView26.getText().toString().trim());
                String name27=(textView27.getText().toString().trim());String name28=(textView28.getText().toString().trim());String name29=(textView29.getText().toString().trim());
                String name30=(textView30.getText().toString().trim());String name31=(textView31.getText().toString().trim());String name32=(textView32.getText().toString().trim());
                rootNode = FirebaseDatabase.getInstance();
                member.setName(name);member.setName1(name1);member.setName2(name2);member.setName3(name3);member.setName4(name4); //++
                member.setName5(name5);member.setName6(name6);member.setName7(name7);member.setName8(name8);member.setName9(name9);
                member.setName10(name10);member.setName11(name11);member.setName12(name12);member.setName13(name13);member.setName14(name14);
                member.setName15(name15);member.setName16(name16);member.setName17(name17);member.setName18(name18);member.setName19(name19);
                member.setName20(name20);member.setName21(name21);member.setName22(name22);member.setName23(name23);member.setName24(name24);
                member.setName25(name25);member.setName26(name26);member.setName27(name27);member.setName28(name28);member.setName29(name29);
                member.setName30(name30);member.setName31(name31);member.setName32(name32);
                reference.setValue(member);

                setToast("結帳完畢");

            Intent intent = new Intent();
            intent.setClass(FrontSideCheckout.this, FrontSideCustSeatPage.class);
            startActivity(intent);
                dialog.dismiss();
            });
            dialog.getButton(AlertDialog.BUTTON_NEUTRAL).setOnClickListener((v3 -> {
                setToast("取消");
                dialog.dismiss();
            }));

            dialog.setCancelable(false);
            dialog.setCanceledOnTouchOutside(false);
        });





    button12.setOnClickListener(new View.OnClickListener()

    {


        @Override
        public void onClick (View v){
            // v.clearAnimation();
            findViewById(R.id.time1).setVisibility( View.VISIBLE );
            TextView time = (TextView) findViewById(R.id.time1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            Date date = new Date(System.currentTimeMillis());
            time.setText(simpleDateFormat.format(date));

        rootDatabaseref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {

                        String data = snapshot.getValue().toString();
                        textView.setText(data);
                    if (data.length() == 0) {
                        findViewById(R.id.textV_1).setVisibility(View.GONE);
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
                    if (data1.length() == 0) {
                        findViewById(R.id.textV_2).setVisibility(View.GONE);
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
                    if (data2.length() == 0) {
                        findViewById(R.id.textV_3).setVisibility(View.GONE);
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
                    if (data3.length() == 0) {
                        findViewById(R.id.textV_4).setVisibility(View.GONE);
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
                    if (data4.length() == 0) {
                        findViewById(R.id.textV_5).setVisibility(View.GONE);
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
                    if (data5.length() == 0) {
                        findViewById(R.id.textV_6).setVisibility(View.GONE);
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
                    if (data6.length() == 0) {
                        findViewById(R.id.textV_7).setVisibility(View.GONE);
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
                    if (data7.length() == 0) {
                        findViewById(R.id.textV_8).setVisibility(View.GONE);
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
                    if (data8.length() == 0) {
                        findViewById(R.id.textV_9).setVisibility(View.GONE);
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
                    if (data9.length() == 0) {
                        findViewById(R.id.textV_10).setVisibility(View.GONE);
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
                    if (data10.length() == 0) {
                        findViewById(R.id.textV_11).setVisibility(View.GONE);
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
                    if (data11.length() == 0) {
                        findViewById(R.id.textV_12).setVisibility(View.GONE);
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
                    if (data12.length() == 0) {
                        findViewById(R.id.textV_13).setVisibility(View.GONE);
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
                    if (data13.length() == 0) {
                        findViewById(R.id.textV_14).setVisibility(View.GONE);
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
                    if (data14.length() == 0) {
                        findViewById(R.id.textV_15).setVisibility(View.GONE);
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
                    if (data15.length() == 0) {
                        findViewById(R.id.textV_16).setVisibility(View.GONE);
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
                    if (data16.length() == 0) {
                        findViewById(R.id.textV_17).setVisibility(View.GONE);
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
                    if (data17.length() == 0) {
                        findViewById(R.id.textV_18).setVisibility(View.GONE);
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
                    if (data18.length() == 0) {
                        findViewById(R.id.textV_19).setVisibility(View.GONE);
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
                    if (data19.length() == 0) {
                        findViewById(R.id.textV_20).setVisibility(View.GONE);
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
                    if (data20.length() == 0) {
                        findViewById(R.id.textV_21).setVisibility(View.GONE);
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
                    if (data21.length() == 0) {
                        findViewById(R.id.textV_22).setVisibility(View.GONE);
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
                    if (data22.length() == 0) {
                        findViewById(R.id.textV_23).setVisibility(View.GONE);
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
                    if (data23.length() == 0) {
                        findViewById(R.id.textV_24).setVisibility(View.GONE);
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
                    if (data24.length() == 0) {
                        findViewById(R.id.textV_25).setVisibility(View.GONE);
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
                    if (data25.length() == 0) {
                        findViewById(R.id.textV_26).setVisibility(View.GONE);
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
                    if (data26.length() == 0) {
                        findViewById(R.id.textV_27).setVisibility(View.GONE);
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
                    if (data27.length() == 0) {
                        findViewById(R.id.textV_28).setVisibility(View.GONE);
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
                    if (data28.length() == 0) {
                        findViewById(R.id.textV_29).setVisibility(View.GONE);
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
                    if (data29.length() == 0) {
                        findViewById(R.id.textV_30).setVisibility(View.GONE);
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
                    if (data30.length() == 0) {
                        findViewById(R.id.textV_31).setVisibility(View.GONE);
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
                    if (data31.length() == 0) {
                        findViewById(R.id.textV_32).setVisibility(View.GONE);
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
                if (snapshot.exists()) {
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
}

    private void setToast (String text){
        Toast.makeText(FrontSideCheckout.this, text, Toast.LENGTH_SHORT).show();
    }
}

