package com.lft.composite.entity;

public class CompositeEntityPatternDemo {
	public static void main(String[] args) {
		Strategies strategies = new Strategies();
		strategies.setData("Test", "Data");
		strategies.printData();
		strategies.setData("Second Test", "Data1");
		strategies.printData();
	}
}