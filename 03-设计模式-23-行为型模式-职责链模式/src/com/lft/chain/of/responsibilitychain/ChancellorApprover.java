package com.lft.chain.of.responsibilitychain;

public class ChancellorApprover extends Approver {
	
	public ChancellorApprover(String name) {
		super(name);
	}
	
	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		if (purchaseRequest.getPrice() >= 30000) {
			System.out.println("请求编号：" + purchaseRequest.getId() + " 被 " + this.name + " 审批处理了。");
		} else {
			approver.processRequest(purchaseRequest);
		}
	}
}