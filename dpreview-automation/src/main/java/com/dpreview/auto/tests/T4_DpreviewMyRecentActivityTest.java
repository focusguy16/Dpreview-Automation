package com.dpreview.auto.tests;

import org.testng.annotations.Test;

import org.openqa.selenium.By;

import com.dpreview.auto.infra.config.MainConfig;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class T4_DpreviewMyRecentActivityTest extends BaseTest {
	
	@Test(description = "The user sets his gear list", priority = 5)
	public void userGearList() throws Exception {
		
		browseToUrl("https://www.dpreview.com/members/5763666202/overview");
		
		WebElement userGearList = driver.findElement(By.xpath("//*[@class='tabsContainer']//*[text()='Gear']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(userGearList).build().perform();
		
		driver.findElement(By.xpath("//*[@class='tabsContainer']//*[text()='Gear']")).click(); 
		
		driver.navigate().to("https://www.dpreview.com/members/5763666202/gearlist");
		
		Thread.sleep(3000);
		
		driver.close();
	}
	
	/*
	@Test(description = "Adding gear", priority = 6)
	public void addingGear() {
		
		WebElement addGear = driver.findElement(By.xpath("//*[@class='ownIt gearList']//*[text()='Add gear']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(addGear).build().perform();
		
		driver.findElement(By.xpath("//*[@class='ownIt gearList']//*[text()='Add gear']")).click();
	}
	*/

}
