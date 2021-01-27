package com.lft.command.device.command;

import com.lft.command.Command;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-16 13:45
 * <p>
 * Class Name:      LightOnCommand
 * Package Name:    com.lft.command
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 * <p>
 * 没有任何命令，即空执行：用于初始化每人按钮，当调用空命令时，对象什么都不做，其实，这样是一种设计模式，可以少掉对空判断。
 */
public class NoCommand implements Command {
	
	@Override
	public void execute() {
	}
	
	@Override
	public void undo() {
	}
}
