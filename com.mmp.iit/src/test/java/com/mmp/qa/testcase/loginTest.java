package com.mmp.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

public class loginTest extends baseTests  {
	//modified by mona
	@Test (enabled = false)
	public void testVerifyTitle()
	{
		logger= extent.createTest("Validate Title");
		logger.log(Status.INFO, "Browser Launched");
		logger.log(Status.INFO, "Navigated to the URL");
		String title = lp.verifyTitle();
		Assert.assertEquals("actiTIME - Login", title);
		logger.log(Status.FAIL, "Verified Title Successfully");
		logger.log(Status.INFO, "Closed the Browser");
	}
	
	@Test (enabled = false)
	public void testVerifyLogoDisplayed()
	{
		logger=extent.createTest("Validate Logo Displayed");
		boolean res = lp.verifyLogoisDisplayed();
		System.out.println(res);
		logger.log(Status.FAIL, "Logo is Not Displayed");
	}
	
	@Test (enabled = true)
	public void testValidateLoginFunction()
	{
		logger=extent.createTest("Validate Login");
		lp.validateLoginFunction("admin", "manager");
		logger.log(Status.FAIL, "Login Functionality Passed");
	}

}
