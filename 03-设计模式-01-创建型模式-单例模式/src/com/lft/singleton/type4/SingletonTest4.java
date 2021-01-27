package com.lft.singleton.type4;

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
public class SingletonTest4 {
	public static void main(String[] args) {
		System.out.println("懒汉式2，线程安全");
		Singleton instance = Singleton.getInstance();
		Singleton instance1 = Singleton.getInstance();
		System.out.println(instance == instance1);
		System.out.println("instance.hashCode = " + instance.hashCode());
		System.out.println("instance1.hashCode = " + instance1.hashCode());
	}
}

/**
 * 懒汉式(线程安全，同步方法，效率低，不推荐)
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
	 * 加入synchronized关键字，同步方法，解决线程不安全问题
	 * 但是，这个方法只执行一次实例化就够了，后面想要获利该类的实例，直接return就行了。方法进行同步效率太低了。
	 * @return
	 */
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
}
