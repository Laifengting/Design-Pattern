package com.lft.pattern09.facade;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-13 12:38
 * <p>
 * Class Name:      Facade
 * Package Name:    com.lft.pattern09.facade
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Facade {
	public static void main(String[] args) throws ClassNotFoundException {
		
		/*
		Class中的forName(String name, boolean initialize ,ClassLoader loader)方法调用了ClassLoader、System接口。
		 */
		//     public static Class<?> forName(String name, boolean initialize,
		//                                    ClassLoader loader)
		//         throws ClassNotFoundException
		//     {
		//         Class<?> caller = null;
		//         SecurityManager sm = System.getSecurityManager();
		//         if (sm != null) {
		//             // Reflective call to get caller class is only needed if a security manager
		//             // is present.  Avoid the overhead of making this call otherwise.
		//             caller = Reflection.getCallerClass();
		//             if (sun.misc.VM.isSystemDomainLoader(loader)) {
		//                 ClassLoader ccl = ClassLoader.getClassLoader(caller);
		//                 if (!sun.misc.VM.isSystemDomainLoader(ccl)) {
		//                     sm.checkPermission(
		//                         SecurityConstants.GET_CLASSLOADER_PERMISSION);
		//                 }
		//             }
		//         }
		//         return forName0(name, initialize, loader, caller);
		//     }
		
		
		
		/*
		FacesServlet实现了Servlet接口，在实现方法service()中调用了HttpServletRequest、HttpServletResponse、ApplicationContext接口的方法。
		 */
		// public void service(ServletRequest request,
		//                         ServletResponse response)
		//         throws IOException, ServletException {
		//
		//         requestStart(((HttpServletRequest) request).getRequestURI()); // V3 Probe hook
		//
		//         // If prefix mapped, then ensure requests for /WEB-INF are
		//         // not processed.
		//         String pathInfo = ((HttpServletRequest) request).getPathInfo();
		//         if (pathInfo != null) {
		//             pathInfo = pathInfo.toUpperCase();
		//             if (pathInfo.startsWith("/WEB-INF/")
		//                 || pathInfo.equals("/WEB-INF")
		//                 || pathInfo.startsWith("/META-INF/")
		//                 || pathInfo.equals("/META-INF")) {
		//                 ((HttpServletResponse) response).
		//                       sendError(HttpServletResponse.SC_NOT_FOUND);
		//                 return;
		//             }
		//         }
		//
		//         if (!initFacesContextReleased) {
		//             FacesContext initFacesContext = FacesContext.getCurrentInstance();
		//             if (null != initFacesContext) {
		//                 initFacesContext.release();
		//             }
		//             initFacesContextReleased = true;
		//         }
		//
		//         // Acquire the FacesContext instance for this request
		//         FacesContext context = facesContextFactory.getFacesContext
		//               (servletConfig.getServletContext(), request, response, lifecycle);
		//
		//         // Execute the request processing lifecycle for this request
		//         try {
		//             ResourceHandler handler =
		//                   context.getApplication().getResourceHandler();
		//             if (handler.isResourceRequest(context)) {
		//                 handler.handleResourceRequest(context);
		//             } else {
		//                 lifecycle.execute(context);
		//                 lifecycle.render(context);
		//             }
		//         } catch (FacesException e) {
		//             Throwable t = e.getCause();
		//             if (t == null) {
		//                 throw new ServletException(e.getMessage(), e);
		//             } else {
		//                 if (t instanceof ServletException) {
		//                     throw ((ServletException) t);
		//                 } else if (t instanceof IOException) {
		//                     throw ((IOException) t);
		//                 } else {
		//                     throw new ServletException(t.getMessage(), t);
		//                 }
		//             }
		//         }
		//         finally {
		//             // Release the FacesContext instance for this request
		//             context.release();
		//         }
		//
		//         requestEnd(); // V3 Probe hook
		//     }
	}
	
}
