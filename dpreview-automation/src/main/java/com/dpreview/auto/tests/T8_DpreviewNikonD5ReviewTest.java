package com.dpreview.auto.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;

import com.dpreview.auto.infra.config.MainConfig;
import com.dpreview.auto.infra.pages.DpreviewBuyingGuidesPage;
import com.dpreview.auto.infra.pages.DpreviewHomePage;
import com.dpreview.auto.infra.pages.DpreviewNikonD5ReviewPage;
import com.dpreview.auto.infra.reports.Reports;

public class T8_DpreviewNikonD5ReviewTest<E> extends BaseTest {

	// --------------------- Testing the Buying Guides appearance by hovering the Buying Guides element ---------------------------------------

	@Test(description = "Hovering over the Buying Guides element", priority = 0)
	public void hoveringBuyingGuidesElement() {

		browseToUrl(MainConfig.baseUrl);

		DpreviewHomePage dpreviewHomePage = new DpreviewHomePage(driver);
		dpreviewHomePage.hoverOverBuyingGuidesLink();

		DpreviewBuyingGuidesPage dpreviewBuyingGuidesPage = dpreviewHomePage.hoverOverBuyingGuidesLink();
	}


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

	@Test(description = "Selecting the Buying Guides", priority = 2)
	public void buyingGuides() {

		WebElement buyingGuides = driver.findElement(By.cssSelector("a.mainItem:nth-child(4) > span:nth-child(1)"));

		Actions action = new Actions(driver);
		action.moveToElement(buyingGuides).build().perform();

		driver.findElement(By.cssSelector("a.mainItem:nth-child(4) > span:nth-child(1)")).click();
	}

	@Test(description = "Scrolling to the page headline", priority = 3)
	public void pageScrolling() throws Exception {

		WebElement camerasUseCase = driver.findElement(By.id("usecaseSectionTitle"));

		driver.findElement(By.id("usecaseSectionTitle"));  // *** Scrolling to the Cameras Use Case headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", camerasUseCase);
		Reports.report("Scrolled to Element " + By.id("usecaseSectionTitle") + " (" + By.id("usecaseSectionTitle") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Selecting the Best cameras for sports and action guide", priority = 4)
	public void sportsAndAction() {

		WebElement sportsAndAction = driver.findElement(By.cssSelector("div.cardsContainer:nth-child(6) > a:nth-child(8)"));

		Actions action = new Actions(driver);
		action.moveToElement(sportsAndAction).build().perform();

		driver.findElement(By.cssSelector("div.cardsContainer:nth-child(6) > a:nth-child(8)")).click();
	}

	// ----------------------------------------- Best cameras for sports and action guide -----------------------------------------------------------

	@Test(description = "Scrolling to the Best cameras for sports and action guide headline", priority = 5)
	public void bestSportsAndActionCamerasHeadline() throws Exception {

		WebElement pageHeadline = driver.findElement(By.cssSelector(".articleHeader"));

		driver.findElement(By.cssSelector(".articleHeader"));  // *** Scrolling to the page headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", pageHeadline);
		Reports.report("Scrolled to Element " + By.cssSelector(".articleHeader") + " (" + By.cssSelector(".articleHeader") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Scrolling to the Nikon D5 headline", priority = 6)
	public void nikonD5() throws Exception {

		WebElement nikonD5 = driver.findElement(By.cssSelector(".articleBody > h3:nth-child(6)"));

		driver.findElement(By.cssSelector(".articleBody > h3:nth-child(6)"));  // *** Scrolling to the Nikon D5 headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nikonD5);
		Reports.report("Scrolled to Element " + By.cssSelector(".articleBody > h3:nth-child(6)") + " (" + By.cssSelector(".articleBody > h3:nth-child(6)") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Clicking on Nikon D5 link", priority = 7)
	public void nikonD5Link() throws Exception {

		WebElement nikonD5Link = driver.findElement(By.cssSelector(".articleBody > ul:nth-child(19) > li:nth-child(1) > strong:nth-child(1) > a:nth-child(1)"));

		Actions action = new Actions(driver);
		action.moveToElement(nikonD5Link).build().perform();

		driver.findElement(By.cssSelector(".articleBody > ul:nth-child(19) > li:nth-child(1) > strong:nth-child(1) > a:nth-child(1)")).click();
	}

	// ------------------------------------------------ Nikon D5 Review - Page 1: Introduction ------------------------------------------------------

	@Test(description = "Clicking on the Nikon D5 Review URL", priority = 8)
	public void nikonD5ReviewButton() {

		// List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles()); // Creating new array list for browser tabs
		// driver.switchTo().window(browserTabs.get(0));  // @@@@@@@@@@ Switching to browser tab 1 @@@@@@@@@@@@@@@

		WebElement nikonD5ReviewButton = driver.findElement(By.cssSelector(".scoreContainer > div:nth-child(2) > a:nth-child(1)"));

		Actions action = new Actions(driver);
		action.moveToElement(nikonD5ReviewButton).build().perform();

		driver.findElement(By.cssSelector(".scoreContainer > div:nth-child(2) > a:nth-child(1)")).click();

		// driver.switchTo().window(browserTabs.get(1));
	}

	@Test(description = "Validating the page: 'Nikon D5 Review'", priority = 9)
	public void nikonD5ReviewPage() throws Exception {

		browseToUrl("https://www.dpreview.com/reviews/nikon-d5-pro-dslr-review");

		Thread.sleep(5000);

		DpreviewHomePage dpreviewHomePage = new DpreviewHomePage(driver);
		dpreviewHomePage.hoverOverMainMenu();

		DpreviewNikonD5ReviewPage dpreviewNikonD5ReviewPage = dpreviewHomePage.hoverOverMainMenu();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.cssSelector(".currentContainer"), " page 1 Introduction"));
	}

	@Test(description = "Hovering over the Nikon D5 Review Main Review menu", priority = 10)
	public void hoverOverMainMenu() throws Exception {

		WebElement mainMenu = driver.findElement(By.xpath("//td/div/div/*[@class='current']"));
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(mainMenu)); 

		DpreviewHomePage dpreviewHomePage = new DpreviewHomePage(driver);
		dpreviewHomePage.hoverOverMainMenu();

		DpreviewNikonD5ReviewPage dpreviewNikonD5ReviewPage = dpreviewHomePage.hoverOverMainMenu();
	}

	@Test(description = "Introduction", priority = 11)
	public void introduction() throws Exception {

		// WebDriverWait wait = new WebDriverWait(driver, 5);
		// wait.until(ExpectedConditions.elementToBeSelected(introduction));
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		// WebElement introduction = driver.findElement(By.cssSelector("div.current"));

		// Actions action = new Actions(driver);
		// action.moveToElement(introduction).build().perform();
		
		// driver.findElement(By.cssSelector("div.current")).click();
		
		// Thread.sleep(5000);

		driver.findElement(By.linkText("1. Introduction")).isSelected();

		driver.findElement(By.linkText("1. Introduction")).click();
	}

}
