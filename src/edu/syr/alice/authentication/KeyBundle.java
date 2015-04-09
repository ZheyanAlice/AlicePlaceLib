package edu.syr.alice.authentication;

/**
 * Created by Alice Yu on 3/22/15.
 * zyu05@syr.edu
 */

public class KeyBundle {
    private static GooglePlaceAPIKey GOOGLE_API_KEY = new GooglePlaceAPIKey("PlaceHolder");
    private static ForecastAPIKey FORECAST_API_KEY = new ForecastAPIKey("PlaceHolder");

    public KeyBundle() {
        this(GOOGLE_API_KEY, FORECAST_API_KEY);
    }

    public KeyBundle(GooglePlaceAPIKey googlePlaceAPIKey, ForecastAPIKey forecastAPIKey){
        GOOGLE_API_KEY = googlePlaceAPIKey;
        FORECAST_API_KEY = forecastAPIKey;
    }

    public KeyBundle(GooglePlaceAPIKey googlePlaceAPIKey){
        this(googlePlaceAPIKey, FORECAST_API_KEY);
    }

    public KeyBundle(ForecastAPIKey forecastAPIKey){
        this(GOOGLE_API_KEY, forecastAPIKey);
    }

    public GooglePlaceAPIKey getGoogleApiKey(){
        return GOOGLE_API_KEY;
    }

    public ForecastAPIKey getForecastApiKey(){
        return FORECAST_API_KEY;
    }
}
