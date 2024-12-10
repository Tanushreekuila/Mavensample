package com.orangeHrm.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orangeHrm.pages.loginpage1;

public class verifylogintestcase1 {
	WebDriver driver=new ChromeDriver();
	loginpage1 log=new loginpage1(driver);
	
    
	@Test
	public void openHomepage() throws IOException, InterruptedException
	{
		
		log.verifyuserlogin();
	}
 
 
	
	
}
