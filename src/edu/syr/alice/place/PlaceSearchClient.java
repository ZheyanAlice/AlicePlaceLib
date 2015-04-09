package edu.syr.alice.place;

import com.sun.tools.javac.util.Pair;
import edu.syr.alice.authentication.KeyBundle;
import edu.syr.alice.util.Util;

import java.util.List;

/**
 * Created by Alice Yu on 3/22/15.
 * Email: zyu05@syr.edu
 */

public class PlaceSearchClient {
    private KeyBundle keyBundle;

    public PlaceSearchClient(KeyBundle keyBundle){
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

    //TODO
    public List<Place> nearbySearch(double lat, double lng, double radius, int limit, Pair<String, String>... extraParams){
        String requiredParams = String.format("key=%s&location=%f,%f&radius=%f", keyBundle.getGoogleApiKey().getAPIKey(),
                lat, lng, radius);
        String URL = buildURLForGooglePlace(Util.NEARBY_SEARCH, requiredParams, extraParams);

        return null;
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
