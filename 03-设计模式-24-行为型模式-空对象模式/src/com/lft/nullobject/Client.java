package com.lft.nullobject;

public class Client {
	public static void main(String[] args) {
		AbstractClass class1 = ClassFactory.getClass("Jack");
		AbstractClass class2 = ClassFactory.getClass("Herry");
		AbstractClass class3 = ClassFactory.getClass("Helen");
		AbstractClass class4 = ClassFactory.getClass("Tom");
		
		System.out.println("Names: ");
		System.out.println(class1.getName());
		System.out.println(class2.getName());
		System.out.println(class3.getName());
		System.out.println(class4.getName());
	}
}
