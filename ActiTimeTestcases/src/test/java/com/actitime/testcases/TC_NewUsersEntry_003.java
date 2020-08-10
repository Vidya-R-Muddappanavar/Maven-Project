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
		Thread.sleep(1000);
		CreateNewUsers c=new CreateNewUsers(driver);
		FWUtiles.verifyPage(driver, userListTitle );
		c.setcreateNewUser();
		Thread.sleep(1000);
		c.createUser();
	}
}
