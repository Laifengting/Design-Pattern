package com.lft.singleton.type1;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020/9/6 22:58
 * E-mail:			laifengting@foxmail.com
 * <p>
 * Class Name:      Singleton
 * Package Name:    com.lft.singleton.type1
 * @author Laifengting
 * @version 1.0.0
 * @since JDK 8
 */
public class SingletonTest1 {
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		Singleton instance1 = Singleton.getInstance();
		System.out.println(instance == instance1);
		System.out.println("instance.hashCode = " + instance.hashCode());
		System.out.println("instance1.hashCode = " + instance1.hashCode());
	}
}

/**
 * 饿汉式(静态变量,线程安全)
 */
class Singleton {
	/**
	 * 1. 构造器私有化，外部不能new
	 */
	private Singleton() {
	}
	
	/**
	 * 2. 本类内部创建对象实例
	 */
	private static final Singleton INSTANCE = new Singleton();
	
	/**
	 * 3. 提供一个仅有的静态方法，返回实例对象。
	 */
	public static Singleton getInstance() {
		return INSTANCE;
	}
}