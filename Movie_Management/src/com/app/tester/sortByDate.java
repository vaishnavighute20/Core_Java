package com.app.tester;

import java.util.Comparator;

import com.app.core.Movie;

public class sortByDate implements Comparator <Movie>{

	@Override
	public int compare(Movie m1, Movie m2) {
 		return Integer.compare(m1.getRatings(), m2.getRatings());
	}

}
