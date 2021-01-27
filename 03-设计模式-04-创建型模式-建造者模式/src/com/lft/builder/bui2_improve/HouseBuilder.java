package com.lft.builder.bui2_improve;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-09 21:13
 * <p>
 * Class Name:      HouseBuilder
 * Package Name:    com.lft.builder.bui2_improve
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 * <p>
 * 抽象/接口 —— 建造者
 */
public abstract class HouseBuilder {
	protected House house = new House();
	
	// 将建造的流程写好，抽象方法
	public abstract void buildBase();
	
	public abstract void buildWall();
	
	public abstract void buildRoof();
	
	// 建造房子，将产品(房子)返回
	public House buildHouse() {
		return house;
	}
}
