package com.lft.pattern10.flyweight;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-13 15:56
 * <p>
 * Class Name:      Flyweight
 * Package Name:    com.lft.pattern10.flyweight
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Flyweight {
	public static void main(String[] args) {
		
		// 如果Integer.valueOf（x），x在-128~127之间，就是使用享元模式返回。
		// 如果不在这个范围内，就会new新对象。
		Integer x = Integer.valueOf(127);
		Integer y = new Integer(127);
		Integer z = Integer.valueOf(127);
		Integer w = new Integer(127);
		
		System.out.println(x.equals(y)); // true
		System.out.println(x == y); // false
		System.out.println(x == z); // true
		System.out.println(w == x); // false
		System.out.println(w == y); // false
		
		/*
		小结：
			1. 在valueOf() 方法中，先判断值是否在IntegerCache中，如果不在，就创建新的Integer(new)，否则，就直接从缓存池返回
			2. valueOf() 方法，就使用到享元模式
			3. 如果使用valueOf方法得到一个Integer实例，范围在-128~127，执行速度比new快。
		 */
		// public static Integer valueOf(int i) {
		//     if (i >= IntegerCache.low && i <= IntegerCache.high)
		//         return IntegerCache.cache[i + (-IntegerCache.low)];
		//     return new Integer(i);
		// }
	}
}
