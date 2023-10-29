package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGbasic {
	
	
	//before suit
	//before test
	//before class
	//before method
	//@test
	//after method
	//after class
	//after test
	//after suit

	@BeforeClass
	public void beforeclassmethod()
	{
		System.out.println("in before class method");
	}
	@AfterClass
	public void afterclassmethod()
	{
		System.out.println("in after class method");
	}
	@BeforeSuite
	public void beforesuitmethod()
	{
		System.out.println("in before suit method");
	}
	@AfterSuite
	public void aftersuitmethod()
	{
		System.out.println("in after suit method");
	}
	@Test
	public void testmethod1()
	{
		System.out.println("in test-1 method");
	}
	@Test
	public void testmethod2()
	{
		System.out.println("in test-2 method");
	}
	@Test
	public void testmethod3()
	{
		System.out.println("in test-3 method");
	}
	
	
	
	@BeforeTest
	public void beforetestmethod()
	{
		System.out.println("in before test method");
	}
	@AfterTest
	public void aftertestmethod()
	{
		System.out.println("in after test method");
	}
	
	@BeforeMethod
	public void beforemehod()
	{
		System.out.println("in before method");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("in after test method");
	}
}
