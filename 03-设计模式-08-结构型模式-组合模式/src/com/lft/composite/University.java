package com.lft.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-12 9:31
 * <p>
 * Class Name:      University
 * Package Name:    com.lft.composite
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 * <p>
 * University 就是角色Composite，可以管理College。
 */
public class University extends OrganizationComponent {
	
	List<OrganizationComponent> organizationComponentList = new ArrayList<>();
	
	/**
	 * 构造器
	 * @param name
	 * @param des
	 */
	public University(String name, String des) {
		super(name, des);
	}
	
	/**
	 * 重写add方法
	 * @param organizationComponent
	 */
	@Override
	protected void add(OrganizationComponent organizationComponent) {
		organizationComponentList.add(organizationComponent);
	}
	
	@Override
	protected void remove(OrganizationComponent organizationComponent) {
		organizationComponentList.remove(organizationComponent);
	}
	
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
		System.out.println("------------------" + getName() + "------------------");
		for (OrganizationComponent organizationComponent : organizationComponentList) {
			organizationComponent.print();
		}
	}
}
