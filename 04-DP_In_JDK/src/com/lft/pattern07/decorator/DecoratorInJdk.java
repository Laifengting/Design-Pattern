package com.lft.pattern07.decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-11 12:09
 * <p>
 * Class Name:      DecoratorInJdk
 * Package Name:    com.lft.pattern07.decorator
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class DecoratorInJdk {
	public static void main(String[] args) throws IOException {
		/*
		 * 说明
		 * 1. InputStream 是抽象类，类似我们前面讲的 Drink
		 * 2. FileInputStream 是 InputStream 子类：类似前面ShortBlack，LongBlack
		 * 3. FilterInputStream 是 InputStream 子类：类似我们前面的 Decorator 修饰者
		 * 4. DataInputStream 是 FilterInputStream 子类，具体的修改者，类似前面的Milk,Soy等。
		 * 5. FilterInputStream 类 有protected volatile InputStream in; 即含被装饰者。
		 * 6. 分析得出在JDK的IO体系中，就是使用装饰者模式
		 */
		DataInputStream dataInputStream = new DataInputStream(new FileInputStream("d:\\abc.txt"));
		System.out.println(dataInputStream.read());
		dataInputStream.close();
	}
}
