package com.lft.facade;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-13 0:05
 * <p>
 * Class Name:      DVDPlayer
 * Package Name:    com.lft.facade
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class DVDPlayer {
	// 使用单例模式——饿汉式
	private static DVDPlayer instance = new DVDPlayer();
	
	private DVDPlayer() {
	
	}
	
	public static DVDPlayer getInstance() {
		return instance;
	}
	
	public void on() {
		System.out.println("DVD 打开了");
	}
	
	public void off() {
		System.out.println("DVD 关闭了");
	}
	
	public void play() {
		System.out.println("DVD 正在拨放中...");
	}
	
	public void pause() {
		System.out.println("DVD 暂停拨放");
	}
}
