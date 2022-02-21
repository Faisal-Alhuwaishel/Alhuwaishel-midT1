package com.example.alhuwaishel_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity3 extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("You are in Activity3");
        //setContentView(R.layout.activity_main3);
        String[] attractions= {"Item1 ","Item 2","Item 3","Item 4"};
        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_main3,R.id.travel,attractions));
        Button go1 = findViewById(R.id.button3);
        Button go2 = findViewById(R.id.button4);


        go1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity3.this,MainActivity.class));
            }
        });
        go2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity3.this,MainActivity2.class));}
        });


    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch(position){
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://alfaisal.edu")));
                break;
            case 1:
                startActivity(new Intent(MainActivity3.this,newItem.class));
                break;
            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://youtube.com")));
                break;
            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com")));
                break;
        }
    }
}