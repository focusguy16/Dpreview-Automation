package com.dpreview.auto.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.dpreview.auto.infra.config.MainConfig;
import com.dpreview.auto.infra.pages.DpreviewBuyingGuidesPage;
import com.dpreview.auto.infra.pages.DpreviewHomePage;
import com.dpreview.auto.infra.reports.Reports;

public class T7_DpreviewBuyingGuidesReviewTest extends BaseTest {

	// --------------------- Testing the Buying Guides appearance by hovering the Buying Guides element ---------------------------------------

	@Test(description = "Hovering over the Buying Guides element", priority = 0)
	public void hoveringBuyingGuidesElement() {

		browseToUrl(MainConfig.baseUrl);

		DpreviewHomePage dpreviewHomePage = new DpreviewHomePage(driver);
		dpreviewHomePage.hoverOverBuyingGuidesLink();

		DpreviewBuyingGuidesPage dpreviewBuyingGuidesPage = dpreviewHomePage.hoverOverBuyingGuidesLink();
	}

	/*
	// --------------------- Testing the Best cameras for sports and action link from the Buying Guides menu -----------------------------------

	@Test(description = "Selecting the Best cameras for sports and action link from the Buying Guides menu", priority = 1)
	public void selectingCamerasSportsActionLink() {

		WebElement camerasSportsAction = driver.findElement(By.linkText("Best cameras for sports and action"));

		Actions action = new Actions(driver);
		action.moveToElement(camerasSportsAction).build().perform();

		driver.findElement(By.linkText("Best cameras for sports and action")).isSelected();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 3000);
		wait1.until(ExpectedConditions.elementToBeSelected(camerasSportsAction));
		
		// driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		driver.findElement(By.linkText("Best cameras for sports and action")).click();

		WebDriverWait wait2 = new WebDriverWait(driver, 3000);
		wait2.until(ExpectedConditions.urlContains("sports-and-action"));

		driver.navigate().to("https://www.dpreview.com/reviews/buying-guide-best-cameras-for-sports-and-action");
	}
	*/

	@Test(description = "Selecting the Buying Guides", priority = 1)
	public void buyingGuides() {
		
		WebElement buyingGuides = driver.findElement(By.cssSelector("a.mainItem:nth-child(4) > span:nth-child(1)"));
		
		Actions action = new Actions(driver);
		action.moveToElement(buyingGuides).build().perform();
		
		driver.findElement(By.cssSelector("a.mainItem:nth-child(4) > span:nth-child(1)")).click();
	}
	
	@Test(description = "Scrolling to the page headline", priority = 2)
	public void pageScrolling() throws Exception {

		WebElement camerasUseCase = driver.findElement(By.id("usecaseSectionTitle"));

		driver.findElement(By.id("usecaseSectionTitle"));  // *** Scrolling the Cameras Use Case headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", camerasUseCase);
		Reports.report("Scrolled to Element " + By.id("usecaseSectionTitle") + " (" + By.id("usecaseSectionTitle") + ")");

		Thread.sleep(5000);
	}
}
