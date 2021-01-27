package com.lft.pattern14.command;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-16 14:45
 * <p>
 * Class Name:      Command
 * Package Name:    com.lft.pattern14.command
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Command {
	public static void main(String[] args) {
		/**
		 * Runnable接口，就可以看做是一个Command接口。它是所有命令的接口，调用命令对象的run()方法，就可以让接受者进行相关的动作。
		 */
		// public interface Runnable {
		//     /**
		//      * When an object implementing interface <code>Runnable</code> is used
		//      * to create a thread, starting the thread causes the object's
		//      * <code>run</code> method to be called in that separately executing
		//      * thread.
		//      * <p>
		//      * The general contract of the method <code>run</code> is that it may
		//      * take any action whatsoever.
		//      *
		//      * @see     java.lang.Thread#run()
		//      */
		//     public abstract void run();
		// }
		
		/**
		 * Thread 类 可以看成是一个 Invoker，持有一个命令对象，并在某个时间点调用命令对象的run()方法，将请求付诸执行。
		 */
		// class Thread implements Runnable {
		//  属性
		// 	private Runnable target;
		//  构造器
		//  public Thread(Runnable target) {
		//      init(null, target, "Thread-" + nextThreadNum(), 0);
		//  }
		//	重写了run()方法。
		// 	@Override
		// 	public void run() {
		// 		if (target != null) {
		// 			target.run();
		// 		}
		// 	}
		// }
		//
		// 具体启动方法。
		// public synchronized void start() {
		//         if (threadStatus != 0)
		//             throw new IllegalThreadStateException();
		//         group.add(this);
		//         boolean started = false;
		//         try {
		//             start0();
		//             started = true;
		//         } finally {
		//             try {
		//                 if (!started) {
		//                     group.threadStartFailed(this);
		//                 }
		//             } catch (Throwable ignore) {
		//             }
		//         }
		//     }
		
		/**
		 * 具体的接收类。
		 */
		// class Receiver {
		// 		public void action() {
		//			System.out.println("做点什么动作...")
		// 		}
		// }
		
		/**
		 * 具体的俱定义了动作和接受者之间的绑定关系，调用者只要调用run()方法，就可以发出请求，然后由具体命令调用接受者的一个或多个动作。
		 */
		// class ConcreteRunnable implements Runnable {
		// 		private Receiver receiver;
		//
		// 		@Override
		// 		public void run() {
		// 			receiver.action();
		// 		}
		// }
		
		/**
		 * 具体的客户端
		 */
		// class Client{
		// 		public static void main(String[] args) {
		// 			Receiver receiver = new Receiver();
		// 			ConcreteRunnable runnable = new ConcreteRunnable(receiver);
		// 			// 线程调用
		// 			Thread thread = new Thread(runnable);
		// 			thread.start();
		// 		}
		// }
		
	}
}