package com.lft.visitor.improve;

import com.lft.visitor.improve.element.GraduateStudent;
import com.lft.visitor.improve.element.Undergraduate;
import com.lft.visitor.improve.visitor.Company;
import com.lft.visitor.improve.visitor.Visitor;

public class Client {
	public static void main(String[] args) {
		// 创建一个访问者对象，指向具体的访问者引用。
		Visitor visitor = new Company();
		// 创建一个对象结构对象。
		ObjectStructure objectStructure = new ObjectStructure();
		
		// 向其中添加学生。
		objectStructure.addStudent(new Undergraduate(50, 70, "张三"));
		objectStructure.addStudent(new Undergraduate(60, 80, "李四"));
		objectStructure.addStudent(new Undergraduate(70, 90, "王五"));
		objectStructure.addStudent(new Undergraduate(80, 98, "赵六"));
		objectStructure.addStudent(new GraduateStudent(80, 60, 70, "小明"));
		objectStructure.addStudent(new GraduateStudent(90, 90, 98, "小红"));
		objectStructure.addStudent(new GraduateStudent(70, 75, 80, "小王"));
		objectStructure.addStudent(new GraduateStudent(60, 88, 90, "小张"));
		
		// 显示学生录取情况
		objectStructure.displayStudent(visitor);
	}
}
