package com.lft.proxy.pro2_dynamic;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-14 8:58
 * <p>
 * Class Name:      Client
 * Package Name:    com.lft.proxy.pro2_dynamic
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Client {
	public static void main(String[] args) {
		// 创建目标对象
		ITeacherDao target = new TeacherDao();
		
		// 给目标对象，创建代理对象，可以强转成ITeacherDao
		ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
		
		// proxyInstance= com.lft.proxy.pro2_dynamic.TeacherDao@677327b6
		System.out.println("proxyInstance= " + proxyInstance);
		
		// proxyInstance= class com.sun.proxy.$Proxy0 内存中动态生成了代理对象
		System.out.println("proxyInstance= " + proxyInstance.getClass());
		
		proxyInstance.teach();
		
		proxyInstance.sayHello("Tom");
	}
}
