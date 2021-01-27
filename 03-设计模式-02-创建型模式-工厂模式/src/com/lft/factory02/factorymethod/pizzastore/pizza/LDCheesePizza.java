package com.lft.factory02.factorymethod.pizzastore.pizza;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-08 9:12
 * <p>
 * Class Name:      BJCheesePizza
 * Package Name:    com.lft.factory.factorymethod.pizzastore.pizza
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class LDCheesePizza extends Pizza {
	@Override
	public void prepare() {
		setName("伦敦奶酪 Pizza");
		System.out.println(name + " preparing;");
	}
}
