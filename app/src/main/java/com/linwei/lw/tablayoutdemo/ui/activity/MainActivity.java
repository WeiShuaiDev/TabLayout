package com.linwei.lw.tablayoutdemo.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.linwei.lw.tablayoutdemo.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 固定模式
     *
     * @param v
     */
    public void shortTab(View v) {
        Intent intent = new Intent(MainActivity.this, ShortTabActivity.class);
        startActivity(intent);

    }

    /**
     * 滚动模式。
     *
     * @param v
     */
    public void longTab(View v) {
        Intent intent = new Intent(MainActivity.this, LongTabActivity.class);
        startActivity(intent);
    }
    /**
     * Tab图片显示。
     *
     * @param v
     */
    public void ImageTab(View v) {
        Intent intent = new Intent(MainActivity.this, ImageTabActivity.class);
        startActivity(intent);
    }

    /**
     * Tab图片和文字显示。
     *
     * @param v
     */
    public void ImageTextTab(View v) {
        Intent intent = new Intent(MainActivity.this, ImageTabTextActivity.class);
        startActivity(intent);
    }

    /**
     * 通过样式改变Tab显示。
     * @param v
     */
    public void StyleTab(View v) {
        Intent intent = new Intent(MainActivity.this, StyleActivity.class);
        startActivity(intent);
    }

    /**
     * 自定义View显示。。
     * @param v
     */
    public void custom(View v){
        Intent intent = new Intent(MainActivity.this, CustomActivity.class);
        startActivity(intent);
    }

    /**
     * tabGravity="fill"和tabMode="fixed"
     * @param v
     */
    public void TabMode1(View v) {
        Intent intent = new Intent(MainActivity.this, ModeoneActivity.class);
        startActivity(intent);
    }

    /**
     * tabGravity="center"和tabMode="fixed"
     * @param v
     */
    public void TabMode2(View v) {
        Intent intent = new Intent(MainActivity.this, ModetwoActivity.class);
        startActivity(intent);
    }

    /**
     * tabGravity="fill"和tabMode="scrollable"
     * @param v
     */
    public void TabMode3(View v) {
        Intent intent = new Intent(MainActivity.this,ModethreeActivity.class);
        startActivity(intent);
    }

    /**
     * tabGravity="cente"和tabMode="scrollable"
     * @param v
     */
    public void TabMode4(View v) {
        Intent intent = new Intent(MainActivity.this, ModefourActivity.class);
        startActivity(intent);
    }

}
