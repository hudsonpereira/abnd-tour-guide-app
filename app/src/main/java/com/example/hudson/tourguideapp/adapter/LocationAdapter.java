package com.example.hudson.tourguideapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hudson.tourguideapp.R;

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.LocationViewHolder> {

    @NonNull
    @Override
    public LocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.location_item, parent, false);

        return new LocationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LocationViewHolder holder, int position) {
        holder.setImageTItle("Hudson");
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    class LocationViewHolder extends RecyclerView.ViewHolder {
        ImageView locationImage;

        TextView locationTitle;

        public LocationViewHolder(View itemView) {
            super(itemView);

            locationImage = itemView.findViewById(R.id.location_image);
            locationTitle = itemView.findViewById(R.id.location_title);
        }

        public void setImageResource(int res) {
            locationImage.setImageResource(res);
        }

        public void setImageTItle(String title) {
            locationTitle.setText(title);
        }
    }
}
