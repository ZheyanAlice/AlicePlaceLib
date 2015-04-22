package edu.syr.alice.place;

import com.google.gson.Gson;
import com.sun.tools.javac.util.Pair;
import edu.syr.alice.authentication.KeyBundle;
import edu.syr.alice.util.Util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * Created by Alice Yu on 3/22/15.
 * Email: zyu05@syr.edu
 */

public class PlaceSearchClient {
    private KeyBundle keyBundle;
    private Gson gson;

    public PlaceSearchClient(KeyBundle keyBundle){
        gson = new Gson();
        this.keyBundle = keyBundle;
    }

    private String buildURLForGooglePlace(String method, String requiredParams, Pair<String, String>... extraParams){
        String url = String.format("%s%s/json?%s", Util.GOOGLE_PLACE_URL, method, requiredParams);
        url = addExtraParams(url, extraParams);
        url = url.replace(' ', '+');
        return url;
    }

    private static String addExtraParams(String base, Pair<String, String>... extraParams) {
        for (Pair<String, String> param : extraParams) {
            base += "&" + param.fst + (param.snd != null ? "=" + param.snd : "");
        }
        return base;
    }

    //TODO
    private String buildURLForForecast(){
        return null;
    }

    public List<Place> nearbySearch(double lat, double lng, double radius, int limit, Pair<String, String>... extraParams){
        String requiredParams = String.format("key=%s&location=%f,%f&radius=%f", keyBundle.getGoogleApiKey().getAPIKey(),
                lat, lng, radius);
        String urlString = buildURLForGooglePlace(Util.NEARBY_SEARCH, requiredParams, extraParams);
        String line;
        StringBuffer result = new StringBuffer();
        try {
            URL url = new URL(urlString);
            HttpURLConnection  connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            while ((line = bufferedReader.readLine()) != null){
                result.append(line);
            }
            bufferedReader.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        PlacesResult placesResult = gson.fromJson(result.toString(), PlacesResult.class);
        return placesResult.getResults();
    }



    //TODO
    public List<Place> textSearch(){
        return null;
    }

    //TODO
    public List<Place> radarSearch(){
        return null;
    }

    //TODO
    public Place detailSearch(){
        return null;
    }

    //TODO
}
