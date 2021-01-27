package com.lft.factory03.abstractfactory.pizzastore.order;

import com.lft.factory03.abstractfactory.pizzastore.pizza.LDCheesePizza;
import com.lft.factory03.abstractfactory.pizzastore.pizza.LDPepperPizza;
import com.lft.factory03.abstractfactory.pizzastore.pizza.Pizza;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-08 11:13
 * <p>
 * Class Name:      BJFactory
 * Package Name:    com.lft.factory03.abstractfactory.pizzastore.order
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 * <p>
 * 这是一个工厂子类
 */
public class LDFactory implements AbsFactory {
	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("~~使用的是抽象工厂模式~~");
		Pizza pizza = null;
		if ("cheese".equals(orderType)) {
			pizza = new LDCheesePizza();
		} else if ("pepper".equals(orderType)) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}
}
