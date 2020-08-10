package com.actitime.testcases;

import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.FWUtiles;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.LicensesPage;
import com.actitime.pages.LoginPage;

public class TC_VerifyingLicencePage_002 extends BaseClass{
	@Test
	public void productionEditionANDIssuedate() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.login();
		EnterTimeTrackPage a=new EnterTimeTrackPage(driver);
		Thread.sleep(3000);
		FWUtiles.verifyPage(driver, enterTimeTrackTitle );
		a.clickOnSettingsTab();
		FWUtiles.captureScreenShot(driver,"settings page");
		a.clickOnLicensesTab();
		FWUtiles.captureScreenShot(driver,"licence page");
		Thread.sleep(1000);
		LicensesPage lcp=new LicensesPage(driver);
		FWUtiles.verifyPage(driver, licenceTitle);
		lcp.verifyProductEdition();
		Thread.sleep(1000);
		lcp.verifyIssueDate();
	}
}
