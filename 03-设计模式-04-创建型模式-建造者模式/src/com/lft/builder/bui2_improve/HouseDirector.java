package com.lft.builder.bui2_improve;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-09 21:20
 * <p>
 * Class Name:      HouseDirector
 * Package Name:    com.lft.builder.bui2_improve
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 * <p>
 * 指挥者，去指定制作流程，返回产品。
 */
public class HouseDirector {
	HouseBuilder houseBuilder = null;
	
	// 通过构造器传入houseBuilder
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	// 通过setter传入houseBuilder
	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	// 如何处理建造房子的流程，交给指挥者
	public House constructHouse() {
		houseBuilder.buildBase();
		houseBuilder.buildWall();
		houseBuilder.buildRoof();
		return houseBuilder.buildHouse();
	}
}
