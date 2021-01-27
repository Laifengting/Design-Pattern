package com.lft.factory01.simplefactory.pizzastore.use;

import com.lft.factory01.simplefactory.pizzastore.order.OrderPizza2;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-07 20:59
 * <p>
 * Class Name:      PizzaStore
 * Package Name:    com.lft.factory.simplefactory.pizzastore.order
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 * <p>
 * 相当于一个客户端，发出订购
 */
public class PizzaStore {
	public static void main(String[] args) {
		// // 普通应用
		// new OrderPizza();
		
		// // 简单工厂应用
		// new OrderPizza(new SimpleFactory());
		// System.out.println("~~退出程序~~");
		
		// 静态工厂应用
		new OrderPizza2();
	}
}
