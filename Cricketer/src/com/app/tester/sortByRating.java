package com.app.tester;

import java.util.Comparator;

import com.app.core.Cricketer;

public class sortByRating implements Comparator <Cricketer> {

	@Override
	public int compare(Cricketer c1, Cricketer c2) {
 		return Integer.compare(c1.getRating(), c2.getRating());
	}

}
