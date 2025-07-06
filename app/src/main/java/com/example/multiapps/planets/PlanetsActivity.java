package com.example.multiapps.planets;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.multiapps.R;

import java.util.ArrayList;
import java.util.List;

public class PlanetsActivity extends AppCompatActivity {
    ArrayList<Planet> planets;
    ListView planetsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_planets);
        // Create adapter view
        planetsListView = findViewById(R.id.planetsListView);
        // Data Source
        planets = new ArrayList<>(List.of(
                new Planet("Earth", "1 Moon", R.drawable.earth),
                new Planet("Mercury", "0 Moons", R.drawable.mercury),
                new Planet("Venus", "0 Moons", R.drawable.venus),
                new Planet("Mars", "2 Moons", R.drawable.mars),
                new Planet("Jupiter", "95 Moons", R.drawable.jupiter),
                new Planet("Saturn", "274 Moons", R.drawable.saturn),
                new Planet("Uranus", "28 Moons", R.drawable.uranus),
                new Planet("Neptune", "16 Moons", R.drawable.neptune),
                new Planet("Pluto", "5 Moons", R.drawable.pluto)
        ));
        PlanetsAdapter planetsAdapter = new PlanetsAdapter(getApplicationContext(), planets);
        planetsListView.setAdapter(planetsAdapter);
    }
}