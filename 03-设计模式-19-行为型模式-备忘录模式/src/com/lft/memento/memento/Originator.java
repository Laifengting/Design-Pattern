package com.lft.memento.memento;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-25 14:22
 * <p>
 * Class Name:      Originator
 * Package Name:    com.lft.memento
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Originator {
	private String state;
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * 编写一个方法，可以保存一个状态对象 Memento
	 * 因此编写一个方法，返回 Memento
	 */
	public Memento saveStateMemento() {
		return new Memento(state);
	}
	
	/**
	 * 通过备忘录对象，恢复状态
	 */
	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
	}
}
