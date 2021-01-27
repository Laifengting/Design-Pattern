package com.lft.decorator;

import com.lft.decorator.coffee.LongBlack;
import com.lft.decorator.seasoning.Milk;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-11 8:53
 * <p>
 * Class Name:      CoffeeBar
 * Package Name:    com.lft.decorator
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class CoffeeBarClient {
	public static void main(String[] args) {
		// 1. 点一份LongBlack
		Drink order = new LongBlack();
		System.out.println("费用= " + order.cost());
		System.out.println("描述= " + order.getDes());
		
		System.out.println("====================================");
		
		// 2. 加一份牛奶
		order = new Milk(order);
		System.out.println("费用= " + order.cost());
		System.out.println("描述= " + order.getDes());
		
		System.out.println("====================================");
		
		// 3. 加一份牛奶
		order = new Milk(order);
		System.out.println("费用= " + order.cost());
		System.out.println("描述= " + order.getDes());
	}
}
