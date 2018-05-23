package com.corejava.classes;

abstract class Parent 
{
	public  abstract void add(int a, int b);//method without implementation

	/*public void add(int a, int b, int c){
		System.out.println(a+b+c);
	}*/
	public abstract void doHomeWork(boolean doneHW);
}

class Child extends Parent
{
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public void doHomeWork(boolean done){
		if(true)
		System.out.println("home work done");
		if(false)
			System.out.println("not done");
	}
}

public class AbstractEx
{
	public static void main(String arg[])
	{
		Child c = new Child();
		c.add(2,3);
		c.doHomeWork(true);
	}
}
