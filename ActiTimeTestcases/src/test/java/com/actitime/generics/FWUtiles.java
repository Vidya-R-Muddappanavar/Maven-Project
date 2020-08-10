package com.actitime.generics;

import java.io.File;

import org.apache.maven.surefire.shade.org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	public static void captureScreenShot(WebDriver driver, String screenShortName)
	{
		try
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des=new File(PHOTO_PATH+screenShortName+".png");
			FileUtils.copyFile(src, des);
			System.out.println("Screenshot Taken");
		}
		catch(Exception e)
		{
			System.out.println("Exception while taking screenshot "+e.getMessage());
			e.printStackTrace();
		}
	}
}
