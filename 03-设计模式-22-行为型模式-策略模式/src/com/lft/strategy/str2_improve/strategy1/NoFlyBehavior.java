package com.lft.strategy.str2_improve.strategy1;

public class NoFlyBehavior implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("不会飞~~");
	}
}