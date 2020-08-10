package com.actitime.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtiles extends BaseClass{
	public static void waitForTitleContains(WebDriver driver,String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,ETO);
		wait.until(ExpectedConditions.titleContains(title));
	}
	public static void waitForElrmrntPresent(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,ETO);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
