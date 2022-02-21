package com.example.alhuwaishel_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TextView time = (TextView) findViewById(R.id.textView2);
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                for(int i=9;i>0;i--){
                    time.setText(Integer.toString(i));
                }
                finish();
                startActivity(new Intent(Splash.this, MainActivity.class));
            }
        };
        Timer opening = new Timer();
        opening.schedule(timerTask,9000);
    }
}