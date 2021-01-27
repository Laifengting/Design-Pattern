package com.lft.memento.game;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-25 21:22
 * <p>
 * Class Name:      Nenebti
 * Package Name:    com.lft.memento.game
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Memento {
	private int aggressivity; // 攻击力
	private int defense; // 防御力
	
	public Memento(int aggressivity, int defense) {
		this.aggressivity = aggressivity;
		this.defense = defense;
	}
	
	public int getAggressivity() {
		return aggressivity;
	}
	
	public void setAggressivity(int aggressivity) {
		this.aggressivity = aggressivity;
	}
	
	public int getDefense() {
		return defense;
	}
	
	public void setDefense(int defense) {
		this.defense = defense;
	}
}
