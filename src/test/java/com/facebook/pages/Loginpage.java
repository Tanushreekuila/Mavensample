package com.facebook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	WebDriver driver;
	
	By username=By.id("email");
	By password=By.id("pass");
	
	 public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
public void typeusername(String uid)
{
	driver.findElement(username).sendKeys(uid);
}
	
public void typeupassword(String pwd)
{
	driver.findElement(password).sendKeys(pwd);
}
	
}
