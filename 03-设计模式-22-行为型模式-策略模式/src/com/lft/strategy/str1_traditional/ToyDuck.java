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
public class ToyDuck extends Duck {
	@Override
	public void display() {
		System.out.println(" ~~这是玩具鸭~~ ");
	}
	
	@Override
	public void fly() {
		System.out.println("玩具鸭不能飞");
	}
	
	@Override
	public void quack() {
		System.out.println("玩具鸭不会叫~");
	}
	
	@Override
	public void swim() {
		System.out.println("玩具鸭不会游泳~~");
	}
}
