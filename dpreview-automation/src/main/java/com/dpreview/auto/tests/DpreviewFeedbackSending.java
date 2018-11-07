package com.dpreview.auto.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.dpreview.auto.infra.config.MainConfig;
import com.dpreview.auto.infra.reports.Reports;

public class DpreviewFeedbackSending extends BaseTest {

	@Test(description = "Validating the home page", priority = 0)
	public void homePage() {

		browseToUrl(MainConfig.baseUrl);

	}

	@Test(description = "Accessing the Feedback page", priority = 1)
	public void feedbackPageAccess() {

		WebElement feedbackLink = driver.findElement(By.cssSelector(".tip"));

		Actions action = new Actions(driver);
		action.moveToElement(feedbackLink).build().perform();

		driver.findElement(By.cssSelector(".tip")).click();
	}

	@Test(description = "", priority = 2)
	public void scrollToContactingUs() throws Exception {

		WebElement contactingUs = driver.findElement(By.xpath("//*[@class='label']//*[@class='header']"));

		driver.findElement(By.xpath("//*[@class='label']//*[@class='header']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", contactingUs);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='label']//*[@class='header']") + " (" + By.xpath("//*[@class='label']//*[@class='header']") + ")");

		Thread.sleep(10000);
	}

	@Test(description = "", priority = 3)
	public void scrollToYourEmail() {

		WebElement yourEmail = driver.findElement(By.xpath("//*[@class='label']//*[@class='header']"));

		driver.findElement(By.xpath("//*[@class='label']//*[@class='header']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yourEmail);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='label']//*[@class='header']") + " (" + By.xpath("//*[@class='label']//*[@class='header']") + ")");

	}
	
	@Test(description = "", priority = 4)
	public void sendFeedback() {
		
		WebElement sendFeedback = driver.findElement(By.id("feedbackFormSubmitBtn"));
		
		Actions action = new Actions(driver);
		action.moveToElement(sendFeedback).build().perform();
		
		driver.findElement(By.id("feedbackFormSubmitBtn")).click();
	}

}
