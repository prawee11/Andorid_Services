package com.example.andoridservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnStart,btnStop;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart = findViewById(R.id.btn1);



    btnStart.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startService(new Intent(MainActivity.this, MyServices.class));
        }
    });

        btnStop= findViewById(R.id.btn2);
    btnStop.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            stopService(new Intent(MainActivity.this, MyServices.class));
        }
    });

}}