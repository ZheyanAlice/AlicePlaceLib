package edu.syr.alice;

import edu.syr.alice.forecastio.weather.*;

import java.util.logging.Logger;

/**
 * Created by Alice Yu on 6/1/15.
 * Email: zyu05@syr.edu
 */
public class Place extends edu.syr.alice.google.places.Place {
    private String forecastIOAPIKey;

    public Place(String forecastIOAPIKey) {
        this.forecastIOAPIKey = forecastIOAPIKey;
    }

    public void setForecastIOAPIKey(String forecastIOAPIKey){
        this.forecastIOAPIKey = forecastIOAPIKey;
    }

    private ForecastIO forecastIO;

    public FIOCurrently getCurrentlyWeather(){
        checkAndReturnForecastIO();
        FIOCurrently currently = new FIOCurrently(forecastIO);
        return currently;
    }

    public FIOMinutely getMinutelyWeather(){
        checkAndReturnForecastIO();
        FIOMinutely minutely = new FIOMinutely(forecastIO);
        return minutely;
    }

    public FIOHourly getHourlyWeather(){
        checkAndReturnForecastIO();
        FIOHourly hourly = new FIOHourly(forecastIO);
        return hourly;
    }

    public FIODaily getDailyWeather(){
        checkAndReturnForecastIO();
        FIODaily daily = new FIODaily(forecastIO);
        return daily;
    }

    public FIOAlerts getAlertWeather(){
        checkAndReturnForecastIO();
        FIOAlerts alerts = new FIOAlerts(forecastIO);
        return alerts;
    }

    private void checkAndReturnForecastIO(){
        if (forecastIOAPIKey.isEmpty()){
            Logger.getLogger("Alice_Place_Logger").severe("Please set ForecastIO API Key");
        }
        if (null == forecastIO){
            forecastIO = new ForecastIO(forecastIOAPIKey);
            forecastIO.getForecast(String.valueOf(getGeometry().getLocation().getLat()),
                    String.valueOf(getGeometry().getLocation().getLng()));
            forecastIO.setUnits(ForecastIO.UNITS_SI);
        }
    }
}
