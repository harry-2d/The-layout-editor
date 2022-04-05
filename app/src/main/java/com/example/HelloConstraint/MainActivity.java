package com.example.HelloConstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    Button buttonCount;
    Button buttonReset;
    Button buttonReset1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        buttonReset= (Button) findViewById(R.id.button_reset);
        buttonReset1=(Button) findViewById(R.id.button_reset);
        buttonCount=(Button) findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        buttonReset.setBackgroundColor(getResources().getColor(R.color.pink));
        switch (mCount%2){
            case 0: buttonCount.setBackgroundColor(getResources().getColor(R.color.purple_200));
                break;
            case 1: buttonCount.setBackgroundColor(getResources().getColor(R.color.green));
                break;
        }

    }
    @SuppressLint("ResourceAsColor")
    public void resetValue(View view) {
        mCount=0;
        mShowCount.setText(String.valueOf(mCount));
        buttonReset.setBackgroundColor(com.google.android.material.R.color.material_grey_50);
        buttonReset1.setBackgroundColor(getResources().getColor(R.color.grey));
        buttonCount.setBackgroundColor(getResources().getColor(R.color.light_green));

    }
}