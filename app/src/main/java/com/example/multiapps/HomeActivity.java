package com.example.multiapps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.multiapps.grocery.GroceryActivity;
import com.example.multiapps.planets.PlanetsActivity;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    Button planetsButton;
    Button grocerysButton;
    TextView welcomeMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        grocerysButton = findViewById(R.id.groceryButton);
        planetsButton = findViewById(R.id.planetsButton);
        welcomeMessage = findViewById(R.id.welcomeMessage);

        grocerysButton.setOnClickListener(this);
        planetsButton.setOnClickListener(this);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("username");
        welcomeMessage.setText(String.format("Welcome %s👋🏽", userName));
        welcomeMessage.setOnClickListener(v -> Toast.makeText(this, "Welcome" + this, Toast.LENGTH_LONG).show());
    }

    public void goToActivity(Class<?> cls) {
        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.groceryButton) {
            goToActivity(GroceryActivity.class);
        } else if (v.getId() == R.id.planetsButton) {
            goToActivity(PlanetsActivity.class);
        }
    }
}