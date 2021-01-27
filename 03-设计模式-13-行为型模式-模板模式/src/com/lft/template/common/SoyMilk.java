package com.lft.template.common;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-15 8:57
 * <p>
 * Class Name:      SoyMilk
 * Package Name:    com.lft.template
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public abstract class SoyMilk {
	/**
	 * 模板方法，make，模板方法可以做成final，不让子类去覆盖。
	 */
	final void make() {
		select();
		addCondiments();
		soak();
		beat();
	}
	
	/**
	 * 先材料
	 */
	void select() {
		System.out.println("第一步：选择新鲜的黄豆");
	}
	
	/**
	 * 添加不同的配料，使用抽象方法。让具体的豆浆品种重写。
	 */
	abstract void addCondiments();
	
	/**
	 * 浸泡
	 */
	void soak() {
		System.out.println("第三步：黄豆和配料开始浸泡，需要3小时");
	}
	
	/**
	 * 研磨
	 */
	void beat() {
		System.out.println("第四步：黄豆和配料放到豆浆机中开始研磨");
	}
}
