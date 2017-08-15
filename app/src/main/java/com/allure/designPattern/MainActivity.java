package com.allure.designPattern;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.*;
import android.support.v7.widget.DividerItemDecoration;
import android.view.View;

import com.allure.designPattern.builder.BuilderActivity;
import com.allure.designPattern.observe.ObserveActivity;
import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MainAdapter mainAdapter;
    private List<MainBean> list = new ArrayList<>();
    private String[] content = new String[]{
            "builder模式",
            "单例模式",
            "原型模式",
            "工厂模式",
            "抽象工厂",
            "策略模式",
            "状态模式",
            "责任链模式",
            "解释器模式",
            "命令模式",
            "观察者模式",
            "备忘录模式",
            "迭代器模式",
            "模板方法模式",
            "访问者模式",
            "中介者模式",
            "代理模式",
            "组合模式",
            "适配器模式",
            "装饰模式",
            "享元模式",
            "外观模式",
            "桥接模式",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();


    }

    private void initData() {
        for (int i = 0; i < content.length; i++) {
            MainBean mainBean = new MainBean();
            mainBean.setName(content[i]);
            list.add(mainBean);
        }
    }

    private void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.recycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        mainAdapter = new MainAdapter(R.layout.main_item, list);
        recyclerView.setAdapter(mainAdapter);
        mainAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                switch (position) {
                    //builder模式
                    case 0:
                        startActivity(BuilderActivity.class);
                        break;
                    //单例模式
                    case 1:
                        break;
                    //原型模式
                    case 2:
                        break;
                    //工厂模式
                    case 3:
                        break;
                    //抽象工厂
                    case 4:
                        break;
                    //策略模式
                    case 5:
                        break;
                    //状态模式
                    case 6:
                        break;
                    //责任链模式
                    case 7:
                        break;
                    //解释器模式
                    case 8:
                        break;
                    //命令模式
                    case 9:
                        break;
                    //观察者模式
                    case 10:
                        startActivity(ObserveActivity.class);
                        break;
                    //备忘录模式
                    case 11:
                        break;
                    //迭代器模式
                    case 12:
                        break;
                    //模板方法模式
                    case 13:
                        break;
                    //访问者模式
                    case 14:
                        break;
                    //中介者模式
                    case 15:
                        break;
                    //代理模式
                    case 16:
                        break;
                    //组合模式
                    case 17:
                        break;
                    //适配器模式
                    case 18:
                        break;
                    //装饰模式
                    case 19:
                        break;
                    //享元模式
                    case 20:
                        break;
                    //外观模式
                    case 21:
                        break;
                    //桥接模式
                    case 22:
                        break;

                }
            }
        });

    }


    public void go2Obsever(View v) {
        startActivity(new Intent(MainActivity.this, ObserveActivity.class));
    }

    private  void   startActivity(Class<?> aClass){
        startActivity(new Intent(MainActivity.this,aClass));
    }
}
