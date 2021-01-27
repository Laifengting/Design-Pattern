package com.lft.uml.p3_implementation;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020/9/6 21:27
 * E-mail:			laifengting@foxmail.com
 * <p>
 * Class Name:      PersonServiceBean
 * Package Name:    com.lft.uml.implementation
 * @author Laifengting
 * @version 1.0.0
 * @since JDK 8
 * <p>
 * 实现关系
 * B类 实现了 A接口
 * AB就是实现关系
 * <p>
 * 表示方法：空心箭头的虚线
 * 实现关系指两个实体之间的一个合同。换言之，一个实体定义一个合同，而另一个实体保证履行该合同。
 * 对Java应用程序进行建模时，实现关系可直接用implements关键字来表示。表达一种说明元素与实现元素之间的关系；
 */
public class PersonServiceBean implements PersonService {
	@Override
	public void delete(Integer id) {
		System.out.println("delete...");
	}
}
