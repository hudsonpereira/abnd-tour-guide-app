package com.example.hudson.tourguideapp.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.hudson.tourguideapp.R;
import com.example.hudson.tourguideapp.fragment.CompaniesFragment;
import com.example.hudson.tourguideapp.fragment.PubsFragment;
import com.example.hudson.tourguideapp.fragment.RestaurantsFragment;
import com.example.hudson.tourguideapp.fragment.SchoolsFragment;

public class LocationPagerAdapter extends FragmentPagerAdapter {
    private Context context;

    public LocationPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new PubsFragment();
            case 1:
                return new CompaniesFragment();
            case 2:
                return new RestaurantsFragment();
            case 3:
            default:
                return new SchoolsFragment();
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
