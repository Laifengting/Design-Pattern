package com.lft.pattern02.factory;

import java.util.Calendar;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-10 9:44
 * <p>
 * Class Name:      FactoryInJdk
 * Package Name:    com.lft.pattern02.factory
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class FactoryInJdk {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		calendar.get(Calendar.HOUR_OF_DAY);
		calendar.get(Calendar.MINUTE);
		calendar.get(Calendar.SECOND);
	}
}
