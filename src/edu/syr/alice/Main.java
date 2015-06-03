package edu.syr.alice;

import edu.syr.alice.forecastio.weather.FIOCurrently;
import edu.syr.alice.google.places.PlacesQueryOptions;
import edu.syr.alice.google.places.PlacesResult;

/**
 * Created by Alice Yu on 6/1/15.
 * Email: zyu05@syr.edu
 */
public class Main {
    public static void main(String[] args) {
        AlicePlaces places = new AlicePlaces("AIzaSyAsMBcYsYok8ZdAthNRbW2tcWB6TsTtrBw");
        PlacesResult result = places.searchNearby(40.10744f, -88.22724f, 5000, PlacesQueryOptions.create().keyword( "siebel center" ));
        System.out.println( result.getStatus( ) );

        //Print place information
        for ( Place place : result ) {
            System.out.println(place.getName() + " at " + place.getGeometry().getLocation());
            //Provide your own forecastio api key
            place.setForecastIOAPIKey("24877842d7e591427a3a2d767a13508e");
            FIOCurrently currently = place.getCurrentlyWeather();
            String [] f  = currently.get().getFieldsArray();
            for(int i = 0; i<f.length;i++)
                System.out.println(f[i]+": "+currently.get().getByKey(f[i]));
        }
    }
}
