package com.lft.command;

import com.lft.command.device.LightReceiver;
import com.lft.command.device.TVReceiver;
import com.lft.command.device.command.LightOffCommand;
import com.lft.command.device.command.LightOnCommand;
import com.lft.command.device.command.TVOffCommand;
import com.lft.command.device.command.TVOnCommand;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-16 14:01
 * <p>
 * Class Name:      Client
 * Package Name:    com.lft.command
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Client {
	public static void main(String[] args) {
		// 使用命令设计模式，完成通过摇控器，对电灯的操作。
		
		// 创建电灯的对象(接收者)
		LightReceiver lightReceiver = new LightReceiver();
		
		// 创建电灯相关的开关命令。
		LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
		LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
		
		// 创建一个摇控器
		RemoteController remoteController = new RemoteController();
		
		// 给摇控器设置命令。比如：no = 0 的是电灯的 开 和 关 命令。
		remoteController.setCommand(0, lightOnCommand, lightOffCommand);
		
		System.out.println("----------------按下开灯按钮----------------");
		remoteController.onButtonWasPushed(0);
		
		System.out.println("----------------按下关灯按钮----------------");
		remoteController.offButtonWasPushed(0);
		
		System.out.println("----------------按下撤销按钮----------------");
		remoteController.undoButtonWasPushed();
		
		System.out.println("**********************");
		
		// 创建电视的对象(接收者)
		TVReceiver tvReceiver = new TVReceiver();
		
		// 创建电灯相关的开关命令。
		TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
		TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
		
		// 给摇控器设置命令。比如：no = 0 的是电灯的 开 和 关 命令。
		remoteController.setCommand(1, tvOnCommand, tvOffCommand);
		
		remoteController.onButtonWasPushed(1);
		remoteController.offButtonWasPushed(1);
		remoteController.undoButtonWasPushed();
	}
}
