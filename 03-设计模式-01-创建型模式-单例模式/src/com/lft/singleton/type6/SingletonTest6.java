package com.lft.singleton.type6;

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
public class SingletonTest6 {
	public static void main(String[] args) {
		System.out.println("懒汉式4，双重检查，线程安全");
		Singleton instance = Singleton.getInstance();
		Singleton instance1 = Singleton.getInstance();
		System.out.println(instance == instance1);
		System.out.println("instance.hashCode = " + instance.hashCode());
		System.out.println("instance1.hashCode = " + instance1.hashCode());
	}
}

/**
 * 懒汉式(线程安全，延迟加载，双重检查+同步代码块，效率较高，推荐使用)
 */
class Singleton {
	/**
	 * 1. 私有静态变量
	 * 添加关键字volatile，作用：防止指令重排。
	 */
	private static volatile Singleton instance;
	
	/**
	 * 2. 私有化构造器
	 */
	private Singleton() {
	}
	
	/**
	 * 3. 提供一个静态公有方法，当使用到该方法时，才去创建instance
	 * 加入synchronized关键字，同步代码块，在同步代码块中，只会有一个线程，加入再次判断是否实例为空，这样双重检查线程安全
	 * 第二次实例不为空，就不会进入同步代码块中，这样也保证了效率
	 * @return
	 */
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
