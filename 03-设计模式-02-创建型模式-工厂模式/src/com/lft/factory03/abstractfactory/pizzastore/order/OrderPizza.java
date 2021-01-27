package com.lft.factory03.abstractfactory.pizzastore.order;

import com.lft.factory03.abstractfactory.pizzastore.pizza.Pizza;
import com.lft.util.FactoryUtils;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-08 11:18
 * <p>
 * Class Name:      OrderPizza
 * Package Name:    com.lft.factory03.abstractfactory.pizzastore.order
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class OrderPizza {
	AbsFactory factory;
	
	/**
	 * 构造器
	 * @param factory
	 */
	public OrderPizza(AbsFactory factory) {
		setFactory(factory);
	}
	
	/**
	 * @param factory
	 */
	private void setFactory(AbsFactory factory) {
		Pizza pizza = null;
		String orderType;
		this.factory = factory;
		
		do {
			orderType = FactoryUtils.getType();
			pizza = factory.createPizza(orderType);
			
			if (pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println("~~输入有误~~");
				System.out.println("~~退出订购~~");
				break;
			}
		} while (true);
	}
}
