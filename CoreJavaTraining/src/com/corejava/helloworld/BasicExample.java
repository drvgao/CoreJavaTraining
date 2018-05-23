package com.corejava.helloworld;

public class BasicExample {
	
	public int sum(int a, int b){
		return a+b;
	}
	
	
	public void scopeCheck(){
		int n = 10;
		
		{
			int k = 89;
			System.out.println("n is: "+n + "k is: "+k);
		}
		
	}
}
