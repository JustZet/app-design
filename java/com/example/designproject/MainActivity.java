package com.example.designproject;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import com.example.designproject.adapters.ActivitiesRecycleViewAdapter;
import com.example.designproject.adapters.DatesRecyclerViewAdapter;
import com.example.designproject.models.ActivityModel;
import com.example.designproject.models.DateModel;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    public RecyclerView datesRecycleView;
    public RecyclerView activitiesRecycleView;

    public ArrayList<DateModel> dates;
    public ArrayList<ActivityModel> activities;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.initApp();
        this.initUI();
    }

    public void initApp() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }


    public void initUI() {
        setContentView(R.layout.activity_main);

        datesRecycleView = findViewById(R.id.dates_recycleView);
        activitiesRecycleView = findViewById(R.id.activities_listView);

        this.initDatesRecyclerView();
        this.initActivitiesRecyclerView();
    }

    public void initDatesRecyclerView() {
        this.initDates();

        DatesRecyclerViewAdapter adapter = new DatesRecyclerViewAdapter(this, dates);
        datesRecycleView.setAdapter(adapter);
        datesRecycleView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }
    public void initActivitiesRecyclerView() {

        this.initActivities();

        ActivitiesRecycleViewAdapter adapter = new ActivitiesRecycleViewAdapter(this, activities);
        activitiesRecycleView.setAdapter(adapter);
        activitiesRecycleView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }

    public void initDates() {
        dates = new ArrayList<DateModel>();

        dates.add(new DateModel(5, "Mon"));
        dates.add(new DateModel(6, "Tue"));
        dates.add(new DateModel(7, "Wed"));
        dates.add(new DateModel(8, "Thu"));
        dates.add(new DateModel(9, "Fri"));
        dates.add(new DateModel(10, "Sat"));
    }

    public void initActivities() {
        activities = new ArrayList<ActivityModel>();

        activities.add(new ActivityModel("Idea", "13 on this week", R.mipmap.idea_icon));
        activities.add(new ActivityModel("Food", "4 on this week", R.mipmap.food_icon));
        activities.add(new ActivityModel("Work", "15 on this week", R.mipmap.work_icon));
        activities.add(new ActivityModel("Sport", "7 on this week", R.mipmap.sport_icon));
        activities.add(new ActivityModel("Music", "24 on this week", R.mipmap.music_icon));
    }


}