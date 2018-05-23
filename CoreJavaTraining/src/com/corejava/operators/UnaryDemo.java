package com.corejava.operators;
/**
 * @version 1.0
 * @category unary operators
 * @author RDURGAM
 *
 */
public class UnaryDemo {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;

		int result = +x; // we are assigning positive x value here. //result =
							// 10

		System.out.println("result has -x = " + result); // o/p is 10

		result = -y; // result = -20 (-20 replaced with 10)

		System.out.println("-y = " + result); // o/p is -20
		System.out.println("-y: "+-y);

		result = ++x; //both 11
		System.out.println("++x = " + result+" x is: "+x);

		result = x++;
		System.out.println("x++ is: " + result);
		System.out.println("2nd x++ is: "+x);
		result = --y;

		System.out.println("x++ is: " + result);
		System.out.println("++y = " + result);

		boolean ok = false;

		System.out.println(ok);

		System.out.println(!ok);

	}
}
