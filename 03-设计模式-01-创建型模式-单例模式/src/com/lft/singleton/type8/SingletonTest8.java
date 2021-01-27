package com.lft.singleton.type8;

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
public class SingletonTest8 {
	public static void main(String[] args) {
		System.out.println("枚举");
		Singleton instance = Singleton.INSTANCE;
		Singleton instance2 = Singleton.INSTANCE;
		System.out.println(instance == instance2);
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());
		
		instance.dosomething();
	}
}

/**
 * 枚举，不仅能够避免多线程同步问题，而且还能防止反序列化重新创建新的对象。推荐使用。
 */
enum Singleton {
	/**
	 * 枚举类的字段，就是一个单例模式的对象实例。
	 */
	INSTANCE;
	
	public void dosomething() {
		System.out.println("dosomething");
	}
}
