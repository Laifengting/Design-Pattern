package com.lft.observer.obs2_improve;

public class Client {
	public static void main(String[] args) {
		//
		WeatherData weatherData = new WeatherData();
		CurrentConditions currentConditions = new CurrentConditions();
		weatherData.registerObserver(currentConditions);
		weatherData.setData(40, 160, 90);
		
		System.out.println("========================");
		
		weatherData.setData(-50, 140, 10);
		
		Baidu baidu = new Baidu();
		weatherData.registerObserver(baidu);
		
		System.out.println("========================");
		
		weatherData.setData(40, 160, 90);
		
	}
}
