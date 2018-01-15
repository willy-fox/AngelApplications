package com.angel.willy.Base;

import android.support.v7.widget.RecyclerView;

import java.util.List;


/**
 * Created by wei on 2018/1/15.
 */

public abstract class BaseAdapter<T extends Object> extends RecyclerView.Adapter{
    protected abstract void setData(List<T> t);
    protected abstract List<T> getData();
    protected abstract void addData(T t);
    protected abstract void delData(int position);
}
