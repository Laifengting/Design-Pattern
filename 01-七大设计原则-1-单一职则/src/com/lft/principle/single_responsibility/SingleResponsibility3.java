package com.lft.principle.single_responsibility;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020/9/5 13:45
 * E-mail:			laifengting@foxmail.com
 * <p>
 * Class Name:      SingleResponsibility3
 * Package Name:    com.lft.principle.singleresponsibility
 * @author Laifengting
 * @version 1.0.0
 * @since JDK 8
 */
public class SingleResponsibility3 {
	public static void main(String[] args) {
		Vehicle2 vehicle = new Vehicle2();
		
		vehicle.run("汽车");
		vehicle.runAir("飞机");
		vehicle.runWater("轮船");
		
	}
}

/**
 * 方案3 分析：
 * 1. 这种修改方法没有对原来的类做大的修改，只是增加方法
 * 2. 这里虽然在类这个级别上没有遵守单一职责原则，但是在方法级别上，仍然是遵守单一职则
 */
class Vehicle2 {
	public void run(String vehicle) {
		System.out.println(vehicle + " 在公路上运行");
	}
	
	public void runAir(String vehicle) {
		System.out.println(vehicle + " 在天上运行");
	}
	
	public void runWater(String vehicle) {
		System.out.println(vehicle + " 在水里运行");
	}
}