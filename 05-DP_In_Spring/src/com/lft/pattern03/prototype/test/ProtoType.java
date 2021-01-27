package com.lft.pattern03.prototype.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-09 11:16
 * <p>
 * Class Name:      ProtoType
 * Package Name:    com.lft.pattern01.prototype.test
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class ProtoType {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Object bean = applicationContext.getBean("id01");
		System.out.println("bean = " + bean);
		
		Object bean2 = applicationContext.getBean("id01");
		System.out.println("bean2 = " + bean2);
		
		System.out.println(bean == bean2);
	}
}
