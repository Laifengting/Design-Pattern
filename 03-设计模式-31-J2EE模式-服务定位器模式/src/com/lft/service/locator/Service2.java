package com.lft.service.locator;

/**
 * 创建实体服务2。
 */
public class Service2 implements Service {
	public void execute() {
		System.out.println("Executing Service2");
	}
	
	@Override
	public String getName() {
		return "Service2";
	}
}