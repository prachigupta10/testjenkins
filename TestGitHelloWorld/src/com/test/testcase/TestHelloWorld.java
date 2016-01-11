package com.test.testcase;

import org.junit.Assert;


import org.junit.Test;

import com.test.git.Calculator;




public class TestHelloWorld {

	@Test
	public void test() {
		int actual = Calculator.add(5, 9);
		Assert.assertEquals(14, actual);
	}

}
