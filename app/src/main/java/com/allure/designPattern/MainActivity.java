package com.allure.designPattern;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.allure.designPattern.observe.ObserveActivity;

public class MainActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



    public  void go2Obsever(View v){
        startActivity(new Intent(MainActivity.this, ObserveActivity.class));
    }
}
