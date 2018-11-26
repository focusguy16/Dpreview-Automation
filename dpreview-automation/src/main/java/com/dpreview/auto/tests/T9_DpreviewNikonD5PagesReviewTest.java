package com.dpreview.auto.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.dpreview.auto.infra.pages.DpreviewNikonD5ReviewPage;
import com.dpreview.auto.infra.reports.Reports;

public class T9_DpreviewNikonD5PagesReviewTest extends BaseTest {

	@Test(description = "Hovering over the Nikon D5 Review Main Review menu", priority = 10)
	public void hoverOverMainMenu() throws Exception {

		browseToUrl("https://www.dpreview.com/reviews/nikon-d5-pro-dslr-review");

		DpreviewNikonD5ReviewPage dpreviewNikonD5ReviewPage = new DpreviewNikonD5ReviewPage(driver);
		dpreviewNikonD5ReviewPage.hoverOverReviewMenu();

		Thread.sleep(5000);
	}

	@Test(description = "Introduction", priority = 11)
	public void introduction() throws Exception {

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		driver.findElement(By.linkText("1. Introduction")).isSelected();

		driver.findElement(By.linkText("1. Introduction")).click();

		Thread.sleep(5000);
	}

	@Test(description = "Specifications", priority =  12)
	public void specifications() throws Exception {

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		DpreviewNikonD5ReviewPage dpreviewNikonD5ReviewPage = new DpreviewNikonD5ReviewPage(driver);
		dpreviewNikonD5ReviewPage.hoverOverReviewMenu();

		Thread.sleep(5000);

		driver.findElement(By.linkText("2. Specifications")).isSelected();

		driver.findElement(By.linkText("2. Specifications")).click();

		Thread.sleep(5000);
	}

	@Test(description = "Body & Design", priority = 13)
	public void bodyAndDesign() throws Exception {

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		DpreviewNikonD5ReviewPage dpreviewNikonD5ReviewPage = new DpreviewNikonD5ReviewPage(driver);
		dpreviewNikonD5ReviewPage.hoverOverReviewMenu();

		Thread.sleep(5000);

		driver.findElement(By.linkText("3. Body & Design")).isSelected();

		driver.findElement(By.linkText("3. Body & Design")).click();

		Thread.sleep(5000);
	}

	@Test(description = "Controls & Setup", priority = 14)
	public void controlsAndSetup() throws Exception {

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		DpreviewNikonD5ReviewPage dpreviewNikonD5ReviewPage = new DpreviewNikonD5ReviewPage(driver);
		dpreviewNikonD5ReviewPage.hoverOverReviewMenu();

		Thread.sleep(5000);

		driver.findElement(By.linkText("4. Controls & Setup")).isSelected();

		driver.findElement(By.linkText("4. Controls & Setup")).click();

		Thread.sleep(5000);
	}

	@Test(description = "Performance", priority = 15)
	public void performance() throws Exception {

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		DpreviewNikonD5ReviewPage dpreviewNikonD5ReviewPage = new DpreviewNikonD5ReviewPage(driver);
		dpreviewNikonD5ReviewPage.hoverOverReviewMenu();

		Thread.sleep(5000);

		driver.findElement(By.linkText("5. Performance")).isSelected();

		driver.findElement(By.linkText("5. Performance")).click();

		Thread.sleep(5000);
	}

	@Test(description = "Image Quality", priority = 16)
	public void imageQuality() throws Exception {

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		DpreviewNikonD5ReviewPage dpreviewNikonD5ReviewPage = new DpreviewNikonD5ReviewPage(driver);
		dpreviewNikonD5ReviewPage.hoverOverReviewMenu();

		Thread.sleep(5000);

		driver.findElement(By.linkText("6. Image Quality")).isSelected();

		driver.findElement(By.linkText("6. Image Quality")).click();

		Thread.sleep(5000);
	}

	@Test(description = "Low Light & High ISO Image Quality", priority = 17)
	public void lowLightHighISO() throws Exception {

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		DpreviewNikonD5ReviewPage dpreviewNikonD5ReviewPage = new DpreviewNikonD5ReviewPage(driver);
		dpreviewNikonD5ReviewPage.hoverOverReviewMenu();

		Thread.sleep(5000);

		driver.findElement(By.linkText("7. Low Light & High ISO Image Quality")).isSelected();

		driver.findElement(By.linkText("7. Low Light & High ISO Image Quality")).click();

		Thread.sleep(5000);
	}

