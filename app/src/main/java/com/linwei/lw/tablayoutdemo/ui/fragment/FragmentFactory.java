package com.linwei.lw.tablayoutdemo.ui.fragment;

import java.util.HashMap;

/**
 * Fragment工厂类。
 * Created by LW on 2017/4/20.
 */

public class FragmentFactory {
    private static HashMap<Integer, BaseFragment> mBaseFragments = new HashMap<Integer, BaseFragment>();

    public static BaseFragment createFragment(int pos) {
        BaseFragment baseFragment = mBaseFragments.get(pos);

        if (baseFragment == null) {
            switch (pos) {
                case 0:
                    baseFragment = new TopLineFragment();//头条
                    break;
                case 1:
                    baseFragment = new NewsFragment();//要闻
                    break;
                case 2:
                    baseFragment = new EntertainmentFragment();//娱乐
                    break;
                case 3:
                    baseFragment = new SportsFragment();//体育
                    break;
                case 4:
                    baseFragment = new FinanceFragment();//财经
                    break;
                case 5:
                    baseFragment = new ScienceFragment();//科技
                    break;
                case 6:
                    baseFragment = new ModeFragment();//时尚
                    break;
                case 7:
                    baseFragment = new VideoFragment();//视频
                    break;
                case 8:
                    baseFragment = new  DirectSeedingFragment();//直播
                    break;

            }
            mBaseFragments.put(pos, baseFragment);
        }
        return baseFragment;
    }
}
