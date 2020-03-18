package com.sauce.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sauce.pages.LoginPage;
import com.sauce.pages.CartPage;
import com.sauce.pages.CommonPage;
import com.sauce.pages.HomePage;

public class MainClass extends BaseClass{

	//WebDriver driver ;
	LoginPage loginpage;
	HomePage addtocart;
	CartPage cartpage;
	CommonPage commonpage;
	public MainClass() {
		loginpage = PageFactory.initElements(getDriver(), LoginPage.class);
		addtocart = PageFactory.initElements(getDriver(), HomePage.class);
		commonpage = PageFactory.initElements(getDriver(), CommonPage.class);
		cartpage = PageFactory.initElements(getDriver(), CartPage.class);
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
	
	public void VerifyCartItems()
	{
		//cartpage.Sauce_Labs_Backpack();
		  commonpage.getCart().click();
		  Assert.assertEquals(true, cartpage.Sauce_Labs_Backpack().isDisplayed());
		  Assert.assertEquals(true, cartpage.Sauce_Labs_Backpack_Remove().isDisplayed());
		 		
	}
	
	public void SwagLabs() throws Exception 
	{
		addtocart.Sauce_Labs_Backpack_Add().click();
		Thread.sleep(20000);
	}
	
}