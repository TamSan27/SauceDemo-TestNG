package com.sauce.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
         private static WebDriver driver;

		public static WebDriver getDriver() {
			return driver;
		}

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Tamil\\git\\SauceDemo-TestNG\\drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
			getDriver().get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
			System.out.println("added");
			
			
		}
		
         
}
