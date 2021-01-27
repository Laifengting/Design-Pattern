package com.lft.factory02.factorymethod.pizzastore.order;

import com.lft.factory02.factorymethod.pizzastore.pizza.Pizza;
import com.lft.util.FactoryUtils;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-07 20:49
 * <p>
 * Class Name:      OrderPizza
 * Package Name:    com.lft.factory.factorymethod.pizzastore.order
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public abstract class OrderPizza {
	/**
	 * 定义一个抽象方法，createOrder()
	 * @param orderType
	 * @return
	 */
	public abstract Pizza createPizza(String orderType);
	
	/**
	 * 构造器
	 */
	public OrderPizza() {
		Pizza pizza;
		// 订购披萨的类型
		String orderType;
		do {
			orderType = FactoryUtils.getType();
			// 抽象方法，由工厂子类完成
			pizza = createPizza(orderType);
			if (pizza != null) {
				// 输出Pizza制作过程
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				break;
			}
		} while (true);
	}
}
