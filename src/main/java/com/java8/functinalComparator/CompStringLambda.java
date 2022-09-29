package com.java8.functinalComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompStringLambda {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("rakesh");
		list.add("prashanth");
		list.add("teja");
		list.add("vishwa");
		list.add("surya");
		
		System.out.println(list);
		
		Collections.sort(list, (o1,o2)->o2.compareTo(o1));
		System.out.println(list);
	}

}
