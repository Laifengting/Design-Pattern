package com.lft.observer.obs3_improve2.subject;

import com.lft.observer.obs3_improve2.message.WeatherMessage;
import com.lft.observer.obs3_improve2.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 核心类
 * 1. 包含最新的天气情况信息
 * 2. 含有 观察者集合，使用ArrayList来管理
 * 3. 当数据有更新时，就主动的调用 ArrayList , 通知所有的接入方，这样就能看到最新的信息。
 */
public class WeatherData implements Subject {
	private WeatherMessage message;
	private List<Observer> observerList;
	
	public WeatherData() {
		message = new WeatherMessage();
		observerList = new ArrayList<>();
	}
	
	public void dataChanged() {
		// 调用接入方的update()方法进行推送。
		notifyObservers();
	}
	
	// 当数据有更新时，就调用setData()方法
	public void setData(float temperature, float pressure, float humidity) {
		message.setTemperature(temperature);
		message.setPressure(pressure);
		message.setHumidity(humidity);
		// 将最新的信息推送给接入方。
		dataChanged();
	}
	
	/**
	 * 注册一个观察者
	 * @param observer
	 */
	@Override
	public void registerObserver(Observer observer) {
		if (!observerList.contains(observer)) {
			observerList.add(observer);
		}
	}
	
	/**
	 * 移除一个观察者
	 * @param observer
	 */
	@Override
	public void removeObserver(Observer observer) {
		observerList.remove(observer);
	}
	
	@Override
	public void notifyObservers() {
		for (Observer observer : observerList) {
			observer.update(message);
		}
	}
}
