package edu.syr.alice.authentication;

/**
 * Created by Alice Yu on 3/22/15.
 * Email: zyu05@syr.edu
 */

public class APIKey {
    private String APIKEY;

    public APIKey(String APIKEY) {
        this.APIKEY = APIKEY;
    }

    public String getAPIKey(){
        return APIKEY;
    }

    public void setAPIKey(String APIKEY){
        this.APIKEY = APIKEY;
    }
}
