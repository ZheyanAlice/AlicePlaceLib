package edu.syr.alice.place;

/**
 * Created by Alice Yu on 3/22/15.
 * Email: zyu05@syr.edu
 */
public class Location {
    private float lat;
    private float lng;

    public Location(float lat, float lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public float getLatitude() {
        return lat;
    }

    public void setLatitude(float lat) {
        this.lat = lat;
    }

    public float getLongitude() {
        return lng;
    }

    public void setLongitude(float lng) {
        this.lng = lng;
    }
}
