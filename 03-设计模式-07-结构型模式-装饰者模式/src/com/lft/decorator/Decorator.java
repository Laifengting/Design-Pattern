package com.lft.decorator;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-11 8:36
 * <p>
 * Class Name:      Decorator
 * Package Name:    com.lft.decorator
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Decorator extends Drink {
	private Drink obj;
	
	/**
	 * 构造器
	 * @param obj
	 */
	public Decorator(Drink obj) {
		this.obj = obj;
	}
	
	@Override
	public float cost() {
		// 自己的价格 + 单品咖啡的价格
		return super.getPrice() + obj.cost();
	}
	
	@Override
	public String getDes() {
		// obj.getDes() 输出被装饰者的信息;
		return des + ":" + getPrice() + " && " + obj.getDes();
	}
}
