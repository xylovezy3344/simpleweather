package com.xiaoyu.simpleweather.activity;

import android.os.Bundle;

import com.xiaoyu.simpleweather.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public int getContentViewId() {
        return R.layout.activity_main;
    }
}