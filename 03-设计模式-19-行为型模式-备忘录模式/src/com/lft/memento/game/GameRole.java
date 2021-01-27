package com.lft.memento.game;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-25 21:30
 * <p>
 * Class Name:      GameRole
 * Package Name:    com.lft.memento.game
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class GameRole {
	private int aggressivity; // 攻击力
	private int defense; // 防御力
	
	// 创建Memento，根据当前的状态得到Memento
	public Memento createMemento() {
		return new Memento(aggressivity, defense);
	}
	
	// 从备忘录对象，恢复GameRole的状态
	public void recoverGameRoleFromMemento(Memento memento) {
		this.aggressivity = memento.getAggressivity();
		this.defense = memento.getDefense();
	}
	
	// 显示当前游戏角色的状态
	public void display() {
		System.out.println("攻击力：" + aggressivity);
		System.out.println("防御力：" + defense);
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
