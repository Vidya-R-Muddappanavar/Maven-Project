package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(name="username")
	private WebElement unTB;
	@FindBy(name="pwd")
	private WebElement pwTB;
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepLoggedInCheckBoxTB;
	@FindBy(id="loginButton")
	private WebElement loginBTN;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void login()
	{
		unTB.sendKeys("admin");
		pwTB.sendKeys("manager");
		keepLoggedInCheckBoxTB.click();
		loginBTN.click();
	}
	
	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
	public void setPassWord(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void setkeepLoggedInCheckBoxTB()
	{
		keepLoggedInCheckBoxTB.click();
	}
	public void setloginButton()
	{
		loginBTN.click();
	}
}
