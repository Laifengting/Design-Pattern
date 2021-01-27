package com.lft.visitor.old;

import java.util.LinkedList;
import java.util.List;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-18 16:48
 * <p>
 * Class Name:      ObjectStructure
 * Package Name:    com.lft.visitor
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 * <p>
 * 数据结构，管理了很多人(Man，Woman)
 */
public class ObjectStructure {
	// 维护了一个集合。
	private List<Person> personList = new LinkedList<>();
	
	// 增加到personList
	public void attach(Person person) {
		personList.add(person);
	}
	
	// 从personList中移除
	public void detach(Person person) {
		personList.remove(person);
	}
	
	// 显示测评情况
	public void display(Action action) {
		for (Person person : personList) {
			person.accept(action);
		}
	}
}
