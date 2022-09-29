package com.java8.Constructor.Ref;

public class SampleAnnonymous {

	public static void main(String[] args) {
		InterF i = new InterF() {
			
			@Override
			public TestSample getSample() {
				return new TestSample();
			}
		};
		
		TestSample s1 = i.getSample();
		TestSample s2 = i.getSample();
		TestSample s3 = i.getSample();
		TestSample s4 = i.getSample();
	}
}
