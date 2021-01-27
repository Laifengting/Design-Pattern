package com.lft.template.improve;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-15 9:16
 * <p>
 * Class Name:      PureSoyMilk
 * Package Name:    com.lft.template.improve
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class PureSoyMilk extends SoyMilk {
	@Override
	void addCondiments() {
		// 空实现
	}
	
	@Override
	boolean customerWantCondiments() {
		return false;
	}
}
