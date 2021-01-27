package com.lft.principle.single_responsibility;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020/9/5 13:45
 * E-mail:			laifengting@foxmail.com
 * <p>
 * Class Name:      SingleResponsibility2
 * Package Name:    com.lft.principle.singleresponsibility
 * @author Laifengting
 * @version 1.0.0
 * @since JDK 8
 */
public class SingleResponsibility2 {
	public static void main(String[] args) {
		RoadVehicle vehicle = new RoadVehicle();
		vehicle.run("摩托车");
		vehicle.run("汽车");
		
		AirVehicle airVehicle = new AirVehicle();
		airVehicle.run("飞机");
		
		WaterVehicle waterVehicle = new WaterVehicle();
		waterVehicle.run("轮船");
		
	}
}

/**
 * 方案2 分析：
 * 1. 遵守单一职责原则
 * 2. 但是这样做的改动很大，即将类分解，同时修改客户端
 * 3. 改进：直接修改Vehicle类，发动的代码会比较少 => 方案3
 */
class RoadVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " 在公路上运行");
	}
}

class AirVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " 在天上运行");
	}
}

class WaterVehicle {
	public void run(String vehicle) {
		System.out.println(vehicle + " 在水中运行");
	}
}
