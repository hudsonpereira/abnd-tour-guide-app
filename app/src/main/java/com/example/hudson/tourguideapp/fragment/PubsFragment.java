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

public class PubsFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_with_recycler_view, container, false);

        ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(getString(R.string.jack_pub), R.drawable.jack));
        locations.add(new Location(getString(R.string.armazen), R.drawable.armazen));
        locations.add(new Location(getString(R.string.brazuka), R.drawable.brazuka));
        locations.add(new Location(getString(R.string.emporio_sao_lourenco), R.drawable.emporio_sao_lourenco));
        locations.add(new Location(getString(R.string.dona_maria), R.drawable.donamaria));

        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);
        LocationAdapter locationAdapter = new LocationAdapter(locations);
        recyclerView.setAdapter(locationAdapter);

        return rootView;
    }
}
