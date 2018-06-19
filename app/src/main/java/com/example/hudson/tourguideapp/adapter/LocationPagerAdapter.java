package com.example.hudson.tourguideapp.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.hudson.tourguideapp.R;
import com.example.hudson.tourguideapp.fragment.PubsFragment;

public class LocationPagerAdapter extends FragmentPagerAdapter {
    Context context;

    public LocationPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
            case 1:
            case 2:
            case 3:
            default:
                return new PubsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.pubs);
            case 1:
                return context.getString(R.string.tech_companies);
            case 2:
                return context.getString(R.string.restaurants);
            case 3:
            default:
                return context.getString(R.string.tech_schools);
        }
    }
}
