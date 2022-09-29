package com.java8.Constructor.Ref;

public class SampleConstructorRef {
	
	public static void main(String[] args) {
		InterF i = TestSample :: new;
		
		TestSample s1 = i.getSample();
		TestSample s2 = i.getSample();
		TestSample s3 = i.getSample();
		TestSample s4 = i.getSample();
	}

}
