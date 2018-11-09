package com.dpreview.auto.infra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dpreview.auto.infra.web.By2;

public class DpreviewHomePage extends AbstractPage {

	private static final By2 searchBox = new By2("Search box", By.className("searchBox"));
	private static final By2 goButton = new By2("'GO' button", By.className("submitBtn"));
	private static final By2 lightMode = new By2("Light mode", By.cssSelector("span.option:nth-child(1)"));
	private static final By2 darkMode = new By2("Dark mode", By.cssSelector("span.option:nth-child(2)"));
	private static final By2 signinButton = new By2("'Sign in button'", By.id("signInSubmit"));
	private static final By2 reviewsLink = new By2("'Reviews' link", By.xpath("//*[@class='mainItem']//*[text()='Reviews']"));

	public DpreviewHomePage(WebDriver driver) {
		super("DPReview Home Page", driver, searchBox, goButton, lightMode, darkMode);
	}

	public void writeToSearchbox(String searchString) {

		bot.writeToElement(searchBox, searchString);
	}

	public DpreviewSearchResultsPage clickGoButton() {
		
		bot.click(goButton);
		return new DpreviewSearchResultsPage(pageName, driver, null);
	}
	
	public void ReadingInLightMode() {
		
		bot.click(lightMode);
		
		if (lightMode == darkMode  ) {
			
			System.out.println("The reading mode is in Dark mode");
		}
	}
	
	public void ReadingInDarkMode() {
		
		bot.click(darkMode);
		
		if (darkMode == lightMode) {
			
			System.out.println("The reading mode is in Light mode");
		}
	}
	
	public DpreviewSignInPage clickSigninButton() {
		bot.click(signinButton);
		return new DpreviewSignInPage(driver);
	}
	
	public DpreviewSmartphoneReviewsPage hoverOverReviewsLink() {
		bot.hoverOverElement(reviewsLink);
		return null;
	}
}
