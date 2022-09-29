package com.java8.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.functinalComparator.Student;

public class StudentStream {
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(100, "ajay", 69));
		list.add(new Student(101, "vinay", 52));
		list.add(new Student(102, "vamshi", 70));
		list.add(new Student(103, "sanjay", 25));
		list.add(new Student(104, "prashanth", 89));
		
		// List of >60 marks students printed!! (1.7v Java)
		/*List<Student> topperList = new ArrayList<>();
		
		for (Student student : list) {
			if(student.getMarks()>60) {
				topperList.add(student);
			}
		}*/
		
// List of >60 marks students printed!! (1.8v Java)
		List<Student> topperList = list.stream().filter(std->std.getMarks()>60).collect(Collectors.toList());
		
// List of evenName students printed!! (1.8v Java)
		List<Student> evenNameList = list.stream().filter(std->std.getName().length()%2==0).collect(Collectors.toList());
		
		System.out.println(evenNameList);
		System.out.println(topperList);
		
	}

}
