package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogletitileTest {
	
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
		
		Assert.assertEquals(title, "Google","title not match");
		
	}
	
	@Test
	public void verifylogo()
	{
		
	boolean logo=	driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
	System.out.println("logo is available"+logo);
	
	Assert.assertTrue(logo);
	Assert.assertEquals(logo, true);
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
