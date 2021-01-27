package com.lft.service.locator;

/**
 * 创建实体服务1。
 */
public class Service1 implements Service {
	public void execute() {
		System.out.println("Executing Service1");
	}
	
	@Override
	public String getName() {
		return "Service1";
	}
}