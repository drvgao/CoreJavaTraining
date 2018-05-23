package com.corejava.classes;

interface I1
{
	public void m1();
}

interface I2
{
	public int m1();
}

class  InterfaceEx2 implements I1
{
	public static void main(String[] args) 
	{
		I1 i1 = new InterfaceEx2();
//		I2  i2 = new InterfaceEx2();
		i1.m1();
//		i2.m1();
	}
	/*public void m1(){
		System.out.println("M1 Method");
	}*/

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	/*public int m1(){
		System.out.println("M1 Method");
	}*/
}
