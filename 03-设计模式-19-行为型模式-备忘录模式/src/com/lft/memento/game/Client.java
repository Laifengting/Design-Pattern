package com.lft.memento.game;

public class Client {
	public static void main(String[] args) {
		GameRole gameRole = new GameRole();
		gameRole.setAggressivity(100);
		gameRole.setDefense(100);
		
		System.out.println("大战前的状态：");
		gameRole.display();
		
		// 保存大战前的状态
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(gameRole.createMemento());
		
		System.out.println("大战开始~~~~");
		gameRole.setAggressivity(60);
		gameRole.setDefense(50);
		
		System.out.println("大战后的状态：");
		gameRole.display();
		
		// 大战后恢复
		System.out.println("恢复后的状态：");
		gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
		gameRole.display();
	}
}
