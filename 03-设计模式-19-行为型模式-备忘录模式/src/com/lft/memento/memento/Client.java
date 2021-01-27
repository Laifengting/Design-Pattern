package com.lft.memento.memento;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-25 14:30
 * <p>
 * Class Name:      Client
 * Package Name:    com.lft.memento
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Client {
	public static void main(String[] args) {
		// 创建原始数据
		Originator originator = new Originator();
		
		// 创建备忘录管理者
		Caretaker caretaker = new Caretaker();
		
		// 设置原始数据的状态
		originator.setState("状态#1, HP:100");
		
		// 将状态保存，将添加到备忘录管理者中
		caretaker.add(originator.saveStateMemento());
		
		originator.setState("状态#2, HP:80");
		caretaker.add(originator.saveStateMemento());
		
		originator.setState("状态#3, HP:50");
		caretaker.add(originator.saveStateMemento());
		
		System.out.println("当前的状态是：" + originator.getState());
		
		// 希望恢复到状态1
		originator.getStateFromMemento(caretaker.get(0));
		
		System.out.println("恢复后的状态是：" + originator.getState());
	}
}
