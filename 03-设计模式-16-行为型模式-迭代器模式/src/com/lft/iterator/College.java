package com.lft.iterator;

import java.util.Iterator;

/**
 * 学校
 */
public interface College {
	
	String getName();
	
	void addDepartment(String name, String desc);
	
	Iterator<?> createIterator();
}
