package com.java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class TestStringForEach {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("Hai");
		list.add("Hero");
		list.add("Honda");
		list.add("Activa");
		list.add("Yamaha");
		list.add("Enfield");
		
// here the string having H letter that is printed (1.8v)
		//list.stream().filter(s->s.contains("H")).forEach(System.out::println);
		
// here  the string didn't having H letter that is printed (1.7v)	
		/*List<String> filterdNames = new ArrayList<>();
		for (String item : list) {
			if(!item.contains("H"))
				filterdNames.add(item);
		}
		System.out.println(filterdNames);*/
		
// here  the string didn't having H letter that is printed (1.8v)
		list.removeIf(s->s.contains("H"));
		System.out.println(list);
	}

}
