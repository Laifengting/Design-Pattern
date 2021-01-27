package com.lft.observer.obs3_improve2.message;

/**
 * 具体消息类
 * 新闻信息
 */
public class NewsMessage implements Message {
	private String newsMessage;
	
	public NewsMessage() {
	}
	
	public NewsMessage(String newsMessage) {
		this.newsMessage = newsMessage;
	}
	
	public String getNewsMessage() {
		return newsMessage;
	}
	
	public void setNewsMessage(String newsMessage) {
		this.newsMessage = newsMessage;
	}
	
	@Override
	public void displayMessage() {
		System.out.println("要闻：" + newsMessage);
	}
}
