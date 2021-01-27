package com.lft.bridge;

import com.lft.bridge.brand.HuaWei;
import com.lft.bridge.brand.Vivo;
import com.lft.bridge.brand.XiaoMi;
import com.lft.bridge.type.FoldedPhone;
import com.lft.bridge.type.FoldingScreenPhone;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-10 21:56
 * <p>
 * Class Name:      Client
 * Package Name:    com.lft.bridge
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Client {
	public static void main(String[] args) {
		// 获取折叠式手机(样式 + 品牌)
		Phone phone1 = new FoldedPhone(new XiaoMi());
		phone1.open();
		phone1.call();
		phone1.close();
		
		System.out.println("-----------------------");
		
		Phone phone2 = new FoldedPhone(new Vivo());
		phone2.open();
		phone2.call();
		phone2.close();
		
		System.out.println("-----------------------");
		
		Phone phone3 = new FoldingScreenPhone(new HuaWei());
		phone3.open();
		phone3.call();
		phone3.close();
	}
}
