package com.lft.visitor.old;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-18 16:29
 * <p>
 * Class Name:      Singer
 * Package Name:    com.lft.visitor
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public abstract class Action {
	// 得到男性的测评
	public abstract void getManResult(Man man);
	
	// 得到女性的测评
	public abstract void getWomanResult(Woman woman);
}
