package com.example.multiapps;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.multiapps.planets.PlanetsActivity;

public class HomeActivity extends AppCompatActivity {
    Button planetsButton;
    TextView welcomeMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        planetsButton = findViewById(R.id.planetsButton);
        welcomeMessage = findViewById(R.id.welcomeMessage);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("username");
        welcomeMessage.setText(String.format("Welcome %s👋🏽", userName));

        planetsButton.setOnClickListener(v -> {
            goToActivity();
        });
    }

    public void goToActivity() {
        Intent intent = new Intent(this, PlanetsActivity.class);
        startActivity(intent);
    }
}