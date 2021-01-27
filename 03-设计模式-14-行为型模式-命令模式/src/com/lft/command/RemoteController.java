package com.lft.command;

import com.lft.command.device.command.NoCommand;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-16 13:51
 * <p>
 * Class Name:      RemoteController
 * Package Name:    com.lft.command
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class RemoteController {
	// 开按钮的命令数组
	Command[] onCommands;
	Command[] offCommands;
	
	// 执行撤销的命令。
	Command undoCommand;
	
	/**
	 * 初始化按钮为空命令。
	 */
	public RemoteController() {
		onCommands = new Command[5];
		offCommands = new Command[5];
		for (int i = 0; i < onCommands.length; i++) {
			onCommands[i] = new NoCommand();
			offCommands[i] = new NoCommand();
		}
	}
	
	// 给我们的按钮设置需要的命令。
	public void setCommand(int no, Command onCommand, Command offCommand) {
		onCommands[no] = onCommand;
		offCommands[no] = offCommand;
	}
	
	// 按下开按钮
	public void onButtonWasPushed(int no) {
		// 找到按下的开的按钮，并调用对应方法。
		onCommands[no].execute();
		
		// 记录这次的操作，用于撤销。
		undoCommand = onCommands[no];
	}
	
	// 按下关按钮
	public void offButtonWasPushed(int no) {
		// 找到按下的关的按钮，并调用对应方法。
		offCommands[no].execute();
		
		// 记录这次的操作，用于撤销。
		undoCommand = offCommands[no];
	}
	
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}
}
