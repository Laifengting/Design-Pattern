package com.lft.visitor.old;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-19 19:56
 * <p>
 * Class Name:      Wait
 * Package Name:    com.lft.visitor
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Wait extends Action {
	@Override
	public void getManResult(Man man) {
		System.out.println("男士给的评价是待定。");
	}
	
	@Override
	public void getWomanResult(Woman woman) {
		System.out.println("女士给的评价是待定。");
	}
}
