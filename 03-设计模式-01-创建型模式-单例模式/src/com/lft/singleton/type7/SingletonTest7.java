package com.lft.singleton.type7;

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
public class SingletonTest7 {
	public static void main(String[] args) {
		System.out.println("静态内部类，单例模式，线程安全");
		Singleton instance = Singleton.getInstance();
		Singleton instance1 = Singleton.getInstance();
		System.out.println(instance == instance1);
		System.out.println("instance.hashCode = " + instance.hashCode());
		System.out.println("instance1.hashCode = " + instance1.hashCode());
	}
}

/**
 * 静态内部类(线程安全，延迟加载，效率高，推荐使用)
 */
class Singleton {
	
	/**
	 * 1. 私有化构造器
	 */
	private Singleton() {
	}
	
	/**
	 * 2. 提供一个静态内部类。在静态内部类中提供一个静态属性，这个静态属性就是 Singleton 的实例对象。
	 * 静态内部类，不会随着类 Singleton 的加载而加载，当方法调用静态内部类的属性的时候，会加载静态内部类，JVM加载类的时候是线程安全的。
	 * 这种方式采用了类装载的机制来保证初始化实例时只有一个线程。
	 * 类的静态属性只会在第一次加载类的时候初始化。
	 * <p>
	 * 存在反射攻击或者反序列化攻击的风险。
	 */
	private static class SingleInstance {
		private static final Singleton INSTANCE = new Singleton();
	}
	
	/**
	 * 3. 提供公有方法，返回静态内部类的成员属性。
	 * @return
	 */
	public static Singleton getInstance() {
		return SingleInstance.INSTANCE;
	}
}
