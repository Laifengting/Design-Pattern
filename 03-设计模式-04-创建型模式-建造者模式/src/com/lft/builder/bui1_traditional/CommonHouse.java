package com.lft.builder.bui1_traditional;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-09 20:46
 * <p>
 * Class Name:      CommonHouse
 * Package Name:    com.lft.builder.bui1_traditional
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class CommonHouse extends House {
	@Override
	public void buildBase() {
		System.out.println("给普通房子打地基");
	}
	
	@Override
	public void buildWall() {
		System.out.println("给普通房子砌墙");
	}
	
	@Override
	public void buildRoof() {
		System.out.println("给普通房子封顶");
	}
}
