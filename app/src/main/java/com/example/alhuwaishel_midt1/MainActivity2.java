package com.example.alhuwaishel_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("You are in Activity2");
        TableLayout t =(TableLayout) findViewById(R.id.tlayout);
        TextView text = (TextView) findViewById(R.id.textView);
        t.getChildAt(1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setBackground(t.getChildAt(1));
            }
        });
        t.getChildAt(2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setBackground(t.getChildAt(2));
            }
        });
        t.getChildAt(3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setBackground(t.getChildAt(3));
            }
        });
        t.getChildAt(3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setBackground(t.getChildAt(3));
            }
        });



                Button go1 = findViewById(R.id.button);
        Button go3 = findViewById(R.id.button2);


        go1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,MainActivity.class));
            }
        });
        go3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity2.this,MainActivity3.class));}
        });
    }
}