	@Test(description = "Raw DR - Exposure Latitude & ISO Invariance", priority = 18)
	public void rawExposureISO() throws Exception {

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		DpreviewNikonD5ReviewPage dpreviewNikonD5ReviewPage = new DpreviewNikonD5ReviewPage(driver);
		dpreviewNikonD5ReviewPage.hoverOverReviewMenu();

		Thread.sleep(5000);

		driver.findElement(By.linkText("8. Raw DR - Exposure Latitude & ISO Invariance")).isSelected();

		driver.findElement(By.linkText("8. Raw DR - Exposure Latitude & ISO Invariance")).click();

		Thread.sleep(5000);
	}

	@Test(description = "Autofocus", priority = 19)
	public void autofocus() throws Exception {

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		DpreviewNikonD5ReviewPage dpreviewNikonD5ReviewPage = new DpreviewNikonD5ReviewPage(driver);
		dpreviewNikonD5ReviewPage.hoverOverReviewMenu();

		Thread.sleep(5000);

		driver.findElement(By.linkText("9. Autofocus")).isSelected();

		driver.findElement(By.linkText("9. Autofocus")).click();

		Thread.sleep(5000);
	}

	@Test(description = "Real-world Autofocus Performance: Motocross Practice", priority = 20)
	public void realWorldMotocross() throws Exception {

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		DpreviewNikonD5ReviewPage dpreviewNikonD5ReviewPage = new DpreviewNikonD5ReviewPage(driver);
		dpreviewNikonD5ReviewPage.hoverOverReviewMenu();

		Thread.sleep(5000);

		driver.findElement(By.linkText("10. Real-world Autofocus Performance: Motocross Practice")).isSelected();

		driver.findElement(By.linkText("10. Real-world Autofocus Performance: Motocross Practice")).click();

		Thread.sleep(5000);
	}

	@Test(description = "Real-world Autofocus Performance: Soccer", priority = 21)
	public void realWorldSoccer() throws Exception {

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		DpreviewNikonD5ReviewPage dpreviewNikonD5ReviewPage = new DpreviewNikonD5ReviewPage(driver);
		dpreviewNikonD5ReviewPage.hoverOverReviewMenu();

		Thread.sleep(5000);

		driver.findElement(By.linkText("11. Real-world Autofocus Performance: Soccer")).isSelected();

		driver.findElement(By.linkText("11. Real-world Autofocus Performance: Soccer")).click();

		Thread.sleep(5000);
	}

	@Test(description = "Video", priority = 22)
	public void video() throws Exception {

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		DpreviewNikonD5ReviewPage dpreviewNikonD5ReviewPage = new DpreviewNikonD5ReviewPage(driver);
		dpreviewNikonD5ReviewPage.hoverOverReviewMenu();

		Thread.sleep(5000);

		driver.findElement(By.linkText("12. Video")).isSelected();

		driver.findElement(By.linkText("12. Video")).click();

		Thread.sleep(5000);
	}

	@Test(description = "Conclusion & Samples", priority = 23)
	public void conclusionAndSamples() throws Exception {

		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		DpreviewNikonD5ReviewPage dpreviewNikonD5ReviewPage = new DpreviewNikonD5ReviewPage(driver);
		dpreviewNikonD5ReviewPage.hoverOverReviewMenu();

		Thread.sleep(5000);

		driver.findElement(By.linkText("13. Conclusion & Samples")).isSelected();

		driver.findElement(By.linkText("13. Conclusion & Samples")).click();

		Thread.sleep(5000);
	}
	
	@Test(description = "Conclusion Headline", priority = 24)
	public void conclusionHeadline() throws Exception {
		
		WebElement conclusionHeadline = driver.findElement(By.cssSelector(".articleBody > h2:nth-child(1)"));

		driver.findElement(By.cssSelector(".articleBody > h2:nth-child(1)"));  // *** Scrolling to the Conclusion headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", conclusionHeadline);
		Reports.report("Scrolled to Element " + By.cssSelector(".articleBody > h2:nth-child(1)") + " (" + By.cssSelector(".articleBody > h2:nth-child(1)") + ")");

		Thread.sleep(5000);
	}
	
	@Test(description = "Overall Conclusion", priority = 25)
	public void overallConclusion() throws Exception {
		
		WebElement conclusionHeadline = driver.findElement(By.cssSelector(".articleBody > h2:nth-child(1)"));

		driver.findElement(By.cssSelector(".articleBody > h2:nth-child(1)"));  // *** Scrolling to the Conclusion headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", conclusionHeadline);
		Reports.report("Scrolled to Element " + By.cssSelector(".articleBody > h2:nth-child(1)") + " (" + By.cssSelector(".articleBody > h2:nth-child(1)") + ")");

		Thread.sleep(5000);
	}
}
