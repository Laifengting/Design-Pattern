package com.lft.visitor.improve.element;

import com.lft.visitor.improve.visitor.Visitor;

public class GraduateStudent extends Student {
	double math, english, physics;
	String name;
	
	public GraduateStudent(double math, double english, double physics, String name) {
		this.math = math;
		this.english = english;
		this.physics = physics;
		this.name = name;
	}
	
	public double getPhysics() {
		return physics;
	}
	
	public double getMath() {
		return math;
	}
	
	public double getEnglish() {
		return english;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
