package com.lft.adapter1.classadapter;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-10 12:17
 * <p>
 * Class Name:      Client
 * Package Name:    com.lft.adapter1.classadapter
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Client {
	public static void main(String[] args) {
		System.out.println("====类适配器模式====");
		Phone phone = new Phone();
		phone.charging(new VoltageAdapter());
	}
}
