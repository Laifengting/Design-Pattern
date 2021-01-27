package com.lft.strategy.str2_improve.strategy2;

public class NoQuackBehavior implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("不会叫~~");
	}
}