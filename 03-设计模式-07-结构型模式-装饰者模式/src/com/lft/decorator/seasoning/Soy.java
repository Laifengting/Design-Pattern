package com.lft.decorator.seasoning;

import com.lft.decorator.Decorator;
import com.lft.decorator.Drink;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-11 8:50
 * <p>
 * Class Name:      Chocolate
 * Package Name:    com.lft.decorator
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 * <p>
 * 具体的Decorator就是调味品Chocolate
 */
public class Soy extends Decorator {
	/**
	 * 构造器
	 * @param obj
	 */
	public Soy(Drink obj) {
		super(obj);
		// 调味品描述
		setDes("~~豆浆~~");
		// 调味品价格
		setPrice(1.0F);
	}
}
