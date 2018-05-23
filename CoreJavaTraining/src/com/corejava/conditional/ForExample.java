package com.corejava.conditional;

public class ForExample {
		ForExample(int a, int b){
			a=90;
			b=89;
		}
	
	String varForDemo = "";

	public void forDemo(int orderNo) {
		for (int order = orderNo; order > 1; order--) {
			System.out.println("1. Prawns");
			System.out.println("2. Paneer");
			System.out.println("3. Biryani");
		}
	}

	public void printEvenNos(int num1, int num2) {
		System.out.println("in method");
		for (int i = num1; i <= num2; i++) {

			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static String printName(String fName, String lName) {
		
		return fName+" "+lName;
	}
}
