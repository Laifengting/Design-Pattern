package com.lft.builder.bui1_traditional;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-09 20:44
 * <p>
 * Class Name:      House
 * Package Name:    com.lft.builder.bui1_traditional
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public abstract class House {
	
	public abstract void buildBase();
	
	public abstract void buildWall();
	
	public abstract void buildRoof();
	
	public void build() {
		buildBase();
		buildWall();
		buildRoof();
	}
}
