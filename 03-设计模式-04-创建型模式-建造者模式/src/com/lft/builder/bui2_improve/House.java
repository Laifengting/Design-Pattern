package com.lft.builder.bui2_improve;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-09 21:12
 * <p>
 * Class Name:      House
 * Package Name:    com.lft.builder.bui2_improve
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 *
 * 对应 —— 产品
 */
public class House {
	private String base;
	private String wall;
	private String roof;
	
	public House() {
	}
	
	public House(String base, String wall, String roof) {
		this.base = base;
		this.wall = wall;
		this.roof = roof;
	}
	
	public String getBase() {
		return base;
	}
	
	public void setBase(String base) {
		this.base = base;
	}
	
	public String getWall() {
		return wall;
	}
	
	public void setWall(String wall) {
		this.wall = wall;
	}
	
	public String getRoof() {
		return roof;
	}
	
	public void setRoof(String roof) {
		this.roof = roof;
	}
	
	@Override
	public String toString() {
		return "House{" +
				"base='" + base + '\'' +
				", wall='" + wall + '\'' +
				", roof='" + roof + '\'' +
				'}';
	}
}
