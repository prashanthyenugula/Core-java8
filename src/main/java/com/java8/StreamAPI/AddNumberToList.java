package com.java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class AddNumberToList {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(13);
		list.add(97);
		list.add(48);
		list.add(67);
		list.add(72);
		list.add(17);
		list.add(86);
		
		List<Integer> list2 = new ArrayList<>();
		for (Integer num : list) {
			num=num+5;
			list2.add(num);
		}
		System.out.println(list2);
	}

}
