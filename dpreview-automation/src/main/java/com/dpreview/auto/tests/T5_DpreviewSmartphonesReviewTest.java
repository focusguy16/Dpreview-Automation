package com.dpreview.auto.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.dpreview.auto.infra.config.MainConfig;
import com.dpreview.auto.infra.pages.DpreviewLoginPage;
import com.dpreview.auto.infra.pages.DpreviewSignInPage;
import com.dpreview.auto.infra.pages.DpreviewSmartphoneReviewsPage;
import com.dpreview.auto.infra.reports.Reports;
import com.dpreview.auto.infra.pages.DpreviewHomePage;

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
		dpreviewLoginPage.writeToEmailInput(inputEmail);

		Thread.sleep(1000);

		dpreviewLoginPage.writeToPasswordInput(inputPassword);

		Thread.sleep(1000);

		dpreviewLoginPage.keepMeSignedInCheckbox();

		Thread.sleep(1000);

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
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//*[@class='dropdownMenuContent']//*[text()='Smartphone reviews']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 5000);
		wait.until(ExpectedConditions.urlContains("mobilephones"));
		
		driver.navigate().to("https://www.dpreview.com/reviews?category=mobilephones");
	}

	// --------------------- Testing the index order opening in the page ---------------------------------------------------------------

	@Test(description = "Ordering the items in the page", priority = 3)
	public void orderBy() {

		WebElement orderBy = driver.findElement(By.cssSelector("#reviewIndexOrder"));

		Actions action = new Actions(driver);
		action.moveToElement(orderBy).build().perform();
		
		driver.findElement(By.cssSelector("#reviewIndexOrder")).click();
		
		Select index = new Select(orderBy);
		index.selectByIndex(2);

		WebElement firstIndex = index.getFirstSelectedOption();
		System.out.println("First element = " + firstIndex.getText());

		List<WebElement> listOptions = index.getOptions();
		for (WebElement webElement : listOptions) {
			System.out.println("options - " + webElement.getText());
		}
		
	}
	
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
		
		driver.findElement(By.xpath("//*[@class='name']//*[text()='LG V30 Review']"));  // *** Scrolling the page to the LG V30 element ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lgV30);
        Reports.report("Scrolled to Element " + By.xpath("//*[@class='name']//*[text()='LG V30 Review']") + " (" + By.xpath("//*[@class='name']//*[text()='LG V30 Review']") + ")");
        
        Thread.sleep(5000);
        
        // WebDriverWait wait = new WebDriverWait(driver, 5000);
		// wait.wait(1000, 0);
        
        driver.findElement(By.xpath("//*[@class='name']//*[text()='Huawei P9 Review']"));  // *** Scrolling the page to the Huawei P9 Review element ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", huawei_P9);
        Reports.report("Scrolled to Element " + By.xpath("//*[@class='name']//*[text()='Huawei P9 Review']") + " (" + By.xpath("//*[@class='name']//*[text()='Huawei P9 Review']") + ")");
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//*[@class='name']//*[text()='Sony Xperia M5 Review']"));  // *** Scrolling the page to the Sony Xperia M5 Review element ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sonyXperia_M5);
        Reports.report("Scrolled to Element " + By.xpath("//*[@class='name']//*[text()='Sony Xperia M5 Review']") + " (" + By.xpath("//*[@class='name']//*[text()='Sony Xperia M5 Review']") + ")");
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//*[@class='name']//*[text()='Apple iPhone 6s Review']"));  // *** Scrolling the page to the Apple iPhone 6s Review element ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", appleiPhone_6s);
        Reports.report("Scrolled to Element " + By.xpath("//*[@class='name']//*[text()='Apple iPhone 6s Review']") + " (" + By.xpath("//*[@class='name']//*[text()='Apple iPhone 6s Review']") + ")");
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//*[@class='name']//*[text()='HTC One M9 Review']"));  // *** Scrolling the page to the HTC One M9 Review element ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", htcOne_M9);
        Reports.report("Scrolled to Element " + By.xpath("//*[@class='name']//*[text()='HTC One M9 Review']") + " (" + By.xpath("//*[@class='name']//*[text()='HTC One M9 Review']") + ")");
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//*[@class='name']//*[text()='Amazon Fire Phone Review']"));  // *** Scrolling the page to the Amazon Fire Phone Review element ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", amazonFirePhone);
        Reports.report("Scrolled to Element " + By.xpath("//*[@class='name']//*[text()='Amazon Fire Phone Review']") + " (" + By.xpath("//*[@class='name']//*[text()='Amazon Fire Phone Review']") + ")");
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//*[@class='name']//*[text()='Nokia Lumia 1520 Review']"));  // *** Scrolling the page to the Nokia Lumia 1520 Review element ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nokiaLumia1520);
        Reports.report("Scrolled to Element " + By.xpath("//*[@class='name']//*[text()='Nokia Lumia 1520 Review']") + " (" + By.xpath("//*[@class='name']//*[text()='Nokia Lumia 1520 Review']") + ")");
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//*[@class='name']//*[text()='Samsung Galaxy S4 Review']"));  // *** Scrolling the page to the Samsung Galaxy S4 Review element ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", samsungGalaxy_S4);
        Reports.report("Scrolled to Element " + By.xpath("//*[@class='name']//*[text()='Samsung Galaxy S4 Review']") + " (" + By.xpath("//*[@class='name']//*[text()='Samsung Galaxy S4 Review']") + ")");
        
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//*[@class='name']//*[text()='Nokia Lumia 920 Review']"));  // *** Scrolling the page to the Nokia Lumia 920 Review Review element ***
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", nokiaLumia_920);
        Reports.report("Scrolled to Element " + By.xpath("//*[@class='name']//*[text()='Nokia Lumia 920 Review']") + " (" + By.xpath("//*[@class='name']//*[text()='Nokia Lumia 920 Review']") + ")");
	}
}
