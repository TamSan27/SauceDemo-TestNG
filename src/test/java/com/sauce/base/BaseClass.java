package com.sauce.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {

	protected static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	@BeforeTest
	public void open_browser() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.home") + "\\git\\SauceDemo-TestNG\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		getDriver().get("https://www.saucedemo.com/");
		System.out.println( "hello");
	}
	
	

	
	 @AfterTest 
	 public void close_browser() {
		 getDriver().close(); 
		 }
	  
	 }
