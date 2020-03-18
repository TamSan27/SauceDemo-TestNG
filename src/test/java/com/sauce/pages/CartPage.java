package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	private WebElement Sauce_Labs_Backpack ;

	public WebElement getFirst_Product() {
		return Sauce_Labs_Backpack;
	}
}
