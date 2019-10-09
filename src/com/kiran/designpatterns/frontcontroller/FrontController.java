package com.kiran.designpatterns.frontcontroller;

public class FrontController {
	
	private Dispatching dispatching;
	
	public FrontController() {
		dispatching = new Dispatching();
	}
	
	private boolean isAuthenticUser() 
    { 
        System.out.println("Authentication successfull."); 
        return true; 
    } 
	
	public void trackUser(String request) {
		System.out.println("Requested View is :"+request);
	}
	
	public void dispatchRequest(String request) {
		trackUser(request);
		
		if(isAuthenticUser()) {
			dispatching.dispatch(request);
		}
	}
}
