package com.actitime.testcases;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.FWUtiles;
import com.actitime.pages.CreateNewUsers;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LoginPage;

public class TC_DeleteUser_004 extends BaseClass{
	@Test
	public void deleteUser() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.login();
		Thread.sleep(1000);
		EnterTimeTrackPage a=new EnterTimeTrackPage(driver);
		a.clickOnUsersTab();
		Thread.sleep(1000);
		CreateNewUsers c=new CreateNewUsers(driver);
		FWUtiles.verifyPage(driver, userListTitle );
		c.setenable();
		Thread.sleep(1000);
		c.setOldUser();
		Thread.sleep(1000);
		c.setDeleteUser();
		Alert alert=driver.switchTo().alert();
		String msg=alert.getText();
		System.out.println(msg);
		alert.accept();
	}
}
