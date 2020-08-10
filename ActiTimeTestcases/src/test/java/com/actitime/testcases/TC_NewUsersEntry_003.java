package com.actitime.testcases;

import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.FWUtiles;
import com.actitime.pages.CreateNewUsers;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LoginPage;

public class TC_NewUsersEntry_003 extends BaseClass{
	@Test
	public void newUser() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.login();
		EnterTimeTrackPage a=new EnterTimeTrackPage(driver);
		Thread.sleep(1000);
		FWUtiles.verifyPage(driver, enterTimeTrackTitle );
		a.clickOnUsersTab();
		FWUtiles.captureScreenShot(driver,"user list");
		Thread.sleep(1000);
		CreateNewUsers c=new CreateNewUsers(driver);
		FWUtiles.verifyPage(driver, userListTitle );
		c.setcreateNewUser();
		FWUtiles.captureScreenShot(driver,"create new user");
		Thread.sleep(1000);
		c.createUser();
		FWUtiles.captureScreenShot(driver,"create user");
	}
}
