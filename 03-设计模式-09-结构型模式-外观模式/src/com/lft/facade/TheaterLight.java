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
public class TheaterLight {
	// 使用单例模式——饿汉式
	private static TheaterLight instance = new TheaterLight();
	
	private TheaterLight() {
	
	}
	
	public static TheaterLight getInstance() {
		return instance;
	}
	
	public void on() {
		System.out.println("剧院灯光 已经打开");
	}
	
	public void off() {
		System.out.println("剧院灯光 已经关闭");
	}
	
	public void dim() {
		System.out.println("剧院灯光 调暗");
	}
	
	public void bright() {
		System.out.println("剧院灯光 调亮");
	}
	
}
