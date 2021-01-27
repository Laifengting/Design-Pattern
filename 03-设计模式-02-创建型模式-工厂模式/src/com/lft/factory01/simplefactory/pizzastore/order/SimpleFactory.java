package com.lft.factory01.simplefactory.pizzastore.order;

import com.lft.factory01.simplefactory.pizzastore.pizza.CheesePizza;
import com.lft.factory01.simplefactory.pizzastore.pizza.ChinaPizza;
import com.lft.factory01.simplefactory.pizzastore.pizza.GreekPizza;
import com.lft.factory01.simplefactory.pizzastore.pizza.PepperPizza;
import com.lft.factory01.simplefactory.pizzastore.pizza.Pizza;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-07 22:05
 * <p>
 * Class Name:      SimpleFactory
 * Package Name:    com.lft.factory.simplefactory.pizzastore.order
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class SimpleFactory {
	/**
	 * 根据orderType返回对应的Pizza对象
	 * @param orderType
	 * @return
	 */
	public Pizza createPizza(String orderType) {
		Pizza pizza = null;
		
		System.out.println("使用简单工厂模式");
		if ("greek".equals(orderType)) {
			pizza = new GreekPizza();
		} else if ("cheese".equals(orderType)) {
			pizza = new CheesePizza();
		} else if ("pepper".equals(orderType)) {
			pizza = new PepperPizza();
		} else if ("china".equals(orderType)) {
			pizza = new ChinaPizza();
		}
		return pizza;
	}
	
	// 简单工厂模式也叫静态工厂模式
	public static Pizza createPizza2(String orderType) {
		Pizza pizza = null;
		System.out.println("使用简单工厂模式");
		
		if ("greek".equals(orderType)) {
			pizza = new GreekPizza();
		} else if ("cheese".equals(orderType)) {
			pizza = new CheesePizza();
		} else if ("pepper".equals(orderType)) {
			pizza = new PepperPizza();
		} else if ("china".equals(orderType)) {
			pizza = new ChinaPizza();
		}
		return pizza;
	}
	
}
