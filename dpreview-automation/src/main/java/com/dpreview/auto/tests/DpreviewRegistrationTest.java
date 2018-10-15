package com.dpreview.auto.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dpreview.auto.infra.config.MainConfig;
import com.dpreview.auto.infra.pages.DpreviewHomePage;
import com.dpreview.auto.infra.pages.DpreviewRegistrationPage;
import com.dpreview.auto.infra.pages.DpreviewSearchResultsPage;

import com.google.common.base.Throwables;

public class DpreviewRegistrationTest extends BaseTest {

	@Test(description = "Validation of the registration page", priority = 0)
	public void registrationPageTest() {
		
		browseToUrl(MainConfig.baseUrl);
		
		WebElement registrationLink = driver.findElement(By.cssSelector(".userTools > a:nth-child(2)"));
		
		Actions action = new Actions(driver);
		action.moveToElement(registrationLink).build().perform();
		
		driver.findElement(By.cssSelector(".userTools > a:nth-child(2)")).click();

	}

	@Test (description = "Testing the registration process" , priority = 1)
	public void registrationProcessTest() throws Exception {    // (String minChars) 
		
		String yourName = "";
		String emailAddress = "";
		String yourPassword = "";
		String passwordCheck = "";
		
		DpreviewRegistrationPage dpreviewRegistrationPage = new DpreviewRegistrationPage(driver);
		dpreviewRegistrationPage.writeYourNameInput(yourName);
		Thread.sleep(2000);
		
		dpreviewRegistrationPage.writeYourEmailAddress(emailAddress);
		Thread.sleep(2000);
		
		dpreviewRegistrationPage.writeYourPassword(yourPassword);
		// dpreviewRegistrationPage.minimumPasswordChars(minChars);
		Thread.sleep(2000);
		
		dpreviewRegistrationPage.reEnterYourPassword(passwordCheck);
		// dpreviewRegistrationPage.yourPassword.equals(passwordCheck);
		Thread.sleep(2000);
		
		dpreviewRegistrationPage.createYourDpreviewAccount().clickGoButton();

	}
	
}
