package com.corejava.io;

public class StaticClassEx {
	int b;
	
	public static class InnerClass{
		int a;
		
		public void bill(){
			System.out.println("selected items are n, price is p");
			System.out.println(a+10);
		}
	}
}
