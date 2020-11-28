package com.mmp.qa.testcase;

import com.mmp.qa.Base.driverScript;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.mmp.qa.pages.loginPage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class baseTests extends driverScript{

//public baseTests() {
//	super();
//}

ExtentHtmlReporter htmlReport;
public ExtentReports extent;
public ExtentTest logger;
loginPage lp;

 
@BeforeClass
public void reportSetup()
{
 	htmlReport = new ExtentHtmlReporter("./acti.reports/AutomationReport.html");
	extent = new ExtentReports();
	extent.attachReporter(htmlReport);
}

@BeforeMethod
public void preTest()
{
	initBrowser();
	navigatetoApplication();
	lp = new loginPage();
	

}

@AfterMethod
public void postTest()
{
//	driver.close();
//	extent.flush();
}


}