package com.dpreview.auto.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;

import com.dpreview.auto.infra.config.MainConfig;
import com.dpreview.auto.infra.pages.DpreviewLoginPage;
import com.dpreview.auto.infra.pages.DpreviewSmartphoneReviewsPage;
import com.dpreview.auto.infra.reports.Reports;
import com.dpreview.auto.infra.pages.DpreviewHomePage;

/*
 * --------------------------------------------------------------------------------------------------------------------------------------------------------------
 * ---------------------------- This test is intended to check and verify the process of reviewing smart phones page by page ------------------------------------ 
 * -------------------------------------------------------------------------------------------------------------------------------------------------------------
 */

public class T5_DpreviewSmartphonesReviewTest extends BaseTest {

	// ------------------------- Testing the validation of the Login link ------------------------------------------------------------------

	@Test(description = "Testing the validation of the Login link", priority = 0)
	public void loginLinkTest() {

		browseToUrl(MainConfig.baseUrl);

		WebElement loginLink = driver.findElement(By.cssSelector(".userTools > a:nth-child(1)"));

		Actions action = new Actions(driver);
		action.moveToElement(loginLink).build().perform();

		driver.findElement(By.cssSelector(".userTools > a:nth-child(1)")).click();
	}

	// --------------------- Testing the valid login process with valid details --------------------------------------------------------

	@Test(description = "Typing the login details", priority = 1)
	public void loginDetails() throws Exception {

		String inputEmail = "eagle15e2000@yahoo.com";
		String inputPassword = "JazzMusic73!";

		DpreviewLoginPage dpreviewLoginPage = new DpreviewLoginPage(driver);
		dpreviewLoginPage.writeEmail(inputEmail);

		dpreviewLoginPage.writePassword(inputPassword);

		dpreviewLoginPage.keepMeSignedInCheckbox();

		dpreviewLoginPage.clickSigninButton(); 
	}

	// --------------------- Testing the Reviews Menu appearance by hovering the Reviews element ---------------------------------------

	@Test(description = "Hovering over the Reviews element", priority = 2)
	public void hoveringReviewsElement() {

		DpreviewHomePage dpreviewHomePage = new DpreviewHomePage(driver);
		dpreviewHomePage.hoverOverReviewsLink();

		DpreviewSmartphoneReviewsPage dpreviewSmartphoneReviewsPage = dpreviewHomePage.hoverOverReviewsLink();
	}

	// --------------------- Testing the Smart phone reviews link from the Reviews menu ------------------------------------------------

