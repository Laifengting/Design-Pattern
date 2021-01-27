package com.lft.proxy.pro1_static;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-13 23:50
 * <p>
 * Class Name:      TeacherDaoProxy
 * Package Name:    com.lft.proxy.pro1_static
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class TeacherDaoProxy implements ITeacherDao {
	
	/**
	 * 目标对象，通过接口来聚合。
	 */
	private ITeacherDao target;
	
	public TeacherDaoProxy(ITeacherDao target) {
		this.target = target;
	}
	
	@Override
	public void teach() {
		System.out.println("代理开始，完成某些操作...");
		target.teach();
		System.out.println("提交...");
	}
}
