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
public class Stereo {
	// 使用单例模式——饿汉式
	private static Stereo instance = new Stereo();
	
	private Stereo() {
	
	}
	
	public static Stereo getInstance() {
		return instance;
	}
	
	public void on() {
		System.out.println("立体声 开启");
	}
	
	public void off() {
		System.out.println("立体声 关闭");
	}
	
	public void up() {
		System.out.println("立体声 调大");
	}
	
	public void down() {
		System.out.println("立体声 调小");
	}
}
