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

	// ---------------------------- Best cameras for sports and action guide - Page 1: Introduction ---------------------------------------

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

	@Test(description = "Scrolling to the Nikon D500 headline", priority = 7)
	public void nikonD500() throws Exception {

		WebElement nikonD500 = driver.findElement(By.cssSelector(".articleBody > h3:nth-child(11)"));

		driver.findElement(By.cssSelector(".articleBody > h3:nth-child(11)"));  // *** Scrolling to the Nikon D500 headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nikonD500);
		Reports.report("Scrolled to Element " + By.cssSelector(".articleBody > h3:nth-child(11)") + " (" + By.cssSelector(".articleBody > h3:nth-child(11)") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Next page button", priority = 8)
	public void page2Button() throws Exception {

		WebElement page2Button = driver.findElement(By.cssSelector("span.next > a:nth-child(1)"));

		Actions action = new Actions(driver);
		action.moveToElement(page2Button).build().perform();

		driver.findElement(By.cssSelector("span.next > a:nth-child(1)")).click();
	}

	// ---------------------------- Best cameras for sports and action guide - Page 2: Nikon D5 Guide -------------------------------------

	@Test(description = "Scrolling to the Nikon D5 Guide headline", priority = 9)
	public void nikonD5Guide() throws Exception {

		WebElement nikonD5 = driver.findElement(By.cssSelector(".articleBody > h2:nth-child(1)"));

		driver.findElement(By.cssSelector(".articleBody > h2:nth-child(1)"));  // *** Scrolling to the Nikon D5 guide headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nikonD5);
		Reports.report("Scrolled to Element " + By.cssSelector(".articleBody > h2:nth-child(1)") + " (" + By.cssSelector(".articleBody > h2:nth-child(1)") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Scrolling to the Nikon D5 Feature Quote", priority = 10)
	public void nikonD5FeatureQuote() throws Exception {

		WebElement nikonD5FeatureQuote = driver.findElement(By.cssSelector(".pullQuote"));

		driver.findElement(By.cssSelector(".pullQuote"));  // *** Scrolling to the Nikon D5 Feature Quote ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nikonD5FeatureQuote);
		Reports.report("Scrolled to Element " + By.cssSelector(".pullQuote") + " (" + By.cssSelector(".pullQuote") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Next page button", priority = 11)
	public void page3Button() throws Exception {

		WebElement page3Button = driver.findElement(By.cssSelector("span.next > a:nth-child(1)"));

		Actions action = new Actions(driver);
		action.moveToElement(page3Button).build().perform();

		driver.findElement(By.cssSelector("span.next > a:nth-child(1)")).click();
	}

	// ---------------------------- Best cameras for sports and action guide - Page 3: Nikon D500 Guide -----------------------------------

	@Test(description = "Scrolling to the Nikon D500 Guide headline", priority = 12)
	public void nikonD500Guide() throws Exception {

		WebElement nikonD500Guide = driver.findElement(By.cssSelector(".articleHeader > h1:nth-child(2)"));

		driver.findElement(By.cssSelector(".articleHeader > h1:nth-child(2)"));  // *** Scrolling to the Nikon D500 guide headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nikonD500Guide);
		Reports.report("Scrolled to Element " + By.cssSelector(".articleHeader > h1:nth-child(2)") + " (" + By.cssSelector(".articleHeader > h1:nth-child(2)") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Scrolling to the Nikon D500 Feature Quote", priority = 13)
	public void nikonD500FeatureQuote() throws Exception {

		WebElement nikonD500FeatureQuote = driver.findElement(By.cssSelector(".pullQuote"));

		driver.findElement(By.cssSelector(".pullQuote"));  // *** Scrolling to the Nikon D500 Feature Quote ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nikonD500FeatureQuote);
		Reports.report("Scrolled to Element " + By.cssSelector(".pullQuote") + " (" + By.cssSelector(".pullQuote") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Next page button", priority = 14)
	public void page4Button() throws Exception {

		WebElement page4Button = driver.findElement(By.cssSelector("span.next > a:nth-child(1)"));

		Actions action = new Actions(driver);
		action.moveToElement(page4Button).build().perform();

		driver.findElement(By.cssSelector("span.next > a:nth-child(1)")).click();
	}

	// ---------------------------- Best cameras for sports and action guide - Page 4: Canon EOS 1DX Mark II Guide ------------------------

	@Test(description = "Scrolling to the Canon EOS 1DX Mark II Guide headline", priority = 15)
	public void canon1DXGuide() throws Exception {

		WebElement canon1DXGuide = driver.findElement(By.cssSelector(".articleBody > h2:nth-child(1)"));

		driver.findElement(By.cssSelector(".articleBody > h2:nth-child(1)"));  // *** Scrolling to the Canon EOS 1DX Mark II headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", canon1DXGuide);
		Reports.report("Scrolled to Element " + By.cssSelector(".articleBody > h2:nth-child(1)") + " (" + By.cssSelector(".articleBody > h2:nth-child(1)") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Scrolling to the Canon EOS 1DX Mark II Feature Quote", priority = 16)
	public void canon1DXQuote() throws Exception {

		WebElement canon1DXQuote = driver.findElement(By.cssSelector(".pullQuote"));

		driver.findElement(By.cssSelector(".pullQuote"));  // *** Scrolling to the Canon EOS 1DX Mark II Feature Quote ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", canon1DXQuote);
		Reports.report("Scrolled to Element " + By.cssSelector(".pullQuote") + " (" + By.cssSelector(".pullQuote") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Scrolling to the Canon EOS 1DX Mark II Sample Gallery headline", priority = 17)
	public void canon1DXSampleGallery() throws Exception {

		WebElement canon1DXSampleGallery = driver.findElement(By.cssSelector(".articleBody > p:nth-child(16) > strong:nth-child(1)"));

		driver.findElement(By.cssSelector(".articleBody > p:nth-child(16) > strong:nth-child(1)"));  // *** Scrolling to the Canon EOS 1DX Mark II Sample Gallery ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", canon1DXSampleGallery);
		Reports.report("Scrolled to Element " + By.cssSelector(".articleBody > p:nth-child(16) > strong:nth-child(1)") + " (" + By.cssSelector(".articleBody > p:nth-child(16) > strong:nth-child(1)") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Next page button", priority = 18)
	public void page5Button() throws Exception {

		WebElement page5Button = driver.findElement(By.cssSelector("span.next > a:nth-child(1)"));

		Actions action = new Actions(driver);
		action.moveToElement(page5Button).build().perform();

		driver.findElement(By.cssSelector("span.next > a:nth-child(1)")).click();
	}

	// ---------------------------- Best cameras for sports and action guide - Page 5: Fujifilm X-T3 Guide ------------------------

	@Test(description = "Scrolling to the Fujifilm X-T3 Guide headline", priority = 19)
	public void fujifilmXT3Guide() throws Exception {

		WebElement fujifilmXT3Guide = driver.findElement(By.cssSelector(".articleHeader > h1:nth-child(2)"));

		driver.findElement(By.cssSelector(".articleHeader > h1:nth-child(2)"));  // *** Scrolling to the Fujifilm X-T3 Guide headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", fujifilmXT3Guide);
		Reports.report("Scrolled to Element " + By.cssSelector(".articleHeader > h1:nth-child(2)") + " (" + By.cssSelector(".articleHeader > h1:nth-child(2)") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Scrolling to the Fujifilm X-T3 Feature Quote", priority = 20)
	public void fujifilmXT3Quote() throws Exception {

		WebElement fujifilmXT3Quote = driver.findElement(By.cssSelector(".pullQuote"));

		driver.findElement(By.cssSelector(".pullQuote"));  // *** Scrolling to the Fujifilm X-T3 Feature Quote ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", fujifilmXT3Quote);
		Reports.report("Scrolled to Element " + By.cssSelector(".pullQuote") + " (" + By.cssSelector(".pullQuote") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Next page button", priority = 21)
	public void page6Button() throws Exception {

		WebElement page6Button = driver.findElement(By.cssSelector("span.next > a:nth-child(1)"));

		Actions action = new Actions(driver);
		action.moveToElement(page6Button).build().perform();

		driver.findElement(By.cssSelector("span.next > a:nth-child(1)")).click();
	}

	// ---------------------------- Best cameras for sports and action guide - Page 6: Olympus OM-D E-M1 Mark II Guide ------------------------

	@Test(description = "Scrolling to the Olympus OM-D E-M1 Mark II Guide headline", priority = 22)
	public void olympusOM_D_E_M1_Mark_IIGuide() throws Exception {

		WebElement olympusOM_D_E_M1_Mark_IIGuide = driver.findElement(By.cssSelector(".articleBody > h2:nth-child(1)"));

		driver.findElement(By.cssSelector(".articleBody > h2:nth-child(1)"));  // *** Scrolling to the Olympus OM-D E-M1 Mark II Guide headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", olympusOM_D_E_M1_Mark_IIGuide);
		Reports.report("Scrolled to Element " + By.cssSelector(".articleBody > h2:nth-child(1)") + " (" + By.cssSelector(".articleBody > h2:nth-child(1)") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Scrolling to the Olympus OM-D E-M1 Mark II Feature Quote", priority = 23)
	public void olympusOM_D_E_M1_Mark_IIQuote() throws Exception {

		WebElement olympusOM_D_E_M1_Mark_IIQuote = driver.findElement(By.cssSelector(".pullQuote"));

		driver.findElement(By.cssSelector(".pullQuote"));  // *** Scrolling to the Olympus OM-D E-M1 Mark II Feature Quote ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", olympusOM_D_E_M1_Mark_IIQuote);
		Reports.report("Scrolled to Element " + By.cssSelector(".pullQuote") + " (" + By.cssSelector(".pullQuote") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Next page button", priority = 24)
	public void page7Button() throws Exception {

		WebElement page7Button = driver.findElement(By.cssSelector("span.next > a:nth-child(1)"));

		Actions action = new Actions(driver);
		action.moveToElement(page7Button).build().perform();

		driver.findElement(By.cssSelector("span.next > a:nth-child(1)")).click();
	}

	// ---------------------------- Best cameras for sports and action guide - Page 7: Panasonic Lumix DC-G9 Guide ------------------------

	@Test(description = "Scrolling to the Panasonic Lumix DC-G9 Guide headline", priority = 25)
	public void panasonicLumixDC_G9Guide() throws Exception {

		WebElement panasonicLumixDC_G9Guide = driver.findElement(By.cssSelector(".articleBody > h2:nth-child(1)"));

		driver.findElement(By.cssSelector(".articleBody > h2:nth-child(1)"));  // *** Scrolling to the Panasonic Lumix DC-G9 Guide headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", panasonicLumixDC_G9Guide);
		Reports.report("Scrolled to Element " + By.cssSelector(".articleBody > h2:nth-child(1)") + " (" + By.cssSelector(".articleBody > h2:nth-child(1)") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Scrolling to the Panasonic Lumix DC-G9 Feature Quote", priority = 26)
	public void panasonicLumixDC_G9Quote() throws Exception {

		WebElement panasonicLumixDC_G9Quote = driver.findElement(By.cssSelector(".pullQuote"));

		driver.findElement(By.cssSelector(".pullQuote"));  // *** Scrolling to the Panasonic Lumix DC-G9 Feature Quote ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", panasonicLumixDC_G9Quote);
		Reports.report("Scrolled to Element " + By.cssSelector(".pullQuote") + " (" + By.cssSelector(".pullQuote") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Scrolling to the Panasonic Lumix DC-G9 Sample Gallery headline", priority = 27)
	public void panasonicLumixDC_G9Gallery() throws Exception {

		WebElement panasonicLumixDC_G9Gallery = driver.findElement(By.cssSelector(".articleBody > p:nth-child(16) > strong:nth-child(1)"));

		driver.findElement(By.cssSelector(".articleBody > p:nth-child(16) > strong:nth-child(1)"));  // *** Scrolling to the Panasonic Lumix DC-G9 Sample Gallery ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", panasonicLumixDC_G9Gallery);
		Reports.report("Scrolled to Element " + By.cssSelector(".articleBody > p:nth-child(16) > strong:nth-child(1)") + " (" + By.cssSelector(".articleBody > p:nth-child(16) > strong:nth-child(1)") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Next page button", priority = 28)
	public void page8Button() throws Exception {

		WebElement page8Button = driver.findElement(By.cssSelector("span.next > a:nth-child(1)"));

		Actions action = new Actions(driver);
		action.moveToElement(page8Button).build().perform();

		driver.findElement(By.cssSelector("span.next > a:nth-child(1)")).click();
	}

	// ---------------------------- Best cameras for sports and action guide - Page 8: Sony a7 III Guide ------------------------

	@Test(description = "Scrolling to the Sony a7 III Guide headline", priority = 29)
	public void sony_a7_IIIGuide() throws Exception {

		WebElement sony_a7_IIIGuide = driver.findElement(By.cssSelector(".articleBody > h2:nth-child(1)"));

		driver.findElement(By.cssSelector(".articleBody > h2:nth-child(1)"));  // *** Scrolling to the Sony a7 III Guide headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sony_a7_IIIGuide);
		Reports.report("Scrolled to Element " + By.cssSelector(".articleBody > h2:nth-child(1)") + " (" + By.cssSelector(".articleBody > h2:nth-child(1)") + ")");

		Thread.sleep(5000);
	}

	@Test(description = "Scrolling to the Sony a7 III Feature Quote", priority = 30)
	public void sony_a7_IIIQuote() throws Exception {

		WebElement sony_a7_IIIQuote = driver.findElement(By.cssSelector(".pullQuote"));

		driver.findElement(By.cssSelector(".pullQuote"));  // *** Scrolling to the Sony a7 III Feature Quote ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sony_a7_IIIQuote);
		Reports.report("Scrolled to Element " + By.cssSelector(".pullQuote") + " (" + By.cssSelector(".pullQuote") + ")");

		Thread.sleep(5000);
	}


	@Test(description = "Next page button", priority = 31)
	public void page9Button() throws Exception {

		WebElement page9Button = driver.findElement(By.cssSelector("span.next > a:nth-child(1)"));

		Actions action = new Actions(driver);
		action.moveToElement(page9Button).build().perform();

		driver.findElement(By.cssSelector("span.next > a:nth-child(1)")).click();
	}
}


