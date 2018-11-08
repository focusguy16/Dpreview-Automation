package com.dpreview.auto.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.dpreview.auto.infra.config.MainConfig;
import com.dpreview.auto.infra.reports.Reports;

public class DpreviewAddingGearListTest extends BaseTest {
	
	@Test(description = "Adding gear to the list", priority = 4)
	public void addingGearList() {
		
		browseToUrl(MainConfig.overviewUrl);
		
		WebElement gearList = driver.findElement(By.xpath("//*[@class='empty']//*[text()='Gear List']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(gearList).build().perform();
		
		driver.findElement(By.xpath("//*[@class='empty']//*[text()='Gear List']")).click();
	}

}
