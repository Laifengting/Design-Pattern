package com.lft.uml.p6_composition;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020/9/6 22:07
 * E-mail:			laifengting@foxmail.com
 * <p>
 * Class Name:      Computer
 * Package Name:    com.lft.uml.aggregation
 * @author Laifengting
 * @version 1.0.0
 * @since JDK 8
 * <p>
 * 表示方法：实心菱形实线
 * <p>
 * 1、合成关系是关联关系的一种，是比聚合关系还要强的关系。
 * 2、它要求普通的聚合关系中代表整体的对象负责代表部分的对象的生命周期。
 * 特征：属于是关联的特殊情况，也体现了体现部分-整体关系，是一种强“拥有关系”；整体与部分有相同的生命周期，是一种强关联；
 */
public class Computer {
	
	
	/**
	 * 组合关系：表示的是整体和部分的关系，整体和部分不可以分开。
	 */
	private Monitor monitor = new Monitor();
	private Mouse mouse = new Mouse();
	private Keyboard keyboard = new Keyboard();
	
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	
	public void setKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}
}