package com.lft.factory01.simplefactory.pizzastore.pizza;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-07 14:57
 * <p>
 * Class Name:      CheessPizza
 * Package Name:    com.lft.factory.simplefactory.pizzastore.pizza
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class ChinaPizza extends Pizza {
	@Override
	public void prepare() {
		setName("中国pizza");
		System.out.println(name + " preparing;");
	}
}
