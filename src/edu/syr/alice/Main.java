package edu.syr.alice;


import edu.syr.alice.authentication.KeyBundle;
import edu.syr.alice.place.PlaceSearchClient;

/**
 * Created by Alice Yu on 3/22/15.
 * Email: zyu05@syr.edu
 */

public class Main {
    public static void main(String[] args) {
        KeyBundle keyBundle = new KeyBundle();
        PlaceSearchClient placeSearchClient = new PlaceSearchClient(keyBundle);

    }
}
