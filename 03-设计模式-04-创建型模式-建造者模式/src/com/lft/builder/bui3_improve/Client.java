package com.lft.builder.bui3_improve;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-20 20:38
 * <p>
 * Class Name:      Client
 * Package Name:    com.lft.builder.bui3_improve
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Client {
	public static void main(String[] args) {
		ComputerBuilder macBookBuilder = new MacBookBuilder();
		Director director = new Director(macBookBuilder);
		director.construct("技嘉主板", "Retina显示器");
		Computer macbookComputer = macBookBuilder.build();
		System.out.println(macbookComputer);
		
		System.out.println("-------------------------------------------------------------");
		
		ComputerBuilder hpBookBuilder = new HPBookBuilder();
		Director director1 = new Director(hpBookBuilder);
		director1.construct("华硕主板", "LED显示器");
		Computer hpComputer = hpBookBuilder.build();
		System.out.println(hpComputer);
	}
}
