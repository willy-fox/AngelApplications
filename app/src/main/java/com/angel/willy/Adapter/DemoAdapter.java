package com.angel.willy.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.angel.willy.Base.BaseAdapter;
import com.angel.willy.Base.BaseViewHold;
import com.angel.willy.Mode.DemoMode;

import java.util.List;

/**
 * Created by wei on 2018/1/15.
 */

public class DemoAdapter extends BaseAdapter<DemoMode>{
    @Override
    public DemoViewHold onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }
    @Override
    public int getItemCount() {
        return 0;
    }


    @Override
    protected void setData(List<DemoMode> t) {

    }

    @Override
    protected List<DemoMode> getData() {
        return null;
    }

    @Override
    protected void addData(DemoMode demoMode) {

    }

    @Override
    protected void delData(int position) {

    }

    class DemoViewHold extends BaseViewHold{

        public DemoViewHold(View itemView) {
            super(itemView);
        }
    }
}
