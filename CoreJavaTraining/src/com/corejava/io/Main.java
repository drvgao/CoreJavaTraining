package com.corejava.io;

import com.corejava.io.StaticClassEx.InnerClass;

public class Main {

	public static void main(String[] args) {
//		System.out.println("pi: "+StaticVars.pi);
//		Student std = new Student();
//		Student.showObjectCount();//0
//		std.makeInstances();//makes 2
//		Student.showObjectCount();//print 2
		
		StaticClassEx.InnerClass innerClass = new StaticClassEx.InnerClass();
//		innerClass.a = 12;
//		System.out.println(innerClass.a);
		innerClass.bill();
	}

}
