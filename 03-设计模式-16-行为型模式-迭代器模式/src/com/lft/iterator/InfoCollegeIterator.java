package com.lft.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * 信息工程学院迭代器
 */
public class InfoCollegeIterator implements Iterator {
	// 这里我们需要知道Department是以怎样的方式存放的——集合
	List<Department> departmentList;
	int index = -1;
	
	public InfoCollegeIterator(List<Department> departmentList) {
		this.departmentList = departmentList;
	}
	
	@Override
	public boolean hasNext() {
		if (index >= departmentList.size() - 1) {
			return false;
		} else {
			index += 1;
			return true;
		}
	}
	
	@Override
	public Object next() {
		return departmentList.get(index);
	}
	
	// 删除的方法。默认空实现。
	@Override
	public void remove() {
	}
}
