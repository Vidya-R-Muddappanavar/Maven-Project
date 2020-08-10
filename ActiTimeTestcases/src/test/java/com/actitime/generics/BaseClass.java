package com.actitime.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass implements IAutoCanstant{
	static
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	public static WebDriver driver;
	
	@BeforeClass
	@Parameters("browser")
	public void openBrowser(String browser)
	{
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(ETO, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void openApplication()
	{
		driver.get(URL);
	}
	
	@AfterMethod
	public void closeApplication()
	{
		driver.close();
	}
}
