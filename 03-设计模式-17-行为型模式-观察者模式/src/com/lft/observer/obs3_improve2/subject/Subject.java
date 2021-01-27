package com.lft.observer.obs3_improve2.subject;

import com.lft.observer.obs3_improve2.observer.Observer;

/**
 * 接口，让 WeatherData 来实现
 */
public interface Subject {
	void registerObserver(Observer observer);
	
	void removeObserver(Observer observer);
	
	void notifyObservers();
}
