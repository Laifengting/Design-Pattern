package com.lft.bridge;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-10 21:45
 * <p>
 * Class Name:      Phone
 * Package Name:    com.lft.bridge
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public abstract class Phone {
	
	private Brand brand;
	
	public Phone(Brand brand) {
		this.brand = brand;
	}
	
	protected void open() {
		brand.open();
	}
	
	protected void close() {
		brand.close();
	}
	
	protected void call() {
		brand.call();
	}
}
