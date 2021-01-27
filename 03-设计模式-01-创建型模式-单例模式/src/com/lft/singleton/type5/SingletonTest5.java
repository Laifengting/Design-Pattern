package com.lft.singleton.type5;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-07 10:06
 * <p>
 * Class Name:      SingletonTest3
 * Package Name:    com.lft.singleton.type3
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class SingletonTest5 {
	public static void main(String[] args) {
		System.out.println("懒汉式3，线程不安全");
		Singleton instance = Singleton.getInstance();
		Singleton instance1 = Singleton.getInstance();
		System.out.println(instance == instance1);
		System.out.println("instance.hashCode = " + instance.hashCode());
		System.out.println("instance1.hashCode = " + instance1.hashCode());
	}
}

/**
 * 懒汉式(线程不安全，同步代码块，不推荐使用)
 */
class Singleton {
	/**
	 * 1. 私有静态变量
	 */
	private static Singleton instance;
	
	/**
	 * 2. 私有化构造器
	 */
	private Singleton() {
	}
	
	/**
	 * 3. 提供一个静态公有方法，当使用到该方法时，才去创建instance
	 * 加入synchronized关键字，同步代码块，线程依然不安全
	 * @return
	 */
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				instance = new Singleton();
			}
		}
		return instance;
	}
	
}
