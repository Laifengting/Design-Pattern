package com.lft.memento.game;

/**
 * 守护者对象，保存游戏角色的状态。
 */
public class Caretaker {
	
	/**
	 * 保存一次，创建一个对象就可以了。
	 */
	private Memento memento;
	/**
	 * 如果需要保存多次，可以使用List<Memento>集合来管理。
	 */
	// private List<Memento> mementoList;
	
	/**
	 * 如果需要对多个游戏角色保存多个状态。使用HashMap + List来管理。
	 */
	// private HashMap<String, List<Memento>> rolesMementos;
	public Memento getMemento() {
		return memento;
	}
	
	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
