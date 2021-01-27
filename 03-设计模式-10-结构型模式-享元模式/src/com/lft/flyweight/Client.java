package com.lft.flyweight;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-13 15:44
 * <p>
 * Class Name:      Client
 * Package Name:    com.lft.flyweight
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class Client {
	public static void main(String[] args) {
		// 创建一个工厂类
		WebSiteFactory webSiteFactory = new WebSiteFactory();
		
		// 客户要一个以新闻形式发布的网站
		WebSite webSite1 = webSiteFactory.getWebSiteCategory("新闻");
		webSite1.use(new User("小红"));
		
		// 客户要一个以新闻形式发布的网站
		WebSite webSite2 = webSiteFactory.getWebSiteCategory("博客");
		webSite2.use(new User("小花"));
		
		System.out.println("网站的分类共有: " + webSiteFactory.getWebSiteCount() + " 个");
		
		// 客户要一个以新闻形式发布的网站
		WebSite webSite3 = webSiteFactory.getWebSiteCategory("新闻");
		webSite3.use(new User("小明"));
		
		System.out.println("网站的分类共有: " + webSiteFactory.getWebSiteCount() + " 个");
		
	}
}
