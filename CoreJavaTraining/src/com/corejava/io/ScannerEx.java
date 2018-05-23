package com.corejava.io;

import java.io.Console;

public class ScannerEx {
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		String name = in.nextLine();
//		String firstName = in.next(); //to read a single word
//		int age = in.nextInt();
//		double sal = in.nextDouble();
//		
//		System.out.println("name: "+firstName);
//		System.out.println("age: "+age);
//		System.out.println("sal: "+sal);
		
		 Console cnsl = null;
	      String name = null;
	      
	      try{
	         // creates a console object
	         cnsl = System.console();

	         // if console is not null
	         if (cnsl != null) {
	            
	            // read line from the user input
	            name = cnsl.readLine("Name: ");
	            
	            // prints
	            System.out.println("Name entered : " + name);
	         }      
	      }catch(Exception ex){
	         
	         // if any error occurs
	         ex.printStackTrace();      
	      }
		
	}
}

//Restuarant: Menu
//starters 
//1. chilly 65
//2. corn flakes
//3. etc
//drinks
//1. lassi
//2. soft drinks
//1 or 2