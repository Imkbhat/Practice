package com.kiran.designpatterns.frontcontroller;

public class Dispatching {
	
	private StudentView studentView;
	private TeacherView teacherView;
	
	public Dispatching() {
		studentView = new StudentView();
		teacherView = new TeacherView();
	}
	
	public void dispatch(String request) {
		if(request.equalsIgnoreCase("student")) {
			studentView.display();
		} else {
			teacherView.display();
		}
	}
}
