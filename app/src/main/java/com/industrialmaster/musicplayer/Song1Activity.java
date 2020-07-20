package com.industrialmaster.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Song1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song1);
    }

    public void Home(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void start(View v){
        Intent intent = new Intent(this,MySong1.class);
        startService(intent);
    }

    public void stop(View v){
        Intent intent = new Intent(this,MySong1.class);
        stopService(intent);
    }

    public void Next(View v){
        Intent intent = new Intent(this, Song2Activity.class);
        startActivity(intent);
    }
}
