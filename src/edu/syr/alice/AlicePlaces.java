package edu.syr.alice;

import edu.syr.alice.google.places.GooglePlaces;

/**
 * Created by Alice Yu on 6/1/15.
 * Email: zyu05@syr.edu
 */
public class AlicePlaces extends GooglePlaces{
    private String googlePlaceAPIKey;
    private String forecastIOAPIKey;
    private GooglePlaces places;

    public AlicePlaces(String googlePlaceAPIKey, String forecastIOAPIKey) {
        super(googlePlaceAPIKey);
        this.forecastIOAPIKey = forecastIOAPIKey;
    }

    public AlicePlaces(String googlePlaceAPIKey) {
        super(googlePlaceAPIKey);
    }

}
