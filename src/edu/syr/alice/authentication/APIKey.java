package edu.syr.alice.authentication;

/**
 * Created by Alice Yu on 3/22/15.
 * Email: zyu05@syr.edu
 */

public class APIKey {
    private String APIKey;

    public APIKey(String APIKey) {
        this.APIKey = APIKey;
    }

    public String getAPIKey(){
        return APIKey;
    }

    public void setAPIKey(String APIKey){
        this.APIKey = APIKey;
    }
}
