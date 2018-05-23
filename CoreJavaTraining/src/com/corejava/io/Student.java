package com.corejava.io;

import java.nio.channels.ShutdownChannelGroupException;

public class Student {
	public static int noOfObjs;

	Student() {
		noOfObjs++;
	}

	public static void showObjectCount() {
		System.out.println("Number of instances of Student class is: " + noOfObjs);
	}

	// public static void main(String[] args) {
	public void makeInstances() {
		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();
		Student std4 = new Student();
		showObjectCount();
	}

	static {
		System.out.println("block");
		
	}
}
