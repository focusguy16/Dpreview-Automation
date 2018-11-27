package com.dpreview.auto.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.dpreview.auto.infra.pages.DpreviewNikonD5ReviewPage;
import com.dpreview.auto.infra.reports.Reports;

/******************************************************************************************************************************************
 ******************** This test is checking the full conclusion review of the Nikon D5 camera *********************************************
 ******************************************************************************************************************************************  
 */

public class T10_DpreviewNikonD5ReviewConclusionTest extends BaseTest {

	@Test(description = "Validating the Nikon D5 Review Conclusion URL", priority = 24)
	public void validatingConclusionPage() {

		browseToUrl("https://www.dpreview.com/reviews/nikon-d5-pro-dslr-review/13");

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.urlToBe("https://www.dpreview.com/reviews/nikon-d5-pro-dslr-review/13"));
	}

	@Test(description = "Conclusion Headline", priority = 25)
	public void conclusionHeadline() throws Exception {

		WebElement conclusionHeadline = driver.findElement(By.cssSelector(".articleBody > h2:nth-child(1)"));

		driver.findElement(By.cssSelector(".articleBody > h2:nth-child(1)"));  // *** Scrolling to the Conclusion headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", conclusionHeadline);
		Reports.report("Scrolled to Element " + By.cssSelector(".articleBody > h2:nth-child(1)") + " (" + By.cssSelector(".articleBody > h2:nth-child(1)") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Overall Conclusion", priority = 26)
	public void overallConclusion() throws Exception {

		WebElement overallConclusion = driver.findElement(By.cssSelector(".articleBody > h3:nth-child(3)"));

		driver.findElement(By.cssSelector(".articleBody > h3:nth-child(3)"));  // *** Scrolling to the Overall Conclusion headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", overallConclusion);
		Reports.report("Scrolled to Element " + By.cssSelector(".articleBody > h3:nth-child(3)") + " (" + By.cssSelector(".articleBody > h3:nth-child(3)") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Handling", priority = 27)
	public void handling() throws Exception {

		WebElement handling = driver.findElement(By.cssSelector(".articleBody > h3:nth-child(8)"));

		driver.findElement(By.cssSelector(".articleBody > h3:nth-child(8)"));  // *** Scrolling to the Handling headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", handling);
		Reports.report("Scrolled to Element " + By.cssSelector(".articleBody > h3:nth-child(8)") + " (" + By.cssSelector(".articleBody > h3:nth-child(8)") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Soccer Image Summary", priority = 28)
	public void soccerImageSummary() throws Exception {

		WebElement soccerImage = driver.findElement(By.cssSelector("table.images:nth-child(10) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)"));

		driver.findElement(By.cssSelector("table.images:nth-child(10) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)"));  // *** Scrolling to the Soccer Image Summary ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", soccerImage);
		Reports.report("Scrolled to Element " + By.cssSelector("table.images:nth-child(10) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)") + " (" + By.cssSelector("table.images:nth-child(10) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Dog Image Summary", priority = 29)
	public void dogImageSummary() throws Exception {

		WebElement dogImage = driver.findElement(By.cssSelector("table.images:nth-child(13) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)"));

		driver.findElement(By.cssSelector("table.images:nth-child(13) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)"));  // *** Scrolling to the Dog Image Summary ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dogImage);
		Reports.report("Scrolled to Element " + By.cssSelector("table.images:nth-child(13) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)") + " (" + By.cssSelector("table.images:nth-child(13) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Autofocus and overall performance", priority = 30)
	public void autofocusAndPerformance() throws Exception {

		WebElement autofocusPerformance = driver.findElement(By.cssSelector(".articleBody > h3:nth-child(16)"));

		driver.findElement(By.cssSelector(".articleBody > h3:nth-child(16)"));  // *** Scrolling to the Autofocus and overall performance headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", autofocusPerformance);
		Reports.report("Scrolled to Element " + By.cssSelector(".articleBody > h3:nth-child(16)") + " (" + By.cssSelector(".articleBody > h3:nth-child(16)") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Motorcycle Image Summary", priority = 31)
	public void motorcycleImageSummary() throws Exception {

		WebElement motorcycleImageSummary = driver.findElement(By.cssSelector("table.images:nth-child(20) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)"));

		driver.findElement(By.cssSelector("table.images:nth-child(20) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)"));  // *** Scrolling to the Motorcycle Image Summary ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", motorcycleImageSummary);
		Reports.report("Scrolled to Element " + By.cssSelector("table.images:nth-child(20) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)") + " (" + By.cssSelector("table.images:nth-child(20) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Singer Image Summary", priority = 32)
	public void singerImageSummary() throws Exception {

		WebElement singerImageSummary = driver.findElement(By.cssSelector("table.images:nth-child(23) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)"));

		driver.findElement(By.cssSelector("table.images:nth-child(23) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)"));  // *** Scrolling to the Singer Image Summary ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", singerImageSummary);
		Reports.report("Scrolled to Element " + By.cssSelector("table.images:nth-child(23) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)") + " (" + By.cssSelector("table.images:nth-child(23) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Stills and video image quality", priority = 33)
	public void stillsAndVideo() throws Exception {

		WebElement stillsAndVideo = driver.findElement(By.cssSelector(".articleBody > h3:nth-child(26)"));

		driver.findElement(By.cssSelector(".articleBody > h3:nth-child(26)"));  // *** Scrolling to the Stills and video image quality headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", stillsAndVideo);
		Reports.report("Scrolled to Element " + By.cssSelector(".articleBody > h3:nth-child(26)") + " (" + By.cssSelector(".articleBody > h3:nth-child(26)") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Man on grass Image Summary", priority = 34)
	public void manOnGrassImageSummary() throws Exception {

		WebElement manOnGrassImageSummary = driver.findElement(By.cssSelector("table.images:nth-child(28) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)"));

		driver.findElement(By.cssSelector("table.images:nth-child(28) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)"));  // *** Scrolling to the Man on grass Image Summary ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", manOnGrassImageSummary);
		Reports.report("Scrolled to Element " + By.cssSelector("table.images:nth-child(28) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)") + " (" + By.cssSelector("table.images:nth-child(28) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Woman Image Summary", priority = 35)
	public void womanImageSummary() throws Exception {

		WebElement womanImageSummary = driver.findElement(By.cssSelector("table.images:nth-child(31) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)"));

		driver.findElement(By.cssSelector("table.images:nth-child(31) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)"));  // *** Scrolling to the Woman Image Summary ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", womanImageSummary);
		Reports.report("Scrolled to Element " + By.cssSelector("table.images:nth-child(31) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)") + " (" + By.cssSelector("table.images:nth-child(31) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "The final word", priority = 36)
	public void theFinalWord() throws Exception {

		WebElement womanImageSummary = driver.findElement(By.cssSelector(".articleBody > h3:nth-child(34)"));

		driver.findElement(By.cssSelector(".articleBody > h3:nth-child(34)"));  // *** Scrolling to The final word ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", womanImageSummary);
		Reports.report("Scrolled to Element " + By.cssSelector(".articleBody > h3:nth-child(34)") + " (" + By.cssSelector(".articleBody > h3:nth-child(34)") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Field motorcycle Image Summary", priority = 37)
	public void fieldMotorcycleImageSummary() throws Exception {

		WebElement fieldMotorcycleImageSummary = driver.findElement(By.cssSelector("table.images:nth-child(37) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)"));

		driver.findElement(By.cssSelector("table.images:nth-child(37) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)"));  // *** Scrolling to the Field motorcycle Image Summary ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", fieldMotorcycleImageSummary);
		Reports.report("Scrolled to Element " + By.cssSelector("table.images:nth-child(37) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)") + " (" + By.cssSelector("table.images:nth-child(37) > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1)") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Nikon D5 Summary Table", priority = 38)
	public void nikonD5SummaryTable() throws Exception {

		WebElement nikonD5SummaryTable = driver.findElement(By.cssSelector("div.productName"));

		driver.findElement(By.cssSelector("div.productName"));  // *** Scrolling to the Nikon D5 Summary Table ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nikonD5SummaryTable);
		Reports.report("Scrolled to Element " + By.cssSelector("div.productName") + " (" + By.cssSelector("div.productName") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Nikon D5 Conclusion", priority = 39)
	public void nikonD5Conclusion() throws Exception {

		WebElement nikonD5Conclusion = driver.findElement(By.cssSelector(".conclusion"));

		driver.findElement(By.cssSelector(".conclusion"));  // *** Scrolling to the Nikon D5 Conclusion ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nikonD5Conclusion);
		Reports.report("Scrolled to Element " + By.cssSelector(".conclusion") + " (" + By.cssSelector(".conclusion") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Samples Gallery headline", priority = 40)
	public void samplesGalleryHeadline() throws Exception {

		WebElement samplesGalleryHeadline = driver.findElement(By.cssSelector(".articleBody > h3:nth-child(44)"));

		driver.findElement(By.cssSelector(".articleBody > h3:nth-child(44)"));  // *** Scrolling to the Samples Gallery headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", samplesGalleryHeadline);
		Reports.report("Scrolled to Element " + By.cssSelector(".articleBody > h3:nth-child(44)") + " (" + By.cssSelector(".articleBody > h3:nth-child(44)") + ")");

		Thread.sleep(5000);

		driver.close();
	}
}
