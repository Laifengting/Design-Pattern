package com.lft.facade;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-13 0:16
 * <p>
 * Class Name:      Popcorn
 * Package Name:    com.lft.facade
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Popcorn {
	// 使用单例模式——饿汉式
	private static Popcorn instance = new Popcorn();
	
	private Popcorn() {
	
	}
	
	public static Popcorn getInstance() {
		return instance;
	}
	
	public void on() {
		System.out.println("爆米花机 已经打开");
	}
	
	public void off() {
		System.out.println("爆米花机 已经关闭");
	}
	
	public void pop() {
		System.out.println("爆米花机 正在出爆米花");
	}
}
