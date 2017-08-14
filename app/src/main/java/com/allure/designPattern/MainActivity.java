package com.allure.designPattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.allure.designPattern.factory.AndroidCodeMonkey;
import com.allure.designPattern.factory.cachefactory.CodeMonkeyCacheFactory;
import com.allure.designPattern.factory.easyfactory.CodeMonkeyEasyFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            //简单工厂
            CodeMonkeyEasyFactory.generateCodeMonkey(CodeMonkeyEasyFactory.GENERATE_ANDROID).showCodeMonkeyType();
            CodeMonkeyEasyFactory.generateCodeMonkey(CodeMonkeyEasyFactory.GENERATE_IOS).showCodeMonkeyType();
            new CodeMonkeyCacheFactory().generateCodeMonkey(AndroidCodeMonkey.class).showCodeMonkeyType();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
