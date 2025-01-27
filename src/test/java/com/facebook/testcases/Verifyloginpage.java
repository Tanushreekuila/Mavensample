package com.facebook.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.facebook.pages.Loginpage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifyloginpage {
	
	WebDriver driver=new ChromeDriver();
	Loginpage lg =new Loginpage(driver);
	String actual=null;
	@BeforeTest
	public void setup()
	{
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	}
	
	@Test
	public void getresults() throws FileNotFoundException, IOException
	{
		lg.usercredentials("tanuuserxyz", "1234");
        lg.clickingbtn();
	}
	
	@Test
	public void verymsg()
	{
       boolean act=lg.verifymessage();
      Assert.assertTrue(act, "element not present");
      System.out.println(act);
      
      //OR
		/*if(lg.verifymessage())
		{
			System.out.println("element is presnet");
		}
		else
		{
			System.out.println("not present");
		}*/
      
	}
	
	
	
	@AfterTest
	public void teardown()
	{
		//driver.close();
	}
}
