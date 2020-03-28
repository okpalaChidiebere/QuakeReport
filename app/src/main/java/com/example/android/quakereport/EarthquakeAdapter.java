package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    /**
     * Constructs a new {@link EarthquakeAdapter}.
     *
     * @param context of the app
     * @param earthquakes is the list of earthquakes, which is the data source of the adapter
     */
    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemViewRow = convertView;
        if (listItemViewRow == null) {
            listItemViewRow = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        // Find the earthquake at the given position in the list of earthquakes
        Earthquake currentEarthquake = getItem(position);

        // Find the TextView with view ID magnitude
        TextView magnitudeView = (TextView) listItemViewRow.findViewById(R.id.magnitude);
        // Display the magnitude of the current earthquake in that TextView
        magnitudeView.setText(currentEarthquake.getMagnitude());

        // Find the TextView with view ID location
        TextView locationView = (TextView) listItemViewRow.findViewById(R.id.location);
        // Display the magnitude of the current earthquake in that TextView
        locationView.setText(currentEarthquake.getLocation());

        // Create a new Date object from the time in milliseconds of the earthquake
        Date dateObject = new Date(currentEarthquake.getTimeInMilliseconds());

        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemViewRow.findViewById(R.id.date);
        /* Format the date string (i.e. "Mar 3, 1984")*/
        SimpleDateFormat dateFormatter = new SimpleDateFormat("MMM DD, yyyy");
        String formattedDate = dateFormatter.format(dateObject);
        /*ed format date*/
        // Display the date of the current earthquake in that TextView
        dateView.setText(formattedDate);

        // Find the TextView with view ID time
        TextView timeView = (TextView) listItemViewRow.findViewById(R.id.time);
        /* Format the time string (i.e. "4:30PM")*/
        SimpleDateFormat timeFormatter = new SimpleDateFormat("h:mm a");
        String formattedTime = timeFormatter.format(dateObject);
        /* end format time*/
        // Display the time of the current earthquake in that TextView
        timeView.setText(formattedTime);

        return listItemViewRow;
    }
}
