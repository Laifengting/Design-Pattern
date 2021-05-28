package com.lft.proxy.pro2_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-14 8:46
 * <p>
 * Class Name:      ProxyFactory
 * Package Name:    com.lft.proxy.pro2_dynamic
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class ProxyFactory {
	/**
	 * 维护一个目标对象。
	 */
	private Object target;
	
	/**
	 * 构造器，对target进行初始化
	 * @param target 需要代理的目标类
	 */
	public ProxyFactory(Object target) {
		this.target = target;
	}
	
	/**
	 * 给目标对象，生成一个代理对象。
	 * @return 代理对象
	 */
	public Object getProxyInstance() {
		
		/*
		 * 说明：
		 * @param loader 指定当前目标对象使用的类加载器，获取加载器的方法固定
		 * @param interfaces 目标对象实现的接口类型，使用泛型方式确认类型
		 * @param h    调用处理器，事件处理，执行目标对象的方法时，会触发事件处理器方法，会把当前进程句柄执行的目标对象方法作为参数传入。
		 * @return
		 * public static Object newProxyInstanc e(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
		 */
		ClassLoader loader = target.getClass().getClassLoader();
		Class<?>[] interfaces = target.getClass().getInterfaces();
		return Proxy.newProxyInstance(
				loader,
				interfaces,
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("目标对象方法调用之前 可以增强操作...");
						// 通过反射机制调用目标对象的方法。
						Object returnValue = method.invoke(target, args);
						System.out.println("目标对象方法调用之后 可以增强操作...");
						return returnValue;
					}
				});
	}
	
}
