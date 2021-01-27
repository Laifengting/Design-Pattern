package com.lft.factory02.factorymethod.pizzastore.use;

import com.lft.factory02.factorymethod.pizzastore.order.BJOrderPizza;
import com.lft.factory02.factorymethod.pizzastore.order.LDOrderPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-07 20:59
 * <p>
 * Class Name:      PizzaStore
 * Package Name:    com.lft.factory.factorymethod.pizzastore.use
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 * <p>
 * 相当于一个客户端，发出订购
 */
public class PizzaStore {
	public static void main(String[] args) {
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
			new BJOrderPizza();
		} else if ("ld".equalsIgnoreCase(loc)) {
			new LDOrderPizza();
		}
	}
}
