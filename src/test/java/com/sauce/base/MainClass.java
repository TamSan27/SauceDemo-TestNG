 package com.sauce.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	CartPage cartpage;
	CommonPage commonpage;
	HomePage homepage;
	public MainClass() {
		loginpage = PageFactory.initElements(getDriver(), LoginPage.class);
		commonpage = PageFactory.initElements(getDriver(), CommonPage.class);
		cartpage = PageFactory.initElements(getDriver(), CartPage.class);
		homepage = PageFactory.initElements(getDriver(), HomePage.class);
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
	
	public void addSingleItemToCart() throws Exception {
		addToCart(homepage.getAddToCartProduct_Sauce_Labs_Backpack());
		Thread.sleep(1000);
	}
	
	/*
	 * public void addRandomSingleItem(String item) { addToCart(ele);
	 * System.out.println("aaa"); }
	 */
	
	public void addMultipleItemCart() {
		
		List<WebElement> elements = homepage.getAllItems();
		for(WebElement element:elements) {
			addToCart(element);
		}
		
	}
	public void AddToCart__Sauce_Labs_Backpack() {
		homepage.getAddToCartProduct_Sauce_Labs_Backpack().click();
	}
	
	public void AddToCart_Sauce_Labs_Bike_Light() {
		homepage.getAddToCartProduct_Sauce_Labs_Bike_Light().click();;
	}
	
	public void AddToCart_Sauce_Labs_Bolt_TShirt() {
		homepage.getAddToCartProduct_Sauce_Labs_Bolt_TShirt().click();
	}
	
	public void AddToCart_Sauce_Labs_Fleece_Jacket() {
		homepage.getAddToCartProduct_Sauce_Labs_Fleece_Jacket().click();
	}
	
	public void AddToCart_Sauce_Labs_Red_Tshirt() {
		homepage.getAddToCartProduct_Sauce_Labs_Red_Tshirt().click();
	}

	public void AddToCart_Sauce_Labs_Onesie() {
		homepage.getAddToCartProduct_Sauce_Labs_Onesie().click();
	}

	public void RemoveFromCard__Sauce_Labs_Backpack() {
		homepage.getAddToCartProduct_Sauce_Labs_Backpack().click();
	}
	
	public void RemoveFromCard_Sauce_Labs_Bike_Light() {
		homepage.getAddToCartProduct_Sauce_Labs_Bike_Light().click();;
	}
	
	public void RemoveFromCard_Sauce_Labs_Bolt_TShirt() {
		homepage.getAddToCartProduct_Sauce_Labs_Bolt_TShirt().click();
	}
	
	public void RemoveFromCard_Sauce_Labs_Fleece_Jacket() {
		homepage.getAddToCartProduct_Sauce_Labs_Fleece_Jacket().click();
	}
	
	public void RemoveFromCard_Sauce_Labs_Red_Tshirt() {
		homepage.getAddToCartProduct_Sauce_Labs_Red_Tshirt().click();
	}

	public void RemoveFromCard_Sauce_Labs_Onesie() {
		homepage.getAddToCartProduct_Sauce_Labs_Onesie().click();
	}
	
	
}








