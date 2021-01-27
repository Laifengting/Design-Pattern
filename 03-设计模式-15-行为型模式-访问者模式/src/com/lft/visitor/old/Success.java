package com.lft.visitor.old;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-18 16:40
 * <p>
 * Class Name:      Success
 * Package Name:    com.lft.visitor
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Success extends Action {
	@Override
	public void getManResult(Man man) {
		System.out.println("男人给的评价是成功");
	}
	
	@Override
	public void getWomanResult(Woman woman) {
		System.out.println("女人给的评价是成功");
	}
}
