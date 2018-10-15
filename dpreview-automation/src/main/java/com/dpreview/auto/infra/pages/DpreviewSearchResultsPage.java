package com.dpreview.auto.infra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dpreview.auto.infra.web.By2;

public class DpreviewSearchResultsPage extends AbstractPage {
	
	private static final By2 dpreviewCamerasLink = new By2("Dpreview Cameras Link", By.cssSelector("a.mainItem:nth-child(7) > span:nth-child(1)"));
	private static final By2 dpreviewLensesLink = new By2("Dpreview Lenses Link", By.cssSelector("a.mainItem:nth-child(8) > span:nth-child(1)"));
	private static final By2 dpreviewPhonesLink = new By2("Dpreview Phones Link", By.cssSelector("a.mainItem:nth-child(9) > span:nth-child(1)"));

	public DpreviewSearchResultsPage(String pageName, WebDriver driver, By2 pageUniqueElements) {
		super("Dpreview Search Results Page", driver, pageUniqueElements);
	}

	public String getSearchResultTitle(int resultNumber) {

		By2 searchResultItem = new By2("Title of search result item #" + resultNumber, By.cssSelector("li#result_" + resultNumber + " h2"));
		String resultTitle = bot.getElementText(searchResultItem);
		return resultTitle;
	}
	
	public DpreviewProductPage clickSearchResultTitle(int resultNumber) {
		
		By2 searchResultItem = new By2("Title of search result item #" + resultNumber, By.cssSelector("li#result_" + resultNumber + " h2"));
		bot.click(searchResultItem);
		return new DpreviewProductPage(driver);
	}
	
	public void clickDpreviewCamerasLink() {
		bot.click(dpreviewCamerasLink);
	}
	
	public void clickDpreviewLensesLink() {
		bot.click(dpreviewLensesLink);
	}
	
	public void clickDpreviewPhonesLink() {
		bot.click(dpreviewPhonesLink);
	}
}
