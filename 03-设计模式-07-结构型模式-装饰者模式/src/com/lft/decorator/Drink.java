package com.lft.decorator;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-11 8:26
 * <p>
 * Class Name:      Drink
 * Package Name:    com.lft.decorator
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public abstract class Drink {
	public String des;
	private float price = 0.0F;
	
	public String getDes() {
		return des;
	}
	
	public void setDes(String des) {
		this.des = des;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	// 计算费用的抽象方法。用于被子类实现。
	public abstract float cost();
}
