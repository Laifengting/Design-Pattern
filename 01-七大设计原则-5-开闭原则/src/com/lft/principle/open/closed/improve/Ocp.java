package com.lft.principle.open.closed.improve;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020/9/6 13:24
 * E-mail:			laifengting@foxmail.com
 * <p>
 * Class Name:      OpenClosed
 * Package Name:    com.lft.principle.open.closed
 * @author Laifengting
 * @version 1.0.0
 * @since JDK 8
 */
public class Ocp {
	public static void main(String[] args) {
		// 使用看看存在的问题。
		
		GraphicEditor graphicEditor = new GraphicEditor();
		graphicEditor.drawShape(new Rectangle());
		graphicEditor.drawShape(new Circle());
		graphicEditor.drawShape(new Triangle());
		graphicEditor.drawShape(new Other());
		
	}
}

/**
 * 这是一个用于绘图的类 （使用方）
 */
class GraphicEditor {
	// 接收Shape对象。直接调用draw()方法
	public void drawShape(Shape s) {
		s.draw();
	}
}

/**
 * Shape类，基类 (提供方)
 */
abstract class Shape {
	int m_type;
	
	// 抽象方法
	public abstract void draw();
}

class Rectangle extends Shape {
	Rectangle() {
		super.m_type = 1;
	}
	
	@Override
	public void draw() {
		System.out.println("  绘制矩形  ");
	}
}

class Circle extends Shape {
	Circle() {
		super.m_type = 2;
	}
	
	@Override
	public void draw() {
		System.out.println("  绘制圆形  ");
	}
}

/**
 * 新增画三角形
 */
class Triangle extends Shape {
	Triangle() {
		super.m_type = 3;
	}
	
	@Override
	public void draw() {
		System.out.println("  绘制三角形  ");
	}
}

/**
 * 新增其他图形
 */
class Other extends Shape {
	Other() {
		super.m_type = 4;
	}
	
	@Override
	public void draw() {
		System.out.println("  绘制其他图形  ");
	}
}