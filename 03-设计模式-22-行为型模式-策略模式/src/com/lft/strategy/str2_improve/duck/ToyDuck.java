package com.lft.strategy.str2_improve.duck;

import com.lft.strategy.str2_improve.strategy1.NoFlyBehavior;
import com.lft.strategy.str2_improve.strategy2.NoQuackBehavior;
import com.lft.strategy.str2_improve.strategy3.NoSwimBehavior;

public class ToyDuck extends Duck {
	
	public ToyDuck() {
		flyBehavior = new NoFlyBehavior();
		quackBehavior = new NoQuackBehavior();
		swimBehavior = new NoSwimBehavior();
	}
	
	@Override
	public void display() {
		System.out.println(" ~~这是玩具鸭~~ ");
	}
}
