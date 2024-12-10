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
	
	/*@Test
	public boolean verymsg()
	{
       boolean actual=lg.verifymessage();
        assert.assertTrue(actual,"");
      
	}*/
	
	
	
	@AfterTest
	public void teardown()
	{
		//driver.close();
	}
}
