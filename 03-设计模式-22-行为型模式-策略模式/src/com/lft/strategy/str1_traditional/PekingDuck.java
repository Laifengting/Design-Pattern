package com.lft.strategy.str1_traditional;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-27 9:09
 * <p>
 * Class Name:      WildDuck
 * Package Name:    com.lft.strategy.traditional
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class PekingDuck extends Duck {
	@Override
	public void display() {
		System.out.println(" ~~这是北京鸭~~ ");
	}
	
	/**
	 * 因为北京鸭不能飞翔，因此需要重写fly
	 */
	@Override
	public void fly() {
		System.out.println("北京鸭不能飞");
	}
}
