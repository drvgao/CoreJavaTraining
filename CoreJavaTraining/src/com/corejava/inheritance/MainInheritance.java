package com.corejava.inheritance;

public class MainInheritance {

	public static void main(String[] args) {
		EBook eBook = new EBook();
		
		eBook.setTitle("Gone with the wind");
//		System.out.println("title is: "+ eBook.getTitle());
		
		Baby baby = new Baby();
		baby.talk();
	}

}
