package com.dpreview.auto.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.dpreview.auto.infra.config.MainConfig;
import com.dpreview.auto.infra.pages.DpreviewLoginPage;
import com.dpreview.auto.infra.pages.DpreviewSignInPage;
import com.dpreview.auto.infra.pages.DpreviewSmartphoneReviewsPage;
import com.dpreview.auto.infra.pages.DpreviewHomePage;

public class T5_DpreviewSmartphonesReviewTest extends BaseTest {
	
	// ------------------------- Testing the validation of the Login link ------------------------------------------------------------------
	
		@Test(description = "Testing the validation of the Login link", priority = 0)
		public void loginLinkTest() {

			browseToUrl(MainConfig.baseUrl);

			WebElement loginLink = driver.findElement(By.cssSelector(".userTools > a:nth-child(1)"));
			
			Actions action = new Actions(driver);
			action.moveToElement(loginLink).build().perform();
			
			driver.findElement(By.cssSelector(".userTools > a:nth-child(1)")).click();
		}
		
		// --------------------- Testing the valid login process with valid details --------------------------------------------------------
		
		@Test(description = "Typing the login details", priority = 1)
		public void loginDetails() throws Exception {

			String inputEmail = "eagle15e2000@yahoo.com";
			String inputPassword = "JazzMusic73!";
			
			DpreviewLoginPage dpreviewLoginPage = new DpreviewLoginPage(driver);
			dpreviewLoginPage.writeToEmailInput(inputEmail);
			
			Thread.sleep(1000);
			
			dpreviewLoginPage.writeToPasswordInput(inputPassword);
			
			Thread.sleep(1000);
			
			dpreviewLoginPage.keepMeSignedInCheckbox();
			
			Thread.sleep(1000);
			
			dpreviewLoginPage.clickSigninButton(); 
		}
		
		// --------------------- Testing the Reviews Menu appearance by hovering the Reviews element ---------------------------------------
		
		@Test(description = "Hovering over the Reviews element", priority = 2)
		public void hoveringReviewsElement() {
			
			DpreviewHomePage dpreviewHomePage = new DpreviewHomePage(driver);
			dpreviewHomePage.hoverOverReviewsLink();
			
			DpreviewSmartphoneReviewsPage dpreviewSmartphoneReviewsPage = dpreviewHomePage.hoverOverReviewsLink();
		}
		
		// --------------------- Testing the Smart phone reviews link from the Reviews menu ------------------------------------------------
		
		@Test(description = "Selecting the Smartphone reviews link from the Reviews menu", priority = 3)
		public void selectingSmartphoneReviews() {
			
			WebElement smartphoneReviews = driver.findElement(By.xpath("//*[@class='dropdownMenuContent']//*[text()='Smartphone reviews']"));
			
			Actions action = new Actions(driver);
			action.moveToElement(smartphoneReviews).build().perform();
			
			driver.findElement(By.xpath("//*[@class='dropdownMenuContent']//*[text()='Smartphone reviews']")).isSelected();
			driver.findElement(By.xpath("//*[@class='dropdownMenuContent']//*[text()='Smartphone reviews']")).click();
			
		}

}
