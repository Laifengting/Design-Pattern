package com.lft.strategy.str2_improve.duck;

import com.lft.strategy.str2_improve.strategy1.BadFlyBehavior;
import com.lft.strategy.str2_improve.strategy2.JiJiQuackBehavior;
import com.lft.strategy.str2_improve.strategy3.NoSwimBehavior;

public class PekingDuck extends Duck {
	
	public PekingDuck() {
		flyBehavior = new BadFlyBehavior();
		quackBehavior = new JiJiQuackBehavior();
		swimBehavior = new NoSwimBehavior();
	}
	
	@Override
	public void display() {
		System.out.println(" ~~这是北京鸭~~ ");
	}
}
