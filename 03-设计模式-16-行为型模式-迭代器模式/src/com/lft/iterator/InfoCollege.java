package com.lft.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 信息工程学院
 */
public class InfoCollege implements College {
	List<Department> departmentList;
	int numOfDepartment = 0;    // 保存当前数组的对象个数。
	
	@Override
	public String getName() {
		return "信息工程学院";
	}
	
	public InfoCollege() {
		departmentList = new ArrayList<>();
		addDepartment("信息安全专业", "~~信息案例专业~~");
		addDepartment("网络安全专业", "~~网络案例专业~~");
		addDepartment("服务器安全专业", "~~服务器案例专业~~");
	}
	
	@Override
	public void addDepartment(String name, String desc) {
		Department department = new Department(name, desc);
		departmentList.add(department);
		numOfDepartment++;
	}
	
	@Override
	public Iterator createIterator() {
		return new InfoCollegeIterator(departmentList);
	}
}
