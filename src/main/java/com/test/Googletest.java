package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Googletest {
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
	//	System.setProperty("webdriver.chrome.driver", "C:/Users/TiaaUser/Downloads/chromedriver-win64");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	@Test(priority = 1,groups = "Title")
	public void verifytitle()
	{
		String title=driver.getTitle();
		System.out.println("title is"+title);
		
	}
	@Test(priority = 3,groups = "image" )
	public void verifylogo()
	{
		
	boolean logo=	driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
	System.out.println("logo is available"+logo);
		
	}
	@Test(priority = 2,groups = "smaoke")
	public void verifysignbutton()
	{
		boolean logo2=driver.findElement(By.xpath("//span[contains (text(),'Sign in')]")).isDisplayed();
		System.out.println("logo2 available" +logo2);
		
	}
	@Test(groups = "sanity")
	public void t1()
	{
		System.out.println("test1");
	}
	@Test
	public void tt2()
	{
		System.out.println("test2");
	}
	@Test
	public void te3()
	{
		System.out.println("test3");
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
