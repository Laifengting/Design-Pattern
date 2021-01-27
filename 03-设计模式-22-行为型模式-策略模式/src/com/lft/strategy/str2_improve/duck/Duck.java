package com.lft.strategy.str2_improve.duck;

import com.lft.strategy.str2_improve.strategy1.FlyBehavior;
import com.lft.strategy.str2_improve.strategy2.QuackBehavior;
import com.lft.strategy.str2_improve.strategy3.SwimBehavior;

public abstract class Duck {
	// 属性，策略接口
	FlyBehavior flyBehavior;
	
	// 其他属性，其他策略接口
	QuackBehavior quackBehavior;
	SwimBehavior swimBehavior;
	
	public Duck() {
	}
	
	public void quack() {
		if (quackBehavior != null) {
			quackBehavior.quack();
		}
	}
	
	public void swim() {
		if (swimBehavior != null) {
			swimBehavior.swim();
		}
	}
	
	public void fly() {
		if (flyBehavior != null) {
			flyBehavior.fly();
		}
	}
	
	/**
	 * 抽象方法
	 * 显示鸭子信息
	 */
	public abstract void display();
	
	/**
	 * 添加set方法，可以动态修改行为
	 * @param flyBehavior
	 */
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void setSwimBehavior(SwimBehavior swimBehavior) {
		this.swimBehavior = swimBehavior;
	}
}
