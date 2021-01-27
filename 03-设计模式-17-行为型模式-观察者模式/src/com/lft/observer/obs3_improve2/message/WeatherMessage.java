package com.lft.observer.obs3_improve2.message;

/**
 * 具体消息类
 * 天气信息
 */
public class WeatherMessage implements Message {
	private float temperature;
	private float pressure;
	private float humidity;
	
	public WeatherMessage() {
	}
	
	public WeatherMessage(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
	}
	
	public float getTemperature() {
		return temperature;
	}
	
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	
	public float getPressure() {
		return pressure;
	}
	
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	
	@Override
	public void displayMessage() {
		System.out.println("气温：" + temperature);
		System.out.println("气压：" + pressure);
		System.out.println("温度：" + humidity);
	}
}
