package com.lft.observer.obs3_improve2.observer;

import com.lft.observer.obs3_improve2.message.Message;
import com.lft.observer.obs3_improve2.subject.Subject;

/**
 * 显示当前天气情况(可以理解成是气象站自己的网站)
 */
public class Sina implements Observer {
	
	private Subject subject;
	
	public Sina(Subject subject) {
		this.subject = subject;
		subscribe();
	}
	
	@Override
	public void update(Message message) {
		// 更新 天气情况。是由WeatherData来调用，使用推送模式
		System.out.println("====新浪提醒====");
		message.displayMessage();
	}
	
	@Override
	public void subscribe() {
		subject.registerObserver(this);
	}
	
	public void unsubscribe() {
		subject.removeObserver(this);
		System.out.println("新浪取消了订阅");
	}
}
