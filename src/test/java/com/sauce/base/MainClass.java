package com.sauce.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.sauce.pages.LoginPage;
import com.sauce.pages.SwagLabs;

public class MainClass extends BaseClass{

	//WebDriver driver ;
	LoginPage loginpage;
	SwagLabs addtocart;
	public MainClass() {
		loginpage = PageFactory.initElements(getDriver(), LoginPage.class);
		addtocart = PageFactory.initElements(getDriver(), SwagLabs.class);
		
	}

	public void Login() throws Exception 
	{
		loginpage.getUserName().sendKeys("standard_user");
		loginpage.getPassword().sendKeys("secret_sauce");
		Thread.sleep(2000);
		loginpage.getLoginBtn().click();
		/*
		 * getDriver().findElement(By.xpath(LoginPage.password)).sendKeys("secret_sauce"
		 * ); getDriver().findElement(By.xpath(LoginPage.loginBtn)).click();
		 */
	}
	
	public void SwagLabs() throws Exception 
	{
		addtocart.getFirst_Product().click();
		Thread.sleep(20000);
	}
	
}