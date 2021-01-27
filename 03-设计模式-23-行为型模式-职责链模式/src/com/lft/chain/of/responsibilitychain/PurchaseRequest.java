package com.lft.chain.of.responsibilitychain;

/**
 * 请求类
 */
public class PurchaseRequest {
	/**
	 * 请求类型
	 */
	private int type;
	
	/**
	 * 请求金额
	 */
	private float price;
	
	/**
	 * 请求序号
	 */
	private int id;
	
	/**
	 * 构造器
	 * @param type
	 * @param price
	 * @param id
	 */
	public PurchaseRequest(int type, float price, int id) {
		this.type = type;
		this.price = price;
		this.id = id;
	}
	
	public int getType() {
		return type;
	}
	
	public float getPrice() {
		return price;
	}
	
	public int getId() {
		return id;
	}
}
