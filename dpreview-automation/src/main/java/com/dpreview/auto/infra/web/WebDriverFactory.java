package com.dpreview.auto.infra.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.dpreview.auto.infra.config.MainConfig;

public class WebDriverFactory {

	public static WebDriver getWebDriver(BrowserType browserType) {

		WebDriver driver = null;

		switch (browserType) {
		case FIREFOX:
			System.setProperty("webdriver.gecko.driver", "webdrivers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case CHROME:
			System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case INTERNET_EXPLORER:
			System.setProperty("webdriver.iedriver.driver", "webdriver/IEDriver.exe");
			driver = new InternetExplorerDriver();
			break;
		case OPERA:
			break;
		case SAFARI:
			break;
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}
}
