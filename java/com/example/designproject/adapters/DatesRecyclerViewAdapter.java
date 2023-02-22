package com.example.designproject.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.designproject.R;
import com.example.designproject.models.DateModel;

import java.util.ArrayList;

public class DatesRecyclerViewAdapter extends RecyclerView.Adapter<DatesRecyclerViewAdapter.MyViewHolder> {

    Context context;
    ArrayList<DateModel> dates;

    public DatesRecyclerViewAdapter(Context context, ArrayList<DateModel> dates) {
        this.context = context;
        this.dates = dates;
    }

    @Override
    public void onBindViewHolder(@NonNull DatesRecyclerViewAdapter.MyViewHolder holder, int position) {
        DateModel date = dates.get(position);

        String day = String.valueOf(date.getDay());
        holder.monthDayNumber.setText(day);
        holder.dayAbbreviation.setText(date.getDayOfWeek());

    }


    @Override
    public int getItemCount() {
        return dates.size();
    }

    @NonNull
    @Override
    public DatesRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.date_small_card, parent, false);

        return new DatesRecyclerViewAdapter.MyViewHolder(view);
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView monthDayNumber;
        TextView dayAbbreviation;

       public MyViewHolder(@NonNull View view) {
            super(view);

            monthDayNumber = view.findViewById(R.id.date_dayNumber);
            dayAbbreviation = view.findViewById(R.id.date_dayAbbr);
        }
    }
}
