package com.example.footballcompetitions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    LayoutInflater inflater;
    List<Competition> competitions;

    public Adapter(Context ctx, List<Competition> competitions) {
        this.inflater = LayoutInflater.from(ctx);
        this.competitions = competitions;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_list_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.competitionName.setText(competitions.get(position).getCompetition());
    }

    @Override
    public int getItemCount() {
        return competitions.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView competitionName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            competitionName = itemView.findViewById(R.id.competitionName);
        }
    }
}
