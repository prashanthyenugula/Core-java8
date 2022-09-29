package com.java8.Constructor.Ref;

public class MobileImpl implements IMobile{

	@Override
	public Mobile getMobile(String name) {
		return new Mobile(name);
	}

}
