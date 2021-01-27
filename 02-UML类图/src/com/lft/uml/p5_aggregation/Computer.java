package com.lft.uml.p5_aggregation;

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
 * 表示方法：空心菱形头实线
 * 1、聚合关系是关联关系的一种，是强的关联关系。
 * 2、聚合是整体和部分之间的关系，例如汽车由引擎、轮胎以及其它零件组成。
 * 3、聚合关系也是通过成员变量来实现的。但是，关联关系所涉及的两个类处在同一个层次上，而聚合关系中，两个类处于不同的层次上，一个代表整体，一个代表部分。
 * 4、关联与聚合仅仅从 Java 或 C++ 语法上是无法分辨的，必须考察所涉及的类之间的逻辑关系。
 * 特征：属于是关联的特殊情况，体现部分-整体关系，是一种弱拥有关系；整体和部分可以有不一样的生命周期；是一种弱关联；
 */
public class Computer {
	/**
	 * 聚合关系：表示的是整体和部分的关系，整体和部分可以分开。
	 */
	private Monitor monitor;
	private Mouse mouse;
	private Keyboard keyboard;
	
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