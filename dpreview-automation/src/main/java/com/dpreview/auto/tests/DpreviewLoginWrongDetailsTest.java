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

}
