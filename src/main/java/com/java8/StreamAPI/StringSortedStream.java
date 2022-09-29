package com.java8.StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringSortedStream {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("chandu");
		list.add("ashok");
		list.add("venu");
		list.add("sai");
		list.add("ajay");
		list.add("bhanu");
		list.add("naveen");
		list.add("sanjeev");
		list.add("teja");
		
		Collections.sort(list,(s1,s2)->s1.compareTo(s2));// Alphabetical Order 1.8
		
// 	Alphabetical Order using streamAPI	
		List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		System.out.println(list);
	}

}
