package com.lft.proxy.pro1_static;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-13 23:54
 * <p>
 * Class Name:      Client
 * Package Name:    com.lft.proxy.pro1_static
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Client {
	public static void main(String[] args) {
		// 创建目标对象(被代理对象)
		TeacherDao teacherDao = new TeacherDao();
		
		// 创建代理对象，同时将被代理对象传递给代理对象。
		TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
		
		// 通过代理对象，调用被代理对象的方法。
		// 即：执行的是代理对象的方法，代理对象再去调用目标对象的方法。
		teacherDaoProxy.teach();
	}
}
