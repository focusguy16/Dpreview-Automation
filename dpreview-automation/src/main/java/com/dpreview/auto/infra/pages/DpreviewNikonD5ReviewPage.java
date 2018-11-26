package com.dpreview.auto.infra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dpreview.auto.infra.web.By2;

public class DpreviewNikonD5ReviewPage extends AbstractPage {
	
	private static final By2 nikonD5ReviewMenu = new By2("Nikon D5 Review Menu", By.cssSelector("div.current"));

	public DpreviewNikonD5ReviewPage(WebDriver driver) {
		super("Nikon D5 Review", driver, nikonD5ReviewMenu);
	}
	
	public DpreviewNikonD5ReviewPage hoverOverReviewMenu() {
		bot.hoverOverElement(nikonD5ReviewMenu);
		return null;
	}
	
	/*
	public DpreviewNikonD5ReviewPage hoverOverMainMenu() {
		bot.hoverOverElement(nikonD5ReviewMenu);
		return null;
	}
	*/

}
