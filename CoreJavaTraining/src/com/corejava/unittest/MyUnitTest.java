package com.corejava.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyUnitTest {
	MyUnit myUnit = new MyUnit();

	@Test
	public void testConcatenate() {
		String result = myUnit.concatenate("Aleem", "Ashraf");
		assertEquals("Aleem Ashraf", result);
	}

	@Test
	public void testSum(){
		assertEquals(4, myUnit.sum(1, 3));//verify expected and actual matches or not
	}
}
