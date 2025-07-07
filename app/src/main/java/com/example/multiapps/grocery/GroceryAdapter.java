package com.example.multiapps.grocery;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.multiapps.R;

import java.util.List;

public class GroceryAdapter extends RecyclerView.Adapter<GroceryAdapter.GroceryViewHolder> {
    private final List<GroceryItem> groceryItemList;

    public GroceryAdapter(List<GroceryItem> groceryItemList) {
        this.groceryItemList = groceryItemList;
    }

    @NonNull
    @Override
    public GroceryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Responsible for creating new view holder for items in the dataset
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.grocery_item, parent, false);
        return new GroceryViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull GroceryViewHolder holder, int position) {
        // Binds data from the dataset to the views within the view holder
        GroceryItem item = groceryItemList.get(position);
        holder.productInfo.setText(item.getDesc());
        holder.productName.setText(item.getName());
        holder.productImage.setImageResource(item.getImage());
    }

    @Override
    public int getItemCount() {
        // Return total number of items in dataset
        return groceryItemList.size();
    }


    public static class GroceryViewHolder extends RecyclerView.ViewHolder {
        ImageView productImage;
        TextView productName;
        TextView productInfo;
        public GroceryViewHolder(@NonNull View itemView) {
            super(itemView);
            productImage = itemView.findViewById(R.id.productImage);
            productName = itemView.findViewById(R.id.productName);
            productInfo = itemView.findViewById(R.id.productInfo);
        }
    }
}
