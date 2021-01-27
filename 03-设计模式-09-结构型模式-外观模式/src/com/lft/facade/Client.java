package com.lft.facade;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-13 9:38
 * <p>
 * Class Name:      Client
 * Package Name:    com.lft.facade
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Client {
	public static void main(String[] args) {
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
		homeTheaterFacade.ready();
		
		homeTheaterFacade.play();
		
		homeTheaterFacade.end();
		
	}
}
