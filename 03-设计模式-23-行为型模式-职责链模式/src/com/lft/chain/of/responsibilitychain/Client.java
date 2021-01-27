package com.lft.chain.of.responsibilitychain;

public class Client {
	public static void main(String[] args) {
		// 创建一个请求
		PurchaseRequest purchaseRequest = new PurchaseRequest(1, 15000, 1);
		
		// 创建相关的审批人
		DepartmentApprover departmentApprover = new DepartmentApprover("系");
		CollegeApprover collegeApprover = new CollegeApprover("学院");
		ViceChancellorApprover viceChancellorApprover = new ViceChancellorApprover("副校长");
		ChancellorApprover chancellorApprover = new ChancellorApprover("校长");
		
		// 需要将各个审批人级别的下一个处理者设置好（处理人构成环形）
		departmentApprover.setApprover(collegeApprover);
		collegeApprover.setApprover(viceChancellorApprover);
		viceChancellorApprover.setApprover(chancellorApprover);
		chancellorApprover.setApprover(departmentApprover);
		
		// 调用处理请求方法。
		chancellorApprover.processRequest(purchaseRequest);
	}
}
