package com.example.firebase_module;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class ModuleOneNotificationService extends FirebaseMessagingService {

    private static final String TAG = "ModuleOneNotificationSe";


    public ModuleOneNotificationService() {
//        Log.e(TAG, "Token:  " + FirebaseInstanceId.getInstance().getToken());
        FirebaseInstallations.getInstance().getId().addOnSuccessListener(new OnSuccessListener<String>() {
            @Override
            public void onSuccess(String s) {
                Log.e(TAG, "onSuccess:  " + s);
            }
        });
    }


    @Override
    public void onNewToken(@NonNull String s) {
        super.onNewToken(s);
        Log.e(TAG, "onNewToken:  " + s);
    }

    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        Log.e(TAG, "onMessageReceived:  " + remoteMessage.getData());
    }

}
