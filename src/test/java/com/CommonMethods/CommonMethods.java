package com.CommonMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonMethods {
	
	static WebDriver driver;
	static WebDriverWait wait;

	public static WebDriver startBrowser(String browserName, String url) {

		switch (browserName) {

		case "firefox":

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			break;

		case "chrome":

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			break;

		case "edge":

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
			break;

		}// end switch

		wait = new WebDriverWait(driver, 40);

		return driver;

	}// end startBrowser
	
	public void sendKeysElement(WebElement element, String txt) {
		
		wait.until(ExpectedConditions.visibilityOf(element));
		element.clear();
		element.sendKeys(txt);
		
	}// end sendKeysElement
	
	

}// end CommonMethods
