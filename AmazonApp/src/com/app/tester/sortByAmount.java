package com.app.tester;

import java.util.Comparator;

import com.app.core.Amazon;

public class sortByAmount implements Comparator <Amazon> {

	@Override
	public int compare(Amazon A1, Amazon A2) {
		
		return Double.compare(A1.getAmount(),A2.getAmount());
	}

}
