package com.lft.memento.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-25 14:27
 * <p>
 * Class Name:      Caretaker
 * Package Name:    com.lft.memento
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Caretaker {
	/**
	 * 在 List 集合中会有很多的备忘录对象。
	 */
	private List<Memento> mementoList = new ArrayList<>();
	
	public void add(Memento memento) {
		mementoList.add(memento);
	}
	
	/**
	 * 获取第index个Originator 的备忘录对象（即保存状态）。
	 * @param index
	 * @return
	 */
	public Memento get(int index) {
		return mementoList.get(index);
	}
}
