package com.lft.principle.liskov.substitution;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020/9/5 22:39
 * E-mail:			laifengting@foxmail.com
 * <p>
 * Class Name:      Liskov1
 * Package Name:    com.lft.principle.liskov.substitution
 * @author Laifengting
 * @version 1.0.0
 * @since JDK 8
 */
public class Liskov1 {
	public static void main(String[] args) {
		A a = new A();
		System.out.println("11 - 3 = " + a.func1(11, 3));
		System.out.println("1 - 8 = " + a.func1(1, 8));
		System.out.println("---------------------------");
		
		B b = new B();
		System.out.println("11 - 3 = " + b.func1(11, 3));
		System.out.println("1 - 8 = " + b.func1(1, 8));
		System.out.println("11 + 3 + 9 =" + b.func2(11, 3));
	}
}

class A {
	public int func1(int num1, int num2) {
		return num1 - num2;
	}
}

class B extends A {
	@Override
	public int func1(int a, int b) {
		return a + b;
	}
	
	public int func2(int a, int b) {
		return func1(a, b) + 9;
	}
}