package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {
	
	
	@Test(timeOut = 2000)
	public void infinitlooptest()
	{
		int i=1;
		while(i==1)
			System.out.println(i);
	}
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void time()
	{
		int i=1/0;
		
			System.out.println(i);
	}
	
	@Test(expectedExceptions = NumberFormatException.class)
	public void time1()
	{
		String i="1A";
		
			System.out.println(i);
	}

	
	
}
