package com.lft.visitor.old;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-18 16:39
 * <p>
 * Class Name:      Person
 * Package Name:    com.lft.visitor
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public abstract class Person {
	// 提供一个方法，让访问者可以访问。
	public abstract void accept(Action action);
}
