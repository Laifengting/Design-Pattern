package com.lft.pattern22.strategy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-27 12:20
 * <p>
 * Class Name:      Strategy
 * Package Name:    com.lft.pattern22.strategy
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Strategy {
	public static void main(String[] args) {
		// 无序数组
		Integer[] data = {9, 1, 2, 8, 4, 3};
		
		// 实现升序排序网络，返回-1放左边，1放右边，0保持不变
		// 说明
		// 1. 实现了Comparator接口（策略接口），匿名类对象 new Comparator<Integer>(){...}
		// 2. 对象 new Comparator<Integer>(){...} 就是实现了策略接口的对象。
		// 3. public int compare(Integer o1,Integer o2){} 指定具体的处理策略。
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 > o2) {
					return 1;
				} else if (o1 < o2) {
					return -1;
				} else {
					return 0;
				}
			}
		};
		
		/*
		public static <T> void sort(T[] a, Comparator<? super T> c) {
			if (c == null) {
				sort(a);
			} else {
				if (LegacyMergeSort.userRequested)
					legacyMergeSort(a, c);
				else
					TimSort.sort(a, 0, a.length, c, null, 0, 0);
			}
		}
		 */
		Arrays.sort(data, comparator);
		System.out.println(Arrays.toString(data)); // 升序
		
		System.out.println("************************");
		
		// 方式2-使用lambda表达式
		Integer[] data2 = {19, 11, 12, 18, 14, 13};
		
		// Arrays.sort(data2, (var1, var2) -> {
		// 	if (var1.compareTo(var2) > 0) {
		// 		return 1;
		// 	} else if (var1.compareTo(var2) < 0) {
		// 		return -1;
		// 	} else {
		// 		return 0;
		// 	}
		// });
		
		// Arrays.sort(data2, (var1, var2) -> {
		// 	return Integer.compare(var1.compareTo(var2), 0);
		// });
		
		Arrays.sort(data2, (var1, var2) -> Integer.compare(var1.compareTo(var2), 0));
		System.out.println(Arrays.toString(data2));
	}
}
