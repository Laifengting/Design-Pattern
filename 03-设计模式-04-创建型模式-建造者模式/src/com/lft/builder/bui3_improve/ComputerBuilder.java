package com.lft.builder.bui3_improve;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-20 16:21
 * <p>
 * Class Name:      ComputerBuilder
 * Package Name:    com.lft.builder.bui3_improve
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public abstract class ComputerBuilder {
	abstract void buildBoard(String board);
	
	abstract void buildDisplay(String display);
	
	abstract void buildOs();
	
	abstract Computer build();
}
