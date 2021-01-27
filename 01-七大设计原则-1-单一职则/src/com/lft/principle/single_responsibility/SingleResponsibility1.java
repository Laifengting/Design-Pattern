package com.lft.principle.single_responsibility;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020/9/5 13:45
 * E-mail:			laifengting@foxmail.com
 * <p>
 * Class Name:      SingleResponsibility1
 * Package Name:    com.lft.principle.singleresponsibility
 * @author Laifengting
 * @version 1.0.0
 * @since JDK 8
 */
public class SingleResponsibility1 {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		
		vehicle.run("摩托车");
		vehicle.run("汽车");
		vehicle.run("飞机");
		
	}
}

/**
 * 方案1 分析：
 * 1. 在方案1的run方法中，违反了单一职责原则
 * 2. 解决方案：根据交通工具运行方法不同，分解成不同类。
 */
class Vehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " 在公路上跑!");
	}
}

