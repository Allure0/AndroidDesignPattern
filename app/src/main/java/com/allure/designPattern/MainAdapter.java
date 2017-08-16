package com.allure.designPattern;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by Allure on 2017/8/15.
 */

public class MainAdapter extends BaseQuickAdapter<MainBean, BaseViewHolder> {
    private TextView textView;


    public MainAdapter(@LayoutRes int layoutResId, @Nullable List<MainBean> data) {
        super(R.layout.main_item, data);
    }




    @Override
    protected void convert(BaseViewHolder helper, MainBean item) {
        Log.e("2222",item.getName());
        helper.setText(R.id.textview,item.getName());
    }


}
