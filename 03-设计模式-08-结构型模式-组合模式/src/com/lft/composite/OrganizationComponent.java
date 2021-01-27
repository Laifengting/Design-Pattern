package com.lft.composite;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-12 9:27
 * <p>
 * Class Name:      OrganizationComponent
 * Package Name:    com.lft.composite
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public abstract class OrganizationComponent {
	/**
	 * 组织名字
	 */
	private String name;
	/**
	 * 组织说明
	 */
	private String des;
	
	public OrganizationComponent(String name, String des) {
		this.name = name;
		this.des = des;
	}
	
	/**
	 * 默认实现。叶子节点不需要实现。
	 * @param organizationComponent
	 */
	protected void add(OrganizationComponent organizationComponent) {
		throw new UnsupportedOperationException();
	}
	
	protected void remove(OrganizationComponent organizationComponent) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * 每个子类都需要实现的打印方法。做成抽象方法。让每个继承的子类去实现。
	 */
	protected abstract void print();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDes() {
		return des;
	}
	
	public void setDes(String des) {
		this.des = des;
	}
	
}
