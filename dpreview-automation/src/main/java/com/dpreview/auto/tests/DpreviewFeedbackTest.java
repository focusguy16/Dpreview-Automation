package com.dpreview.auto.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.dpreview.auto.infra.config.MainConfig;

/*
 * ************************** This test is using the mouse right click context menu to open the Feedback and Help forum *****************************
 */


public class DpreviewFeedbackTest extends BaseTest {
	
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
	
	@Test(description = "Opening the Feedback forum", priority = 2)
	public void feedbackForum() {
		
		WebElement feedbackForum = driver.findElement(By.id("viewForumButton"));
		
		Actions action = new Actions(driver);
		action.contextClick(feedbackForum).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		
		driver.findElement(By.id("viewForumButton"));
		
	}

}
