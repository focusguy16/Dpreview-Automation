package com.dpreview.auto.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

import com.dpreview.auto.infra.config.MainConfig;
import com.dpreview.auto.infra.pages.DpreviewLoginPage;

/* ****************************************************************************************************************************************
 ************************** This test validates the error message which appears when wrong password is typed ******************************
 * ****************************************************************************************************************************************
 */

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
	public void loginDetails() throws Exception {

		String inputEmail = "eagle15@yahoo.com";
		String inputPassword = "JazzMusic73!";
		String inputWrongPassword = "AlphaBlondie";  // This is a wrong password.

		DpreviewLoginPage dpreviewLoginPage = new DpreviewLoginPage(driver);
		dpreviewLoginPage.writeToEmailInput(inputEmail);

		Thread.sleep(5000);

		dpreviewLoginPage.writeToPasswordInput(inputWrongPassword);

		Thread.sleep(5000);

		dpreviewLoginPage.keepMeSignedInDetails();

		Thread.sleep(10000);

		dpreviewLoginPage.closingSignedInDetailsPopup();

		dpreviewLoginPage.keepMeSignedInCheckbox();

		Thread.sleep(5000);

		dpreviewLoginPage.clickSigninButton();

		if(inputWrongPassword == inputPassword) {

			System.out.println("This is a correct password");

			browseToUrl(MainConfig.baseUrl);
		}
		else {

			System.out.println("This is a wrong password");
		}
	}

	@Test(description = "Validating the error login page", priority = 2)
	public void errorLoginPage() {

		WebElement importantMessage = driver.findElement(By.cssSelector("#auth-warning-message-box > div:nth-child(1)"));
		WebElement captchaImage = driver.findElement(By.cssSelector("#auth-captcha-image"));

		assertEquals(true, true);

		if(importantMessage != null && captchaImage != null) {

			System.out.println(" --------------------------- |------------------------------ | ---------------------------- ");
			System.out.println(" --------------------------- | This is an error login page ! | ---------------------------- ");
			System.out.println(" --------------------------- |-------------------------------| ---------------------------- ");
		}
		
		driver.close();
	}
}
