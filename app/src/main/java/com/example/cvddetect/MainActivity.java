package com.example.cvddetect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public void btn1(View view){
        Log.i("btn1", "this is a message");
    }

    public void btn2(View view){
        Log.i("btn2", "a message");
    }
    public void btn3(View view){
        Log.i("btn3", "submit message");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}