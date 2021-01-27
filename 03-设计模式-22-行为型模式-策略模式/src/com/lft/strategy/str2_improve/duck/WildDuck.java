package com.lft.strategy.str2_improve.duck;

import com.lft.strategy.str2_improve.strategy1.GoodFlyBehavior;
import com.lft.strategy.str2_improve.strategy2.GaGaQuackBehavior;
import com.lft.strategy.str2_improve.strategy3.GoodSwimBehavior;

public class WildDuck extends Duck {
	
	public WildDuck() {
		flyBehavior = new GoodFlyBehavior();
		quackBehavior = new GaGaQuackBehavior();
		swimBehavior = new GoodSwimBehavior();
	}
	
	@Override
	public void display() {
		System.out.println(" ~~这是野鸭~~ ");
	}
}
