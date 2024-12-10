package com.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testbase {

	public static WebDriver driver;
	public static Properties pr1;
	
	private static Properties loadproperties() throws IOException {
		   Properties prop=new Properties();
		   FileInputStream f1=new FileInputStream("C:\\Users\\kuilata\\eclipse-workspace\\Mavenproject1\\src\\test\\java\\com\\baseclass\\config.properties");
		   prop.load(f1);
		   return prop;
		   }
	public static void getbrowsers() throws IOException
	
	{  
		pr1=loadproperties();
		String browsername=pr1.getProperty("browser");
		
		if(browsername.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\kuilata\\Downloads\\chromedriver-win64 (11)\\chromedriver-win64\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox"))	
		{
			{
				System.setProperty("webdriver.gecko.driver","./driver.geckodriver.exe");
				driver=new FirefoxDriver();
			}
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(pr1.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	}
	

	
	
}
