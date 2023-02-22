package com.example.designproject.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.designproject.R;
import com.example.designproject.models.ActivityModel;

import java.util.ArrayList;

public class ActivitiesRecycleViewAdapter extends RecyclerView.Adapter<ActivitiesRecycleViewAdapter.MyViewHolder>{
    Context context;
    ArrayList<ActivityModel> activities;

    public ActivitiesRecycleViewAdapter(Context context, ArrayList<ActivityModel> activities) {
        this.context = context;
        this.activities = activities;
    }

    @NonNull
    @Override
    public ActivitiesRecycleViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_container, parent, false);

        return new ActivitiesRecycleViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ActivitiesRecycleViewAdapter.MyViewHolder holder, int position) {
        ActivityModel activity = activities.get(position);

        holder.title.setText(activity.getTitle());
        holder.info.setText(activity.getDescription());
        holder.icon.setImageResource(activity.getImage());

    }

    @Override
    public int getItemCount() {
        return activities.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView icon;
        TextView title;
        TextView info;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            icon = itemView.findViewById(R.id.activity_icon);
            title = itemView.findViewById(R.id.activity_title);
            info = itemView.findViewById(R.id.activity_info);

        }
    }
}
