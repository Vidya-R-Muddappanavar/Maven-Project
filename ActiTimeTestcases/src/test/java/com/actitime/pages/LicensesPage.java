package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LicensesPage {
	@FindBy(xpath="//b[.='actiTIME v3.1']")
	private WebElement productEdition;
	@FindBy(xpath=("//td[contains(text(),'Aug 04, 2011')]"))
	private WebElement issueDate;
	
	public LicensesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyIssueDate()
	{
		String actualIssueDate=issueDate.getText();
		String expectedIssueDate="Aug 04, 2011";
		if(actualIssueDate.equals(expectedIssueDate))
		{
			Reporter.log("Expected issueDate is desplaied---->"+expectedIssueDate,true);
			System.out.println("Test case is passed");
		}
		else
		{
			Reporter.log("Expected issueDate is not desplaied---->"+actualIssueDate,true);
			System.out.println("Test case is not passed");
		}
	}
	
	public void verifyProductEdition()
	{
		String actualProductEdition=productEdition.getText();
		String expectedProductEdition="actiTIME v3.1";
		if(actualProductEdition.equals(expectedProductEdition))
		{
			Reporter.log("Expected productEdition is desplaied---->"+expectedProductEdition,true);
			System.out.println("Test case is passed");
		}
		else
		{
			Reporter.log("Expected productEdition is not desplaied---->"+actualProductEdition,true);
			System.out.println("Test case is not passed");
		}
	}
}
