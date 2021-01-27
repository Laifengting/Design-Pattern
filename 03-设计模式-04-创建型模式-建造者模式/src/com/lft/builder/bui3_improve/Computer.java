package com.lft.builder.bui3_improve;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-20 16:21
 * <p>
 * Class Name:      Computer
 * Package Name:    com.lft.builder.bui3_improve
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public abstract class Computer {
	protected String mBoard;
	protected String mDisplay;
	protected String mOs;
	
	protected Computer() {
	}
	
	public void setBoard(String board) {
		mBoard = board;
	}
	
	public void setDisplay(String display) {
		this.mDisplay = display;
	}
	
	public abstract void setOs();
	
	@Override
	public String toString() {
		return "Computer{" +
				"mBoard='" + mBoard + '\'' +
				", mDisplay='" + mDisplay + '\'' +
				", mOs='" + mOs + '\'' +
				'}';
	}
}
