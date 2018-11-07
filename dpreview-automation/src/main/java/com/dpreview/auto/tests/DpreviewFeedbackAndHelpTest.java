package com.dpreview.auto.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.dpreview.auto.infra.config.MainConfig;
import com.dpreview.auto.infra.reports.Reports;

/*
 * ************************** This test is using the mouse right click context menu to open the Feedback and Help forum *****************************
 */


public class DpreviewFeedbackAndHelpTest extends BaseTest {

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
		

		Actions action1 = new Actions(driver);
		action1.contextClick(feedbackForum).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();

		driver.findElement(By.id("viewForumButton"));
		
		WebElement siteFeedbackAndHelp = driver.findElement(By.cssSelector(".forumHeader > h1:nth-child(3)"));
		
		Actions action2 = new Actions(driver);
		action2.moveToElement(siteFeedbackAndHelp).build().perform();
		
		driver.findElement(By.cssSelector(".forumHeader > h1:nth-child(3)")).click();
	}
	
	// ------------------------------------------------- All Threads Tab ----------------------------------------

	@Test(description = "All threads tab", priority = 5)
	public void allThreadsTab() {
		
		WebElement allThreadsTab = driver.findElement(By.cssSelector("a.tab:nth-child(1)"));
		
		Actions action = new Actions(driver);
		action.moveToElement(allThreadsTab).build().perform();
		
		driver.findElement(By.cssSelector("a.tab:nth-child(1)")).click();
		
		driver.close();
	}
	
	// ------------------------------------------------- Discussions Tab ----------------------------------------
	
	@Test(description = "Discussions tab", priority = 3)
	public void discussionsTab() throws Exception {
		
		WebElement discussionsTab = driver.findElement(By.xpath("//*[@class='tab left discussion']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(discussionsTab).build().perform();
		
		driver.findElement(By.xpath("//*[@class='tab left discussion']")).click();
		
		Thread.sleep(5000);

	}
	
	// --------------------------------------------------- Questions Tab ----------------------------------------
	
	@Test(description = "Questions tab", priority = 4)
	public void questionsTab() throws Exception {
		
		WebElement questionsTab = driver.findElement(By.xpath("//*[@class='tab left question']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(questionsTab).build().perform();
		
		driver.findElement(By.xpath("//*[@class='tab left question']")).click();
		
		Thread.sleep(5000);
	}

}
