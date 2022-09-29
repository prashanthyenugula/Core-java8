package com.java8.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.java8.functinalComparator.Student;

public class PredicateStudentMarks {
	
	public static void main(String[] args) {
		
		List<Student> stdList = new ArrayList<>();
		stdList.add(new Student(100, "ajay", 927));
		stdList.add(new Student(101, "vinay", 882));
		stdList.add(new Student(102, "vamshi", 776));
		stdList.add(new Student(103, "sanjay", 922));
		stdList.add(new Student(104, "prashanth", 789));
		
		Predicate<Student> p = std-> std.getMarks()>800;
		for (Student student : stdList) {
			if(p.test(student)) { // here 800+ marks students printed
				System.out.println(student);
			}
		}
		System.out.println("---------------");
		
		Predicate<Student> p2 = std-> std.getStdId()%2==0;
		for (Student student : stdList) {
			if(p2.test(student)) // here even no.Id students printed
				System.out.println(student);
		}
	}

}
