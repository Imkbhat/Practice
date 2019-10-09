package com.kiran.designpatterns.facade;

public class VegResturant implements Hotel{

	@Override
	public Menu getMenus() {
		VegMenu menu =  new VegMenu();
		return null;
	}
}
