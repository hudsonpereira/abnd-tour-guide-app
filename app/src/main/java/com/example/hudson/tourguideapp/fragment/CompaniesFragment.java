package com.example.hudson.tourguideapp.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hudson.tourguideapp.R;
import com.example.hudson.tourguideapp.adapter.LocationAdapter;

public class CompaniesFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_with_recycler_view, container, false);

        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);
        recyclerView.setAdapter(new LocationAdapter());

        return rootView;
    }
}
