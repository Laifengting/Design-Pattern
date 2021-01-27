package com.lft.proxy.pro2_dynamic;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-14 8:44
 * <p>
 * Class Name:      ITeacherDao
 * Package Name:    com.lft.proxy.pro2_dynamic
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public interface ITeacherDao {
	/**
	 * 授课方法
	 */
	void teach();
	
	/**
	 * 打招呼方法
	 * @param name
	 */
	void sayHello(String name);
}
