package com.java8.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.java8.functinalComparator.Student;

public class FunctionStudent {
	
	public static void main(String[] args) {
		
		List<Student> List = new ArrayList<>();
		List.add(new Student(100, "ajay", 69));
		List.add(new Student(101, "vinay", 52));
		List.add(new Student(102, "vamshi", 70));
		List.add(new Student(103, "sanjay", 25));
		List.add(new Student(104, "prashanth", 89));
		
		//FunctionStudent f = new FunctionStudent();
		
		Function<Student, String> f = (s)->{
			if(s.getMarks()>70)
				return "A";
				else if(s.getMarks()>60)
					return"B";
				else if(s.getMarks()>50)
					return"C";
				else
					return "Fail";
		};
		
		for (Student student : List) {
			System.out.println(student+" "+f.apply(student));
		}
	}

	/*public String findGrade(Student s) {
		
		if(s.getMarks()>70)
		return "A";
		else if(s.getMarks()>60)
			return"B";
		else if(s.getMarks()>50)
			return"C";
		else
			return "Fail";
	}*/
}
