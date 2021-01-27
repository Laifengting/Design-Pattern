package com.lft.adapter1.classadapter;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-10 10:28
 * <p>
 * Class Name:      Voltage220V
 * Package Name:    com.lft.adapter1.classadapter
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 * <p>
 * 被适配的类
 */
public class Voltage220V {
	// 输出220V电压
	public int output220V() {
		int src = 220;
		System.out.println("电压 " + src + " V");
		return src;
	}
}
