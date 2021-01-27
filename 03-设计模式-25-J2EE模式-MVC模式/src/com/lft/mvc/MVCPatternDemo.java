package com.lft.mvc;

public class MVCPatternDemo {
	public static void main(String[] args) {
		// 从数据库获取学生记录
		Student model = retrieveStudentFromDatabase();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		
		controller.updateView();
		
		System.out.println("******************************");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 更新模型数据
		controller.setStudentName("John");
		controller.setStudentRollNo("20");
		controller.updateView();
		
	}
	
	private static Student retrieveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Jack");
		student.setRollNo("10");
		return student;
	}
}
