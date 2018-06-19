package com.example.hudson.tourguideapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hudson.tourguideapp.Location;
import com.example.hudson.tourguideapp.R;

import java.util.List;

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.LocationViewHolder> {

    private List<Location> locations;

    public LocationAdapter(List<Location> locations) {
        this.locations = locations;
    }

    @NonNull
    @Override
    public LocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.location_item, parent, false);

        return new LocationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LocationViewHolder holder, int position) {
        Location location = locations.get(position);

        holder.setImageTitle(location.getTitle());
        holder.setImageResource(location.getImageResource());
    }

    @Override
    public int getItemCount() {
        return locations.size();
    }

    class LocationViewHolder extends RecyclerView.ViewHolder {
        ImageView locationImage;

        TextView locationTitle;

        LocationViewHolder(View itemView) {
            super(itemView);

            locationImage = itemView.findViewById(R.id.location_image);
            locationTitle = itemView.findViewById(R.id.location_title);
        }

        void setImageResource(int res) {
            if (res == 0) {
                locationImage.setVisibility(View.GONE);
                return;
            }

            locationImage.setImageResource(res);
        }

        void setImageTitle(String title) {
            locationTitle.setText(title);
        }
    }
}
