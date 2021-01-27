package com.lft.intercepting.filter;

public class SendRequest {
	FilterManager filterManager;
	
	public void setFilterManager(FilterManager filterManager) {
		this.filterManager = filterManager;
	}
	
	public void sendRequest(String request) {
		filterManager.filterRequest(request);
	}
}