package com.lft.principle.interface_segregation;

interface Interface1 {
	void operation1();
	
	void operation2();
	
	void operation3();
	
	void operation4();
	
	void operation5();
}

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020/9/5 14:24
 * E-mail:			laifengting@foxmail.com
 * <p>
 * Class Name:      InterfaceSegregation1
 * Package Name:    com.lft.principle.interface_segregation
 * @author Laifengting
 * @version 1.0.0
 * @since JDK 8
 */
public class InterfaceSegregation1 {
	public static void main(String[] args) {
		A a = new A();
		a.depend1(new B());
		a.depend2(new B());
		a.depend3(new B());
		
		C c = new C();
		c.depend1(new D());
		c.depend4(new D());
		c.depend5(new D());
		
	}
}

/**
 * 分析：BD都实现接口Interface1，其中部分方法是完全没必要去实现的。
 */
class B implements Interface1 {
	
	@Override
	public void operation1() {
		System.out.println("B 实现 operation1");
	}
	
	@Override
	public void operation2() {
		System.out.println("B 实现 operation2");
	}
	
	@Override
	public void operation3() {
		System.out.println("B 实现 operation3");
	}
	
	@Override
	public void operation4() {
		System.out.println("B 实现 operation4");
	}
	
	@Override
	public void operation5() {
		System.out.println("B 实现 operation5");
	}
}

class D implements Interface1 {
	
	@Override
	public void operation1() {
		System.out.println("D 实现 operation1");
	}
	
	@Override
	public void operation2() {
		System.out.println("D 实现 operation2");
	}
	
	@Override
	public void operation3() {
		System.out.println("D 实现 operation3");
	}
	
	@Override
	public void operation4() {
		System.out.println("D 实现 operation4");
	}
	
	@Override
	public void operation5() {
		System.out.println("D 实现 operation5");
	}
}

/**
 * A类通过接口Interface1依赖(使用) B类，但是只会用到1,2,3方法
 */
class A {
	public void depend1(Interface1 i) {
		i.operation1();
	}
	
	public void depend2(Interface1 i) {
		i.operation2();
	}
	
	public void depend3(Interface1 i) {
		i.operation3();
	}
}

/**
 * C类通过接口Interface1依赖(使用) D类，但是只会用到1,4,5方法
 */
class C {
	public void depend1(Interface1 i) {
		i.operation1();
	}
	
	public void depend4(Interface1 i) {
		i.operation4();
	}
	
	public void depend5(Interface1 i) {
		i.operation5();
	}
}