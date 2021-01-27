package com.lft.facade;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-13 9:20
 * <p>
 * Class Name:      Projector
 * Package Name:    com.lft.facade
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Screen {
	// 使用单例模式——饿汉式
	private static Screen instance = new Screen();
	
	private Screen() {
	
	}
	
	public static Screen getInstance() {
		return instance;
	}
	
	public void up() {
		System.out.println("屏幕 起来了");
	}
	
	public void down() {
		System.out.println("屏幕 降下了");
	}
}
