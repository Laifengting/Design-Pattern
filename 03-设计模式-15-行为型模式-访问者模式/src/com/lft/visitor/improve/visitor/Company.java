package com.lft.visitor.improve.visitor;

import com.lft.visitor.improve.element.GraduateStudent;
import com.lft.visitor.improve.element.Undergraduate;

public class Company implements Visitor {
	@Override
	public void visit(Undergraduate stu) {
		double math = stu.getMath();
		double english = stu.getEnglish();
		if (math >= 80 && english >= 90) {
			System.out.println(stu.getName() + "被录取了");
		}
	}
	
	@Override
	public void visit(GraduateStudent stu) {
		double math = stu.getMath();
		double english = stu.getEnglish();
		double physics = stu.getPhysics();
		if (math >= 80 && english >= 90 && physics >= 70) {
			System.out.println(stu.getName() + "被录取了");
		}
	}
}
