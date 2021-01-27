package com.lft.builder.bui2_improve;

import com.lft.builder.bui2_improve.house.CommonHouse;
import com.lft.builder.bui2_improve.house.HighBuilding;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-09 21:23
 * <p>
 * Class Name:      Clent
 * Package Name:    com.lft.builder.bui2_improve
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Client {
	public static void main(String[] args) {
		// 盖普通房子。
		CommonHouse commonHouse = new CommonHouse();
		
		// 准备创建房子的指挥者
		HouseDirector houseDirector = new HouseDirector(commonHouse);
		
		// 完成盖房子，返回产品(房子)
		House house = houseDirector.constructHouse();
		
		System.out.println("-------------------------------");
		
		// 盖高楼
		HighBuilding highBuilding = new HighBuilding();
		
		// 重置建造者
		houseDirector.setHouseBuilder(highBuilding);
		
		// 完成盖房子，返回产品(高楼)
		houseDirector.constructHouse();
	}
}
