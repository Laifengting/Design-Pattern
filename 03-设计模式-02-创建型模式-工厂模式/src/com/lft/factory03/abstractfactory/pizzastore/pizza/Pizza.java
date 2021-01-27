package com.lft.factory03.abstractfactory.pizzastore.pizza;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-07 14:54
 * <p>
 * Class Name:      Pizza
 * Package Name:    com.lft.factory.factorymethod.pizzastore.pizza
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public abstract class Pizza {
	
	protected String name;
	
	public abstract void prepare();
	
	public void bake() {
		System.out.println(name + " baking;");
	}
	
	public void cut() {
		System.out.println(name + " cutting;");
	}
	
	public void box() {
		System.out.println(name + " boxing;");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
