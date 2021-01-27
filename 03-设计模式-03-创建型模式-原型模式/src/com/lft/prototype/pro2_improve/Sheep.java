package com.lft.prototype.pro2_improve;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-08 21:49
 * <p>
 * Class Name:      Sheep
 * Package Name:    com.lft.prototype
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Sheep implements Cloneable {
	private String name;
	private int age;
	private String color;
	private String address = "蒙古";
	
	public Sheep(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Sheep{" +
				"name='" + name + '\'' +
				", age=" + age +
				", color='" + color + '\'' +
				", address='" + address + '\'' +
				'}';
	}
	
	/**
	 * 克隆该实例，使用默认的clone方法来完成
	 * @return
	 */
	@Override
	protected Object clone() {
		Sheep sheep = null;
		try {
			sheep = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
		return sheep;
	}
}
