package com.lft.factory03.abstractfactory.pizzastore.order;

import com.lft.factory03.abstractfactory.pizzastore.pizza.Pizza;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-08 11:10
 * <p>
 * Class Name:      AbsFactory
 * Package Name:    com.lft.factory03.abstractfactory.pizzastore.order
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public interface AbsFactory {
	/**
	 * 让正面的工厂子类来具体实现
	 * @param orderType
	 * @return
	 */
	Pizza createPizza(String orderType);
}
