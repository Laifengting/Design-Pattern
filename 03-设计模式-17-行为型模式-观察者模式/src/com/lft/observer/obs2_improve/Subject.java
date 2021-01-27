package com.lft.observer.obs2_improve;


/**
 * 接口，让 WeatherData 来实现
 */
public interface Subject {
	void registerObserver(Observer observer);
	
	void removeObserver(Observer observer);
	
	void notifyObservers();
}
