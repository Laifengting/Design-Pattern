package com.lft.command.device.command;

import com.lft.command.Command;
import com.lft.command.device.TVReceiver;

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
public class TVOffCommand implements Command {
	// 聚合LightReceiver
	TVReceiver tvReceiver;
	
	public TVOffCommand(TVReceiver tvReceiver) {
		this.tvReceiver = tvReceiver;
	}
	
	@Override
	public void execute() {
		tvReceiver.off();
	}
	
	@Override
	public void undo() {
		tvReceiver.on();
	}
}
