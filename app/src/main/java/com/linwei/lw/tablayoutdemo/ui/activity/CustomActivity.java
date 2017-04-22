package com.linwei.lw.tablayoutdemo.ui.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.linwei.lw.tablayoutdemo.R;
import com.linwei.lw.tablayoutdemo.Utils.CommentUtils;
import com.linwei.lw.tablayoutdemo.ui.fragment.BaseFragment;
import com.linwei.lw.tablayoutdemo.ui.fragment.FragmentFactory;

public class CustomActivity extends AppCompatActivity {
    private TabLayout mTab;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
        initView();
        initData();
    }

    private void initData() {
        CustomAdapter adapter = new CustomAdapter(getSupportFragmentManager(), this);
        mViewPager.setAdapter(adapter);
        mTab.setupWithViewPager(mViewPager);
        for (int i = 0; i < mTab.getTabCount(); i++) {
            TabLayout.Tab tab = mTab.getTabAt(i);
            tab.setCustomView(adapter.getTabView(i));
        }

    }

    private void initView() {
        mTab = (TabLayout) findViewById(R.id.tab);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
    }

    private class CustomAdapter extends FragmentPagerAdapter {
        private int[] mTitleImage;
        private Context mContext;
        private String[] mTitle;

        public CustomAdapter(FragmentManager fm, Context context) {
            super(fm);
            this.mContext = context;
            mTitle = getResources().getStringArray(R.array.tab_short_Title);
            mTitleImage = new int[]{R.mipmap.topline, R.mipmap.news, R.mipmap.entertainment, R.mipmap.sports};
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return null;
        }

        @Override
        public BaseFragment getItem(int position) {
            BaseFragment fragment = FragmentFactory.createFragment(position);
            return fragment;
        }

        @Override
        public int getCount() {
            return CommentUtils.TAB_SHORT_COUNT;
        }

        public View getTabView(int position) {
            View view = LayoutInflater.from(mContext).inflate(R.layout.item_custom, null);
            ImageView image = (ImageView) view.findViewById(R.id.iv_image);
            TextView title = (TextView) view.findViewById(R.id.tv_title);
            image.setImageResource(mTitleImage[position]);
            title.setText(mTitle[position]);
            return view;
        }
    }
}
