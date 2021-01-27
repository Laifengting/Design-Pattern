package com.lft.strategy.str2_improve;

import com.lft.strategy.str2_improve.duck.Duck;
import com.lft.strategy.str2_improve.duck.PekingDuck;
import com.lft.strategy.str2_improve.duck.ToyDuck;
import com.lft.strategy.str2_improve.duck.WildDuck;
import com.lft.strategy.str2_improve.strategy1.GoodFlyBehavior;

public class Client {
	public static void main(String[] args) {
		Duck duck = new PekingDuck();
		duck.display();
		duck.swim();
		duck.quack();
		duck.fly();
		
		System.out.println("**************************");
		
		Duck duck1 = new WildDuck();
		duck1.display();
		duck1.swim();
		duck1.quack();
		duck1.fly();
		
		System.out.println("**************************");
		
		Duck duck2 = new ToyDuck();
		duck2.display();
		duck2.swim();
		duck2.quack();
		duck2.fly();
		
		System.out.println("**************************");
		
		// 动态改变行为
		duck2.setFlyBehavior(new GoodFlyBehavior());
		duck2.display();
		duck2.swim();
		duck2.quack();
		duck2.fly();
	}
}
