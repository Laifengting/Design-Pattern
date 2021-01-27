package com.lft.visitor.old;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-18 16:52
 * <p>
 * Class Name:      Client
 * Package Name:    com.lft.visitor
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Client {
	public static void main(String[] args) {
		// 创建ObjectStructure
		ObjectStructure objectStructure = new ObjectStructure();
		objectStructure.attach(new Man());
		objectStructure.attach(new Woman());
		
		// // 成功
		// Success success = new Success();
		// Fail fail = new Fail();
		//
		// objectStructure.display(success);
		// objectStructure.display(fail);
		//
		
		Wait wait = new Wait();
		objectStructure.display(wait);
		
	}
}
