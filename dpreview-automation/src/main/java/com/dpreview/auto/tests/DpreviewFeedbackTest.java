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
		

		Actions action1 = new Actions(driver);
		action1.contextClick(feedbackForum).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();

		driver.findElement(By.id("viewForumButton"));
		
		WebElement siteFeedbackAndHelp = driver.findElement(By.cssSelector(".forumHeader > h1:nth-child(3)"));
		
		Actions action2 = new Actions(driver);
		action2.moveToElement(siteFeedbackAndHelp).build().perform();
		
		driver.findElement(By.cssSelector(".forumHeader > h1:nth-child(3)")).click();
	}
	
	
	@Test(description = "Scrolling the page", priority = 3)
	public void scrollPage() throws Exception {
		
		WebElement threadsOfDistinction = driver.findElement(By.xpath("//*[@class='primaryInfo']//*[text()='Threads of Distinction']"));
		WebElement helpPlease = driver.findElement(By.xpath("//*[@class='primaryInfo']//*[text()='Help please']"));
		WebElement insertPost = driver.findElement(By.xpath("//*[@class='primaryInfo']//*[text()='How to insert a post']"));
		WebElement missingImages = driver.findElement(By.xpath("//*[@class='primaryInfo']//*[text()='missing images']"));
		WebElement sortGearListing = driver.findElement(By.xpath("//*[@class='primaryInfo']//*[text()='Sort gear listing']"));
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@class='primaryInfo']//*[text()='Threads of Distinction']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", threadsOfDistinction);
        Reports.report("Scrolled to Element " + By.xpath("//*[@class='primaryInfo']//*[text()='Threads of Distinction']") + " (" + By.xpath("//*[@class='primaryInfo']//*[text()='Threads of Distinction']") + ")");
        
        Thread.sleep(10000);
        
        driver.findElement(By.xpath("//*[@class='primaryInfo']//*[text()='Help please']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", helpPlease);
        Reports.report("Scrolled to Element " + By.xpath("//*[@class='primaryInfo']//*[text()='Help please']") + " (" + By.xpath("//*[@class='primaryInfo']//*[text()='Help please']") + ")");
		
        Thread.sleep(10000);
        
        driver.findElement(By.xpath("//*[@class='primaryInfo']//*[text()='How to insert a post']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", insertPost);
        Reports.report("Scrolled to Element " + By.xpath("//*[@class='primaryInfo']//*[text()='How to insert a post']") + " (" + By.xpath("//*[@class='primaryInfo']//*[text()='How to insert a post']") + ")");
        
        Thread.sleep(10000);
        
        driver.findElement(By.xpath("//*[@class='primaryInfo']//*[text()='missing images']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", missingImages);
        Reports.report("Scrolled to Element " + By.xpath("//*[@class='primaryInfo']//*[text()='missing images']") + " (" + By.xpath("//*[@class='primaryInfo']//*[text()='missing images']") + ")");
        
        Thread.sleep(10000);
        
        driver.findElement(By.xpath("//*[@class='primaryInfo']//*[text()='Sort gear listing']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sortGearListing);
        Reports.report("Scrolled to Element " + By.xpath("//*[@class='primaryInfo']//*[text()='Sort gear listing']") + " (" + By.xpath("//*[@class='primaryInfo']//*[text()='Sort gear listing']") + ")");
        
        Thread.sleep(10000);
	}
	
	
	// ------------------------------------------------- All Threads Tab ----------------------------------------

	@Test(description = "All threads tab", priority = 6)
	public void allThreadsTab() {
		
		WebElement allThreadsTab = driver.findElement(By.cssSelector("a.tab:nth-child(1)"));
		
		Actions action = new Actions(driver);
		action.moveToElement(allThreadsTab).build().perform();
		
		driver.findElement(By.cssSelector("a.tab:nth-child(1)")).click();

	}
	
	// ------------------------------------------------- Discussions Tab ----------------------------------------
	
	@Test(description = "Discussions tab", priority = 4)
	public void discussionsTab() {
		
		WebElement discussionsTab = driver.findElement(By.xpath("//*[@class='tab left discussion']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(discussionsTab).build().perform();
		
		driver.findElement(By.xpath("//*[@class='tab left discussion']")).click();

	}
	
	// --------------------------------------------------- Questions Tab ----------------------------------------
	
	@Test(description = "Questions tab", priority = 5)
	public void questionsTab() {
		
		WebElement questionsTab = driver.findElement(By.xpath("//*[@class='tab left question']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(questionsTab).build().perform();
		
		driver.findElement(By.xpath("//*[@class='tab left question']")).click();

	}

}
