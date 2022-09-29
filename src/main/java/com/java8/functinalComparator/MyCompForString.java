package com.java8.functinalComparator;

import java.util.Comparator;

public class MyCompForString implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		//return o2.compareTo(o1);
		return o1.compareTo(o2);
	}
	
}
