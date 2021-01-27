package com.lft.pattern03.prototype;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-09 11:11
 * <p>
 * Class Name:      Monster
 * Package Name:    com.lft.pattern01.prototype
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Monster {
	private Integer id = 10;
	private String nickname = "牛魔王";
	private String skill = "芭蕉扇";
	
	public Monster() {
		System.out.println("Monster 创建...");
	}
	
	public Monster(Integer id, String nickname, String skill) {
		this.id = id;
		this.nickname = nickname;
		this.skill = skill;
	}
	
	public Monster(String nickname, String skill, Integer id) {
		this.id = id;
		this.nickname = nickname;
		this.skill = skill;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public String getSkill() {
		return skill;
	}
	
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	@Override
	public String toString() {
		return "Monster{" +
				"id=" + id +
				", nickname='" + nickname + '\'' +
				", skill='" + skill + '\'' +
				'}';
	}
}
