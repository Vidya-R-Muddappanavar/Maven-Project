package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewUsers {
	@FindBy(xpath="//input[@value='Create New User']")
	private WebElement createNewUser;
	@FindBy(name="username")
	private WebElement username;
	@FindBy(name="passwordText")
	private WebElement password;
	@FindBy(name="passwordTextRetype")
	private WebElement passwordRetry;
	@FindBy(name="firstName")
	private WebElement firstName;
	@FindBy(name="lastName")
	private WebElement lastName;
	@FindBy(xpath="//input[@value='   Create User   ']/../input[1]")
	private WebElement createUser;
	
	@FindBy(xpath="//td[text()='enabled']/../td[2]")
	private WebElement enable;
	@FindBy(xpath="//a[text()='Muddappanavar, Vidya (admin1)']")
	private WebElement olduser;
	@FindBy(xpath="//input[@value='Delete This User']")
	private WebElement deleteUser;
	
	public CreateNewUsers(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void createUser()
	{
		username.sendKeys("admin1");
		password.sendKeys("manager1");
		passwordRetry.sendKeys("manager1");
		firstName.sendKeys("Vidya");
		lastName.sendKeys("Muddappanavar");
		createUser.click();
	}
	public void setcreateNewUser()
	{
		createNewUser.click();
	}
	public void setUserName(String un)
	{
		username.sendKeys(un);
	}
	public void setPassWord(String pw)
	{
		password.sendKeys(pw);
	}
	public void setPassWordRetry(String pw)
	{
		passwordRetry.sendKeys(pw);
	}
	public void setFirstName(String fn)
	{
		firstName.sendKeys(fn);
	}
	public void setlastName(String ln)
	{
		lastName.sendKeys(ln);
	}
	public void setenable()
	{
		enable.click();
	}
	public void setOldUser()
	{
		olduser.click();
	}
	public void setDeleteUser()
	{
		deleteUser.click();
	}
}
