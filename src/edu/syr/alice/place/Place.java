package edu.syr.alice.place;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by Alice Yu on 3/22/15.
 * Email: zyu05@syr.edu
 */
public class Place {
    private String icon;
    private String id;
    private String name;
    private String place_id;
    private int price_level;
    private float ratings;
    private List<String> types;
    private Geometry geometry;

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public int getPrice_level() {
        return price_level;
    }

    public void setPrice_level(int price_level) {
        this.price_level = price_level;
    }

    public float getRatings() {
        return ratings;
    }

    public void setRatings(float ratings) {
        this.ratings = ratings;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public String toString(){
        return new Gson().toJson(this);
    }

    public static class Geometry {

        private Location location;

        public Location getLocation( ) {
            return this.location;
        }

        @Override
        public String toString( ) {
            return this.getLocation( ).toString( );
        }

    }

    public static class Location {

        private float lat;

        private float lng;

        public float getLat( ) {
            return this.lat;
        }

        public float getLng( ) {
            return this.lng;
        }

        @Override
        public String toString( ) {
            return this.getLat( ) + ", " + this.getLng( );
        }

    }
}
