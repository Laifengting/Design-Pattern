package com.lft.command.device.command;

import com.lft.command.Command;
import com.lft.command.device.LightReceiver;

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
 */
public class LightOffCommand implements Command {
	// 聚合LightReceiver
	LightReceiver lightReceiver;
	
	public LightOffCommand(LightReceiver lightReceiver) {
		this.lightReceiver = lightReceiver;
	}
	
	@Override
	public void execute() {
		lightReceiver.off();
	}
	
	@Override
	public void undo() {
		lightReceiver.on();
	}
}
