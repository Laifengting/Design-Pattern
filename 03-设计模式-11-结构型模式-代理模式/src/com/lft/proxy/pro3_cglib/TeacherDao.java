package com.lft.proxy.pro3_cglib;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-14 9:32
 * <p>
 * Class Name:      TeacherDao
 * Package Name:    com.lft.proxy.pro3_cglib
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class TeacherDao {
	/**
	 * 授课方法
	 */
	public void teach() {
		System.out.println("老师授课中，我是Cglib代理，不需要实现接口。");
	}
	
	/**
	 * 跟同学打招呼方法
	 * @param name
	 */
	public void sayHello(String name) {
		System.out.println("hello " + name);
	}
	
	public String collect(String bookname) {
		return "已经收到了 " + bookname;
	}
	
}
