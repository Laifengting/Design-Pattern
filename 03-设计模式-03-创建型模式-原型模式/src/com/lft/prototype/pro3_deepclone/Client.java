package com.lft.prototype.pro3_deepclone;

import com.lft.prototype.util.DeepCloneUtil;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-09 13:08
 * <p>
 * Class Name:      Client
 * Package Name:    com.lft.prototype.pro3_deepclone
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Client {
	public static void main(String[] args) {
		DeepProtoType deepProtoType = new DeepProtoType();
		deepProtoType.setName("宋江");
		deepProtoType.setDeepCloneableTarget(new DeepCloneableTarget("宋江老婆", "宋江老婆类"));
		
		// 使用 方式1 完成深拷贝
		// DeepProtoType deepProtoType2 = (DeepProtoType) deepProtoType.clone();
		//
		// System.out.println(deepProtoType);
		// System.out.println(deepProtoType2);
		//
		// System.out.println(deepProtoType.getDeepCloneableTarget().hashCode());
		// System.out.println(deepProtoType2.getDeepCloneableTarget().hashCode());
		
		// 使用 方式2 完成深拷贝
		// DeepProtoType deepProtoType2 = deepProtoType.deepClone();
		// System.out.println(deepProtoType);
		// System.out.println(deepProtoType2);
		//
		// System.out.println(deepProtoType.getDeepCloneableTarget().hashCode());
		// System.out.println(deepProtoType2.getDeepCloneableTarget().hashCode());
		
		// DeepProtoType deepProtoType2 = DeepCloneUtil.deepClone(deepProtoType);
		// System.out.println(deepProtoType);
		// System.out.println(deepProtoType2);
		//
		// System.out.println(deepProtoType.getDeepCloneableTarget().hashCode());
		// System.out.println(deepProtoType2.getDeepCloneableTarget().hashCode());
		
		Person person = new Person(1, "Tom", 10);
		
		Person person1 = DeepCloneUtil.deepClone(person);
		
		System.out.println(person + " " + person.hashCode());
		System.out.println(person1 + " " + person1.hashCode());
	}
	
}
