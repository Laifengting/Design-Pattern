package com.lft.iterator;

import java.util.Iterator;

/**
 * 计算机学院迭代器
 */
public class ComputerCollegeIterator implements Iterator {
	// 这里我们需要知道Department是以怎样的方式存放的——数组
	Department[] departments;
	// 遍历的位置
	int position = 0;
	
	public ComputerCollegeIterator(Department[] departments) {
		this.departments = departments;
	}
	
	@Override
	public boolean hasNext() {
		return position < departments.length && departments[position] != null;
	}
	
	@Override
	public Object next() {
		Department department = departments[position];
		position += 1;
		return department;
	}
	
	// 删除的方法。默认空实现。
	@Override
	public void remove() {
	}
}
