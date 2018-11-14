package com.dpreview.auto.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
// import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.dpreview.auto.infra.config.MainConfig;
import com.dpreview.auto.infra.pages.DpreviewHomePage;
import com.dpreview.auto.infra.pages.DpreviewSmartphoneReviewsPage;
import com.dpreview.auto.infra.reports.Reports;

public class T6_DpreviewSmartphonesIndexOrderTest extends BaseTest {

	// --------------------- Testing the Reviews Menu appearance by hovering the Reviews element ---------------------------------------

	@Test(description = "Hovering over the Reviews element", priority = 0)
	public void hoveringReviewsElement() {

		browseToUrl(MainConfig.baseUrl);

		DpreviewHomePage dpreviewHomePage = new DpreviewHomePage(driver);
		dpreviewHomePage.hoverOverReviewsLink();

	}

	// --------------------- Testing the Smart phone reviews link from the Reviews menu ------------------------------------------------

	@Test(description = "Selecting the Smartphone reviews link from the Reviews menu", priority = 1)
	public void selectingSmartphoneReviews() {

		WebElement smartphoneReviews = driver.findElement(By.xpath("//*[@class='dropdownMenuContent']//*[text()='Smartphone reviews']"));

		Actions action = new Actions(driver);
		action.moveToElement(smartphoneReviews).build().perform();

		driver.findElement(By.xpath("//*[@class='dropdownMenuContent']//*[text()='Smartphone reviews']")).isSelected();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//*[@class='dropdownMenuContent']//*[text()='Smartphone reviews']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.urlContains("mobilephones"));

		driver.navigate().to("https://www.dpreview.com/reviews?category=mobilephones");
	}

	
	@Test(description = "Selecting the Smartphones index order - by Brand", priority = 2)
	public void smartphonesIndexOrder() {

		driver.get("https://www.dpreview.com/reviews?category=mobilephones");

		try {

			WebElement indexOrder = driver.findElement(By.id("reviewIndexOrder"));
			
			Actions action = new Actions(driver);
			action.moveToElement(indexOrder).build().perform();
			
			Thread.sleep(3000);
			driver.findElement(By.id("reviewIndexOrder")).click();
			Select dropdown = new Select(driver.findElement(By.id("reviewIndexOrder")));
			dropdown.selectByIndex(2);

		}
		catch(Exception e) {

			System.out.println(e);
		}

	}
	
	@Test(description = "Scrolling the page to Blackberry brand", priority = 3)
	public void blackberryBrand() throws Exception {
		
		WebElement blackberry = driver.findElement(By.cssSelector("#mainContent > h3:nth-child(7) > img:nth-child(1)"));
		
		driver.findElement(By.cssSelector("#mainContent > h3:nth-child(7) > img:nth-child(1)"));  // *** Scrolling to the Blackberry brand   ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", blackberry);
		Reports.report("Scrolled to Element " + By.cssSelector("#mainContent > h3:nth-child(7) > img:nth-child(1)") + " (" + By.cssSelector("#mainContent > h3:nth-child(7) > img:nth-child(1)") + ")");
		
		Thread.sleep(5000);
	}
	
	@Test(description = "Scrolling the page to Microsoft brand", priority = 4)
	public void microsoftBrand() throws Exception {
		
		WebElement microsoft = driver.findElement(By.cssSelector("#mainContent > h3:nth-child(17) > img:nth-child(1)"));
		
		driver.findElement(By.cssSelector("#mainContent > h3:nth-child(17) > img:nth-child(1)"));  // *** Scrolling to the Microsoft brand   ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", microsoft);
		Reports.report("Scrolled to Element " + By.cssSelector("#mainContent > h3:nth-child(17) > img:nth-child(1)") + " (" + By.cssSelector("#mainContent > h3:nth-child(17) > img:nth-child(1)") + ")");
		
		Thread.sleep(5000);
	}
	
	@Test(description = "Scrolling the page to Panasonic brand", priority = 5)
	public void panasonicBrand() throws Exception {
		
		WebElement panasonic = driver.findElement(By.cssSelector("#mainContent > h3:nth-child(27) > img:nth-child(1)"));
		
		driver.findElement(By.cssSelector("#mainContent > h3:nth-child(27) > img:nth-child(1)"));  // *** Scrolling to the Panasonic brand   ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", panasonic);
		Reports.report("Scrolled to Element " + By.cssSelector("#mainContent > h3:nth-child(27) > img:nth-child(1)") + " (" + By.cssSelector("#mainContent > h3:nth-child(27) > img:nth-child(1)") + ")");
		
		Thread.sleep(5000);
	}
}
