package com.lft.flyweight;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-13 15:37
 * <p>
 * Class Name:      ConcreteWebSite
 * Package Name:    com.lft.flyweight
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class ConcreteWebSite extends WebSite {
	/**
	 * 网站发布的形式(类型)
	 */
	private String type = "";
	
	/**
	 * 构造器
	 * @param type
	 */
	public ConcreteWebSite(String type) {
		this.type = type;
	}
	
	@Override
	public void use(User user) {
		System.out.println("网站的发布形式为：" + type + ", " + user.getName() + " 正在使用中...");
	}
}
