package com.lft.observer.obs1_traditional;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-23 11:35
 * <p>
 * Class Name:      InternetWeather
 * Package Name:    com.lft.observer.obs1_traditional
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class InternetWeather {
	public static void main(String[] args) {
		CurrentConditions currentConditions = new CurrentConditions();
		WeatherData weatherData = new WeatherData(currentConditions);
		// 更新天气情况
		weatherData.setData(35, 150, 40);
		
		System.out.println("*************************");
		
		// 天气情况更新
		weatherData.setData(20, 140, 60);
	}
}
