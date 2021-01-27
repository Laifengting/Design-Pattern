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
public class OrderPizza {
	
	// // 构造器
	// public OrderPizza() {
	// 	Pizza pizza = null;
	// 	// 订购披萨的类型
	// 	String orderType;
	//
	// 	do {
	// 		orderType = getType();
	// 		if ("greek".equals(orderType)) {
	// 			pizza = new GreekPizza();
	// 		} else if ("cheese".equals(orderType)) {
	// 			pizza = new CheessPizza();
	// 		} else if ("pepper".equals(orderType)) {
	// 			pizza = new PepperPizza();
	// 		} else {
	// 			break;
	// 		}
	// 		// 输出Pizza制作过程
	// 		pizza.prepare();
	// 		pizza.bake();
	// 		pizza.cut();
	// 		pizza.box();
	// 	} while (true);
	// }
	
	/**
	 * 定义一个简单工厂对象属性
	 */
	SimpleFactory simpleFactory;
	Pizza pizza = null;
	
	/**
	 * 构造器
	 */
	public OrderPizza(SimpleFactory simpleFactory) {
		setFactory(simpleFactory);
	}
	
	/**
	 * Set方法
	 * @param simpleFactory
	 */
	public void setFactory(SimpleFactory simpleFactory) {
		// 用户输入的
		String orderType;
		
		// 设置简单工厂对象
		this.simpleFactory = simpleFactory;
		
		do {
			orderType = FactoryUtils.getType();
			pizza = this.simpleFactory.createPizza(orderType);
			
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
