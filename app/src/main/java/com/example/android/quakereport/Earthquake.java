package com.example.android.quakereport;

public class Earthquake {

    /** Magnitude of the earthquake */
    private double mMagnitude;

    /** Location of the earthquake */
    private String mLocation;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    /** url of the earthquake web page */
    private String mUrl;


    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the location where the earthquake happened
     * @param timeInMilliseconds is the date the earthquate occured
     * @param url is the website URL to find more details about the earthquake
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * Returns the magnitude of the earthquake.
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Returns the location of the earthquake.
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl(){
        return mUrl;
    }

}
