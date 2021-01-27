package com.lft.pattern08.composite;

import java.util.HashMap;
import java.util.Map;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-12 12:56
 * <p>
 * Class Name:      CompositeInJdk
 * Package Name:    com.lft.pattern08.composite
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class CompositeInJdk {
	public static void main(String[] args) {
		// 说明：
		// 1. Map 就是一个抽象的构建/接口(类似我们的组合模式中的Component)
		// 2. HashMap是一个中间的构建(Composite)，实现/继承了相关方法
		// 3. put,putAll
		// 4. Node，是HashMap的静态内部类，类似Leaf子节点。没有put,putAll方法。
		Map<Integer, String> hashMap = new HashMap<>();
		// 直接存放子节点
		hashMap.put(0, "东游记");
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "西游记");
		map.put(2, "红楼梦");
		
		hashMap.putAll(map);
		System.out.println(hashMap);
	}
}
