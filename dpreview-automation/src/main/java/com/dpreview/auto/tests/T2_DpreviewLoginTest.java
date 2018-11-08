package com.dpreview.auto.tests;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.dpreview.auto.infra.config.MainConfig;
import com.dpreview.auto.infra.pages.DpreviewHomePage;
import com.dpreview.auto.infra.pages.DpreviewSignInPage;
import com.dpreview.auto.infra.reports.Reports;
import com.dpreview.auto.infra.utils.AssertUtils;
import com.dpreview.auto.infra.web.By2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.WebDriverEventListener;

import org.testng.Assert;

import com.dpreview.auto.infra.pages.DpreviewLoginPage;


public class T2_DpreviewLoginTest extends BaseTest {
	
	/*
	@Test // (dataProvider = "csvParamsProvider")
	public void loginTest(String loginEmail, String loginPassword) { // DpreviewLoginResult expectedLoginResult) {
		
		browseToUrl(MainConfig.baseUrl);
		
		DpreviewHomePage dpreviewHomePage = new DpreviewHomePage(driver);
		DpreviewSignInPage dpreviewSignInPage = dpreviewHomePage.clickSigninButton();
		
	}
	*/

	// ------------------------- Testing the validation of the Login page ------------------------------------------------------------------
	
	@Test(description = "Testing the validation of the Login page", priority = 0)
	public void loginPageTest() {

		browseToUrl(MainConfig.baseUrl);

		WebElement loginLink = driver.findElement(By.cssSelector(".userTools > a:nth-child(1)"));
		
		Actions action = new Actions(driver);
		action.moveToElement(loginLink).build().perform();
		
		driver.findElement(By.cssSelector(".userTools > a:nth-child(1)")).click();
	}

	// ------------------------- Testing the login process with valid details --------------------------------------------------------------
	
	@Test(description = "Typing the login details", priority = 1)
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
	
	// ------------------------- Testing the Settings of the logged user ------------------------------------------------------------------
	
	@Test(description = "The user enters to the settings section", priority = 2)
	public void enterSettingsTest() {
		
		WebElement userSettings = driver.findElement(By.id("mainUserBox"));
		
		Actions action0 = new Actions(driver);
		action0.moveToElement(userSettings).build().perform();
		
		driver.findElement(By.id("mainUserBox")).click();
		
		WebElement settings = driver.findElement(By.cssSelector("div.group:nth-child(1) > a:nth-child(2)"));
		
		Actions action1 = new Actions(driver);
		action1.moveToElement(settings).build().perform();
		
		driver.findElement(By.cssSelector("div.group:nth-child(1) > a:nth-child(2)")).click();
		
	}
	
	@Test(description = "The user sets the desired settings of his profile", priority = 3)
	public void userSettingsTest() {
		
		// --------------------- Testing the user settings --------------------------------------------------------------------------------
		
		WebElement location = driver.findElement(By.xpath("//*[@id='userSettingsCountry']"));
		WebElement profession = driver.findElement(By.name("profession"));
		WebElement newsSubscription = driver.findElement(By.xpath("//*[@id='userSettingsSubscribeToNewsletter']"));
		WebElement website = driver.findElement(By.name("website"));
		WebElement galleryViewingSafetyLevel = driver.findElement(By.id("userSettingsGallerySafetyLevelModerate"));
		WebElement saveChanges = driver.findElement(By.id("settingsFormSubmitButton"));
		
		// --------------------- Setting the user location ----------------------------------------
		
		Actions action2 = new Actions(driver);
		action2.moveToElement(location).build().perform();
		
		driver.findElement(By.xpath("//*[@id='userSettingsCountry']")).click();
		
		driver.findElement(By.cssSelector("#userSettingsCountry > option:nth-child(105)")).click();
		
		// --------------------- Setting the user profession ---------------------------------------
		
		Actions action3 = new Actions(driver);
		action3.moveToElement(profession).build().perform();
		
		driver.findElements(By.name("profession"));
		
		profession.sendKeys("QA Engineer");
		
		// --------------------- Setting the web site input ---------------------------------------
		
		Actions action4 = new Actions(driver);
		action4.moveToElement(website).build().perform();
		
		driver.findElement(By.name("website"));
		
		website.sendKeys("https://www.linkedin.com/in/daniel-harel-b3a96414/");
		
		driver.findElement(By.id("userSettingsGallerySafetyLevelModerate"));  // *** Scrolling the page to the galleryViewingSafetyLevel element ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", galleryViewingSafetyLevel);
        Reports.report("Scrolled to Element " + By.name("userSettingsGallerySafetyLevelModerate") + " (" + By.name("userSettingsGallerySafetyLevelModerate") + ")");
        
		
		// --------------------- Home page Personalization ----------------------------------------- 
		
		Actions action5 = new Actions(driver);
		action5.moveToElement(galleryViewingSafetyLevel).build().perform();
		
		
		// --------------------- Newsletter Subscription -------------------------------------------
		
		Actions action6 = new Actions(driver);
		action6.moveToElement(newsSubscription).build().perform();
				
		driver.findElement(By.xpath("//*[@id='userSettingsSubscribeToNewsletter']")).click();
		
		// --------------------- Saving the settings changes ---------------------------------------
		
		Actions action7 = new Actions(driver);
		action7.moveToElement(saveChanges).build().perform();
		
		driver.findElement(By.id("settingsFormSubmitButton")).click();
	}
}
