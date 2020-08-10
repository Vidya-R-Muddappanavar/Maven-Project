package com.actitime.generics;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class FWUtiles extends BaseClass{
	public static void verifyPage(WebDriver driver,String expectedTitle)
	{
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle))
		{
		Reporter.log("Expected title is desplaied---->"+expectedTitle,true);
		System.out.println("Test case is passed");
		}
		else
		{
			Reporter.log("Expected title is not desplaied---->"+actualTitle,true);
			System.out.println("Test case is failed");
		}
	}
}
