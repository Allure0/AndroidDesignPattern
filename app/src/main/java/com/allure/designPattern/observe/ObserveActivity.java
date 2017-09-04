package com.allure.designPattern.observe;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Allure on 2017/8/14.
 */

public class ObserveActivity extends AppCompatActivity implements ObserverListener {
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textView = new TextView(this);
        textView.setGravity(Gravity.CENTER);
        textView.setText("原始名字");
        setContentView(textView);
        //注册
        ObserverManager.getInstance().register(this);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ObserveActivity.this, SecondActivity.class));
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ObserverManager.getInstance().unRegister(this);
    }

    @Override
    public void update(Object o) {
        //更新名字
        textView.setText(((Person) o).getName());
        Person person = (Person) o;
        System.out.print(String.valueOf(person.getName()));
    }
}
