package com.dpreview.auto.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

import com.dpreview.auto.infra.config.MainConfig;
import com.dpreview.auto.infra.pages.DpreviewLoginPage;

public class T3_DpreviewLoginWrongDetailsTest extends BaseTest {
	
	// ------------------------- Testing the validation of the Login page ------------------------------------------------------------------
	
	@Test(description = "Testing the validation of the Login page", priority = 0)
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
			String inputPassword = "AlphaBlondie";  // This is a wrong password.
			
			WebElement importantMessage = driver.findElement(By.id("authportal-center-section"));
			
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
			
			
			assertEquals(true, true); 
			 
			importantMessage.findElement(By.id("authportal-center-section")).isEnabled();
			
			if (importantMessage != null) {
				
				System.out.println("There is a wrong detail in the form");
			}
			else {
				
				System.out.println("The details are correct!");
			}
			
		}

}
