package com.example.testfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.firebase_module.ModuleOneNotificationService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new ModuleOneNotificationService();
    }
}