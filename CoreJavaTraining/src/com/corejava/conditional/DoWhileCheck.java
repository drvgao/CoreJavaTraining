package com.corejava.conditional;

import com.corejava.helloworld.*;

class DoWhileCheck {
	public void restuarant(int order){
		do{
			System.out.println("order #: "+order);
			showMenu();
			order--;}while(order > 1);
		}

	private void showMenu() {
		System.out.println("1. Prawns");
		System.out.println("2. Paneer");
		System.out.println("3. Biryani");
	}
	
	HelloWorld helloWorld = new HelloWorld();
}



