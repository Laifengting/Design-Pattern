package com.lft.proxy.pro3_cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-14 9:33
 * <p>
 * Class Name:      ProxyFactory
 * Package Name:    com.lft.proxy.pro3_cglib
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class ProxyFactory implements MethodInterceptor {
	/**
	 * 维护一个目标对象
	 */
	private Object target;
	
	/**
	 * 构造器，传入一个被代理的对象。
	 * @param target
	 */
	public ProxyFactory(Object target) {
		this.target = target;
	}
	
	/**
	 * 返回一个代理对象，是 target 对象的代理对象。
	 * @return
	 */
	public Object getProxyInstance() {
		// 1. 创建一个工具类。
		Enhancer enhancer = new Enhancer();
		// 2. 设置父类
		enhancer.setSuperclass(target.getClass());
		// 3. 设置回调函数
		enhancer.setCallback(this);
		// 4. 创建子类对象，即代理对象。
		return enhancer.create();
	}
	
	/**
	 * 重写 intercept 方法，会调用目标对象的方法。
	 * @param obj
	 * @param method
	 * @param args
	 * @param proxy
	 * @return
	 * @throws Throwable
	 */
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("Cglib 代理模式，~~ 开始");
		Object returnValue = method.invoke(target, args);
		System.out.println("Cglib 代理模式, ~~ 提交");
		return returnValue;
	}
}
