package edu.syr.alice.place;

import java.util.List;

/**
 * Created by Alice Yu on 4/22/15.
 * Email: zyu05@syr.edu
 */
public class PlacesResult {
    private String status;
    private List<Place> results;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Place> getResults() {
        return results;
    }

    public void setResults(List<Place> results) {
        this.results = results;
    }
}
