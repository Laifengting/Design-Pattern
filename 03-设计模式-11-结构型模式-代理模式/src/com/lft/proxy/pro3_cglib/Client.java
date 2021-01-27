package com.lft.proxy.pro3_cglib;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-14 9:41
 * <p>
 * Class Name:      Client
 * Package Name:    com.lft.proxy.pro3_cglib
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Client {
	public static void main(String[] args) {
		// 创建目标对象。
		TeacherDao target = new TeacherDao();
		
		// 获取到代理对象，并将目标对象传递给代理对象。
		TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(target).getProxyInstance();
		
		// 通过代理对象，调用目标对象的方法。
		proxyInstance.teach();
		proxyInstance.sayHello("Tom");
		String collect = proxyInstance.collect("西游记");
		System.out.println(collect);
	}
}
