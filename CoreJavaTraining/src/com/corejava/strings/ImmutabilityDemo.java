package com.corejava.strings;

public class ImmutabilityDemo {
	public static void main(String args[]) {
		String s = "Sachin";
		s.concat(" Tendulkar");// concat() method appends the string at the end
		System.out.println("original s: "+s);// will print Sachin because strings are immutable
		System.out.println(s.concat(" Tendulkar"));	
		System.out.println("s: "+s);// Sachin
		
		//I want have changed string values, 'Sachin Tendulkar'
//		Stringbuilder/Stringbuffer
	}

}
