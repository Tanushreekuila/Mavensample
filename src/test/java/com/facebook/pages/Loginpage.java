package com.facebook.pages;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	
	WebDriver driver;
	private Properties pr;
	
	By username=By.id("email");
	By password=By.id("pass");
	//By loginbtn=By.xpath("//button[@name='login']");
	
	 public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	 
	 private Properties loadproperties() throws FileNotFoundException, IOException
	 {
	 Properties prop =new Properties();
	 FileReader reader=null;
	 prop.load(new FileReader("C:\\Users\\kuilata\\eclipse-workspace\\Mavenproject1\\drivers\\chromedriver.exe"));
	 //driver.get(prop.getProperty("loginbutton"));
	return prop;
}
	 
 public void usercredentials(String uid,String pwd)
{
	driver.findElement(username).sendKeys(uid);
	driver.findElement(password).sendKeys(pwd);
	
}

 public void clickingbtn() throws FileNotFoundException, IOException
 {   pr=loadproperties();
	 driver.findElement(By.xpath(pr.getProperty("loginbutton"))).click();
 }
 
 public boolean verifymessage()
 {

		WebElement message=(driver.findElement(By.xpath("//div[@class='_9ay7']")));
		return message.isDisplayed();
	
	
 }
	
}
