package com.lft.prototype.pro3_deepclone;

import java.io.Serializable;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-09 11:42
 * <p>
 * Class Name:      DeepClonableTarget
 * Package Name:    com.lft.prototype.pro3_deepclone
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class DeepCloneableTarget implements Serializable, Cloneable {
	
	private static final long serialVersionUID = 1L;
	private String cloneName;
	private String cloneClass;
	
	public DeepCloneableTarget(String cloneName, String cloneClass) {
		this.cloneName = cloneName;
		this.cloneClass = cloneClass;
	}
	
	/**
	 * 该类的属性都是String类型，因此我们可以直接使用默认的clone()方法
	 * @return
	 * @throws CloneNotSupportedException
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
