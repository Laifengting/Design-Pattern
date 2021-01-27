package com.lft.observer.obs1_traditional;

/**
 * 显示当前天气情况(可以理解成是气象站自己的网站)
 */
public class CurrentConditions {
	// 温度、气压、温度
	private float temperature;
	private float pressure;
	private float humidity;
	
	// 更新 天气情况。是由WeatherData来调用，使用推送模式
	public void update(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}
	
	// 显示
	public void display() {
		System.out.println("今天温度：" + temperature);
		System.out.println("今天气压：" + pressure);
		System.out.println("今天湿度：" + humidity);
	}
}
