package com.lft.factory02.factorymethod.pizzastore.order;

import com.lft.factory02.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.lft.factory02.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.lft.factory02.factorymethod.pizzastore.pizza.Pizza;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-08 9:24
 * <p>
 * Class Name:      BJOrderPizza
 * Package Name:    com.lft.factory.factorymethod.pizzastore.order
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class BJOrderPizza extends OrderPizza {
	@Override
	public Pizza createPizza(String orderType) {
		Pizza pizza = null;
		if ("cheese".equalsIgnoreCase(orderType)) {
			pizza = new BJCheesePizza();
		} else if ("greek".equalsIgnoreCase(orderType)) {
			pizza = new BJPepperPizza();
		}
		return pizza;
	}
}
