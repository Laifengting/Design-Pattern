package com.lft.principle.interface_segregation.improce;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020/9/5 15:23
 * E-mail:			laifengting@foxmail.com
 * <p>
 * Class Name:      InterfaceSegregation2
 * Package Name:    com.lft.principle.interface_segregation
 * @author Laifengting
 * @version 1.0.0
 * @since JDK 8
 */
public class InterfaceSegregation2 {
	public static void main(String[] args) {
		A a = new A();
		// A类通过接口去依赖B类
		a.depend1(new B());
		a.depend2(new B());
		a.depend3(new B());
		
		C c = new C();
		c.depend1(new D());
		c.depend4(new D());
		c.depend5(new D());
	}
}

interface Interface1 {
	void opration1();
}

interface Interface2 {
	void opration2();
	
	void opration3();
}

interface Interface3 {
	void opration4();
	
	void opration5();
}

class B implements Interface1, Interface2 {
	
	@Override
	public void opration1() {
		System.out.println("B 实现了 opration1");
	}
	
	@Override
	public void opration2() {
		System.out.println("B 实现了 opration2");
	}
	
	@Override
	public void opration3() {
		System.out.println("B 实现了 opration3");
	}
}

class D implements Interface1, Interface3 {
	
	@Override
	public void opration1() {
		System.out.println("D 实现了 opration1");
	}
	
	@Override
	public void opration4() {
		System.out.println("D 实现了 opration4");
	}
	
	@Override
	public void opration5() {
		System.out.println("D 实现了 opration5");
	}
}

class A {
	public void depend1(Interface1 i1) {
		i1.opration1();
	}
	
	public void depend2(Interface2 i2) {
		i2.opration2();
	}
	
	public void depend3(Interface2 i2) {
		i2.opration3();
	}
}

class C {
	public void depend1(Interface1 i1) {
		i1.opration1();
	}
	
	public void depend4(Interface3 i3) {
		i3.opration4();
	}
	
	public void depend5(Interface3 i3) {
		i3.opration5();
	}
}