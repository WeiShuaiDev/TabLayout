package com.linwei.lw.tablayoutdemo.ui.activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;

import com.linwei.lw.tablayoutdemo.R;
import com.linwei.lw.tablayoutdemo.Utils.CommentUtils;
import com.linwei.lw.tablayoutdemo.ui.fragment.BaseFragment;
import com.linwei.lw.tablayoutdemo.ui.fragment.FragmentFactory;

public class ImageTabTextActivity extends AppCompatActivity {
    private TabLayout mTab;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_tab_text);
        initView();
        initData();
    }

    private void initData() {
        ImagePagerAdapter adapter = new ImagePagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(adapter);
        mTab.setupWithViewPager(mViewPager);

    }

    private void initView() {
        mTab = (TabLayout) findViewById(R.id.tab);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
    }

    private class ImagePagerAdapter extends FragmentPagerAdapter {
        public int[] mTitleImage;
        public  String[] mTitle;

        public ImagePagerAdapter(FragmentManager fm) {
            super(fm);
            mTitleImage = new int[]{R.mipmap.topline, R.mipmap.news, R.mipmap.entertainment, R.mipmap.sports};
            mTitle= getResources().getStringArray(R.array.tab_short_Title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Drawable drawable = ContextCompat.getDrawable(ImageTabTextActivity.this, mTitleImage[position]);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            ImageSpan imageSpan = new ImageSpan(drawable, ImageSpan.ALIGN_BOTTOM);
            SpannableString spannableString = new SpannableString(" "+mTitle[position]);
            spannableString.setSpan(imageSpan, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            return spannableString;
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
    }
}
