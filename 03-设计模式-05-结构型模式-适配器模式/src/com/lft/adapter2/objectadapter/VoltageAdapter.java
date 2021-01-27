package com.lft.adapter2.objectadapter;

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
public class VoltageAdapter implements IVoltage5V {
	/**
	 * 关联关系中的聚合
	 */
	private Voltage220V voltage220V;
	
	/**
	 * 通过构造器，传入一下Voltage220V的对象
	 * @param voltage220V
	 */
	public VoltageAdapter(Voltage220V voltage220V) {
		this.voltage220V = voltage220V;
	}
	
	@Override
	public int output5V() {
		int dstV = 0;
		if (voltage220V != null) {
			// 获取到220V电压
			int srcV = voltage220V.output220V();
			
			// 使用对象适配器，进行适配~~
			System.out.println("使用对象适配器，进行适配~~");
			
			// 转换成5V
			dstV = srcV / 44;
			// 输出5V电压
			System.out.println("适配完成，输出电压为 " + dstV);
		}
		return dstV;
	}
}
