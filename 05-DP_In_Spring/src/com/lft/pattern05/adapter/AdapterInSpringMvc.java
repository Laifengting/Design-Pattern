package com.lft.pattern05.adapter;

import org.springframework.web.servlet.DispatcherServlet;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-10 13:49
 * <p>
 * Class Name:      AdapterInSpringMvc
 * Package Name:    com.lft.pattern05.adapter
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class AdapterInSpringMvc {
	public static void main(String[] args) {
		DispatcherServlet dispatcherServlet = new DispatcherServlet();
		// 通过HandlerMapping来映射Controller
		// mappedHandler = getHandler(processedRequest);
		// ...
		// 获取适配器
		// HandlerAdapter ha = getHandlerAdapter(mappedHandler.getHandler());
		// ...
		// 通过适配器调用Controller的方法并返回ModelAndView
		// mv = ha.handle(processedRequest, response, mappedHandler.getHandler());
		
		// HandlerAdapter的实现子类有多种，使得每一种Controller有一种对应的适配器实现类，每种Controller有不同的实现方式。
		
	}
}
