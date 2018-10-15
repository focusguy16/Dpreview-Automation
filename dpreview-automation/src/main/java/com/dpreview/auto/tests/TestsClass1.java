package com.dpreview.auto.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestsClass1 {

	@Test(description = "Validation of Digital Review Photography URL", priority = 0)
	public void validationOfDpreviewSite() {

		System.setProperty("webdriver.gecko.driver", "webdrivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dpreview.com");
		// driver.findElement(By.cssSelector(".userTools > a:nth-child(2)")).click();
	}

	// @Test(description = "User registration process", priority = 1)
	public void userRegistration() {

		// System.setProperty("webdriver.gecko.driver", "webdrivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();


	}

}
