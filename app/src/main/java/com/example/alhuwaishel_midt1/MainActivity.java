package com.example.alhuwaishel_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView animalpic;
    MediaPlayer mediaplayer;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("You are in Activity1");

        mediaplayer = new MediaPlayer();

        mediaplayer = MediaPlayer.create(this, R.raw.track1);

        playing = 0;

        animalpic = (ImageView) findViewById(R.id.imageView);

        Button go3 = findViewById(R.id.btna3);
        Button go2 = findViewById(R.id.btna2);


        go2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }
        });
        go3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this,MainActivity3.class));}
        });

        animalpic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (playing) {
                    case 0:
                        mediaplayer.start();
                        playing = 1;
                        break;
                    case 1:
                        mediaplayer.pause();
                        playing = 0;
                        break;
                }
            }
        });

    }
}