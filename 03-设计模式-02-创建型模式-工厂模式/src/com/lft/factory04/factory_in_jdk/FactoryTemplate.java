package com.lft.factory04.factory_in_jdk;

import java.util.Calendar;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-08 12:03
 * <p>
 * Class Name:      FactoryTemplate
 * Package Name:    com.lft.factory04.factory_in_jdk
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class FactoryTemplate {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("年：" + calendar.get(Calendar.YEAR));
		System.out.println("月：" + (calendar.get(Calendar.MONTH) + 1));
		System.out.println("日：" + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("时：" + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("分：" + calendar.get(Calendar.MINUTE));
		System.out.println("秒：" + calendar.get(Calendar.SECOND));
		
	}
}
