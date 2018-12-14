package com.dpreview.auto.infra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dpreview.auto.infra.web.By2;

public class DpreviewRegistrationPage extends AbstractPage {
	
	private static final By2 yourNameInput = new By2("Your name", By.id("ap_customer_name"));
	private static final By2 emailInput = new By2("Email input", By.id("ap_email"));
	private static final By2 passwordInput = new By2("Password input", By.id("ap_password"));
	private static final By2 passwordInputReEnter = new By2("", By.id("ap_password_check"));
	private static final By2 createYourDpreviewAccount = new By2("Create your dpreview account", By.id("continue"));
	
	
	public DpreviewRegistrationPage(WebDriver driver) {
		super("Dpreview registration page", driver, yourNameInput, emailInput, passwordInput, passwordInputReEnter, createYourDpreviewAccount);
	}
	
	public void writeYourNameInput(String yourName) {
		bot.writeToElement(yourNameInput, yourName);
	}
	
	public void writeYourEmailAddress(String emailAddress) {
		bot.writeToElement(emailInput, emailAddress);
	}
	
	public void writeYourPassword(String yourPassword) {
		bot.writeToElement(passwordInput, yourPassword);
	}
	
	public void reEnterYourPassword(String passwordCheck) {
		bot.writeToElement(passwordInputReEnter, passwordCheck);
	}
	
	public DpreviewHomePage createYourDpreviewAccount() {
		bot.click(createYourDpreviewAccount);
		return new DpreviewHomePage(driver);
	}
}
