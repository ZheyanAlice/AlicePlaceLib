package edu.syr.alice.google.places;

import edu.syr.alice.*;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class PlacesResult extends Result implements Iterable<edu.syr.alice.Place> {
		
	private String nextPageToken;

	private List<edu.syr.alice.Place> results;
		
	public List<edu.syr.alice.Place> asList( ) {
		return Collections.unmodifiableList( this.results );
	}

	public String getNextPageToken( ) {
		return this.nextPageToken;
	}
	
	@Override
	public Iterator<edu.syr.alice.Place> iterator( ) {
		return this.results.iterator( );
	}

	public int size( ) {
		return this.results.size( );
	}

}
