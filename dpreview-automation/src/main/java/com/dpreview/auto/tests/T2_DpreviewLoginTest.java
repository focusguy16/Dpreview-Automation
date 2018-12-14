package com.dpreview.auto.tests;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.dpreview.auto.infra.config.MainConfig;
import com.dpreview.auto.infra.pages.DpreviewGearList;
import com.dpreview.auto.infra.pages.DpreviewHomePage;
import com.dpreview.auto.infra.pages.DpreviewLoginPage;
import com.dpreview.auto.infra.pages.DpreviewOverviewPage;
import com.dpreview.auto.infra.pages.DpreviewSettingsPage;
import com.dpreview.auto.infra.reports.Reports;

// import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/* ****************************************************************************************************************************************
 ****************************** This test is checking the Login process of Registered user to Dpreview site *******************************  
 * ****************************************************************************************************************************************
 */

public class T2_DpreviewLoginTest extends BaseTest {

	// ------------------------- Testing the validation of the Login page -----------------------------------------------------------------

	@Test(description = "Testing the validation of the Login link", priority = 0)
	public void loginLinkTest() {

		browseToUrl(MainConfig.baseUrl);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		DpreviewHomePage dpreviewHomePage = new DpreviewHomePage(driver);
		dpreviewHomePage.loginLink();
	}

	// ------------------------- Testing the login process with valid details -------------------------------------------------------------

	@Test(description = "Typing the login details", priority = 1)
	public void loginDetails() throws Exception {

		String inputEmail = "eagle15e2000@yahoo.com";
		String inputPassword = "JazzMusic73!";

		DpreviewLoginPage dpreviewLoginPage = new DpreviewLoginPage(driver);
		dpreviewLoginPage.writeEmail(inputEmail);

		dpreviewLoginPage.writePassword(inputPassword);

		dpreviewLoginPage.keepMeSignedInDetails();

		dpreviewLoginPage.closingSignedInDetailsPopup();

		dpreviewLoginPage.keepMeSignedInCheckbox();

		dpreviewLoginPage.clickSigninButton(); 
	}

	// ------------------------- Testing the Menu of the logged user ------------------------------------------------------------------

	@Test(description = "The user enters to the personal menu", priority = 2)
	public void enterPersonalMenuTest() {

		DpreviewHomePage dpreviewHomePage = new DpreviewHomePage(driver);
		dpreviewHomePage.userMenu();

		dpreviewHomePage.userSettings();

	}

	// --------------------- Testing the user settings --------------------------------------------------------------------------------

	@Test(description = "The user sets the desired settings of his profile", priority = 3)
	public void userSettingsTest() {

		String inputProfession = "QA Engineer";
		String inputWebsite = "https://www.linkedin.com/in/daniel-harel-b3a96414/";

		DpreviewSettingsPage dpreviewSettingsPage = new DpreviewSettingsPage(driver);
		dpreviewSettingsPage.openLocation();

		dpreviewSettingsPage.setLocation();

		dpreviewSettingsPage.writeProfession(inputProfession);

		// ######################## Checking if the Profession input is already contain the user profession ###############################

		if(inputProfession == null) {

			dpreviewSettingsPage.writeProfession(inputProfession);
		}
		else {

			Reports.report("The profession input is already typed");
		}

		dpreviewSettingsPage.writeWebsite(inputWebsite);

		// ######################## Checking if the user's web site input is already containing the user web site #########################

		if(inputWebsite == null) {

			dpreviewSettingsPage.writeWebsite(inputWebsite); 
		}
		else {

			Reports.report("The user's website is already typed");
		}

		dpreviewSettingsPage.gallerySafetyLevel();

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dpreviewSettingsPage.gallerySafetyLevel());
		Reports.report("Scrolled to Element " + By.name("userSettingsGallerySafetyLevelModerate") + " (" + By.name("userSettingsGallerySafetyLevelModerate") + ")");

		dpreviewSettingsPage.newsletterSubscription();

		dpreviewSettingsPage.saveChanges();
	}

	// ------------------------- Navigate to the Overview page ----------------------------------------------------------------------------

	@Test(description = "Navigate to Overview page", priority = 4)
	public void navigateToOverviewPage() {

		driver.navigate().to("https://www.dpreview.com/members/5763666202/overview");
	}
	
	@Test(description = "Navigate to the user's gear list page", priority = 5)
	public void gearList() {
		
		browseToUrl(MainConfig.overviewUrl);
		
		DpreviewOverviewPage dpreviewOverviewPage = new DpreviewOverviewPage(driver);
		dpreviewOverviewPage.gearList();
	}
	
	@Test(description = "Editing the user's gear list", priority = 6)
	public void addCurrentGear() {
		
		browseToUrl(MainConfig.gearlistUrl);
		
		DpreviewGearList dpreviewGearList = new DpreviewGearList(driver);
		dpreviewGearList.addCurrentGear();
	}
}
