package com.example.multiapps.grocery;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;;

import com.example.multiapps.R;

import java.util.ArrayList;
import java.util.List;

public class GroceryActivity extends AppCompatActivity {
    GroceryAdapter groceryAdapter;
    LinearLayoutManager layoutManager;
    List<GroceryItem> groceryList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_grocery);

        recyclerView = findViewById(R.id.groceryList);
        groceryList = new ArrayList<>(List.of(
                new GroceryItem(R.drawable.fruit, "Fresh garden fruits", "Fruits"),
                new GroceryItem(R.drawable.vegitables, "Delicious Veggies", "Vegetables"),
                new GroceryItem(R.drawable.bread, "Oven baked soft bread", "Bread"),
                new GroceryItem(R.drawable.beverage, "Juice, Tea, Coffee, and Soda", "Beverages"),
                new GroceryItem(R.drawable.milk, "Milk Shakes and Yoghurts", "Diary"),
                new GroceryItem(R.drawable.popcorn, "Popcorn, Doughnuts, and Drinks", "Popcorn")
        ));

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        groceryAdapter = new GroceryAdapter(groceryList);
        recyclerView.setAdapter(groceryAdapter);
    }
}