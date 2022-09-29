package com.java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class TestMinMax {
	
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
		
		System.out.println(list);
// min means in list of array it is expecting 1st element of that array		
		Integer resultMin = list.stream().min((n1,n2)->n1-n2).get();
		
// max means in list of array it is expecting last element of that array			
		Integer resultMax = list.stream().min((n1,n2)->n2-n1).get();
		
		System.out.println(resultMin);
		System.out.println(resultMax);
	}

}
