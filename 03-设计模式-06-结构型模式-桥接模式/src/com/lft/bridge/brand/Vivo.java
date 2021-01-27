package com.lft.bridge.brand;

import com.lft.bridge.Brand;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-10 21:44
 * <p>
 * Class Name:      Vivo
 * Package Name:    com.lft.bridge
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Vivo implements Brand {
	@Override
	public void open() {
		System.out.println("VIVO手机开机");
	}
	
	@Override
	public void close() {
		System.out.println("VIVO手机关机");
	}
	
	@Override
	public void call() {
		System.out.println("使用VIVO手机打电话");
	}
}
