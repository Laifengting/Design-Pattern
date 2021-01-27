package com.lft.decorator;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-11 8:28
 * <p>
 * Class Name:      Coffee
 * Package Name:    com.lft.decorator
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Coffee extends Drink {
	@Override
	public float cost() {
		return super.getPrice();
	}
}
