package com.lft.nullobject;

public class NullClass extends AbstractClass {
	
	@Override
	public boolean isNil() {
		return true;
	}
	
	@Override
	public String getName() {
		return "Not Available in Class Database";
	}
}