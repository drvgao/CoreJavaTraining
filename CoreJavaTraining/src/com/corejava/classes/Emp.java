package com.corejava.classes;

class Emp 
{
	int empNo;
	String empName;
	
	Emp(){
		System.out.println("Default Constructor");
		empNo = 10;
		empName = "Default Emp Name";
	}
	
	//Emp emp = new Emp(11, "santosh"); //empNo = no, no has 11
	 Emp(int no, String name){
		
		empNo = no;
		empName = name;

		System.out.println("Parameter Constructor");
	}
	
}
