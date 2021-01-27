package com.lft.pattern01.singleton;

import java.text.NumberFormat;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-07 12:28
 * <p>
 * Class Name:      SingletonTest
 * Package Name:    com.lft.singleton.type9_singleton_in_jdk
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 * <p>
 * 单例模式：
 * 1. 采取一定的方法，保证整个系统内存中该类只存在一个对象实例，节省了系统资源，对于一些需要频繁创建销毁的对象，使用单例模式可以提高系统性能。
 * <p>
 * <p>
 * 2. 当想实例化一个单例类的时候，必须要记住使用相应的获取对象的方法，而不是使用new
 * <p>
 * <p>
 * 3. 使用场景：
 * ① 需要频繁的进行创建和销毁的对象
 * ② 创建对象时耗时过多或耗费资源过多（即:重量级对象）
 * ③ 经常用到的对象、工具类对象、频繁访问数据库或文件的对象（比如:数据源、session工厂等）
 * <p>
 * <p>
 * 4. 使用方式：
 * ① 饿汉式(静态变量)——非懒加载
 * ② 饿汉式(静态代码块)——非懒加载
 * ③ 懒汉式(线程不安全)
 * ④ 懒汉式(线程安全，同步方法)
 * ⑤ 懒汉式(线程不安全，同步代码块)
 * ⑥ 懒汉式(线程安全，双重检查+同步代码块)——懒加载			——推荐使用
 * ⑦ 静态内部类——懒加载								——推荐使用(存在反射攻击或者反序列化攻击)
 * ⑧ 枚举											——推荐使用
 */
public class Singleton {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		NumberFormat numberFormat = NumberFormat.getInstance();
	}
}

/**
 * 在JDK中，Runtime类就是使用了饿汉式的单例模式
 */
class Runtime {
	private static Runtime currentRuntime = new Runtime();
	
	/**
	 * Returns the runtime object associated with the current Java application.
	 * Most of the methods of class <code>Runtime</code> are instance
	 * methods and must be invoked with respect to the current runtime object.
	 * @return the <code>Runtime</code> object associated with the current
	 * Java application.
	 */
	public static Runtime getRuntime() {
		return currentRuntime;
	}
	
	/**
	 * Don't let anyone else instantiate this class
	 */
	private Runtime() {
	}
}
