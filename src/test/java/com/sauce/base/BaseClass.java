package com.sauce.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BaseClass {
	
         private static WebDriver driver;

		public static WebDriver getDriver() {
			return driver;
		}
		
		@Test
		public void open_browser() {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.home")+"\\git\\SauceDemo-TestNG\\drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
			getDriver().get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
			
		}
		
		@AfterTest
		public void close_browser() {
			getDriver().close();
		}
         
}
