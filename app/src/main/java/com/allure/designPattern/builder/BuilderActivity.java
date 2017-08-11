package com.allure.designPattern.builder;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

/**
 * Builder构造者模式
 * Created by Allure on 2017/8/11.
 */

public class BuilderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout=new LinearLayout(this);
        setContentView(linearLayout);
        String[] name={"我","是","谁"};
        TabInfoBean.TabInfoBuilder tabInfoBuilder=new TabInfoBean.TabInfoBuilder(name,5,0);
       /* TabInfoBean tabInfoBean=tabInfoBuilder
                .setNormalResId()
                .setSelectResId()
                .setNormalTextColor()
                .setSelectTextColor()
                .setNormalTextSizeSp()
                .setSelectTextSizeSp()
                .build();*/

    }
}
