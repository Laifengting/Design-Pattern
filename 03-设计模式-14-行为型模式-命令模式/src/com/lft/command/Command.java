package com.lft.command;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-16 13:44
 * <p>
 * Class Name:      Command
 * Package Name:    com.lft.command
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public interface Command {
	/**
	 * 执行动作(操作)
	 */
	void execute();
	
	/**
	 * 撤销动作(操作)
	 */
	void undo();
}
