package com.dpreview.auto.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
// import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.dpreview.auto.infra.config.MainConfig;
import com.dpreview.auto.infra.pages.DpreviewHomePage;
import com.dpreview.auto.infra.pages.DpreviewRegistrationPage;
import com.dpreview.auto.infra.reports.Reports;


/* ****************************************************************************************************************************************
 **************** This test is intended to check the Registration process to the DPReview site ********************************************
 * **************************************************************************************************************************************** 
 */

public class T1_DpreviewRegistrationTest extends BaseTest {

	@Test(description = "Validation of the registration page", priority = 0)
	public void registrationPageTest() {

		browseToUrl(MainConfig.baseUrl);

		DpreviewHomePage dpreviewHomePage = new DpreviewHomePage(driver);
		DpreviewRegistrationPage registrationPage = dpreviewHomePage.registrationLink();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlContains("https://login.dpreview.com")); 
		Assert.assertTrue(dpreviewHomePage.registrationLink().equals(registrationPage));
	}

	@Test (description = "Testing the registration process" , priority = 1)
	public void registrationProcessTest() throws Exception { 

		String yourName = "RetroCamFan";
		String emailAddress = "";     // focusguy@walla.com

		DpreviewRegistrationPage dpreviewRegistrationPage = new DpreviewRegistrationPage(driver);
		dpreviewRegistrationPage.writeYourNameInput(yourName);
		
		dpreviewRegistrationPage.writeYourEmailAddress(emailAddress);
	}

	@Test(description = "Minimum password characters test", priority = 2)
	public void passwordTest() {

		String yourPassword = "HelloCameraWorld!";
		String passwordCheck = "";  // Re type the password in order to complete the registration process.

		DpreviewRegistrationPage dpreviewRegistrationPage = new DpreviewRegistrationPage(driver);

		if(yourPassword.length() >= 6) {

			dpreviewRegistrationPage.writeYourPassword(yourPassword);
		}
		else {

			Reports.report("Minimum password length is 6 characters long");
		}

		dpreviewRegistrationPage.reEnterYourPassword(passwordCheck);

		if(yourPassword == passwordCheck) {

			dpreviewRegistrationPage.createYourDpreviewAccount().clickGoButton();
		}
		else {

			Reports.report(" ---------------- Please Re type your password ------------------ ");
		}
	}
}
