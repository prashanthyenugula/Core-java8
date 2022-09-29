package com.java8.Constructor.Ref;

public class InterfImpl implements InterF {

	@Override
	public TestSample getSample() {
		return new TestSample();
	}

}
