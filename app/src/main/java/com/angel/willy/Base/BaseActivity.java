package com.angel.willy.Base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;

/**
 * Created by wei on 2018/1/8.
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewID());
        ButterKnife.bind(getBindView());
        initIntent();
        initView();
        getData();
    }
    protected abstract int getContentViewID();
    protected abstract Activity getBindView();
    protected abstract void initIntent();
    protected abstract void initView();
    protected abstract void getData();
    protected String getLogTag(){
        return getClass().getSimpleName();
    }
    protected void showToastMessage(String s){
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }
}
