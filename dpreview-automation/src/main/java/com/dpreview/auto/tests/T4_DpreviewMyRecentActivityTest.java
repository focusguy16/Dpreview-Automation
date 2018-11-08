package com.dpreview.auto.tests;

import org.testng.annotations.Test;

import org.openqa.selenium.By;

import com.dpreview.auto.infra.config.MainConfig;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class T4_DpreviewMyRecentActivityTest extends BaseTest {
	
	@Test(description = "The user sets his gear list", priority = 4)
	public void userGearList() {
		
		browseToUrl(MainConfig.baseUrl);
		
		WebElement userGearList = driver.findElement(By.xpath("//*[@class='empty']//*[text()='Gear List']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(userGearList).build().perform();
		
		driver.findElement(By.xpath("//*[@class='empty']//*[text()='Gear List']")).click();
		
	}

}
