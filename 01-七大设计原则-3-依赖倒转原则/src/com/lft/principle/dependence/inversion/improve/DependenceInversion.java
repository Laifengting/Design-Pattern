package com.lft.principle.dependence.inversion.improve;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020/9/5 15:42
 * E-mail:			laifengting@foxmail.com
 * <p>
 * Class Name:      DependenceInversion
 * Package Name:    com.lft.dependence.inversion
 * @author Laifengting
 * @version 1.0.0
 * @since JDK 8
 */
public class DependenceInversion {
	public static void main(String[] args) {
		Person person = new Person();
		// 调用方法时，直接传入具体的实现类对象。
		person.receive(new Email());
		person.receive(new WeChat());
	}
}

/**
 * 定义一个接口
 */
interface IReceiver {
	String getInfo();
}

/**
 * 让类去实现接口重写接口方法。
 */
class Email implements IReceiver {
	@Override
	public String getInfo() {
		return "电子邮件邮件信息： Hello,World!!";
	}
}

/**
 * 让类去实现接口重写接口方法。
 */
class WeChat implements IReceiver {
	@Override
	public String getInfo() {
		return "微信信息： Hello,World!!";
	}
}

class Person {
	/**
	 * 依赖倒转原则，将原来对类的依赖倒转为对接口依赖
	 * @param iReceiver
	 */
	public void receive(IReceiver iReceiver) {
		System.out.println(iReceiver.getInfo());
	}
}

/**
 * 或者也可以定义一个抽象类
 */
abstract class MReceicer {
	abstract String getInfo();
}

/**
 * 实体类继承抽象类，实现抽象类的抽象方法。
 */
class YiXin extends MReceicer {
	
	@Override
	String getInfo() {
		return "易信信息： Hello,World!!";
	}
}

class Person2 {
	/**
	 * 依赖倒转原则，将原来对类的依赖倒转为对接口依赖
	 * @param iReceiver
	 */
	public void receive(MReceicer receiver) {
		System.out.println(receiver.getInfo());
	}
}

/*
 **********依赖关系传递的三种方式
 *
 * 1. 接口传递
 *
 * 2. 构造器传递
 *
 * 3. setter方法传递
 */