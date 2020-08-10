package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
	@FindBy(xpath="//div[text()='Time-Track']/parent::a[@class='content tt']")
	private WebElement timetrackTab;
	
	@FindBy(xpath="//div[text()='Tasks']/parent::a[@class='content tasks']")
	private WebElement tasksTab;
	
	@FindBy(xpath="//div[text()='Reports']/parent::a[@class='content reports']")
	private WebElement reportsTab;
	
	@FindBy(xpath="//div[text()='Users']/parent::a[@class='content users']")
	private WebElement usersTab;
	
	@FindBy(xpath="//div[contains(text(),'Settings')]/parent::a[@class='content administration']")
	private WebElement settingsTab;
	
	@FindBy(xpath="//a[contains(text(),'Licenses')]/../../../td[8]")
	private WebElement licensesTab;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutTab;
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnTimeTrackTab()
	{
		timetrackTab.click();
	}
	public void clickOnTasksTab()
	{
		tasksTab.click();
	}
	public void clickOnReportsTab()
	{
		reportsTab.click();
	}
	public void clickOnUsersTab()
	{
		usersTab.click();
	}
	public void clickOnSettingsTab()
	{
		settingsTab.click();
	}
	public void clickOnLicensesTab()
	{
		licensesTab.click();
	}
	public void clickOnLogoutTab()
	{
		logoutTab.click();
	}
}
