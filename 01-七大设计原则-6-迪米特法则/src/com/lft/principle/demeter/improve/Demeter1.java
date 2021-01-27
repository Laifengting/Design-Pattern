package com.lft.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020/9/6 15:06
 * E-mail:			laifengting@foxmail.com
 * <p>
 * Class Name:      Demeter1
 * Package Name:    com.lft.principle.demeter
 * @author Laifengting
 * @version 1.0.0
 * @since JDK 8
 * <p>
 * 客户端，使用者
 */
public class Demeter1 {
	public static void main(String[] args) {
		SchoolManager schoolManager = new SchoolManager();
		schoolManager.printAllEmployee(new CollegeManager());
		
	}
	
}

// 学校总部员工类
class Employee {
	private String id;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
}

// 学院的员工类
class CollegeEmployee {
	private String id;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
}

// 管理学院员工的类
class CollegeManager {
	// 返回学院的所有员工
	public List<CollegeEmployee> getAllEmployee() {
		List<CollegeEmployee> list = new ArrayList<>();
		// 增加了10个员工到list中。
		for (int i = 0; i < 10; i++) {
			CollegeEmployee emp = new CollegeEmployee();
			emp.setId("学院员工id= " + i);
			list.add(emp);
		}
		return list;
	}
	
	public void printEmployee() {
		List<CollegeEmployee> list1 = getAllEmployee();
		System.out.println("------------学院员工------------");
		for (CollegeEmployee e : list1) {
			System.out.println(e.getId());
		}
	}
}

// 学校管理类
class SchoolManager {
	// 返回学校总部的员工
	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList<>();
		// 增加了5个员工到list
		for (int i = 0; i < 5; i++) {
			Employee emp = new Employee();
			emp.setId("学校总部员工id= " + i);
			list.add(emp);
		}
		return list;
	}
	
	// 输出学校总部和学院员工信息的方法
	void printAllEmployee(CollegeManager sub) {
		
		sub.printEmployee();
		
		List<Employee> list2 = this.getAllEmployee();
		System.out.println("------------学校总部员工------------");
		for (Employee e : list2) {
			System.out.println(e.getId());
		}
	}
}
