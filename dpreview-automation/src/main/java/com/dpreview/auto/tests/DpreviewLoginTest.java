package com.dpreview.auto.tests;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org.openqa.selenium.By;

import com.dpreview.auto.infra.config.MainConfig;
import com.dpreview.auto.infra.pages.DpreviewHomePage;
import com.dpreview.auto.infra.pages.DpreviewSignInPage;
import com.dpreview.auto.infra.utils.AssertUtils;
import com.dpreview.auto.tests.enums.DpreviewLoginResult;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.WebDriverEventListener;
// import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import com.dpreview.auto.infra.pages.DpreviewLoginPage;
// import com.dpreview.auto.infra.reports.Reports;


public class DpreviewLoginTest extends BaseTest {
	
	@Test(dataProvider = "csvParamsProvider")
	public void loginTest(String loginEmail, String loginPassword, DpreviewLoginResult expectedLoginResult) {
		
		browseToUrl(MainConfig.baseUrl);
		
		DpreviewHomePage dpreviewHomePage = new DpreviewHomePage(driver);
		DpreviewSignInPage dpreviewSignInPage = dpreviewHomePage.clickSigninButton();
		
	}

	@Test(description = "Validation of the Login page", priority = 0)
	public void loginPageTest() {

		browseToUrl(MainConfig.baseUrl);

		WebElement loginLink = driver.findElement(By.cssSelector(".userTools > a:nth-child(1)"));
		
		Actions action = new Actions(driver);
		action.moveToElement(loginLink).build().perform();
		
		driver.findElement(By.cssSelector(".userTools > a:nth-child(1)")).click();
	}

	@Test(description = "Entering the login details", priority = 1)
	public void loginDetails1() throws Exception {

		String inputEmail = "eagle15e2000@yahoo.com";
		String inputPassword = "JazzMusic73!";
		
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

	}

}
