package com.luminous.android.basicphrases;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View view) {
        switch (view.getId()) {
            case R.id.button:
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
