package com.orangeHrm.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.baseclass.Testbase;
import com.orangeHrm.pages.HomepageHrm;
import com.orangeHrm.pages.oranghrmloginpagefactory;

public class verifylogincredentials extends Testbase {
	
	
	//Webdriver driver= new Chromedriver();

	 
	oranghrmloginpagefactory lg;
	HomepageHrm homepage;
	
	public verifylogincredentials(){
		super();
	}
	
	
	


	@BeforeMethod()
	public void  setup() throws IOException
	{  
		
		getbrowsers();
		lg= new oranghrmloginpagefactory(driver);
	}
	
	 @Test(priority=1)
	 public void verifytitle()
	 {
		String title= lg.gettitle();
		Assert.assertEquals(title,"OrangeHRM");
		System.out.println(title);
	 }
	 
	 @Test(priority=2)
	 public void Elementvisiblity()
	 {  
		boolean elementtext=lg.verifyelements();
		Assert.assertTrue(elementtext);
		System.out.println(elementtext);
		
		
	 }
	
	 
	@Test(priority=3)
	 public void verifylogin() throws InterruptedException
	 {
		homepage= lg.typeusername();
		
	 }
	
	
	
	
	
	@AfterMethod()
	public void teardown()
	{
		driver.quit();
	}

}
