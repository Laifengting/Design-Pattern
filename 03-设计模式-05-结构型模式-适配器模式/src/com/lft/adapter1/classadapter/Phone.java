package com.lft.adapter1.classadapter;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-10 12:15
 * <p>
 * Class Name:      Phone
 * Package Name:    com.lft.adapter1.classadapter
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Phone {
	public void charging(IVoltage5V iVoltage5V) {
		if (iVoltage5V.output5V() == 5) {
			System.out.println("电压为5V，可以充电~~");
		} else {
			System.out.println("电压不合适，无法充电~~");
		}
	}
}
