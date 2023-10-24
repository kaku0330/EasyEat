package com.example.easyeatproject;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;


public class MyFirebaseMessagingService extends FirebaseMessagingService {

    private static final String TAG = "MyFirebaseMsgService";

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.i(TAG, "onMessageReceived:" + remoteMessage.getFrom());
        Intent intent = new Intent();
        intent.setClass(this, FrontSideCustSeatPage.class);
        showNotification(this, remoteMessage, intent);
    }

    @Override
    public void onMessageSent(String s) {
        super.onMessageSent(s);
        Log.i("Service", "onMessageSent" + s);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void showNotification(Context context, RemoteMessage remoteMessage, Intent intent) {
        NotificationManagerCompat manager = NotificationManagerCompat.from(this);
        PendingIntent iPending = PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setContentTitle(remoteMessage.getData().get("title").toString()) //需對應Service設定的字串文字
                        .setWhen(System.currentTimeMillis())
                        .setDefaults(Notification.DEFAULT_SOUND)
                        .setContentText(remoteMessage.getData().get("body").toString()) //需對應Service設定的字串文字
                        .setContentIntent(iPending)
                        .setAutoCancel(true);

        Notification notification = mBuilder.build();
        manager.notify(1, notification);

    }
}