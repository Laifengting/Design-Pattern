package com.lft.template.common;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-15 9:05
 * <p>
 * Class Name:      Client
 * Package Name:    com.lft.template
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Client {
	public static void main(String[] args) {
		System.out.println("----制作黑豆豆浆----");
		SoyMilk blackBeanSoyMilk = new BlackBeanSoyMilk();
		blackBeanSoyMilk.make();
		System.out.println("------------------");
		System.out.println("----制作花生豆浆----");
		SoyMilk peanutSoyMilk = new PeanutSoyMilk();
		peanutSoyMilk.make();
	}
}
