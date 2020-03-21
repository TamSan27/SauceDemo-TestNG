package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
	
	public String xpath;
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	private WebElement Sauce_Labs_Backpack ;

	@FindBy(xpath="//div[text()='Sauce Labs Backpack']//parent::a//parent::div//following-sibling::div//button")
	private WebElement Sauce_Labs_Backpack_Remove ;

	public WebElement Sauce_Labs_Backpack() {
		return Sauce_Labs_Backpack;
	}
	
	public WebElement Sauce_Labs_Backpack_Remove() {
		return Sauce_Labs_Backpack_Remove;
	}
	
	
}
