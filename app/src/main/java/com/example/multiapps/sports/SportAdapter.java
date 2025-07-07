package com.example.multiapps.sports;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.multiapps.R;

import java.util.List;

public class SportAdapter extends RecyclerView.Adapter<SportAdapter.SportViewHolder> {
    private final List<Sport> sportList;

    public SportAdapter(List<Sport> sportList) {
        this.sportList = sportList;
    }

    @NonNull
    @Override
    public SportViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View sportView = LayoutInflater.from(parent.getContext()).inflate(R.layout.sport_item_card, parent, false);
        return new SportViewHolder(sportView);
    }

    @Override
    public void onBindViewHolder(@NonNull SportViewHolder holder, int position) {
        Sport item = sportList.get(position);
        holder.sportName.setText(item.getSportName());
        holder.sportImage.setImageResource(item.getSportImage());
    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }


    public static class SportViewHolder extends RecyclerView.ViewHolder {
        ImageView sportImage;
        TextView sportName;
        public SportViewHolder(@NonNull View itemView) {
            super(itemView);
            sportImage = itemView.findViewById(R.id.sportCardImage);
            sportName = itemView.findViewById(R.id.sportCardText);
        }
    }
}
