package com.lft.uml.p1_dependence;

/**
 * 依赖关系(类中用到了对方)：
 * 1. 类的成员属性
 * 2. 方法的形参(接收的参数类型)
 * 3. 方法的返回值类型
 * 4. 方法的实参(方法中使用到)
 * <p>
 * 表示方法：虚线加箭头 ..>
 * <p>
 * 特点：当类与类之间有使用关系时就属于依赖关系，不同于关联关系，依赖不具有“拥有关系”，而是一种“相识关系”，只在某个特定地方（比如某个方法体内）才有关系。
 * <p>
 * 依赖关系可以分为以下四类：
 * 1）  使用依赖（Usage）表示客户使用提供者提供的服务以实现它的行为，包括：
 * 使用<<use>>--声明使用一个类时需要用到已存在的另一个类。
 * 调用<<call>>--声明一个类调用其他类的操作的方法。
 * 参数<<parameter>>--声明一个操作和它的参数之间的关系。
 * 发送<<send>>--声明信号发送者和信号接收者之间的关系。
 * 实例化<<instantiate>>--声明用一个类的方法创建了另一个类的实例。
 * <p>
 * 2）  抽象依赖（Abstraction）表示客户与提供者之间用不同的方法表现同一个概念，通常一个概念更抽象，一个概念更具体。包括：
 * 跟踪<<trace>>--声明不同模型中的元素之间存在一些连接但不如映射精确。
 * 精化<<refine>>--声明具有两个不同语义层次上的元素之间的映射。
 * 派生<<derive>>--声明一个实例可以从另一个实例导出。
 * <p>
 * 3）  授权依赖（Permission）表达提供者为客户提供某种权限以访问其内容的情形。包括：
 * 访问<<access>>--允许一个包访问另一个包的内容。
 * 导入<<import>>--允许一个包访问另一个包的内容并为被访问包的组成部分增加别名。
 * 友元<<friend>>--允许一个元素访问另一个元素，不管被访问的元素是否具有可见性。
 * <p>
 * 4）  绑定依赖（Binding）较高级的依赖类型，用于绑定模板以创建新的模型元素，包括：
 * 绑定<<bind>>--为模板参数指定值，以生成一个新的模型元素。
 */
public class PersonServiceBean {
	
	private PersonDao personDao;
	
	public void save(Person person) {
	}
	
	public IDCard getIDCard(Integer personId) {
		
		return null;
	}
	
	public void modify() {
		Department department = new Department();
	}
}
