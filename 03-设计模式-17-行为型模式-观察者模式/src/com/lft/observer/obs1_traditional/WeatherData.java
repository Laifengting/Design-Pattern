package com.lft.observer.obs1_traditional;

/**
 * 核心类
 * 1. 包含最新的天气情况信息
 * 2. 含有 CurrentConditions 对象
 * 3. 当数据有更新时，就主动的调用 CurrentConditions 对象的 update 方法(含 display())。
 * 这样接入方就看到最新的信息。
 */
public class WeatherData {
	private float temperature;
	private float pressure;
	private float humidity;
	private CurrentConditions currentConditions;
	
	public WeatherData(CurrentConditions currentConditions) {
		this.currentConditions = currentConditions;
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getPressure() {
		return pressure;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public void dataChanged() {
		// 调用接入方的update()方法进行推送。
		currentConditions.update(getTemperature(), getPressure(), getHumidity());
	}
	
	// 当数据有更新时，就调用setData()方法
	public void setData(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		// 将最新的信息推送给接入方。
		dataChanged();
	}
}
