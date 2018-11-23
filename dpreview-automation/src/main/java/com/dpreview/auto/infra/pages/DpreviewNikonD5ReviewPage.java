package com.dpreview.auto.infra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dpreview.auto.infra.web.By2;

public class DpreviewNikonD5ReviewPage extends AbstractPage {
	
	private static final By2 mainMenu = new By2("Main Menu", By.cssSelector(".currentContainer"));

	public DpreviewNikonD5ReviewPage(WebDriver driver) {
		super("Nikon D5 Review", driver, mainMenu);
	}
	
	public void hoverOverMainMenu() {
		bot.hoverOverElement(mainMenu);
	}

}
