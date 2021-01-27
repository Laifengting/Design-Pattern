package com.lft.business.delegate;

public class Strategies {
	
	BusinessDelegate businessService;
	
	public Strategies(BusinessDelegate businessService) {
		this.businessService = businessService;
	}
	
	public void doTask() {
		businessService.doTask();
	}
}