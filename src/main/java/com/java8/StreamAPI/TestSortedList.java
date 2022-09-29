package com.java8.StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestSortedList {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(67);
		list.add(34);
		list.add(12);
		list.add(45);
		list.add(76);
		list.add(51);
		list.add(95);
		list.add(16);
		
		
//		Collections.sort(list, (n1,n2)->n1-n2);// Ascending Order 1.8
//		Collections.sort(list, (n1,n2)->n2-n1);// Descending Order 1.8
		
// Arranging ascending order using streamAPI
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
// Arranging descending order using streamAPI		
		List<Integer> sortedList1 = list.stream().sorted((n1,n2)->n2-n1).collect(Collectors.toList());
		
		System.out.println(list);
		System.out.println(sortedList);
		System.out.println(sortedList1);
		System.out.println(sortedList1.get(0));// to find Highest number in list
	}

}
