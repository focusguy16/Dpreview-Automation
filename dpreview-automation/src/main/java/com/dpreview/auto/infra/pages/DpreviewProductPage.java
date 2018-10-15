package com.dpreview.auto.infra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dpreview.auto.infra.web.By2;

public class DpreviewProductPage extends AbstractPage {
	
	private static final By2 productTitle = new By2("Product title", By.className("title"));

	public DpreviewProductPage(WebDriver driver) {
		super("Product title", driver, productTitle);
	}

}
