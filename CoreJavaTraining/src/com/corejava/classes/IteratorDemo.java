package com.corejava.classes;

import java.util.*;
class IteratorDemo 
{
	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();
		l.add("apple");
		l.add( new Integer(3));
		l.add( "Lap");
		l.add(1,"Bamboo");
		l.add(1,"Dell");
		l.remove(1);
		l.removeLast();
		l.addFirst("intel");

		System.out.println(l);

		Iterator i = l.iterator();

		while(i.hasNext())
		{
			System.out.println(i.next());
			i.remove();
		}
		System.out.println(l);
	}
}
