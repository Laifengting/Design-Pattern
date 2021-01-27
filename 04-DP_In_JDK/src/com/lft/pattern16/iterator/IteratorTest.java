package com.lft.pattern16.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-23 7:47
 * <p>
 * Class Name:      Iterator
 * Package Name:    com.lft.pattern16.iterator
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class IteratorTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Jack");
		
		// 获取迭代器
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
