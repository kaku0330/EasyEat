package com.example.easyeatproject;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityAdminAccountChose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_account_chose);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);//設定螢幕不隨手機旋轉
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//螢幕保持橫向

        new AlertDialog.Builder(ActivityAdminAccountChose.this)
                .setIcon(android.R.drawable.ic_dialog_alert);
        Button bt_1=(Button)findViewById(R.id.button3);
        bt_1 = (Button) findViewById(R.id.button3);
        bt_1.setOnClickListener((a)-> {
            Intent intent = new Intent();
            intent.setClass(ActivityAdminAccountChose.this,AdminAccountPage.class);startActivity(intent);
        });

        new AlertDialog.Builder(ActivityAdminAccountChose.this)
                .setIcon(android.R.drawable.ic_dialog_alert);
        Button bt_2=(Button)findViewById(R.id.button6);
        bt_2 = (Button) findViewById(R.id.button6);
        bt_2.setOnClickListener((a)-> {
            Intent intent = new Intent();
            intent.setClass(ActivityAdminAccountChose.this,AdminAccountPage1.class);startActivity(intent);
        });

        new AlertDialog.Builder(ActivityAdminAccountChose.this)
                .setIcon(android.R.drawable.ic_dialog_alert);
        Button bt_3=(Button)findViewById(R.id.button5);
        bt_3 = (Button) findViewById(R.id.button5);
        bt_3.setOnClickListener((a)-> {
            Intent intent = new Intent();
            intent.setClass(ActivityAdminAccountChose.this,AdminAccountPage2.class);startActivity(intent);
        });

    }
}
