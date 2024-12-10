package com.orangeHrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Testbase;


public class oranghrmloginpagefactory extends Testbase {
	
	
	@FindBy(name="username")
	WebElement uid;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbtn;
	
	@FindBy(xpath="//a[@class='oxd-main-menu-item active']//child::span[text()='Dashboard']")
	WebElement profilescreen;
	
	public oranghrmloginpagefactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public String gettitle()
	{
		return driver.getTitle();
	}
	
	
	public boolean verifyelements()
	{   
		return loginbtn.isDisplayed();
		
	}
	public HomepageHrm typeusername() throws InterruptedException
	{
	      uid.sendKeys("Admin");
	      pwd.sendKeys("admin123");
	      loginbtn.click();
	      Thread.sleep(5000);
	      System.out.println(profilescreen.isDisplayed());
	      return new HomepageHrm();
	}

}
