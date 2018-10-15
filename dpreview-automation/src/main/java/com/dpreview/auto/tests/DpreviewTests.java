package com.dpreview.auto.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.dpreview.auto.infra.config.MainConfig;
import com.dpreview.auto.infra.pages.DpreviewHomePage;
import com.dpreview.auto.infra.pages.DpreviewSearchResultsPage;

public class DpreviewTests extends BaseTest {

	@Test
	public void searchFromHomePage() {

		browseToUrl(MainConfig.baseUrl);

		String searchString = "DSLR";

		DpreviewHomePage dpreviewHomePage = new DpreviewHomePage(driver);
		dpreviewHomePage.writeToSearchbox(searchString);

		DpreviewSearchResultsPage dpreviewSearchResultsPage = dpreviewHomePage.clickGoButton();

		String searchResultsTitle = dpreviewSearchResultsPage.getSearchResultTitle(0);

		System.out.println(searchResultsTitle);
		Assert.assertTrue(searchResultsTitle.contains(searchString), "Expecting to see '" + searchString + "' in first result");

	}

}
