package com.lft.proxy.pro1_static;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-13 23:50
 * <p>
 * Class Name:      TeacherDao
 * Package Name:    com.lft.proxy.pro1_static
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class TeacherDao implements ITeacherDao {
	@Override
	public void teach() {
		System.out.println("老师授课中...");
	}
}
