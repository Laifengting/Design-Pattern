package com.lft.business.delegate;

public class BusinessDelegatePatternDemo {
	
	public static void main(String[] args) {
		
		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType("EJB");
		
		Strategies strategies = new Strategies(businessDelegate);
		strategies.doTask();
		
		businessDelegate.setServiceType("JMS");
		strategies.doTask();
	}
}