package com.lft.intercepting.filter;

public class Client {
	public static void main(String[] args) {
		FilterManager filterManager = new FilterManager(new Target());
		filterManager.setFilter(new AuthenticationFilter());
		filterManager.setFilter(new DebugFilter());
		
		SendRequest sendRequest = new SendRequest();
		sendRequest.setFilterManager(filterManager);
		sendRequest.sendRequest("HOME");
	}
}