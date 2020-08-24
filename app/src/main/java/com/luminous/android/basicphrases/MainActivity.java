package com.luminous.android.basicphrases;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    private int[] buttonIds = {
            R.id.button1,
            R.id.button2,
            R.id.button3,
            R.id.button4,
            R.id.button5,
            R.id.button6,
            R.id.button7,
            R.id.button8
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.doyouspeakenglish);

        initButtons();
    }

    private void initButtons() {
        String[] titles = getResources().getStringArray(R.array.buttonTitle);
        List<String> buttonTitles = Arrays.asList(titles);

        for (int i = 0; i < buttonIds.length; i++) {
            ((Button)findViewById(buttonIds[i])).setText(buttonTitles.get(i));
        }
    }

    public void buttonClicked(View view) {
        mediaPlayer.stop();
//        another way
//        mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(view.getTag().toString(), "raw", getPackageName()));

        switch (view.getId()) {
            case R.id.button1:
                mediaPlayer = MediaPlayer.create(this, R.raw.doyouspeakenglish);
                mediaPlayer.start();
                break;

            case R.id.button2:
                mediaPlayer = MediaPlayer.create(this, R.raw.goodevening);
                mediaPlayer.start();
                break;

            case R.id.button3:
                mediaPlayer = MediaPlayer.create(this, R.raw.hello);
                mediaPlayer.start();
                break;

            case R.id.button4:
                mediaPlayer = MediaPlayer.create(this, R.raw.howareyou);
                mediaPlayer.start();
                break;

            case R.id.button5:
                mediaPlayer = MediaPlayer.create(this, R.raw.ilivein);
                mediaPlayer.start();
                break;

            case R.id.button6:
                mediaPlayer = MediaPlayer.create(this, R.raw.mynameis);
                mediaPlayer.start();
                break;

            case R.id.button7:
                mediaPlayer = MediaPlayer.create(this, R.raw.please);
                mediaPlayer.start();
                break;

            case R.id.button8:
                mediaPlayer = MediaPlayer.create(this, R.raw.welcome);
                mediaPlayer.start();
                break;
        }
    }




}
