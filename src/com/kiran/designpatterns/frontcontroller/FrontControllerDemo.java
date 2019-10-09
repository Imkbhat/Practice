package com.kiran.designpatterns.frontcontroller;

public class FrontControllerDemo {

	public static void main(String[] args) {
		FrontController controller = new FrontController();
		controller.dispatchRequest("student");
		controller.dispatchRequest("teacher");
	}

}
