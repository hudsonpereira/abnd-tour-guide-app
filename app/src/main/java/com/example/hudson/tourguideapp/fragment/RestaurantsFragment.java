package com.example.hudson.tourguideapp.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hudson.tourguideapp.Location;
import com.example.hudson.tourguideapp.R;
import com.example.hudson.tourguideapp.adapter.LocationAdapter;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_with_recycler_view, container, false);

        ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(getString(R.string.lalai_restaurante), 0));
        locations.add(new Location(getString(R.string.armabile_restaurante), 0));
        locations.add(new Location(getString(R.string.la_terrasse), 0));
        locations.add(new Location(getString(R.string.dom_pimenta), 0));

        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);
        LocationAdapter locationAdapter = new LocationAdapter(locations);
        recyclerView.setAdapter(locationAdapter);

        return rootView;
    }
}
