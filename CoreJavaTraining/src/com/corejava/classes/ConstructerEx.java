package com.corejava.classes;

class ConstructerEx 
{
	public static void main(String[] args) 
	{
		Emp e = new Emp(); //empNo=10 and empName=default...

//		System.out.println("from Main: "+e.empNo + "  "+ e.empName);

		Emp e1 = new Emp(40,"Rajesh"); //empNo=40
		
		System.out.println("e.empNo: "+e.empName);

//		System.out.println(e1.empNo + "  "+ e1.empName);

//		e1.Emp(6, "Santosh");
	}
}
