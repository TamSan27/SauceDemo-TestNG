package com.sauce.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.sauce.pages.LoginPage;

public class MainClass extends BaseClass{

	//WebDriver driver ;
	LoginPage loginpage;
	public MainClass() {
		loginpage = PageFactory.initElements(getDriver(), LoginPage.class);
		
	}

	public void Login() throws Exception 
	{
		loginpage.getUserName().sendKeys("standard_user");
		Thread.sleep(2000);
		/*
		 * getDriver().findElement(By.xpath(LoginPage.password)).sendKeys("secret_sauce"
		 * ); getDriver().findElement(By.xpath(LoginPage.loginBtn)).click();
		 */
	}
	
}
