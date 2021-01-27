package com.lft.nullobject;

public class RealClass extends AbstractClass {
	
	public RealClass(String name) {
		this.name = name;
	}
	
	@Override
	public boolean isNil() {
		return false;
	}
	
	@Override
	public String getName() {
		return name;
	}
}