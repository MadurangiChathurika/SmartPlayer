package com.industrialmaster.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.industrialmaster.musicplayer.audio.background.PlayBackgroundAudioActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MusicalPlayer(View v){
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

    public void BatteryLevel(View v){
        Intent intent = new Intent(this, BatteryLevelActivity.class);
        startActivity(intent);
    }

    public void Gallery(View v){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
