package com.lft.nullobject;

public class ClassFactory {
	public static final String[] names = {"Jack", "Helen", "Tom"};
	
	public static AbstractClass getClass(String name) {
		for (String s : names) {
			if (s.equalsIgnoreCase(name)) {
				return new RealClass(name);
			}
		}
		return new NullClass();
	}
}