	@Test(description = "Selecting the Smartphone reviews link from the Reviews menu", priority = 3)
	public void selectingSmartphoneReviews() {

		WebElement smartphoneReviews = driver.findElement(By.xpath("//*[@class='dropdownMenuContent']//*[text()='Smartphone reviews']"));

		Actions action = new Actions(driver);
		action.moveToElement(smartphoneReviews).build().perform();

		driver.findElement(By.xpath("//*[@class='dropdownMenuContent']//*[text()='Smartphone reviews']")).isSelected();
		
		driver.findElement(By.xpath("//*[@class='dropdownMenuContent']//*[text()='Smartphone reviews']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 3000);
		wait.until(ExpectedConditions.urlContains("mobilephones"));

		driver.navigate().to("https://www.dpreview.com/reviews?category=mobilephones");
	}
	
	// --------------------- Testing and reviewing the Smart phones page ------------------------------------------------

	@Test(description = "Scrolling the page of the smart phones", priority = 4)
	public void scrollPage() throws Exception {

		WebElement lgV30 = driver.findElement(By.xpath("//*[@class='name']//*[text()='LG V30 Review']"));
		WebElement huawei_P9 = driver.findElement(By.xpath("//*[@class='name']//*[text()='Huawei P9 Review']"));
		WebElement sonyXperia_M5 = driver.findElement(By.xpath("//*[@class='name']//*[text()='Sony Xperia M5 Review']"));
		WebElement appleiPhone_6s = driver.findElement(By.xpath("//*[@class='name']//*[text()='Apple iPhone 6s Review']"));
		WebElement htcOne_M9 = driver.findElement(By.xpath("//*[@class='name']//*[text()='HTC One M9 Review']"));
		WebElement amazonFirePhone = driver.findElement(By.xpath("//*[@class='name']//*[text()='Amazon Fire Phone Review']"));
		WebElement nokiaLumia1520 = driver.findElement(By.xpath("//*[@class='name']//*[text()='Nokia Lumia 1520 Review']"));
		WebElement samsungGalaxy_S4 = driver.findElement(By.xpath("//*[@class='name']//*[text()='Samsung Galaxy S4 Review']"));
		WebElement nokiaLumia_920 = driver.findElement(By.xpath("//*[@class='name']//*[text()='Nokia Lumia 920 Review']"));
		WebElement reviewsAndPreviews = driver.findElement(By.xpath("//*[@id='mainContent']//*[text()='Reviews and previews']"));

		driver.findElement(By.xpath("//*[@class='name']//*[text()='LG V30 Review']"));  // *** Scrolling the page to the LG V30 element ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lgV30);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='name']//*[text()='LG V30 Review']") + " (" + By.xpath("//*[@class='name']//*[text()='LG V30 Review']") + ")");

		

		driver.findElement(By.xpath("//*[@class='name']//*[text()='Huawei P9 Review']"));  // *** Scrolling the page to the Huawei P9 Review element ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", huawei_P9);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='name']//*[text()='Huawei P9 Review']") + " (" + By.xpath("//*[@class='name']//*[text()='Huawei P9 Review']") + ")");

		

		driver.findElement(By.xpath("//*[@class='name']//*[text()='Sony Xperia M5 Review']"));  // *** Scrolling the page to the Sony Xperia M5 Review element ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sonyXperia_M5);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='name']//*[text()='Sony Xperia M5 Review']") + " (" + By.xpath("//*[@class='name']//*[text()='Sony Xperia M5 Review']") + ")");

		

		driver.findElement(By.xpath("//*[@class='name']//*[text()='Apple iPhone 6s Review']"));  // *** Scrolling the page to the Apple iPhone 6s Review element ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", appleiPhone_6s);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='name']//*[text()='Apple iPhone 6s Review']") + " (" + By.xpath("//*[@class='name']//*[text()='Apple iPhone 6s Review']") + ")");

		

		driver.findElement(By.xpath("//*[@class='name']//*[text()='HTC One M9 Review']"));  // *** Scrolling the page to the HTC One M9 Review element ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", htcOne_M9);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='name']//*[text()='HTC One M9 Review']") + " (" + By.xpath("//*[@class='name']//*[text()='HTC One M9 Review']") + ")");

		

		driver.findElement(By.xpath("//*[@class='name']//*[text()='Amazon Fire Phone Review']"));  // *** Scrolling the page to the Amazon Fire Phone Review element ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", amazonFirePhone);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='name']//*[text()='Amazon Fire Phone Review']") + " (" + By.xpath("//*[@class='name']//*[text()='Amazon Fire Phone Review']") + ")");

		

		driver.findElement(By.xpath("//*[@class='name']//*[text()='Nokia Lumia 1520 Review']"));  // *** Scrolling the page to the Nokia Lumia 1520 Review element ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nokiaLumia1520);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='name']//*[text()='Nokia Lumia 1520 Review']") + " (" + By.xpath("//*[@class='name']//*[text()='Nokia Lumia 1520 Review']") + ")");

		

		driver.findElement(By.xpath("//*[@class='name']//*[text()='Samsung Galaxy S4 Review']"));  // *** Scrolling the page to the Samsung Galaxy S4 Review element ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", samsungGalaxy_S4);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='name']//*[text()='Samsung Galaxy S4 Review']") + " (" + By.xpath("//*[@class='name']//*[text()='Samsung Galaxy S4 Review']") + ")");

		

		driver.findElement(By.xpath("//*[@class='name']//*[text()='Nokia Lumia 920 Review']"));  // *** Scrolling the page to the Nokia Lumia 920 Review Review element ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nokiaLumia_920);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='name']//*[text()='Nokia Lumia 920 Review']") + " (" + By.xpath("//*[@class='name']//*[text()='Nokia Lumia 920 Review']") + ")");

		

		driver.findElement(By.xpath("//*[@id='mainContent']//*[text()='Reviews and previews']"));  // *** Scrolling to the Head of the page element ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", reviewsAndPreviews);
		Reports.report("Scrolled to Element " + By.xpath("//*[@id='mainContent']//*[text()='Reviews and previews']") + " (" + By.xpath("//*[@id='mainContent']//*[text()='Reviews and previews']") + ")");
	}

	
	// --------------------- Testing the selection of Apple iPhone X smart phone ------------------------------------------------
	
	@Test(description = "iPhone X element", priority = 5)
	public void appleiPhoneXElement() {

		WebElement appleiPhoneX = driver.findElement(By.xpath("//*[@class='name']//*[text()='Apple iPhone X Review']"));

		Actions action = new Actions(driver);
		action.moveToElement(appleiPhoneX).build().perform();

		driver.findElement(By.xpath("//*[@class='name']//*[text()='Apple iPhone X Review']")).click();
		
		driver.get("https://www.dpreview.com/reviews/iphone-x-review");
	}

	
	// --------------------- Testing the iPhone X : page 1 review ---------------------------------------------------------------
	
	@Test(description = "iPhone X review - page 1:Introduction", priority = 6)
	public void appleiPhoneXReviewPage1() throws Exception {

		WebElement appleiPhoneXimage = driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Key Photographic / Video Specifications']"));
		WebElement nextPage = driver.findElement(By.cssSelector("span.next > a:nth-child(1)"));

		driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Key Photographic / Video Specifications']"));  // *** Scrolling to the key features of the iPhone X  ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", appleiPhoneXimage);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='articleBody']//*[text()='Key Photographic / Video Specifications']") + " (" + By.xpath("//*[@class='articleBody']//*[text()='Key Photographic / Video Specifications']") + ")");

		Actions action = new Actions(driver);
		action.moveToElement(nextPage).build().perform();

		driver.findElement(By.cssSelector("span.next > a:nth-child(1)")).click();
	}

	
	// --------------------- Testing the iPhone X : page 2 review ---------------------------------------------------------------
	
	@Test(description = "iPhone X review - page 2:Body and design", priority = 7)
	public void appleiPhoneXReviewPage2() throws Exception {

		WebElement handlingAndWorkflow = driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Handling and workflow']"));
		WebElement lightroomCC = driver.findElement(By.cssSelector("td.imageSwapper:nth-child(1) > p:nth-child(1)"));
		WebElement nextPage = driver.findElement(By.cssSelector("span.next > a:nth-child(1)"));

		driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Handling and workflow']"));  // *** Scrolling to the Handling and workflow headline   ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", handlingAndWorkflow);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='articleBody']//*[text()='Handling and workflow']") + " (" + By.xpath("//*[@class='articleBody']//*[text()='Handling and workflow']") + ")");


		driver.findElement(By.cssSelector("td.imageSwapper:nth-child(1) > p:nth-child(1)"));  // *** Scrolling to the Lightroom CC image   ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lightroomCC);
		Reports.report("Scrolled to Element " + By.cssSelector("td.imageSwapper:nth-child(1) > p:nth-child(1)") + " (" + By.cssSelector("td.imageSwapper:nth-child(1) > p:nth-child(1)") + ")");

		Actions action = new Actions(driver);
		action.moveToElement(nextPage).build().perform();

		driver.findElement(By.cssSelector("span.next > a:nth-child(1)")).click();
	}

	
	// --------------------- Testing the iPhone X : page 3 review ---------------------------------------------------------------
	
	@Test(description = "iPhone X review - page 3:Features", priority = 8)
	public void appleiPhoneXReviewPage3() throws Exception {

		WebElement portraitMode = driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Portrait mode']"));
		WebElement standardPortraitMode = driver.findElement(By.cssSelector("td.imageSwapper:nth-child(1)"));
		WebElement panoramaMode = driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Panorama mode']"));
		WebElement hdrImages = driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='HDR images']"));
		WebElement dngMode = driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='DNG mode']"));
		WebElement waterAndDustResistance = driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='IP67 water and dust resistance rating']"));
		WebElement hdrDisplay = driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='HDR display and P3 color']"));
		WebElement nextPage = driver.findElement(By.cssSelector("span.next > a:nth-child(1)"));

		driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Portrait mode']"));  // *** Scrolling to the Portrait mode headline   ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", portraitMode);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='articleBody']//*[text()='Portrait mode']") + " (" + By.xpath("//*[@class='articleBody']//*[text()='Portrait mode']") + ")");


		driver.findElement(By.cssSelector("td.imageSwapper:nth-child(1)"));  // *** Scrolling to the standard portrait mode headline   ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", standardPortraitMode);
		Reports.report("Scrolled to Element " + By.cssSelector("td.imageSwapper:nth-child(1)") + " (" + By.cssSelector("td.imageSwapper:nth-child(1)") + ")");


		driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Panorama mode']"));  // *** Scrolling to the Panorama mode headline   ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", panoramaMode);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='articleBody']//*[text()='Panorama mode']") + " (" + By.xpath("//*[@class='articleBody']//*[text()='Panorama mode']") + ")");


		driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='HDR images']"));  // *** Scrolling to the HDR images headline   ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", hdrImages);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='articleBody']//*[text()='HDR images']") + " (" + By.xpath("//*[@class='articleBody']//*[text()='HDR images']") + ")");


		driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='DNG mode']"));  // *** Scrolling to the DNG mode headline   ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dngMode);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='articleBody']//*[text()='DNG mode']") + " (" + By.xpath("//*[@class='articleBody']//*[text()='DNG mode']") + ")");


		driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='IP67 water and dust resistance rating']"));  // *** Scrolling to the IP67 water and dust resistance headline   ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", waterAndDustResistance);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='articleBody']//*[text()='IP67 water and dust resistance rating']") + " (" + By.xpath("//*[@class='articleBody']//*[text()='IP67 water and dust resistance rating']") + ")");


		driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='HDR display and P3 color']"));  // *** Scrolling to the HDR display mode   ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", hdrDisplay);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='articleBody']//*[text()='HDR display and P3 color']") + " (" + By.xpath("//*[@class='articleBody']//*[text()='HDR display and P3 color']") + ")");

		Actions action = new Actions(driver);
		action.moveToElement(nextPage).build().perform();

		driver.findElement(By.cssSelector("span.next > a:nth-child(1)")).click();	
	}

	
	// --------------------- Testing the iPhone X : page 4 review ---------------------------------------------------------------
	
	@Test(description = "iPhone X review - page 4:Image quality", priority = 9)
	public void appleiPhoneXReviewPage4() throws Exception {

		WebElement imageQuality = driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Image quality']"));
		WebElement jpegImageQuality = driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='JPEG image quality - studio scene']"));
		WebElement dayLight = driver.findElement(By.cssSelector(".active > p:nth-child(1)"));
		WebElement daylightImageQuality = driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Daylight image quality']"));
		WebElement hdr = driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='HDR']"));
		WebElement portraitMode = driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Portrait mode']"));
		WebElement featuresSection = driver.findElement(By.cssSelector(".articleBody > p:nth-child(24) > a:nth-child(1)"));
		WebElement selfies = driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Selfies']"));
		WebElement lowLight = driver.findElement(By.id("lowlight"));
		WebElement rawCapture = driver.findElement(By.cssSelector(".articleBody > h3:nth-child(42)"));
		WebElement nextPage = driver.findElement(By.cssSelector("span.next > a:nth-child(1)"));
		
		driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Image quality']"));  // *** Scrolling to the Image quality headline   ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", imageQuality);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='articleBody']//*[text()='Image quality']") + " (" + By.xpath("//*[@class='articleBody']//*[text()='Image quality']") + ")");
		
		
		driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='JPEG image quality - studio scene']"));  // *** Scrolling to the JPEG image quality headline   ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", jpegImageQuality);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='articleBody']//*[text()='JPEG image quality - studio scene']") + " (" + By.xpath("//*[@class='articleBody']//*[text()='JPEG image quality - studio scene']") + ")");
		
		
		driver.findElement(By.cssSelector(".active > p:nth-child(1)"));  // *** Scrolling to the Daylight image  ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dayLight);
		Reports.report("Scrolled to Element " + By.cssSelector(".active > p:nth-child(1)") + " (" + By.cssSelector(".active > p:nth-child(1)") + ")");
		
		
		driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Daylight image quality']"));  // *** Scrolling to the Daylight image quality headline   ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", daylightImageQuality);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='articleBody']//*[text()='Daylight image quality']") + " (" + By.xpath("//*[@class='articleBody']//*[text()='Daylight image quality']") + ")");
		
		
		driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='HDR']"));  // *** Scrolling to the HDR headline   ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", hdr);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='articleBody']//*[text()='HDR']") + " (" + By.xpath("//*[@class='articleBody']//*[text()='HDR']") + ")");
		
		
		driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Portrait mode']"));  // *** Scrolling to the Portrait mode headline   ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", portraitMode);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='articleBody']//*[text()='Portrait mode']") + " (" + By.xpath("//*[@class='articleBody']//*[text()='Portrait mode']") + ")");
		
		
		driver.findElement(By.cssSelector(".articleBody > p:nth-child(24) > a:nth-child(1)"));  // *** Scrolling to the Features' section link   ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", featuresSection);
		Reports.report("Scrolled to Element " + By.cssSelector(".articleBody > p:nth-child(24) > a:nth-child(1)") + " (" + By.cssSelector(".articleBody > p:nth-child(24) > a:nth-child(1)") + ")");
		
		
		driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Selfies']"));  // *** Scrolling to the Selfies headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", selfies);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='articleBody']//*[text()='Selfies']") + " (" + By.xpath("//*[@class='articleBody']//*[text()='Selfies']") + ")");
		
		
		driver.findElement(By.id("lowlight"));  // *** Scrolling to the Low light headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lowLight);
		Reports.report("Scrolled to Element " + By.id("lowlight") + " (" + By.id("lowlight") + ")");
		
		
		driver.findElement(By.cssSelector(".articleBody > h3:nth-child(42)"));  // *** Scrolling to the Raw capture headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rawCapture);
		Reports.report("Scrolled to Element " + By.cssSelector(".articleBody > h3:nth-child(42)") + " (" + By.cssSelector(".articleBody > h3:nth-child(42)") + ")");
		
		
		driver.findElement(By.cssSelector("span.next > a:nth-child(1)"));  // *** Scrolling to the Next page button ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nextPage);
		Reports.report("Scrolled to Element " + By.cssSelector("span.next > a:nth-child(1)") + " (" + By.cssSelector("span.next > a:nth-child(1)") + ")");
		
		
		Actions action = new Actions(driver);
		action.moveToElement(nextPage).build().perform();
		
		driver.findElement(By.cssSelector("span.next > a:nth-child(1)")).click();
	}

	
	// --------------------- Testing the iPhone X : page 5 review ---------------------------------------------------------------
	
	@Test(description = "iPhone X review - page 5:Video", priority = 10)
	public void appleiPhoneXReviewPage5() throws Exception {
		
		WebElement video = driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Video']"));
		WebElement inUse = driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='In use']"));
		WebElement highQualityVideo = driver.findElement(By.cssSelector("div.caption:nth-child(8) > a:nth-child(1)"));
		WebElement nextPage = driver.findElement(By.cssSelector("span.next > a:nth-child(1)"));
		
		driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Video']"));  // *** Scrolling to the Video headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", video);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='articleBody']//*[text()='Video']") + " (" + By.xpath("//*[@class='articleBody']//*[text()='Video']") + ")");
		
		
		driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='In use']"));  // *** Scrolling to the In use headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", inUse);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='articleBody']//*[text()='In use']") + " (" + By.xpath("//*[@class='articleBody']//*[text()='In use']") + ")");
		
		
		driver.findElement(By.cssSelector("div.caption:nth-child(8) > a:nth-child(1)"));  // *** Scrolling to the High quality video link ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", highQualityVideo);
		Reports.report("Scrolled to Element " + By.cssSelector("div.caption:nth-child(8) > a:nth-child(1)") + " (" + By.cssSelector("div.caption:nth-child(8) > a:nth-child(1)") + ")");
		
		Actions action = new Actions(driver);
		action.moveToElement(nextPage).build().perform();
		
		driver.findElement(By.cssSelector("span.next > a:nth-child(1)")).click();
	}

	
	// --------------------- Testing the iPhone X : page 6 review ---------------------------------------------------------------
	
	@Test(description = "iPhone X review - page 6:Conclusion", priority = 11)
	public void appleiPhoneXReviewPage6() throws Exception {
		
		WebElement conclusion = driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Conclusion']"));
		WebElement overallConclusion = driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Overall conclusion']"));
		WebElement featuresAndOperation = driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Features and operation']"));
		WebElement image4832 = driver.findElement(By.xpath("//*[@class='image']//*[@href]//*[@id='standard']"));
		WebElement imageQuality = driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Image Quality']"));
		WebElement preserveHighlights = driver.findElement(By.cssSelector(".articleBody > p:nth-child(17) > a:nth-child(2)"));
		WebElement video = driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Video']"));
		WebElement theFinalWord = driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='The final word']"));
		WebElement summary = driver.findElement(By.xpath("//*[@class='title']//*[text()='Apple iPhone X']"));
		WebElement sampleGallery = driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Sample Gallery']"));
		
		driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Conclusion']"));  // *** Scrolling to the Conclusion headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", conclusion);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='articleBody']//*[text()='Conclusion']") + " (" + By.xpath("//*[@class='articleBody']//*[text()='Conclusion']") + ")");
		
		
		driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Overall conclusion']"));  // *** Scrolling to the Overall conclusion headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", overallConclusion);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='articleBody']//*[text()='Overall conclusion']") + " (" + By.xpath("//*[@class='articleBody']//*[text()='Overall conclusion']") + ")");
		
		
		driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Features and operation']"));  // *** Scrolling to the Features and operation headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", featuresAndOperation);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='articleBody']//*[text()='Features and operation']") + " (" + By.xpath("//*[@class='articleBody']//*[text()='Features and operation']") + ")");
		
		
		driver.findElement(By.xpath("//*[@class='image']//*[@href]//*[@id='standard']"));  // *** Scrolling to image 4832 ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", image4832);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='image']//*[@href]//*[@id='standard']") + " (" + By.xpath("//*[@class='image']//*[@href]//*[@id='standard']") + ")");
		
		
		driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Image Quality']"));  // *** Scrolling to the Image quality headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", imageQuality);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='articleBody']//*[text()='Image Quality']") + " (" + By.xpath("//*[@class='articleBody']//*[text()='Image Quality']") + ")");
		
		
		driver.findElement(By.cssSelector(".articleBody > p:nth-child(17) > a:nth-child(2)"));  // *** Scrolling to the Preserve highlights link ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", preserveHighlights);
		Reports.report("Scrolled to Element " + By.cssSelector(".articleBody > p:nth-child(17) > a:nth-child(2)") + " (" + By.cssSelector(".articleBody > p:nth-child(17) > a:nth-child(2)") + ")");
		
		
		driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Video']"));  // *** Scrolling to the Video headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", video);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='articleBody']//*[text()='Video']") + " (" + By.xpath("//*[@class='articleBody']//*[text()='Video']") + ")");
		
		
		driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='The final word']"));  // *** Scrolling to the The final word headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", theFinalWord);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='articleBody']//*[text()='The final word']") + " (" + By.xpath("//*[@class='articleBody']//*[text()='The final word']") + ")");
		
		
		driver.findElement(By.xpath("//*[@class='title']//*[text()='Apple iPhone X']"));  // *** Scrolling to the the summary table ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", summary);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='title']//*[text()='Apple iPhone X']") + " (" + By.xpath("//*[@class='title']//*[text()='Apple iPhone X']") + ")");
		
		
		driver.findElement(By.xpath("//*[@class='articleBody']//*[text()='Sample Gallery']"));  // *** Scrolling to the Sample gallery headline ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sampleGallery);
		Reports.report("Scrolled to Element " + By.xpath("//*[@class='articleBody']//*[text()='Sample Gallery']") + " (" + By.xpath("//*[@class='articleBody']//*[text()='Sample Gallery']") + ")");
		
		
		driver.close();
	}
}
