package com.lft.observer.obs3_improve2;

import com.lft.observer.obs3_improve2.observer.Baidu;
import com.lft.observer.obs3_improve2.observer.Sina;
import com.lft.observer.obs3_improve2.subject.NewsData;
import com.lft.observer.obs3_improve2.subject.WeatherData;

public class Client {
	public static void main(String[] args) {
		NewsData newsData = new NewsData();
		WeatherData weatherData = new WeatherData();
		
		// 百度订阅新闻
		Baidu baidu = new Baidu(newsData);
		newsData.setData("今天没有新闻");
		
		System.out.println();
		
		// 新浪订阅天气
		Sina sina = new Sina(weatherData);
		weatherData.setData(20, 15, 18);
		System.out.println();
		System.out.println("***************************");
		System.out.println();
		
		// 消息更新
		newsData.setData("百度上了头条了是条假新闻");
		System.out.println();
		weatherData.setData(30,140,20);
		System.out.println();
		System.out.println("***************************");
		System.out.println();
		baidu.unsubscribe();
		sina.unsubscribe();
	}
}
