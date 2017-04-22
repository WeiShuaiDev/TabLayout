package com.linwei.lw.tablayoutdemo.ui.fragment;

import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by LW on 2017/4/21.
 */

public class FinanceFragment extends BaseFragment {
    @Override
    protected void loadData() {
        Toast.makeText(mContent,"Fragment财经加载数据",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected View initView() {
        TextView mView=new TextView(mContent);
        mView.setText("Fragment财经");
        mView.setGravity(Gravity.CENTER);
        mView.setTextSize(18);
        mView.setTextColor(Color.BLACK);
        return mView;
    }
}
