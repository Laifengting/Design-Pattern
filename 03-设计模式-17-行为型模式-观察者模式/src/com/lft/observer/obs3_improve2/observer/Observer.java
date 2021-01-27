package com.lft.observer.obs3_improve2.observer;

import com.lft.observer.obs3_improve2.message.Message;

/**
 * 观察者接口，由观察者来实现。
 */
public interface Observer {
	/**
	 * 订阅
	 */
	void subscribe();
	
	/**
	 * 取消订阅
	 */
	void unsubscribe();
	
	void update(Message message);
}
