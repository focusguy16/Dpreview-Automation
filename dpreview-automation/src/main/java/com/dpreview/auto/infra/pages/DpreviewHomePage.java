package com.dpreview.auto.infra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dpreview.auto.infra.reports.Reports;
import com.dpreview.auto.infra.web.By2;

public class DpreviewHomePage extends AbstractPage {

	private static final By2 searchBox = new By2("Search box", By.className("searchBox"));
	private static final By2 goButton = new By2("'GO' button", By.className("submitBtn"));
	private static final By2 lightMode = new By2("Light mode", By.cssSelector("span.option:nth-child(1)"));
	private static final By2 darkMode = new By2("Dark mode", By.cssSelector("span.option:nth-child(2)"));
	private static final By2 registrationLink = new By2("'Registration' link", By.xpath("//*[@class='siteHeader']//*[@class='userTools']//*[text()='Register']"));
	private static final By2 loginLink = new By2("'Login' link", By.cssSelector(".userTools > a:nth-child(1)"));
	private static final By2 signinButton = new By2("'Sign in button'", By.id("signInSubmit"));
	private static final By2 userMenu = new By2("'User Menu' button", By.id("mainUserBox"));
	private static final By2 userSettings = new By2("'User Settings' button", By.cssSelector("div.group:nth-child(1) > a:nth-child(2)"));
	private static final By2 reviewsLink = new By2("'Reviews' link", By.xpath("//*[@class='mainItem']//*[text()='Reviews']"));
	private static final By2 buyingGuidesLink = new By2("'Buying Guides' link", By.xpath("//*[@class='mainItem']//*[text()='Buying Guides']"));


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

			Reports.report("The reading mode is in Dark mode");
		}
	}

	public void ReadingInDarkMode() {
		bot.click(darkMode);

		if (darkMode == lightMode) {

			Reports.report("The reading mode is in Light mode"); 
		}
	}
	
	public DpreviewRegistrationPage registrationLink() {
		bot.click(registrationLink);
		return new DpreviewRegistrationPage(driver);
	}
	
	public DpreviewHomePage loginLink() {
		bot.click(loginLink);
		return new DpreviewHomePage(driver);
	}

	public DpreviewSignInPage clickSigninButton() {
		bot.click(signinButton);
		return new DpreviewSignInPage(driver);
	}
	
	public void userMenu() {
		bot.click(userMenu);
	}
	
	public void userSettings() {
		bot.click(userSettings);
	}

	public DpreviewSmartphoneReviewsPage hoverOverReviewsLink() {
		bot.hoverOverElement(reviewsLink);
		return null;
	}

	public DpreviewBuyingGuidesPage hoverOverBuyingGuidesLink() {
		bot.hoverOverElement(buyingGuidesLink);
		return null;
	}
}
