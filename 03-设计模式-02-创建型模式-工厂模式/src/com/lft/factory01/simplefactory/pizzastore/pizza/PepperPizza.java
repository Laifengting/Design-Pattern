package com.lft.factory01.simplefactory.pizzastore.pizza;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-07 21:35
 * <p>
 * Class Name:      PepperPizza
 * Package Name:    com.lft.factory.simplefactory.pizzastore.pizza
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class PepperPizza extends Pizza {
	@Override
	public void prepare() {
		setName("PepperPizza");
		System.out.println(name + " preparing;");
	}
}
