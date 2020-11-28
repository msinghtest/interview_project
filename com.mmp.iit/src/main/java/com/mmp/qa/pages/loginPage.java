package com.mmp.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mmp.qa.Base.Utils;
import com.mmp.qa.Base.driverScript;

public class loginPage extends driverScript {
	
	//****************************** Objects Identification ***************************************************//	
	
		@FindBy(id="username") WebElement usernameTb;
		@FindBy(name="pwd") WebElement passwordTb;
		@FindBy(id="loginButton") WebElement loginBtn;
		@FindBy(xpath="//div[@class='atLogoImg']") WebElement actiLogo;
		
	//****************************** Page/Object Initialization ********************************************* //
		
		public loginPage()
		{
			PageFactory.initElements(driver, this);
		}
		
	//********************************* Actions / Methods *************************************************** //
		
		public String verifyTitle()
		{
			return driver.getTitle();
		}
		
		public boolean verifyLogoisDisplayed()
		{
 			Utils.highLightElement(actiLogo);
			return actiLogo.isDisplayed();
		}
		
		public void validateLoginFunction(String username, String password)
		{
			Utils.highLightElement(usernameTb);
			usernameTb.sendKeys(username);
			Utils.highLightElement(passwordTb);
			passwordTb.sendKeys(password);
			Utils.highLightElement(loginBtn);
			loginBtn.click();
		}
	
}
