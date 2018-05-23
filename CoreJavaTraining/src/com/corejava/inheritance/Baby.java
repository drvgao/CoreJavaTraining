package com.corejava.inheritance;

public class Baby implements Person {
	int age;
	String name;

	@Override
	public void talk() {
		System.out.println("I'm not able to walk, just a baby");
	}

	@Override
	public void walk() {
		System.out.println("I'm 1 year old, I can't walk");
	}

	@Override
	public void eat() {
		System.out.println("I can only drink milk");
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}

}
