package com.dpreview.auto.infra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dpreview.auto.infra.web.By2;

public class DpreviewSignInPage extends AbstractPage {
	
	private static final By2 emailInput = new By2("Email input", By.id("ap_email"));
	private static final By2 passwordInput = new By2("Password input", By.id("ap_password"));
	private static final By2 signinButton = new By2("Sign in button", By.id("signInSubmit"));
	
	public DpreviewSignInPage(WebDriver driver) {
		super("Dpreview Sign In - Email Input Page", driver, emailInput, passwordInput, signinButton);
	}
	
	public void writeEmail(String email) {
		bot.writeToElement(emailInput, email);
	}
	
	public void writePassword(String password) {
		bot.writeToElement(passwordInput, password);
	}
	
	public DpreviewHomePage clickSigninButton() {
		bot.click(signinButton);
		return new DpreviewHomePage(driver);
	}

}
