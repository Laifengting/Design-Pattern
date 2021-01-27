package com.lft.adapter3.interfaceadapter;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-10 13:37
 * <p>
 * Class Name:      Client
 * Package Name:    com.lft.adapter3.interfaceadapter
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Client {
	public static void main(String[] args) {
		AbsAdapter absAdapter = new AbsAdapter() {
			@Override
			public void m1() {
				System.out.println("使用了m1的方法~~");
			}
		};
		absAdapter.m1();
	}
}
