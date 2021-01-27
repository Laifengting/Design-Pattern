package com.lft.builder.bui3_improve;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-20 20:35
 * <p>
 * Class Name:      MacBookBuilder
 * Package Name:    com.lft.builder.bui3_improve
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class MacBookBuilder extends ComputerBuilder {
	private Computer mComputer = new MacBook();
	
	@Override
	void buildBoard(String board) {
		mComputer.setBoard(board);
	}
	
	@Override
	void buildDisplay(String display) {
		mComputer.setDisplay(display);
	}
	
	@Override
	void buildOs() {
		mComputer.setOs();
	}
	
	@Override
	Computer build() {
		return mComputer;
	}
}
