package com.lft.pattern23.responsibilitychain;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-27 13:44
 * <p>
 * Class Name:      ResponsibilityChain
 * Package Name:    com.lft.pattern23.responsibilitychain
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class ResponsibilityChain {
	public static void main(String[] args) {
		// DispatcherServlet
		
		// public class DispatcherServlet extends FrameworkServlet {
		// 	protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//->	HandlerExecutionChain mappedHandler = null;
		//
		//-> 		mappedHandler = getHandler(processedRequest);
		//
		//->		if (!mappedHandler.applyPreHandle(processedRequest, response)) {
		// 				return;
		// 			}
		// 		}
		// }
		
		// public class HandlerExecutionChain {
		//		boolean applyPreHandle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 			HandlerInterceptor[] interceptors = getInterceptors();
		// 			if (!ObjectUtils.isEmpty(interceptors)) {
		// 				for (int i = 0; i < interceptors.length; i++) {
		//->				HandlerInterceptor interceptor = interceptors[i];
		//->				if (!interceptor.preHandle(request, response, this.handler)) {
		// 						triggerAfterCompletion(request, response, null);
		// 						return false;
		// 					}
		// 					this.interceptorIndex = i;
		// 				}
		// 			}
		// 			return true;
		// 		}
		// }
		
		// void applyPostHandle(HttpServletRequest request, HttpServletResponse response, @Nullable ModelAndView mv)
		// 			throws Exception {
		//
		// 		HandlerInterceptor[] interceptors = getInterceptors();
		// 		if (!ObjectUtils.isEmpty(interceptors)) {
		// 			for (int i = interceptors.length - 1; i >= 0; i--) {
		// 				HandlerInterceptor interceptor = interceptors[i];
		// 				interceptor.postHandle(request, response, this.handler, mv);
		// 			}
		// 		}
		// 	}
	}
}
