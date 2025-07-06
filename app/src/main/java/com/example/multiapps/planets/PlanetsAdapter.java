package com.example.multiapps.planets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.multiapps.R;

import java.util.ArrayList;
import java.util.Objects;

public class PlanetsAdapter extends ArrayAdapter<Planet> {
    ArrayList<Planet> planetsList;
    Context context;

    public PlanetsAdapter(Context context, ArrayList<Planet> planetsList) {
        super(context, R.layout.planet_item, planetsList);
        this.planetsList = planetsList;
        this.context = context;
    }

    /*
    * View Holder Class: used to cache references to views within a layout
    *                    to avoid repeated loo up during scrolling, helps performance
    */
    private static class PlanetsViewHolder {
        ImageView planetImage;
        TextView planetName;
        TextView moonCount;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Get the current object at a given position
        Planet planet = getItem(position);

        // Inflate the layout if needed
        PlanetsViewHolder viewHolder;
        final View result;
        if (convertView == null) {
            viewHolder = new PlanetsViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.planet_item, parent, false);

            viewHolder.moonCount = convertView.findViewById(R.id.moonCount);
            viewHolder.planetName = convertView.findViewById(R.id.planetName);
            viewHolder.planetImage = convertView.findViewById(R.id.planetImageId);

            result = convertView;
            convertView.setTag(viewHolder);
        } else {
            // Reuse existing view
            viewHolder = (PlanetsViewHolder) convertView.getTag();
            result = convertView;
        }
        viewHolder.planetName.setText(Objects.requireNonNull(planet).getPlanetName());
        viewHolder.moonCount.setText(planet.getMoonCount());
        viewHolder.planetImage.setImageResource(planet.getPlanetImage());

        return result;
    }
}
