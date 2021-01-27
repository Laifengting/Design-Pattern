package com.lft.principle.liskov.substitution.improve;

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
public class Liskov2 {
	public static void main(String[] args) {
		A a = new A();
		System.out.println("11 - 3 = " + a.func1(11, 3));
		System.out.println("1 - 8 = " + a.func1(1, 8));
		System.out.println("---------------------------");
		
		B b = new B();
		// 因为B类不再继承A类，因此调用者，不会再认为func1是求减法。调用完成的功能就会很明确。
		System.out.println("11 + 3 = " + b.func1(11, 3));
		System.out.println("1 + 8 = " + b.func1(1, 8));
		System.out.println("11 + 3 + 9 =" + b.func2(11, 3));
		
		// 使用组合，仍然可以使用A类相关方法。这里的本意就是求11-3
		System.out.println("11 - 3 = " + b.func3(11, 3));
	}
}

// 创建一个更加基础的父类
class Base {

}

// A类
class A extends Base {
	// 返回两个数的差
	public int func1(int num1, int num2) {
		return num1 - num2;
	}
}

// B类
// 原需求：增加一个新功能：完成两个数相加，然后和9求和
class B extends Base {
	// 如果B需要使用A类的方法，使用组合关系。
	private A a = new A();
	
	// 这里，重写了A类的方法，可能是无意识的
	public int func1(int a, int b) {
		return a + b;
	}
	
	public int func2(int a, int b) {
		return func1(a, b) + 9;
	}
	
	// 我们仍然想使用A的方法
	public int func3(int a, int b) {
		return this.a.func1(a, b);
	}
}