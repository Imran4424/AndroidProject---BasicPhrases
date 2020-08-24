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
                mediaPlayer = MediaPlayer.create(this, R.raw.);
                mediaPlayer.start();
                break;

            case R.id.button5:
                System.out.println(5);
                break;

            case R.id.button6:
                System.out.println(6);
                break;

            case R.id.button7:
                System.out.println(7);
                break;

            case R.id.button8:
                System.out.println(8);
                break;
        }
    }
}
