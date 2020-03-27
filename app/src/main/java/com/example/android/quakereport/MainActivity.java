package com.example.android.quakereport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String LOG_TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a fake list of earthquake locations.
        ArrayList<Earthquake> earthquakes = new ArrayList<>();
        earthquakes.add(new Earthquake("5.1","San Francisco, CA", "Feb 2, 2016"));
        earthquakes.add(new Earthquake("7.0","London", "Mar 22, 2017"));
        earthquakes.add(new Earthquake("1.0","Italy", "Apr 10, 2014"));
        earthquakes.add(new Earthquake("2.1","Tokyo", "July 11, 2018"));
        earthquakes.add(new Earthquake("1.1","Mexico city", "Jan 6 1994"));
        earthquakes.add(new Earthquake("3.0","Canada", "Dec 10, 2021"));


        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}
