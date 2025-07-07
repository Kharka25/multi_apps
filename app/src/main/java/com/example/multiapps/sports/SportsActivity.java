package com.example.multiapps.sports;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.multiapps.R;

import java.util.ArrayList;
import java.util.List;

public class SportsActivity extends AppCompatActivity {
    List<Sport> sportList;
    RecyclerView recyclerView;
    SportAdapter sportAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sports);
        recyclerView = findViewById(R.id.sportsList);

        sportList = new ArrayList<>(List.of(
                new Sport(R.drawable.football, "Football"),
                new Sport(R.drawable.basketball, "Basketball"),
                new Sport(R.drawable.ping, "PingPong"),
                new Sport(R.drawable.tennis, "Tennis"),
                new Sport(R.drawable.volley, "Volleyball")
        ));

        sportAdapter = new SportAdapter(sportList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(sportAdapter);
    }
}