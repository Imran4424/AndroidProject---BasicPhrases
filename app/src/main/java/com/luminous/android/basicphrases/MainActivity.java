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
    private List<Button> buttons;
    private  List<String> buttonTitles;
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

        String[] titles = getResources().getStringArray(R.array.buttonTitle);
        buttonTitles = Arrays.asList(titles);

        initButtons();
    }

    private void initButtons() {


        for (int i = 1; i <= 8; i++) {
            String buttonId = "button";
            buttonId = buttonId + i;
            Log.d("1", buttonId);
            int bidTemp = getResources().getIdentifier(buttonId, "id", getPackageName());
            System.out.println(bidTemp);
            buttons.add((Button) findViewById(bidTemp));
            buttons.get(i - 1).setText(buttonTitles.get(i - 1));
        }
    }

    public void buttonClicked(View view) {
        switch (view.getId()) {
            case R.id.button1:
                System.out.println(1);
                break;

            case R.id.button2:
                System.out.println(2);
                break;

            case R.id.button3:
                System.out.println(3);
                break;

            case R.id.button4:
                System.out.println(4);
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
