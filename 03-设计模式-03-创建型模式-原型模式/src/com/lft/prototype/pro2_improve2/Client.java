package com.lft.prototype.pro2_improve2;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-09 10:37
 * <p>
 * Class Name:      Client
 * Package Name:    com.lft.prototype.improve
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Client {
	public static void main(String[] args) {
		// 使用原型模式克隆羊
		Sheep sheep = new Sheep("Tom", 1, "白色");
		sheep.setFriend(new Sheep("Helen", 2, "黑色"));
		
		Sheep sheep2 = (Sheep) sheep.clone();
		Sheep sheep3 = (Sheep) sheep.clone();
		Sheep sheep4 = (Sheep) sheep.clone();
		Sheep sheep5 = (Sheep) sheep.clone();
		
		System.out.println(sheep + " sheep.friend= " + sheep.getFriend() + " " + sheep.getFriend().hashCode());
		System.out.println(sheep2 + " sheep.friend= " + sheep2.getFriend() + " " + sheep2.getFriend().hashCode());
		System.out.println(sheep3 + " sheep.friend= " + sheep3.getFriend() + " " + sheep3.getFriend().hashCode());
		System.out.println(sheep4 + " sheep.friend= " + sheep4.getFriend() + " " + sheep4.getFriend().hashCode());
		System.out.println(sheep5 + " sheep.friend= " + sheep5.getFriend() + " " + sheep5.getFriend().hashCode());
		
	}
}
