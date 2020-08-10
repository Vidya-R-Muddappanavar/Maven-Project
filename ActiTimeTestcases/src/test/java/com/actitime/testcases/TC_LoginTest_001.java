package com.actitime.testcases;

import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.FWUtiles;
import com.actitime.pages.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	@Test
	public void loginTest() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		FWUtiles.captureScreenShot(driver,"BrowserStarted");
		lp.login();
		Thread.sleep(2000);
		FWUtiles.verifyPage(driver, enterTimeTrackTitle);
		Thread.sleep(2000);
		FWUtiles.captureScreenShot(driver,"Login page");
	}
}
