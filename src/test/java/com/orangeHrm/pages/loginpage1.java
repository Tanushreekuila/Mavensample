package com.orangeHrm.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage1 
{
    WebDriver driver;
    private Properties pr1;
   By loginbtn=By.xpath("//button[@type='submit']");
   
   public loginpage1(WebDriver driver)
   {
	   this.driver=driver;
   }
   
   //public static void main(String[] args) throws IOException {
   private Properties loadproperties() throws IOException {
   Properties prop=new Properties();
   FileInputStream f1=new FileInputStream("C:\\\\Users\\\\kuilata\\\\eclipse-workspace\\\\Mavenproject1\\\\src\\\\test\\\\java\\\\com\\\\orangeHrm\\\\pages\\\\config.properties");
   prop.load(f1);
   return prop;
   }
   
   public void verifyuserlogin() throws IOException, InterruptedException
   {  
	   pr1=loadproperties();
	   driver.get(pr1.getProperty("url"));
	   driver.manage().window().maximize();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath(pr1.getProperty("uid"))).sendKeys("Admin");
	   driver.findElement(By.xpath(pr1.getProperty("pwd"))).sendKeys("admin123");
	   driver.findElement(loginbtn).click();
   }
}
