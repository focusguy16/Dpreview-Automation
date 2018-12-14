package com.dpreview.auto.infra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dpreview.auto.infra.web.By2;

public class DpreviewLoginPage extends AbstractPage {
	
	private static final By2 emailInput = new By2("Email input", By.id("ap_email"));
	private static final By2 passwordInput = new By2("Password input", By.id("ap_password"));
	private static final By2 signinButton = new By2("Sign in button", By.id("signInSubmit"));
	private static final By2 keepMeSignedInDetails = new By2("Keep me signed in", By.id("remember_me_learn_more_link"));
	private static final By2 closingSignedInDetailsPopup = new By2("Closing the signed in popup window", By.id("a-popover-header-1"));
	private static final By2 keepMeSignedInCheckbox = new By2("Remember me", By.name("rememberMe"));

	public DpreviewLoginPage(WebDriver driver) {
		super("Dpreview login page", driver, emailInput, passwordInput);
	}
	
	public void writeEmail(String inputEmail) {
		bot.writeToElement(emailInput, inputEmail);
	}
	
	public void writePassword(String inputPassword) {
		bot.writeToElement(passwordInput, inputPassword);
	}
	
	public void keepMeSignedInDetails() {
		bot.click(keepMeSignedInDetails);
	}
	
	public void closingSignedInDetailsPopup() {
		bot.click(closingSignedInDetailsPopup);
	}
	
	public void keepMeSignedInCheckbox() {
		bot.click(keepMeSignedInCheckbox);
	}
	
	public DpreviewHomePage clickSigninButton() {
		bot.click(signinButton);
		return new DpreviewHomePage(driver);
	}

}
