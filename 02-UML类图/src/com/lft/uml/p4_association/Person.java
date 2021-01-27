package com.lft.uml.p4_association;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020/9/6 21:38
 * E-mail:			laifengting@foxmail.com
 * <p>
 * Class Name:      Person
 * Package Name:    com.lft.uml.association
 * @author Laifengting
 * @version 1.0.0
 * @since JDK 8
 * <p>
 * 表示方法：实线箭头表示，双向的关联可以有两个箭头或者没有箭头，单向的关联有一个箭头。
 * 关联关系是类与类之间的联结，它使一个类知道另一个类的属性和方法。
 * 在 Java 或 c++ 中，关联关系是通过使用成员变量来实现的。
 * <p>
 * 特征：表示类与类或类与接口之间的依赖关系，表现为“拥有关系”；具体到代码可以用实例变量来表示。
 * （A类有一个成员变量保存的是B类的一个引用，也就是说由A类可以找到B类）
 */
public class Person {
	private IDCard card;
}
