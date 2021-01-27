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
public class Projector {
	// 使用单例模式——饿汉式
	private static Projector instance = new Projector();
	
	private Projector() {
	
	}
	
	public static Projector getInstance() {
		return instance;
	}
	
	public void on() {
		System.out.println("投影仪 已经打开");
	}
	
	public void off() {
		System.out.println("投影仪 已经关闭");
	}
	
	public void focus() {
		System.out.println("投影仪 聚集");
	}
	
}
