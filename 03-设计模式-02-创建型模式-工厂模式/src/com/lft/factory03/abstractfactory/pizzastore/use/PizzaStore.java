package com.lft.factory03.abstractfactory.pizzastore.use;

import com.lft.factory03.abstractfactory.pizzastore.order.BJFactory;
import com.lft.factory03.abstractfactory.pizzastore.order.LDFactory;
import com.lft.factory03.abstractfactory.pizzastore.order.OrderPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-08 11:26
 * <p>
 * Class Name:      PizzaStore
 * Package Name:    com.lft.factory03.abstractfactory.pizzastore.use
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class PizzaStore {
	public static void main(String[] args) {
		do {
			String loc;
			try {
				BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("input location:");
				String str = strin.readLine();
				loc = str;
			} catch (IOException e) {
				e.printStackTrace();
				loc = "";
			}
			if ("bj".equalsIgnoreCase(loc)) {
				// 创建北京口味的各种Pizza
				new OrderPizza(new BJFactory());
			} else if ("ld".equalsIgnoreCase(loc)) {
				new OrderPizza(new LDFactory());
			} else {
				System.out.println("~~输入有误请重新输入~~");
			}
		} while (true);
	}
}
