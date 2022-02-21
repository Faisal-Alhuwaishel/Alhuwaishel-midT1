package com.example.alhuwaishel_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class newItem extends AppCompatActivity {
    MediaPlayer mediaplayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_item);
        mediaplayer = new MediaPlayer();

        mediaplayer = MediaPlayer.create(this, R.raw.track1);
        mediaplayer.start();
    }
}