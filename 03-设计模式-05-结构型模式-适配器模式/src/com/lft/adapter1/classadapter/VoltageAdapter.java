package com.lft.adapter1.classadapter;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-10 12:12
 * <p>
 * Class Name:      VoltageAdapter
 * Package Name:    com.lft.adapter1.classadapter
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 * <p>
 * 适配器类
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
	@Override
	public int output5V() {
		// 获取到220V电压
		int srcV = output220V();
		
		// 转换成5V
		int dstV = srcV / 44;
		
		// 输出5V电压
		return dstV;
	}
}
