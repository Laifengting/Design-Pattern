package com.lft.composite;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-12 9:41
 * <p>
 * Class Name:      Client
 * Package Name:    com.lft.composite
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Client {
	public static void main(String[] args) {
		
		// 从大到小创建对象。学校
		OrganizationComponent university = new University("清华大学", "中国顶级大学");
		
		// 学院
		OrganizationComponent computerCollege = new College("文学专业", "写文章");
		OrganizationComponent infoEngineeringCollege = new College("信息工程专业", "信息工程学院");
		
		// 专业
		computerCollege.add(new Department("软件工程", "软件工程 不错"));
		computerCollege.add(new Department("网络工程", "网络工程 不错"));
		computerCollege.add(new Department("计算机科学与技术", "计算机科学与技术是老牌专业"));
		
		infoEngineeringCollege.add(new Department("通信工程", "通信工程不好学，挺难的"));
		infoEngineeringCollege.add(new Department("信息工程", "信息工程好学"));
		
		university.add(computerCollege);
		university.add(infoEngineeringCollege);
		
		university.print();
		System.out.println("----------------------");
		computerCollege.print();
		System.out.println("----------------------");
		infoEngineeringCollege.print();
		
	}
}
