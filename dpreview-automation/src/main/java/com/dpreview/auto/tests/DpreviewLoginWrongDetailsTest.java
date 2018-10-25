package com.dpreview.auto.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

import com.dpreview.auto.infra.config.MainConfig;
import com.dpreview.auto.infra.pages.DpreviewLoginPage;

public class DpreviewLoginWrongDetailsTest extends BaseTest {
	
	// ------------------------- Testing the validation of the Login page ------------------------------------------------------------------
	
	@Test(description = "Testing the validation of the Login page")
	public void loginPageTest() {
		
		browseToUrl(MainConfig.baseUrl);
		
		WebElement loginLink = driver.findElement(By.cssSelector(".userTools > a:nth-child(1)"));
		
		Actions action = new Actions(driver);
		action.moveToElement(loginLink).build().perform();
		
		driver.findElement(By.cssSelector(".userTools > a:nth-child(1)")).click();
		
	}
	
	// ------------------------- Testing the login process with wrong details --------------------------------------------------------------
	
		@Test(description = "Typing wrong login details", priority = 1)
		public void loginDetails1() throws Exception {

			String inputEmail = "eagle15@yahoo.com";
			String inputPassword = "AlphaBlondie";
			
			DpreviewLoginPage dpreviewLoginPage = new DpreviewLoginPage(driver);
			dpreviewLoginPage.writeToEmailInput(inputEmail);
			
			Thread.sleep(5000);
			
			dpreviewLoginPage.writeToPasswordInput(inputPassword);
			
			Thread.sleep(5000);
			
			dpreviewLoginPage.keepMeSignedInDetails();
			
			Thread.sleep(10000);
			
			dpreviewLoginPage.closingSignedInDetailsPopup();
			
			dpreviewLoginPage.keepMeSignedInCheckbox();
			
			Thread.sleep(5000);
			
			dpreviewLoginPage.clickSigninButton(); 
			
			if (dpreviewLoginPage != null) {
				
				System.out.println("The login details are correct.");
			}
			else {
				
				System.out.println("The login details are incorrect.");
			}
		}

}
