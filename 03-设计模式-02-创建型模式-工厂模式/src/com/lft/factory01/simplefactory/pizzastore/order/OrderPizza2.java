package com.lft.factory01.simplefactory.pizzastore.order;

import com.lft.factory01.simplefactory.pizzastore.pizza.Pizza;
import com.lft.util.FactoryUtils;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-07 20:49
 * <p>
 * Class Name:      OrderPizza
 * Package Name:    com.lft.factory.simplefactory.pizzastore.order
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class OrderPizza2 {
	
	Pizza pizza;
	String orderType;
	
	/**
	 * 构造器
	 */
	public OrderPizza2() {
		do {
			orderType = FactoryUtils.getType();
			pizza = SimpleFactory.createPizza2(orderType);
			
			// 输出Pizza信息
			// 非空，表示订购成功
			if (pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println(" 订购披萨失败 ");
				break;
			}
		} while (true);
	}
}
