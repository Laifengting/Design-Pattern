package com.lft.prototype.pro3_deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-09 13:01
 * <p>
 * Class Name:      DeepProtoType
 * Package Name:    com.lft.prototype.pro3_deepclone
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class DeepProtoType implements Serializable, Cloneable {
	
	private static final long serialVersionUID = -3132087414925588433L;
	
	/**
	 * String类型属性
	 */
	private String name;
	/**
	 * 引用类型属性
	 */
	private DeepCloneableTarget deepCloneableTarget;
	
	public DeepProtoType() {
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public DeepCloneableTarget getDeepCloneableTarget() {
		return deepCloneableTarget;
	}
	
	public void setDeepCloneableTarget(DeepCloneableTarget deepCloneableTarget) {
		this.deepCloneableTarget = deepCloneableTarget;
	}
	
	@Override
	public String toString() {
		return "DeepProtoType{" +
				"name='" + name + '\'' +
				", deepCloneableTarget=" + deepCloneableTarget +
				'}';
	}
	
	/**
	 * 深拷贝 - 方式1 实现Cloneable接口，重写clone()方法
	 */
	@Override
	protected Object clone() {
		Object deep = null;
		// 完成对基本数据类型（属性）和String的克隆
		try {
			deep = super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
		
		// 对引用类型的属性，进行单独处理。
		DeepProtoType deepProtoType = (DeepProtoType) deep;
		
		try {
			deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
		
		return deepProtoType;
	}
	
	/**
	 * 深拷贝 - 方式2 实现Serializable接口，通过对象的序列化实现(推荐使用)
	 */
	public DeepProtoType deepClone() {
		// 创建流过对象
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			//序列化
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			// 把当前这个对象以对象流的方式输出。
			oos.writeObject(this);
			
			// 反序列化
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			
			return (DeepProtoType) ois.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				ois.close();
				bis.close();
				oos.close();
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}
}

