package com.lft.builder.bui3_improve;

public class Director {
	ComputerBuilder mBuilser = null;
	
	public Director(ComputerBuilder builer) {
		this.mBuilser = builer;
	}
	
	public void construct(String board, String display) {
		mBuilser.buildDisplay(display);
		mBuilser.buildBoard(board);
		mBuilser.buildOs();
	}
}