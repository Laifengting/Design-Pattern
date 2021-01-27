package com.lft.pattern09.facade;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-13 10:02
 * <p>
 * Class Name:      Facade
 * Package Name:    com.lft.pattern09.facade
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Facade {
	public static void main(String[] args) {
		/*
		【案例 1 MyBatis中的外观模式】
		Configuration类，相当于外观类。用的里个，直接调用Configuration类。
		
		Configuration里面聚合了如下三个接口：
		protected ReflectorFactory reflectorFactory = new DefaultReflectorFactory();
		protected ObjectFactory objectFactory = new DefaultObjectFactory();
		protected ObjectWrapperFactory objectWrapperFactory = new DefaultObjectWrapperFactory();
		而三个接口对应的实现类为：DefaultReflectorFactory，DefaultObjectFactory，DefaultObjectWrapperFactory
		 */
		// Configuration configuration = ms.getConfiguration();
		
		/*
		当获取新元对象时，会将object, objectFactory, objectWrapperFactory, reflectorFactory这四种对象传入。
		调用静态方法forObject()调用了ReflectorFactory，ObjectFactory，ObjectWrapperFactory接口。
		 */
		// public MetaObject newMetaObject(Object object) {
		// 	return MetaObject.forObject(object, objectFactory, objectWrapperFactory, reflectorFactory);
		// }
		
		/*
		静态方法会判断传入的 object 对象是否非空。非空再调用 MetaObject 构造器进行对象创建。
		 */
		// public static MetaObject forObject(Object object, ObjectFactory objectFactory, ObjectWrapperFactory
		// objectWrapperFactory, ReflectorFactory reflectorFactory) {
		// 	if (object == null) {
		// 		return SystemMetaObject.NULL_META_OBJECT;
		// 	} else {
		// 		return new MetaObject(object, objectFactory, objectWrapperFactory, reflectorFactory);
		// 	}
		// }
		
		
		/*
		构造器创建时，会判断进行接口方法的调用。
		 */
		// private MetaObject(Object object, ObjectFactory objectFactory, ObjectWrapperFactory
		//	  objectWrapperFactory,
		//	  ReflectorFactory reflectorFactory) {
		//     this.originalObject = object;
		//     this.objectFactory = objectFactory;
		//     this.objectWrapperFactory = objectWrapperFactory;
		//     this.reflectorFactory = reflectorFactory;
		//
		//     if (object instanceof ObjectWrapper) {
		//       this.objectWrapper = (ObjectWrapper) object;
		//     } else if (objectWrapperFactory.hasWrapperFor(object)) {
		//       this.objectWrapper = objectWrapperFactory.getWrapperFor(this, object);
		//     } else if (object instanceof Map) {
		//       this.objectWrapper = new MapWrapper(this, (Map) object);
		//     } else if (object instanceof Collection) {
		//       this.objectWrapper = new CollectionWrapper(this, (Collection) object);
		//     } else {
		//       this.objectWrapper = new BeanWrapper(this, object);
		//     }
		//   }
		
	}
}
