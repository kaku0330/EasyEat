package com.example.easyeatproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class AdminSetting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_setting);

        new AlertDialog.Builder(AdminSetting.this)
                .setIcon(android.R.drawable.ic_dialog_alert);
        Button bt_1=(Button)findViewById(R.id.button);
        bt_1 = (Button) findViewById(R.id.button);
        bt_1.setOnClickListener((a)-> {
            Intent intent = new Intent();
            intent.setClass(AdminSetting.this,AdminAccountPage3.class);startActivity(intent);
        });
    }

    public void onSignoutCreate(View v) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(AdminSetting.this);
        alertDialog.setTitle("登出");
        alertDialog.setMessage("確定要登出?");
        alertDialog.setPositiveButton("確定",((dialog, which) -> {}));
        alertDialog.setNeutralButton("取消",((dialog, which) -> {}));
        AlertDialog dialog = alertDialog.create();
        dialog.show();
        dialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener((v1 -> {
            Intent intent = new Intent();
            intent.setClass(AdminSetting.this,LoginPage.class);startActivity(intent);
            setToast("已登出");
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
        Toast.makeText(AdminSetting.this, text, Toast.LENGTH_SHORT).show();
    }
}
