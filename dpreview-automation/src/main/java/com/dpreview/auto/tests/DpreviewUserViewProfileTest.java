package com.dpreview.auto.tests;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.testng.annotations.Test;

import org.openqa.selenium.By;

import com.dpreview.auto.infra.config.MainConfig;
import com.dpreview.auto.infra.pages.DpreviewHomePage;
import com.dpreview.auto.infra.pages.DpreviewLoginPage;
// import com.dpreview.auto.tests.enums.DpreviewLoginResult;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class DpreviewUserViewProfileTest extends BaseTest {
	
	@Test(description = "Entering to the profile of the user")
	public void userViewProfileTest() {
		
		browseToUrl(MainConfig.baseUrl);
		
		// DpreviewHomePage dpreviewHomePage = new DpreviewHomePage(driver);
		
		WebElement userName = driver.findElement(By.id("mainUserBox"));
		
		Actions action = new Actions(driver);
		action.moveToElement(userName).build().perform();
		
		
	}

}
