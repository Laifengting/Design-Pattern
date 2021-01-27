package com.lft.iterator;

import java.util.Iterator;
import java.util.List;

public class OutputImpl {
	// 学院集合
	List<College> collegeList;
	
	public OutputImpl(List<College> collegeList) {
		this.collegeList = collegeList;
	}
	
	// 输出 1. 打印专业
	public void printDepartment(Iterator iterator) {
		while (iterator.hasNext()) {
			Department department = (Department) iterator.next();
			System.out.println(department.getName() + "\t\t" + department.getDesc());
		}
	}
	
	// 输出 2. 打印院系
	public void printCollege() {
		// 从collegeList中取出所有的学院
		Iterator<College> iterator = collegeList.iterator();
		while (iterator.hasNext()) {
			College college = iterator.next();
			System.out.println("==========" + college.getName() + "==========");
			printDepartment(college.createIterator());
		}
	}
	
}
