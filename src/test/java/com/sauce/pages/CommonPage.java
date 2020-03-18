package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonPage {
	@FindBy(xpath="//*[text()='Open Menu']")
	private WebElement Menu;

	@FindBy(xpath="//*[@data-icon='shopping-cart']")
	private WebElement Card;
	
	@FindBy(xpath="//*[text()='All Items']")
	private WebElement All_items;
	
	@FindBy(xpath="//*[text()='About']")
	private WebElement About;
	
	@FindBy(xpath="//*[text()='Logout']")
	private WebElement logout;
	
	@FindBy(xpath="//*[text()='Reset App State']")
	private WebElement Rest_app_state;

	public WebElement getMenu() {
		return Menu;
	}

	public WebElement getCard() {
		return Card;
	}

	public WebElement getAll_items() {
		return All_items;
	}

	public WebElement getAbout() {
		return About;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getRest_app_state() {
		return Rest_app_state;
	}

}
