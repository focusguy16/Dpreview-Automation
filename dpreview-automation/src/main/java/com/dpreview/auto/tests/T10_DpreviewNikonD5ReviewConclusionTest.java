package com.dpreview.auto.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.dpreview.auto.infra.pages.DpreviewNikonD5ReviewPage;
import com.dpreview.auto.infra.reports.Reports;

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

}
