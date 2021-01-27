package com.lft.composite;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-12 9:39
 * <p>
 * Class Name:      Department
 * Package Name:    com.lft.composite
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Department extends OrganizationComponent {
	
	public Department(String name, String des) {
		super(name, des);
	}
	
	// add,remove方法不需要重写了。他是叶子节点。
	
	@Override
	public String getName() {
		return super.getName();
	}
	
	@Override
	public String getDes() {
		return super.getDes();
	}
	
	@Override
	protected void print() {
		System.out.println(getName());
	}
}
