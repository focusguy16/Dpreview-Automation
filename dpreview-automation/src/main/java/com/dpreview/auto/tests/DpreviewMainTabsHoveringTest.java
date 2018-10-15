package com.dpreview.auto.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

import com.dpreview.auto.infra.config.MainConfig;
import com.dpreview.auto.infra.pages.DpreviewHomePage;

public class DpreviewMainTabsHoveringTest extends BaseTest {
	
	@Test(description = "Testing the hovering action on the various tabs in the homepage")
	public void hoveringOnTabs() {
		
		browseToUrl(MainConfig.baseUrl);
		
		WebElement hoveringOnNewsTab = driver.findElement(By.linkText("News"));
		WebElement hoveringOnReviewsTab = driver.findElement(By.linkText("Reviews"));
		WebElement hoveringOnArticlesTab = driver.findElement(By.linkText("Articles"));
		WebElement hoveringOnBuyingGuidesTab = driver.findElement(By.linkText("Buying Guides"));
		WebElement hoveringOnSampleImagesTab = driver.findElement(By.linkText("Sample Images"));
		WebElement hoveringOnVideosTab = driver.findElement(By.linkText("Videos"));
		WebElement hoveringOnCamerasTab = driver.findElement(By.linkText("Cameras"));
		WebElement hoveringOnLensesTab = driver.findElement(By.linkText("Lenses"));
		WebElement hoveringOnPhonesTab = driver.findElement(By.linkText("Phones"));
		WebElement hoveringOnPrintersTab = driver.findElement(By.linkText("Printers"));
		WebElement hoveringOnForumsTab = driver.findElement(By.linkText("Forums"));
		WebElement hoveringOnGalleriesTab = driver.findElement(By.linkText("Galleries"));
		WebElement hoveringOnChallengesTab = driver.findElement(By.linkText("Challenges"));
		
		Actions action0 = new Actions(driver);
		action0.moveToElement(hoveringOnNewsTab).moveToElement(driver.findElement(By.linkText("News"))).build().perform();
		
		Actions action1 = new Actions(driver);
		action1.moveToElement(hoveringOnReviewsTab).moveToElement(driver.findElement(By.linkText("Reviews"))).build().perform();
		
		Actions action2 = new Actions(driver);
		action2.moveToElement(hoveringOnArticlesTab).moveToElement(driver.findElement(By.linkText("Articles"))).build().perform();
		
		Actions action3 = new Actions(driver);
		action3.moveToElement(hoveringOnBuyingGuidesTab).moveToElement(driver.findElement(By.linkText("Buying Guides"))).build().perform();
		
		Actions action4 = new Actions(driver);
		action4.moveToElement(hoveringOnSampleImagesTab).moveToElement(driver.findElement(By.linkText("Sample Images"))).build().perform();
		
		Actions action5 = new Actions(driver);
		action5.moveToElement(hoveringOnVideosTab).moveToElement(driver.findElement(By.linkText("Videos"))).build().perform();
		
		Actions action6 = new Actions(driver);
		action6.moveToElement(hoveringOnCamerasTab).moveToElement(driver.findElement(By.linkText("Cameras"))).build().perform();
		
		Actions action7 = new Actions(driver);
		action7.moveToElement(hoveringOnLensesTab).moveToElement(driver.findElement(By.linkText("Lenses"))).build().perform();
		
		Actions action8 = new Actions(driver);
		action8.moveToElement(hoveringOnPhonesTab).moveToElement(driver.findElement(By.linkText("Phones"))).build().perform();
		
		Actions action9 = new Actions(driver);
		action9.moveToElement(hoveringOnPrintersTab).moveToElement(driver.findElement(By.linkText("Printers"))).build().perform();
		
		Actions action10 = new Actions(driver);
		action10.moveToElement(hoveringOnForumsTab).moveToElement(driver.findElement(By.linkText("Forums"))).build().perform();
		
		Actions action11 = new Actions(driver);
		action11.moveToElement(hoveringOnGalleriesTab).moveToElement(driver.findElement(By.linkText("Galleries"))).build().perform();
		
		Actions action12 = new Actions(driver);
		action12.moveToElement(hoveringOnChallengesTab).moveToElement(driver.findElement(By.linkText("Challenges"))).build().perform();
		
	}

}
