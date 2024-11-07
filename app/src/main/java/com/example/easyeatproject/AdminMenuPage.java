package com.example.easyeatproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminMenuPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_menu_page);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);//設定螢幕不隨手機旋轉
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//螢幕保持橫向
        Button bt_1=(Button)findViewById(R.id.bt_2);
        bt_1 = (Button) findViewById(R.id.bt_2);
        bt_1.setOnClickListener((v)-> {
            Intent intent = new Intent();
            intent.setClass(AdminMenuPage.this,ActivityAdminAccountChose.class);startActivity(intent);
        });
            new AlertDialog.Builder(AdminMenuPage.this)
                    .setIcon(android.R.drawable.ic_dialog_alert);
            Button bt_2=(Button)findViewById(R.id.button2);
            bt_2 = (Button) findViewById(R.id.button2);
            bt_2.setOnClickListener((a)-> {
                Intent intent = new Intent();
                intent.setClass(AdminMenuPage.this,AdminSetting.class);startActivity(intent);
            });
        }

    }




