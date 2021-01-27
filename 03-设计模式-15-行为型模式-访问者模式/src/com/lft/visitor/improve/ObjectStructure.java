package com.lft.visitor.improve;

import com.lft.visitor.improve.element.Student;
import com.lft.visitor.improve.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
	// 维护了一个集合。
	private List<Student> studentList = new ArrayList<>();
	
	// 增加到studentList
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	// 从studentList中删除
	public void removeStudent(Student student) {
		studentList.remove(student);
	}
	
	// 显示测评情况
	public void displayStudent(Visitor visitor) {
		for (Student student : studentList) {
			student.accept(visitor);
		}
	}
}
