package com.java8.functinalComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorForString {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("bhanu");
		list.add("naveen");
		list.add("venu");
		list.add("chandu");
		list.add("ashok");
		list.add("shravan");
		
		System.out.println(list);
		
		Collections.sort(list, new MyCompForString());
		System.out.println("Order is :"+list);
	}
}
