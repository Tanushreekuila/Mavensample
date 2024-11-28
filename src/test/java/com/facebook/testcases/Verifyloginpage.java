package com.facebook.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.facebook.pages.Loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifyloginpage {
	
	WebDriver driver=new ChromeDriver();
	Loginpage lg =new Loginpage(driver);
	@BeforeTest
	public void setup()
	{
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	}
	
	@Test
	public void getresults()
	{
		lg.typeusername("abcd");
		lg.typeupassword("1234");
	}
	
	@AfterTest
	public void teardown()
	{
		//driver.close();
	}
}
