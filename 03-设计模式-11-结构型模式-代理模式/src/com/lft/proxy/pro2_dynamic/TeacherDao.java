package com.lft.proxy.pro2_dynamic;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-14 8:45
 * <p>
 * Class Name:      TeacherDao
 * Package Name:    com.lft.proxy.pro2_dynamic
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class TeacherDao implements ITeacherDao {
	@Override
	public void teach() {
		System.out.println("老师授课中...");
	}
	
	@Override
	public void sayHello(String name) {
		System.out.println("向 " + name + " say Hello...");
	}
}
