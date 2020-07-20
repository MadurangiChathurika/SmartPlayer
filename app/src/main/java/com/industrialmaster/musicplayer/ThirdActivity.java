package com.industrialmaster.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.industrialmaster.musicplayer.audio.background.PlayBackgroundAudioActivity;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void Music(View v){
        Intent intent = new Intent(this, PlayBackgroundAudioActivity.class);
        startActivity(intent);
    }

    public void Home(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void song1(View v){
        Intent intent = new Intent(this, Song1Activity.class);
        startActivity(intent);
    }

    public void song2(View v){
        Intent intent = new Intent(this, Song2Activity.class);
        startActivity(intent);
    }

    public void song3(View v){
        Intent intent = new Intent(this, Song3Activity.class);
        startActivity(intent);
    }

    public void song4(View v){
        Intent intent = new Intent(this, Song4Activity.class);
        startActivity(intent);
    }

    public void song5(View v){
        Intent intent = new Intent(this, Song5Activity.class);
        startActivity(intent);
    }
}
