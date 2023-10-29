package com.test;

import org.testng.annotations.Test;

public class TestNGfeature {
	
	@Test
	public void logintest()
	{
		
	System.out.println("login test");
	int i=9/0;
	System.out.println(i);
	}
	@Test(dependsOnMethods = "logintest")
	public void hometest()
	{
		
	System.out.println("home test");
	}
	

}
