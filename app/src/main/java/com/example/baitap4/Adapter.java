package com.example.baitap4;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
public class Adapter extends RecyclerView.Adapter<Adapter.SportViewHolder> {

    private List<Sqort> sportList;

    public static class SportViewHolder extends RecyclerView.ViewHolder {
        public ImageView sportImage;
        public TextView sportName;

        public SportViewHolder(View itemView) {
            super(itemView);
            sportImage = itemView.findViewById(R.id.sportImage);
            sportName = itemView.findViewById(R.id.sportName);
        }
    }

    public Adapter(List<Sqort> sportList) {
        this.sportList = sportList;
    }

    @Override
    public SportViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sport_item, parent, false);
        return new SportViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SportViewHolder holder, int position) {
        Sqort sport = sportList.get(position);
        holder.sportName.setText(sport.getName());
        holder.sportImage.setImageResource(sport.getImageResId());
    }

    @Override
    public int getItemCount() {
        return sportList != null ? sportList.size() : 0; // added null check to avoid crash
    }
}
