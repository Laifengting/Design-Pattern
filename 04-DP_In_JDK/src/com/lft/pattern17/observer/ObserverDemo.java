package com.lft.pattern17.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-24 9:47
 * <p>
 * Class Name:      ObserverDemo
 * Package Name:    com.lft.pattern17.observer
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class ObserverDemo {
	public static void main(String[] args) {
		// Observable 的作用和地位等价于Subject主题接口和具体主题类
		// 是类，不是接口，类中已经实现了核心的方法。管理Observer的add,delete,notify
		Observable observable = new Observable();
		
		// Observer 接口就是观察者接口。
		Observer observer = new Observer() {
			@Override
			public void update(Observable o, Object arg) {
				
			}
		};
		
	}
}
