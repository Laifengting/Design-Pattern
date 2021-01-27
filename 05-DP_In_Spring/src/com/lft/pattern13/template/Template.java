package com.lft.pattern13.template;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-15 11:38
 * <p>
 * Class Name:      Template
 * Package Name:    com.lft.pattern13.template
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Template {
	public static void main(String[] args) {
		/**
		 * 在 Spring 中有一个 ConfigurableApplicationContext 接口，该接口有一个抽象方法 refresh() 。
		 */
		// ConfigurableApplicationContext{
		// 	void refresh() throws BeansException, IllegalStateException;
		// }
		
		/**
		 * 第1个
		 * ConfigurableApplicationContext 接口的实现抽象类 AbstractApplicationContext 中，重写了refresh()方法。
		 * 这个就是模板模式中的模板方法。
		 * refresh() 中调用了很多方法：prepareRefresh()，obtainFreshBeanFactory()，postProcessBeanFactory()，onRefresh() 等
		 */
		// public abstract class AbstractApplicationContext extends DefaultResourceLoader
		// 		implements ConfigurableApplicationContext {
		// 		@Override
		// 		public void refresh() throws BeansException, IllegalStateException {
		// 			synchronized (this.startupShutdownMonitor) {
		// 		}
		// }

		
		/**
		 * 其中也有钩子方法。obtainFreshBeanFactory() 方法调用了两个方法 refreshBeanFactory()，getBeanFactory();
		 * 这两个方法都是抽象方法，由子类去实现。
		 */
		// 	protected ConfigurableListableBeanFactory obtainFreshBeanFactory() {
		// 		refreshBeanFactory();
		// 		return getBeanFactory();
		// 	}
		
		/**
		 * postProcessBeanFactory() 这个方法也是钩子方法。方法做了空实现。
		 */
		// 	protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		// 	}
		
		/**
		 * onRefresh() 这个方法也是钩子方法。做了空实现。让子类去完成真实实现。
		 */
		// 	protected void onRefresh() throws BeansException {
		// 		// For subclasses: do nothing by default.
		// 	}
		
		
		/**
		 * GenericApplicationContext 继承了 AbstractApplicationContext
		 */
		// public class GenericApplicationContext extends AbstractApplicationContext implements
		// BeanDefinitionRegistry {}
		
		/**
		 * 重写了父类的 getBeanFactory() 方法。
		 */
		// public final ConfigurableListableBeanFactory getBeanFactory() {
		//		return this.beanFactory;
		// }
		
		/**
		 * AbstractRefreshableApplicationContext 继承了 AbstractApplicationContext
		 */
		// public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {
		//		@Override
		// 		protected final void refreshBeanFactory() throws BeansException {
		// 			if (hasBeanFactory()) {
		// 				destroyBeans();
		// 				closeBeanFactory();
		// 			}
		// 			try {
		// 				DefaultListableBeanFactory beanFactory = createBeanFactory();
		// 				beanFactory.setSerializationId(getId());
		// 				customizeBeanFactory(beanFactory);
		// 				loadBeanDefinitions(beanFactory);
		// 				this.beanFactory = beanFactory;
		// 			}
		// 			catch (IOException ex) {
		// 				throw new ApplicationContextException("I/O error parsing bean definition source for " +
		// 				getDisplayName(), ex);
		// 			}
		// 		}
		// }
	}
}
