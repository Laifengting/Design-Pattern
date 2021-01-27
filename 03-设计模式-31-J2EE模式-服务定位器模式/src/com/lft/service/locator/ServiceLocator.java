package com.lft.service.locator;

/**
 * 创建服务定位器。
 */
public class ServiceLocator {
	private static Cache cache;
	
	/**
	 * 静态代码块。
	 * 特点：随着类的加载而执行，而且只执行一次。
	 */
	static {
		cache = new Cache();
	}
	
	public static Service getService(String jndiName) {
		
		Service service = cache.getService(jndiName);
		
		if (service != null) {
			return service;
		}
		
		InitialContext context = new InitialContext();
		Service service1 = (Service) context.lookup(jndiName);
		cache.addService(service1);
		return service1;
	}
}