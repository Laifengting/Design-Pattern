package com.lft.visitor.old;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-18 16:39
 * <p>
 * Class Name:      Man
 * Package Name:    com.lft.visitor
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 * <p>
 * 说明：
 * 1. 这里使用到了双分派，即首先在客户端程序中，将具体状态作为参数传递Woman中（第一次分派）
 * 2. 在Woman类调用作为参数的“具体方法”中方法getWomanResult，同时将自己(this)作为参数传入（第二次分派）
 */
public class Woman extends Person {
	@Override
	public void accept(Action action) {
		action.getWomanResult(this);
	}
}
