package com.lft.visitor.improve.visitor;

import com.lft.visitor.improve.element.GraduateStudent;
import com.lft.visitor.improve.element.Undergraduate;

public interface Visitor {
	void visit(Undergraduate stu);
	
	void visit(GraduateStudent stu);
}
