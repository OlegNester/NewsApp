package com.example.riko.newsapp.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.riko.newsapp.fragment.MeNews;
import com.example.riko.newsapp.fragment.Popular;
import com.example.riko.newsapp.fragment.TopStories;
import com.example.riko.newsapp.fragment.Video;

public class tabpagerAdapter extends FragmentStatePagerAdapter {

    String[] tabarray = new String[] {"Top stories", "My News", "Popular", "Video"};
    Integer TabNumber = 4;

    public tabpagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabarray[position];
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:
                TopStories ts = new TopStories();
                return ts;
            case 1:
                MeNews mn = new MeNews();
                return mn;
            case 2:
                Popular pop = new Popular();
                return pop;
            case 3:
                Video video = new Video();
                return video;

        }

        return null;
    }

    @Override
    public int getCount() {
        return TabNumber;
    }
}
