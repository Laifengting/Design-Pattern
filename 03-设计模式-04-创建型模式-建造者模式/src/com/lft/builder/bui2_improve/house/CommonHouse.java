package com.lft.builder.bui2_improve.house;

import com.lft.builder.bui2_improve.HouseBuilder;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-09 21:17
 * <p>
 * Class Name:      CommonHouse
 * Package Name:    com.lft.builder.bui2_improve
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class CommonHouse extends HouseBuilder {
	@Override
	public void buildBase() {
		System.out.println("普通房子打地基");
	}
	
	@Override
	public void buildWall() {
		System.out.println("普通房子砌墙");
	}
	
	@Override
	public void buildRoof() {
		System.out.println("普通房子盖屋顶");
	}
}
