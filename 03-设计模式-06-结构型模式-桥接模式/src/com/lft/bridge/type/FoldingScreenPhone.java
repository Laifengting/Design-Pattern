package com.lft.bridge.type;

import com.lft.bridge.Brand;
import com.lft.bridge.Phone;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-10 21:46
 * <p>
 * Class Name:      FoldedPhone
 * Package Name:    com.lft.bridge
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class FoldingScreenPhone extends Phone {
	public FoldingScreenPhone(Brand brand) {
		super(brand);
	}
	
	@Override
	protected void open() {
		super.open();
		System.out.println("折叠样式手机");
	}
	
	@Override
	protected void close() {
		super.close();
		System.out.println("折叠样式手机");
	}
	
	@Override
	protected void call() {
		super.call();
		System.out.println("折叠样式手机");
	}
}
