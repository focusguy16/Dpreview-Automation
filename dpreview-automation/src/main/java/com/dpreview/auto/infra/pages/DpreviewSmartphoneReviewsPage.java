package com.dpreview.auto.infra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dpreview.auto.infra.web.By2;

public class DpreviewSmartphoneReviewsPage extends AbstractPage {
	
	private static final By2 smartphoneReviews = new By2("Smartphone link", By.xpath("//*[@class='dropdownMenuContent']//*[text()='Smartphone reviews']"));

	public DpreviewSmartphoneReviewsPage(WebDriver driver) {
		super("Dpreview Smartphone Reviews", driver, smartphoneReviews);
	}
	
	public void smartphoneReviewsLink() {
		bot.hoverOverElement(smartphoneReviews);
	}

}
