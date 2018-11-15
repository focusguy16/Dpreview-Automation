package com.dpreview.auto.infra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dpreview.auto.infra.web.By2;

public class DpreviewBuyingGuidesPage extends AbstractPage {
	
	private static final By2 buyingGuides = new By2("Buying guides link", By.xpath("//*[@class='mainItem']//*[text()='Buying Guides']"));

	public DpreviewBuyingGuidesPage(WebDriver driver) {
		super("Dpreview Buying Guides", driver, buyingGuides);
	}
	
	public void buyingGuidesLink() {
		bot.hoverOverElement(buyingGuides);
	}

}
