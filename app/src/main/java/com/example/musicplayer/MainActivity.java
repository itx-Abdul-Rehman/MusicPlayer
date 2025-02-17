package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button start_button;
    Button stop_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start_button=findViewById(R.id.startButton);
        stop_button=findViewById(R.id.stopButton);

        start_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent serviceIntent=new Intent(MainActivity.this,MyCustomService.class);
                startService(serviceIntent);
            }
        });

        stop_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent serviceIntent=new Intent(MainActivity.this,MyCustomService.class);
                stopService(serviceIntent);

            }
        });

    }
}