package com.allure.designPattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.allure.designPattern.factory.AndroidCodeMonkey;
import com.allure.designPattern.factory.cachefactory.CodeMonkeyCacheFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            new CodeMonkeyCacheFactory().generateCodeMonkey(AndroidCodeMonkey.class).showCodeMonkeyType();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
