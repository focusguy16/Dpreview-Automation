package com.dpreview.auto.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
		
		// driver.findElement(By.xpath("//*[@class='reviewsOptionsNavigation']//*[text()='Order by brand']")).isSelected();	
	}		
}
