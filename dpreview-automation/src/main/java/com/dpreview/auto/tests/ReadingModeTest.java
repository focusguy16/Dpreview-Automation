package com.dpreview.auto.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.dpreview.auto.infra.config.MainConfig;

public class ReadingModeTest extends BaseTest {
	
	@Test(description = "Changing the reading mode of the site to light", priority = 0)
	public void lightModeTest() throws Exception {
		
		browseToUrl(MainConfig.baseUrl);
		
		WebElement lightMode = driver.findElement(By.cssSelector("span.option:nth-child(1)"));
		
		Actions action = new Actions(driver);
		action.moveToElement(lightMode).build().perform();
		
		driver.findElement(By.cssSelector("span.option:nth-child(1)")).click();
		// lightMode.wait(2000);
		Thread.sleep(10000);
	}
	
	@Test(description = "Changing the reading mode of the site to dark", priority = 1)
	public void darkModeTest() {
		
		WebElement darkMode = driver.findElement(By.cssSelector("span.option:nth-child(2)"));
		
		Actions action = new Actions(driver);
		action.moveToElement(darkMode).build().perform();
		
		driver.findElement(By.cssSelector("span.option:nth-child(2)")).click();
		
	}

}
